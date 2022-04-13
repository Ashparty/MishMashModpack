package net.mcreator.mishmashed.procedures;

import net.minecraftforge.eventbus.api.Event;

public class GlueMobplayerCollidesBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.causeFoodExhaustion((float) 0.1);
	}
}
