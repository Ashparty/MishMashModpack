
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mishmashed.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.mishmashed.item.MuffinLauncherItem;
import net.mcreator.mishmashed.item.MuffinItem;
import net.mcreator.mishmashed.item.FunnyCookieItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MishmashedModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item FUNNY_COOKIE = register(new FunnyCookieItem());
	public static final Item MUFFIN = register(new MuffinItem());
	public static final Item MUFFIN_LAUNCHER = register(new MuffinLauncherItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
