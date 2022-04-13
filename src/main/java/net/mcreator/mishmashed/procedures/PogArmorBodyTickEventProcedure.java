package net.mcreator.mishmashed.procedures;

import net.minecraftforge.eventbus.api.Event;

public class PogArmorBodyTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.WITHER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.POISON);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.DIG_SLOWDOWN);
	}
}
