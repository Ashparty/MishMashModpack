package net.mcreator.mishmashed.procedures;

import net.minecraftforge.eventbus.api.Event;

public class TwitchyArmorHelmetTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(MishmashedModItems.TWITCHY_ARMOR_HELMET))
				: false) {
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(MishmashedModItems.TWITCHY_ARMOR_CHESTPLATE))
					: false) {
				if (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(MishmashedModItems.TWITCHY_ARMOR_LEGGINGS))
						: false) {
					if (entity instanceof Player _playerHasItem
							? _playerHasItem.getInventory().contains(new ItemStack(MishmashedModItems.TWITCHY_ARMOR_BOOTS))
							: false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null)
								_ent.getServer().getCommands().performCommand(
										_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
										"/advancement grant @s only mishmashed:cover_me_in_twitch");
						}
					}
				}
			}
		}
	}
}
