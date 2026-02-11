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

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeljavelin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("mortius_weaponry_redux", "modeljavelin"), "main");
	public final ModelPart main;

	public Modeljavelin(ModelPart root) {
		this.main = root.getChild("main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition main = partdefinition.addOrReplaceChild("main",
				CubeListBuilder.create().texOffs(0, 6).addBox(6.0F, -0.5F, -8.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 6).addBox(4.0F, -0.5F, -6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 9)
						.addBox(0.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(2.0F, -0.5F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 12)
						.addBox(-8.0F, -0.5F, 6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 0).addBox(-6.0F, -0.5F, 4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 15)
						.addBox(-12.0F, -0.5F, 10.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 3).addBox(-16.0F, -0.5F, 14.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 8)
						.addBox(-16.0F, -0.5F, 13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 10).addBox(-13.0F, -0.5F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 12)
						.addBox(-10.0F, -0.5F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 14).addBox(-8.0F, -0.5F, 8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-4.0F, -0.5F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 16).addBox(-6.0F, -0.5F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 18)
						.addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 3).addBox(-2.0F, -0.5F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 18)
						.addBox(4.0F, -0.5F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 18).addBox(2.0F, -0.5F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 18)
						.addBox(6.0F, -0.5F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 14).addBox(5.0F, -0.5F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 12)
						.addBox(3.0F, -0.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 20).addBox(1.0F, -0.5F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 10)
						.addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 8).addBox(-3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 20)
						.addBox(-5.0F, -0.5F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 20).addBox(-7.0F, -0.5F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
						.addBox(-9.0F, -0.5F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-11.0F, -0.5F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 6)
						.addBox(-14.0F, -0.5F, 11.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-15.0F, -0.5F, 12.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-10.0F, -0.5F, 8.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(-4.0F, -0.5F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 3)
						.addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.5F, 0.0F, 1.5708F, 0.0F, 0.7854F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
