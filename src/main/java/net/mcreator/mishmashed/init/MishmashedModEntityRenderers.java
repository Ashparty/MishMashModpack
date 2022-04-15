
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mishmashed.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.mishmashed.client.renderer.MuffinTravellerRenderer;
import net.mcreator.mishmashed.client.renderer.MuffinLauncherRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MishmashedModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MishmashedModEntities.POMB, ThrownItemRenderer::new);
		event.registerEntityRenderer(MishmashedModEntities.MUFFIN_LAUNCHER, MuffinLauncherRenderer::new);
		event.registerEntityRenderer(MishmashedModEntities.MUFFIN_TRAVELLER, MuffinTravellerRenderer::new);
	}
}
