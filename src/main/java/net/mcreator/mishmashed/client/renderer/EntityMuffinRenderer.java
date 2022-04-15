package net.mcreator.mishmashed.client.renderer;

public class EntityMuffinRenderer extends MobRenderer<EntityMuffinEntity, Modelcustom_model<EntityMuffinEntity>> {

	public EntityMuffinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);

		this.addLayer(new EyesLayer<EntityMuffinEntity, Modelcustom_model<EntityMuffinEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("mishmashed:textures/tamedmuffin.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EntityMuffinEntity entity) {
		return new ResourceLocation("mishmashed:textures/tamedmuffin.png");
	}

}
