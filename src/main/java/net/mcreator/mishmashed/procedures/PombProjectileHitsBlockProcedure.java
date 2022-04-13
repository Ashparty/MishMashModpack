package net.mcreator.mishmashed.procedures;

import net.minecraftforge.eventbus.api.Event;

public class PombProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 29, Explosion.BlockInteraction.BREAK);
	}
}
