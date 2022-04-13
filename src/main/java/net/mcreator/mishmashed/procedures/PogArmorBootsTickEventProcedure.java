package net.mcreator.mishmashed.procedures;

import net.minecraftforge.eventbus.api.Event;

public class PogArmorBootsTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
	}
}
