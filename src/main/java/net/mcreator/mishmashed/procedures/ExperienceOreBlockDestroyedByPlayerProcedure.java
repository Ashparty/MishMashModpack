package net.mcreator.mishmashed.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ExperienceOreBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 25));
	}
}
