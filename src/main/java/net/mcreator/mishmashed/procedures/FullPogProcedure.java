package net.mcreator.mishmashed.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.mishmashed.init.MishmashedModItems;

public class FullPogProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(MishmashedModItems.POG_ARMOR_HELMET))
				: false) {
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(MishmashedModItems.POG_ARMOR_CHESTPLATE))
					: false) {
				if (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(MishmashedModItems.POG_ARMOR_LEGGINGS))
						: false) {
					if (entity instanceof Player _playerHasItem
							? _playerHasItem.getInventory().contains(new ItemStack(MishmashedModItems.POG_ARMOR_BOOTS))
							: false) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
											_level.getServer(), null).withSuppressedOutput(),
									"/advancement grant @p only mishmashed:full_set_of_pog");
					}
				}
			}
		}
	}
}
