package net.mcreator.mishmashed.client.renderer;

public class WildMuffinRenderer extends MobRenderer<WildMuffinEntity, Modelcustom_model<WildMuffinEntity>> {

	public WildMuffinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(WildMuffinEntity entity) {
		return new ResourceLocation("mishmashed:textures/texture.png");
	}

}
