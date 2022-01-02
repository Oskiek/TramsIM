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
	
	public static Block TicketMachine_Kzkgop, TicketMachine_Brno,OrensePole, Platform, PlatformPole,
			BusStop_2_Left_1, BusStop_2_Middle_1, BusStop_2_Middle_2, BusStop_2_Middle_3, BusStop_2_Middle_4, BusStop_2_Middle_5, BusStop_2_Right_1,
			BusStop_3_Left_1, BusStop_3_Middle_1, BusStop_3_Right_1; //EdgeBritish, EdgeChecker, EdgeLed, EdgeLedLined, EdgeLeftCorner, EdgeLined, EdgePlain, EdgeRightCorner, EdgeYellowLined, EdgeYellowThick;
	public static List<Block>blockList=new ArrayList<Block>();

	
	public static void registerBlocks()
	{
		blockList.add(TicketMachine_Kzkgop =new BlockTicketMachine_Kzkgop().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/iconTicketmachineKZKGOP"));
		blockList.add(TicketMachine_Brno =new BlockTicketMachine_Brno().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/iconTicketmachineBrno"));

		blockList.add(OrensePole =new BlockOrensePole().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/icon_orense_pole"));

		blockList.add(Platform =new BlockPlatform().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/platforms/platform"));
		blockList.add(PlatformPole=new BlockPlatformPole().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/platforms/platform-pole"));

		blockList.add(BusStop_2_Left_1 = new BusStop_2_Left_1().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/l_end"));
		blockList.add(BusStop_2_Middle_1 = new BusStop_2_Middle_1().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/m-glass-bench"));
		blockList.add(BusStop_2_Middle_2 = new BusStop_2_Middle_2().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/m-glass"));
		blockList.add(BusStop_2_Middle_3 = new BusStop_2_Middle_3().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/m-glass-ttable"));
		blockList.add(BusStop_2_Middle_4 = new BusStop_2_Middle_4().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/m-pat"));
		blockList.add(BusStop_2_Middle_5 = new BusStop_2_Middle_5().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/m-pat-timetable"));
		blockList.add(BusStop_2_Right_1 = new BusStop_2_Right_1().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/r_end"));

		blockList.add(BusStop_3_Left_1 = new BusStop_3_Left_1().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var3/left"));
		blockList.add(BusStop_3_Middle_1 = new BusStop_3_Middle_1().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var3/middle"));
		blockList.add(BusStop_3_Right_1 = new BusStop_3_Right_1().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var3/right"));


		/*
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
		*/

		for(Block block:blockList)
		{
			System.out.println(block);
			GameRegistry.registerBlock(block, block.getUnlocalizedName());
		}
	}
	
	
}
