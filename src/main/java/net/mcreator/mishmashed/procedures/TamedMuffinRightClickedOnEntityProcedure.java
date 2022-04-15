package net.mcreator.mishmashed.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

public class TamedMuffinRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner)
			_toTame.tame(_owner);
	}
}
