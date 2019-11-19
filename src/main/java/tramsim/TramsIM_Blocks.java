package tramsim;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import tramsim.blocks.*;
import tramsim.blocks.platforms.BlockPlatform;
import tramsim.blocks.platforms.BlockPlatformPole;
import tramsim.blocks.platforms.edges.*;
import tramsim.blocks.stops.*;

public class TramsIM_Blocks {
	
	public static Block TicketMachine_Kzkgop, TicketMachine_Brno, Platform, PlatformPole, EdgeBritish, EdgeChecker, EdgeLed, EdgeLedLined, EdgeLeftCorner, EdgeLined, EdgePlain, EdgeRightCorner, EdgeYellowLined, EdgeYellowThick;
	public static List<Block>blockList=new ArrayList<Block>();

	
	public static void registerBlocks()
	{
		blockList.add(TicketMachine_Kzkgop =new BlockTicketMachine_Kzkgop().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/iconTicketmachineKZKGOP"));
		blockList.add(TicketMachine_Brno =new BlockTicketMachine_Brno().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/iconTicketmachineBrno"));


		blockList.add(Platform =new BlockPlatform().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/platforms/platform"));
		blockList.add(PlatformPole=new BlockPlatformPole().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/platforms/platform-pole"));

		blockList.add(EdgeBritish=new BlockEdgeBritish().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/platforms/e-british"));
		blockList.add(EdgeChecker=new BlockEdgeChecker().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/platforms/e-checker"));
		blockList.add(EdgeLed=new BlockEdgeLed().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/platforms/e-led"));
		blockList.add(EdgeLedLined=new BlockEdgeLedLined().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/platforms/e-lined-led"));
		blockList.add(EdgeLeftCorner=new BlockEdgeLeftCorner().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/platforms/e-ledge"));
		blockList.add(EdgeLined=new BlockEdgeLined().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/platforms/e-lined"));
		blockList.add(EdgePlain=new BlockEdgePlain().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/platforms/e-plain"));
		blockList.add(EdgeRightCorner=new BlockEdgeRightCorner().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/platforms/e-redge"));
		blockList.add(EdgeYellowLined=new BlockEdgeYellowLined().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/platforms/e-lined-yellow"));
		blockList.add(EdgeYellowThick=new BlockEdgeYellowThick().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/platforms/e-thick-yellow"));
		
		for(Block block:blockList)
		{
			System.out.println(block);
			GameRegistry.registerBlock(block, block.getUnlocalizedName());
		}
	}
	
	
}
