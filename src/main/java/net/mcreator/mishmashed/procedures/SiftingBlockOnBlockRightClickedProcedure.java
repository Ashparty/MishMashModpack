package net.mcreator.mishmashed.procedures;

import net.minecraftforge.eventbus.api.Event;

public class SiftingBlockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.NETHERRACK)) : false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.NETHERRACK);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								"/loot spawn ~0.5 ~0.7 ~0.5 loot mishmashed:blocks/sifting_table");
		}
	}
}
