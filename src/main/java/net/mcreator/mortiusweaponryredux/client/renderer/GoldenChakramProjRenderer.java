package net.mcreator.mortiusweaponryredux.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.mortiusweaponryredux.entity.GoldenChakramProjEntity;
import net.mcreator.mortiusweaponryredux.client.model.Modelwooden_chakram;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GoldenChakramProjRenderer extends EntityRenderer<GoldenChakramProjEntity> {
	private static final ResourceLocation texture = new ResourceLocation("mortius_weaponry_redux:textures/entities/golden_chakram.png");
	private final Modelwooden_chakram model;

	public GoldenChakramProjRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelwooden_chakram(context.bakeLayer(Modelwooden_chakram.LAYER_LOCATION));
	}

	@Override
	public void render(GoldenChakramProjEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(GoldenChakramProjEntity entity) {
		return texture;
	}
}
