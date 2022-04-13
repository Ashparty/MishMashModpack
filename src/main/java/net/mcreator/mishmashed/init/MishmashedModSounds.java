
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mishmashed.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MishmashedModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("mishmashed", "gluebucket"), new SoundEvent(new ResourceLocation("mishmashed", "gluebucket")));
		REGISTRY.put(new ResourceLocation("mishmashed", "jumpscream"), new SoundEvent(new ResourceLocation("mishmashed", "jumpscream")));
		REGISTRY.put(new ResourceLocation("mishmashed", "stop"), new SoundEvent(new ResourceLocation("mishmashed", "stop")));
		REGISTRY.put(new ResourceLocation("mishmashed", "muffinpew"), new SoundEvent(new ResourceLocation("mishmashed", "muffinpew")));
		REGISTRY.put(new ResourceLocation("mishmashed", "poggers"), new SoundEvent(new ResourceLocation("mishmashed", "poggers")));
		REGISTRY.put(new ResourceLocation("mishmashed", "flymusic"), new SoundEvent(new ResourceLocation("mishmashed", "flymusic")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
