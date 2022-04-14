
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mishmashed.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.mishmashed.entity.PombEntity;
import net.mcreator.mishmashed.entity.MuffinTravellerEntity;
import net.mcreator.mishmashed.entity.MuffinLauncherEntity;
import net.mcreator.mishmashed.entity.ImposterEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MishmashedModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<PombEntity> POMB = register("entitybulletpomb",
			EntityType.Builder.<PombEntity>of(PombEntity::new, MobCategory.MISC).setCustomClientFactory(PombEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<MuffinLauncherEntity> MUFFIN_LAUNCHER = register("entitybulletmuffin_launcher",
			EntityType.Builder.<MuffinLauncherEntity>of(MuffinLauncherEntity::new, MobCategory.MISC).setCustomClientFactory(MuffinLauncherEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<MuffinTravellerEntity> MUFFIN_TRAVELLER = register("entitybulletmuffin_traveller",
			EntityType.Builder.<MuffinTravellerEntity>of(MuffinTravellerEntity::new, MobCategory.MISC)
					.setCustomClientFactory(MuffinTravellerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ImposterEntity> IMPOSTER = register("imposter",
			EntityType.Builder.<ImposterEntity>of(ImposterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(75)
					.setUpdateInterval(3).setCustomClientFactory(ImposterEntity::new).fireImmune().sized(0.4f, 0.7f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ImposterEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(IMPOSTER, ImposterEntity.createAttributes().build());
	}
}
