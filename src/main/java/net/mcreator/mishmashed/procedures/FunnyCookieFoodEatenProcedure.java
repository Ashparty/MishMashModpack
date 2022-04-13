package net.mcreator.mishmashed.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FunnyCookieFoodEatenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 1840, 10, (true), (false)));
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mishmashed:flymusic")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mishmashed:flymusic")),
						SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}
