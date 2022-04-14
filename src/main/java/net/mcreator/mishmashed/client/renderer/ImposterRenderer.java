package net.mcreator.mishmashed.client.renderer;

public class ImposterRenderer extends MobRenderer<ImposterEntity, ChickenModel<ImposterEntity>> {

	public ImposterRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(ImposterEntity entity) {
		return new ResourceLocation("mishmashed:textures/.png");
	}

}
