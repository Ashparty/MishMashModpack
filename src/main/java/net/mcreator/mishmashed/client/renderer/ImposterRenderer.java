package net.mcreator.mishmashed.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.mishmashed.entity.ImposterEntity;

public class ImposterRenderer extends MobRenderer<ImposterEntity, ChickenModel<ImposterEntity>> {
	public ImposterRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ImposterEntity entity) {
		return new ResourceLocation("mishmashed:textures/.png");
	}
}
