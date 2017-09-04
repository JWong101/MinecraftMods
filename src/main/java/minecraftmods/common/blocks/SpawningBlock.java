package common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class SpawningBlock extends Block{

	public SpawningBlock() {
		super(Material.IRON);
		setUnlocalizedName("spawningblock");
		setRegistryName("spawningblock");
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHardness(2.0f);
		setResistance(10.0f);
		setLightLevel(1.0f);
	}

	public void onEntityDamagedOnBlock(Entity entity) {

		Entity copy = EntityRegistry.getEntry(entity.getClass()).newInstance(entity.world);
		copy.setPosition(entity.posX, entity.posY + 2, entity.posZ);
		entity.world.spawnEntity(copy);


	}

}
