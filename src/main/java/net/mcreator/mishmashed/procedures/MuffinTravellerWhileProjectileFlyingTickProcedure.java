package net.mcreator.mishmashed.procedures;

import net.minecraftforge.eventbus.api.Event;

public class MuffinTravellerWhileProjectileFlyingTickProcedure {
	public static void execute(Entity entity, Entity imediatesourceentity) {
		if (entity == null || imediatesourceentity == null)
			return;
		entity.startRiding(imediatesourceentity);
	}
}
