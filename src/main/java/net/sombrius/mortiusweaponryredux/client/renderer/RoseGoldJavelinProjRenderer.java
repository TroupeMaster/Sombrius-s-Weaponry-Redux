package net.sombrius.mortiusweaponryredux.client.renderer;

import net.sombrius.mortiusweaponryredux.entity.RoseGoldJavelinProjEntity;
import net.sombrius.mortiusweaponryredux.client.model.Modeljavelin;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RoseGoldJavelinProjRenderer extends EntityRenderer<RoseGoldJavelinProjEntity> {
	private static final ResourceLocation texture = new ResourceLocation("mortius_weaponry_redux:textures/entities/rose_gold_javelinproj.png");
	private final Modeljavelin model;

	public RoseGoldJavelinProjRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modeljavelin(context.bakeLayer(Modeljavelin.LAYER_LOCATION));
	}

	@Override
	public void render(RoseGoldJavelinProjEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.setupAnim(entityIn, 0, 0, entityIn.tickCount + partialTicks, entityIn.getYRot(), entityIn.getXRot());
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(RoseGoldJavelinProjEntity entity) {
		return texture;
	}
}