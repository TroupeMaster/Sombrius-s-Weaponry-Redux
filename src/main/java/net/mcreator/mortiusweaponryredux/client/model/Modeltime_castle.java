package net.mcreator.mortiusweaponryredux.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeltime_castle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("mortius_weaponry_redux", "modeltime_castle"), "main");
	public final ModelPart main;
	public final ModelPart main2;

	public Modeltime_castle(ModelPart root) {
		this.main = root.getChild("main");
		this.main2 = root.getChild("main2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -16.0F, -16.0F, 32.0F, 32.0F, 32.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition main2 = partdefinition.addOrReplaceChild("main2", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -16.0F, -16.0F, 32.0F, 32.0F, 32.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		main2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.main2.yRot = ageInTicks / 20.f;
		this.main.xRot = ageInTicks / 20.f;
	}
}
