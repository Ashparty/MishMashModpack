package net.mcreator.mishmashed.procedures;

import net.minecraft.world.entity.Entity;

public class MuffinTravellerWhileProjectileFlyingTickProcedure {
	public static void execute(Entity entity, Entity imediatesourceentity) {
		if (entity == null || imediatesourceentity == null)
			return;
		entity.startRiding(imediatesourceentity);
	}
}
