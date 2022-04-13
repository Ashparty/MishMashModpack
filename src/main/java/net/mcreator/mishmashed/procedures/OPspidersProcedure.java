package net.mcreator.mishmashed.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class OPspidersProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinWorldEvent event) {
		Entity entity = event.getEntity();
		execute(event, entity);
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (EntityTypeTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:spiders")).contains(entity.getType())) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10000, 5, (true), (false)));
		}
	}
}
