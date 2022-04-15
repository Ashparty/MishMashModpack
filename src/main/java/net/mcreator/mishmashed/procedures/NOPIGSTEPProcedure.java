package net.mcreator.mishmashed.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class NOPIGSTEPProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.MUSIC_DISC_PIGSTEP)) : false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.MUSIC_DISC_PIGSTEP);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.BREAK);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("NO PIGSTEP!"), (false));
		}
	}
}
