package net.mcreator.mishmashed.client.renderer;

public class TamedMuffinRenderer extends MobRenderer<TamedMuffinEntity, Modelcustom_model<TamedMuffinEntity>> {

	public TamedMuffinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(TamedMuffinEntity entity) {
		return new ResourceLocation("mishmashed:textures/tamedmuffin.png");
	}

}
