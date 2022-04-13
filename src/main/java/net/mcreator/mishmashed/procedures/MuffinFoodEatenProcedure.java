package net.mcreator.mishmashed.procedures;

import net.minecraftforge.eventbus.api.Event;

public class MuffinFoodEatenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1, (false), (false)));
	}
}
