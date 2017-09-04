package common;

import common.blocks.SpawningBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ModEventHandler {
	@SubscribeEvent
	public static void mobAttackedOnSpawnBlock(AttackEntityEvent event) {
		Entity mob = event.getTarget();
		if(!(mob instanceof EntityPlayer) && !mob.world.isRemote) {
			double x = mob.posX;
			double y = mob.getEntityBoundingBox().minY - 1;
			double z = mob.posZ;
			Block block = mob.world.getBlockState(new BlockPos(x, y, z)).getBlock();
			if(block instanceof SpawningBlock) {
				System.out.println("IM GOING IN HOT");
				((SpawningBlock)block).onEntityDamagedOnBlock(mob);
			}
		}
		if(mob.world.isRemote) {
			EntityPlayer player = event.getEntityPlayer();
			player.sendMessage(new TextComponentString("Saa yume wo kanaeru"));
			System.out.println("IM REMOTE");
		}
	}
}
