package net.mcreator.mishmashed.procedures;

import net.minecraftforge.eventbus.api.Event;

public class PogLocatorRightClickedInAirProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
			PombEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 1, 5, 5);
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(MishmashedModItems.POG_LOCATOR);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
