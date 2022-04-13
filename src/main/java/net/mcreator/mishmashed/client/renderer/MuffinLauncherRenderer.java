package net.mcreator.mishmashed.client.renderer;

public class MuffinLauncherRenderer extends EntityRenderer<MuffinLauncherEntity> {

	private static final ResourceLocation texture = new ResourceLocation("mishmashed:textures/texture.png");

	private final Modelcustom_model model;

	public MuffinLauncherRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION));
	}

	@Override
	public void render(MuffinLauncherEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn,
			int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(MuffinLauncherEntity entity) {
		return texture;
	}

}
