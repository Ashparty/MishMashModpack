
package net.mcreator.mishmashed.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class MuffinTravellerEntity extends AbstractArrow implements ItemSupplier {

	public MuffinTravellerEntity(FMLPlayMessages.SpawnEntity packet, Level world) {
		super(MishmashedModEntities.MUFFIN_TRAVELLER, world);
	}

	public MuffinTravellerEntity(EntityType<? extends MuffinTravellerEntity> type, Level world) {
		super(type, world);
	}

	public MuffinTravellerEntity(EntityType<? extends MuffinTravellerEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public MuffinTravellerEntity(EntityType<? extends MuffinTravellerEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return null;
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(MishmashedModItems.MUFFIN);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		Entity entity = this.getOwner();
		Entity imediatesourceentity = this;

		MuffinTravellerWhileProjectileFlyingTickProcedure.execute(entity, imediatesourceentity);
		if (this.inGround) {
			this.discard();
		}
	}

	public static MuffinTravellerEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		MuffinTravellerEntity entityarrow = new MuffinTravellerEntity(MishmashedModEntities.MUFFIN_TRAVELLER, entity, world);
		entityarrow.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);

		world.playSound((Player) null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mishmashed:muffinpew")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));

		return entityarrow;
	}

	public static MuffinTravellerEntity shoot(LivingEntity entity, LivingEntity target) {
		MuffinTravellerEntity entityarrow = new MuffinTravellerEntity(MishmashedModEntities.MUFFIN_TRAVELLER, entity, entity.level);
		double d0 = target.getY() + (double) target.getEyeHeight() - 1.1;
		double d1 = target.getX() - entity.getX();
		double d3 = target.getZ() - entity.getZ();
		entityarrow.shoot(d1, d0 - entityarrow.getY() + Math.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 1f * 2, 12.0F);

		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(1);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);

		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		entity.level.playSound((Player) null, (double) x, (double) y, (double) z,
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mishmashed:muffinpew")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));

		return entityarrow;
	}

}
