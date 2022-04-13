package net.mcreator.mishmashed.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class SkeletonArrowProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			execute(event, entity.level, entity, event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (EntityTypeTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:player")).contains(entity.getType())) {
			if (EntityTypeTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:skeletons")).contains(sourceentity.getType())) {
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (sourceentity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
							Arrow entityToSpawn = new Arrow(_ent_sa.level, _ent_sa);
							entityToSpawn.shoot(sourceentity.getLookAngle().x, sourceentity.getLookAngle().y, sourceentity.getLookAngle().z, 2, 0);
							entityToSpawn.setBaseDamage(5);
							entityToSpawn.setKnockback(2);
							_ent_sa.level.addFreshEntity(entityToSpawn);
						}
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if (sourceentity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
									Arrow entityToSpawn = new Arrow(_ent_sa.level, _ent_sa);
									entityToSpawn.shoot(sourceentity.getLookAngle().x, sourceentity.getLookAngle().y, sourceentity.getLookAngle().z,
											2, 0);
									entityToSpawn.setBaseDamage(5);
									entityToSpawn.setKnockback(2);
									_ent_sa.level.addFreshEntity(entityToSpawn);
								}
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private LevelAccessor world;

									public void start(LevelAccessor world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										if (sourceentity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
											Arrow entityToSpawn = new Arrow(_ent_sa.level, _ent_sa);
											entityToSpawn.shoot(sourceentity.getLookAngle().x, sourceentity.getLookAngle().y,
													sourceentity.getLookAngle().z, 2, 0);
											entityToSpawn.setBaseDamage(5);
											entityToSpawn.setKnockback(2);
											_ent_sa.level.addFreshEntity(entityToSpawn);
										}
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private LevelAccessor world;

											public void start(LevelAccessor world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												if (sourceentity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
													Arrow entityToSpawn = new Arrow(_ent_sa.level, _ent_sa);
													entityToSpawn.shoot(sourceentity.getLookAngle().x, sourceentity.getLookAngle().y,
															sourceentity.getLookAngle().z, 2, 0);
													entityToSpawn.setBaseDamage(5);
													entityToSpawn.setKnockback(2);
													_ent_sa.level.addFreshEntity(entityToSpawn);
												}
												new Object() {
													private int ticks = 0;
													private float waitTicks;
													private LevelAccessor world;

													public void start(LevelAccessor world, int waitTicks) {
														this.waitTicks = waitTicks;
														MinecraftForge.EVENT_BUS.register(this);
														this.world = world;
													}

													@SubscribeEvent
													public void tick(TickEvent.ServerTickEvent event) {
														if (event.phase == TickEvent.Phase.END) {
															this.ticks += 1;
															if (this.ticks >= this.waitTicks)
																run();
														}
													}

													private void run() {
														if (sourceentity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
															Arrow entityToSpawn = new Arrow(_ent_sa.level, _ent_sa);
															entityToSpawn.shoot(sourceentity.getLookAngle().x, sourceentity.getLookAngle().y,
																	sourceentity.getLookAngle().z, 2, 0);
															entityToSpawn.setBaseDamage(5);
															entityToSpawn.setKnockback(2);
															_ent_sa.level.addFreshEntity(entityToSpawn);
														}
														new Object() {
															private int ticks = 0;
															private float waitTicks;
															private LevelAccessor world;

															public void start(LevelAccessor world, int waitTicks) {
																this.waitTicks = waitTicks;
																MinecraftForge.EVENT_BUS.register(this);
																this.world = world;
															}

															@SubscribeEvent
															public void tick(TickEvent.ServerTickEvent event) {
																if (event.phase == TickEvent.Phase.END) {
																	this.ticks += 1;
																	if (this.ticks >= this.waitTicks)
																		run();
																}
															}

															private void run() {
																if (sourceentity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
																	Arrow entityToSpawn = new Arrow(_ent_sa.level, _ent_sa);
																	entityToSpawn.shoot(sourceentity.getLookAngle().x, sourceentity.getLookAngle().y,
																			sourceentity.getLookAngle().z, 2, 0);
																	entityToSpawn.setBaseDamage(5);
																	entityToSpawn.setKnockback(2);
																	_ent_sa.level.addFreshEntity(entityToSpawn);
																}
																new Object() {
																	private int ticks = 0;
																	private float waitTicks;
																	private LevelAccessor world;

																	public void start(LevelAccessor world, int waitTicks) {
																		this.waitTicks = waitTicks;
																		MinecraftForge.EVENT_BUS.register(this);
																		this.world = world;
																	}

																	@SubscribeEvent
																	public void tick(TickEvent.ServerTickEvent event) {
																		if (event.phase == TickEvent.Phase.END) {
																			this.ticks += 1;
																			if (this.ticks >= this.waitTicks)
																				run();
																		}
																	}

																	private void run() {
																		if (sourceentity instanceof LivingEntity _ent_sa
																				&& !_ent_sa.level.isClientSide()) {
																			Arrow entityToSpawn = new Arrow(_ent_sa.level, _ent_sa);
																			entityToSpawn.shoot(sourceentity.getLookAngle().x,
																					sourceentity.getLookAngle().y, sourceentity.getLookAngle().z, 2,
																					0);
																			entityToSpawn.setBaseDamage(5);
																			entityToSpawn.setKnockback(2);
																			_ent_sa.level.addFreshEntity(entityToSpawn);
																		}
																		new Object() {
																			private int ticks = 0;
																			private float waitTicks;
																			private LevelAccessor world;

																			public void start(LevelAccessor world, int waitTicks) {
																				this.waitTicks = waitTicks;
																				MinecraftForge.EVENT_BUS.register(this);
																				this.world = world;
																			}

																			@SubscribeEvent
																			public void tick(TickEvent.ServerTickEvent event) {
																				if (event.phase == TickEvent.Phase.END) {
																					this.ticks += 1;
																					if (this.ticks >= this.waitTicks)
																						run();
																				}
																			}

																			private void run() {
																				if (sourceentity instanceof LivingEntity _ent_sa
																						&& !_ent_sa.level.isClientSide()) {
																					Arrow entityToSpawn = new Arrow(_ent_sa.level, _ent_sa);
																					entityToSpawn.shoot(sourceentity.getLookAngle().x,
																							sourceentity.getLookAngle().y,
																							sourceentity.getLookAngle().z, 2, 0);
																					entityToSpawn.setBaseDamage(5);
																					entityToSpawn.setKnockback(2);
																					_ent_sa.level.addFreshEntity(entityToSpawn);
																				}
																				new Object() {
																					private int ticks = 0;
																					private float waitTicks;
																					private LevelAccessor world;

																					public void start(LevelAccessor world, int waitTicks) {
																						this.waitTicks = waitTicks;
																						MinecraftForge.EVENT_BUS.register(this);
																						this.world = world;
																					}

																					@SubscribeEvent
																					public void tick(TickEvent.ServerTickEvent event) {
																						if (event.phase == TickEvent.Phase.END) {
																							this.ticks += 1;
																							if (this.ticks >= this.waitTicks)
																								run();
																						}
																					}

																					private void run() {
																						if (sourceentity instanceof LivingEntity _ent_sa
																								&& !_ent_sa.level.isClientSide()) {
																							Arrow entityToSpawn = new Arrow(_ent_sa.level, _ent_sa);
																							entityToSpawn.shoot(sourceentity.getLookAngle().x,
																									sourceentity.getLookAngle().y,
																									sourceentity.getLookAngle().z, 2, 0);
																							entityToSpawn.setBaseDamage(5);
																							entityToSpawn.setKnockback(2);
																							_ent_sa.level.addFreshEntity(entityToSpawn);
																						}
																						new Object() {
																							private int ticks = 0;
																							private float waitTicks;
																							private LevelAccessor world;

																							public void start(LevelAccessor world, int waitTicks) {
																								this.waitTicks = waitTicks;
																								MinecraftForge.EVENT_BUS.register(this);
																								this.world = world;
																							}

																							@SubscribeEvent
																							public void tick(TickEvent.ServerTickEvent event) {
																								if (event.phase == TickEvent.Phase.END) {
																									this.ticks += 1;
																									if (this.ticks >= this.waitTicks)
																										run();
																								}
																							}

																							private void run() {
																								if (sourceentity instanceof LivingEntity _ent_sa
																										&& !_ent_sa.level.isClientSide()) {
																									Arrow entityToSpawn = new Arrow(_ent_sa.level,
																											_ent_sa);
																									entityToSpawn.shoot(sourceentity.getLookAngle().x,
																											sourceentity.getLookAngle().y,
																											sourceentity.getLookAngle().z, 2, 0);
																									entityToSpawn.setBaseDamage(5);
																									entityToSpawn.setKnockback(2);
																									_ent_sa.level.addFreshEntity(entityToSpawn);
																								}
																								new Object() {
																									private int ticks = 0;
																									private float waitTicks;
																									private LevelAccessor world;

																									public void start(LevelAccessor world,
																											int waitTicks) {
																										this.waitTicks = waitTicks;
																										MinecraftForge.EVENT_BUS.register(this);
																										this.world = world;
																									}

																									@SubscribeEvent
																									public void tick(
																											TickEvent.ServerTickEvent event) {
																										if (event.phase == TickEvent.Phase.END) {
																											this.ticks += 1;
																											if (this.ticks >= this.waitTicks)
																												run();
																										}
																									}

																									private void run() {
																										if (sourceentity instanceof LivingEntity _ent_sa
																												&& !_ent_sa.level.isClientSide()) {
																											Arrow entityToSpawn = new Arrow(
																													_ent_sa.level, _ent_sa);
																											entityToSpawn.shoot(
																													sourceentity.getLookAngle().x,
																													sourceentity.getLookAngle().y,
																													sourceentity.getLookAngle().z, 2,
																													0);
																											entityToSpawn.setBaseDamage(5);
																											entityToSpawn.setKnockback(2);
																											_ent_sa.level
																													.addFreshEntity(entityToSpawn);
																										}
																										MinecraftForge.EVENT_BUS.unregister(this);
																									}
																								}.start(world, 10);
																								MinecraftForge.EVENT_BUS.unregister(this);
																							}
																						}.start(world, 10);
																						MinecraftForge.EVENT_BUS.unregister(this);
																					}
																				}.start(world, 10);
																				MinecraftForge.EVENT_BUS.unregister(this);
																			}
																		}.start(world, 10);
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, 10);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, 10);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, 10);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 10);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 10);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 10);
			}
		}
	}
}
