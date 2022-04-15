package net.mcreator.mishmashed.procedures;

import net.minecraftforge.eventbus.api.Event;

public class PurpleswordEntitySwingsItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5, 2, (false), (false)));
	}
}
