package spanish_pack;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import spanish_pack.blocks.*;
import spanish_pack.models.blocks.*;

public class Spanish_pack_Blocks {
	
	public static Block Catenary_single_A, Catenary_single_B, Catenary_double_C;
	public static List<Block>blockList=new ArrayList<Block>();



	public static void registerBlocks()
	{
		blockList.add(Catenary_single_A =new Block_catenary_Single_A().setCreativeTab(Spanish_pack.spanish_pack_block).setBlockTextureName("tramsim:icon/Catenary_single_A"));
		blockList.add(Catenary_single_B =new Block_catenary_Single_B().setCreativeTab(Spanish_pack.spanish_pack_block).setBlockTextureName("tramsim:icon/Catenary_single_B"));
		blockList.add(Catenary_double_C =new Block_catenary_double_C().setCreativeTab(Spanish_pack.spanish_pack_block).setBlockTextureName("tramsim:icon/Catenary_double_C"));

		for(Block block:blockList)
		{
			System.out.println(block);
			GameRegistry.registerBlock(block, block.getUnlocalizedName());
		}
	}
	
	
}
