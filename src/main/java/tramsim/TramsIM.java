package tramsim;

import Oskiek.FlagmodEurope.FlagRegistry;
import Oskiek.FlagmodEurope.Flag_Instance;
import Oskiek.FlagmodEurope.FlagmodEurope;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.TiMTab;
import ebf.tim.registry.TiMGenericRegistry;
import net.minecraft.creativetab.CreativeTabs;
//train imports
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import tramsim.blocks.BlockTicketMachine_Brno;
import tramsim.blocks.BlockTicketMachine_Kzkgop;
import tramsim.blocks.stops.*;
import tramsim.entities.trains.*;
import tramsim.entities.wagons.*;

//block imports
import tramsim.tiles.*;
import tramsim.tiles.platforms.*;
import tramsim.tiles.platforms.edges.*;
import tramsim.tiles.stops.*;
import tramsim.tiles.stops.render.RenderBusStop;

import javax.naming.Context;
import javax.security.auth.callback.Callback;

import static tramsim.TramsIM_Blocks.blockList;


@Mod(modid = TramsIM.MODID, version = TramsIM.MOD_VERSION, name = "Trams in Motion")
public class TramsIM {

    public static final String MODID = "tramsim";
    public static final String MOD_VERSION="0.2 prerelease";

    @SidedProxy(clientSide="tramsim.ClientProxy", serverSide = "tramsim.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs tramsimtabvehicle;
    public static CreativeTabs tramsimtabblock;

    private Boolean flagmod=false;


    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event) {

        //TramsIM_Blocks.registerBlocks();
        proxy.registerRenderers();

        GameRegistry.registerTileEntity(TileEntityTicketMachine_Kzkgop.class, "ticketmachine_kzkgop");
        GameRegistry.registerTileEntity(TileEntityTicketMachine_Brno.class, "ticketmachine_brno");

        //GameRegistry.registerTileEntity(TileEntityBusStop_2_Left_1.class, "busstop_2_left_1");
        GameRegistry.registerTileEntity(TileEntityBusStop_2_Middle_1.class, "busstop_2_middle_1");
        GameRegistry.registerTileEntity(TileEntityBusStop_2_Middle_2.class, "busstop_2_middle_2");
        GameRegistry.registerTileEntity(TileEntityBusStop_2_Middle_3.class, "busstop_2_middle_3");
        GameRegistry.registerTileEntity(TileEntityBusStop_2_Middle_4.class, "busstop_2_middle_4");
        GameRegistry.registerTileEntity(TileEntityBusStop_2_Middle_5.class, "busstop_2_middle_5");
        GameRegistry.registerTileEntity(TileEntityBusStop_2_Right_1.class, "busstop_2_right_1");
        GameRegistry.registerTileEntity(TileEntityBusStop_3_Left_1.class, "busstop_3_left_1");
        GameRegistry.registerTileEntity(TileEntityBusStop_3_Middle_1.class, "busstop_3_middle_1");
        GameRegistry.registerTileEntity(TileEntityBusStop_3_Right_1.class, "busstop_3_right_1");

        GameRegistry.registerTileEntity(TileEntityPlatform.class, "platform");
        GameRegistry.registerTileEntity(TileEntityPlatformPole.class, "platformPole");


        /* Pre-release 2 blocked
        GameRegistry.registerTileEntity(TileEntityEdgeBritish.class, "edge_british");
        GameRegistry.registerTileEntity(TileEntityEdgeChecker.class, "edge_checker");
        GameRegistry.registerTileEntity(TileEntityEdgeLed.class, "edge_led");
        GameRegistry.registerTileEntity(TileEntityEdgeLedLined.class, "edge_ledlined");
        GameRegistry.registerTileEntity(TileEntityEdgeLeftCorner.class, "edge_leftcorner");
        GameRegistry.registerTileEntity(TileEntityEdgeLined.class, "edge_lined");
        GameRegistry.registerTileEntity(TileEntityEdgePlain.class, "edge_plain");
        GameRegistry.registerTileEntity(TileEntityEdgeRightCorner.class, "edge_rightcorner");
        GameRegistry.registerTileEntity(TileEntityEdgeYellowLined.class, "edge_yellowlined");
        GameRegistry.registerTileEntity(TileEntityEdgeYellowThick.class, "edge_yellowthick");
*/
    }
    public static GenericRailTransport[] listElectricTrams() {
        return new GenericRailTransport[]{
                new EntityKonstal105Na(null),
/*/Pre-release 2 blocked*/                new EntityKonstalN(null),
                new EntityKonstal105NaMl(null),
                new EntityKonstal105Na135R(null),
                new EntityTatraT3(null),
                //       new EntityBombardierCR4000(null),
                new EntityDuewagPT8 (null),
                new EntityModerusAlfa (null),
/*/Pre-release 2 blocked*/                new EntityPCC( null),
/*/Pre-release 2 blocked*/                new EntityTriebwagen105(null),
                new EntityBNLRV_A(null),
                new EntityTatraT3Short(null),
/*/Pre-release 2 blocked*/                new EntityCombinoEnd(null),
/*/Pre-release 2 blocked*/                new EntityRussiaOne(null),
/*/Pre-release 2 blocked*/                new EntityMGT6D(null),
                new EntityTatraK2_End(null)
        };
    }
    public static GenericRailTransport[] listWagonTrams() {
        return new GenericRailTransport[]{
                //       new EntityBombardierCR4000_Middle(null)
                new EntityDuewagPT8_Middle(null),
                new EntityBNLRV_B( null),
/*/Pre-release 2 blocked*/                new EntityCombino_Halfmiddle_1(null),
/*/Pre-release 2 blocked*/                new EntityCombino_Halfmiddle_2(null),
/*/Pre-release 2 blocked*/                new EntityCombino_Middle(null),
/*/Pre-release 2 blocked*/                new EntityCombino_Halfmiddle_2_ticket(null),
/*/Pre-release 2 blocked*/                new EntityCombino_Halfmiddle_1_bidir(null),
/*/Pre-release 2 blocked*/                new EntityRussiaOne_Middle(null),
/*/Pre-release 2 blocked*/                new EntityRussiaOne_NoPanto(null),
/*/Pre-release 2 blocked*/                new EntityMGT6D_Middle(null),
                new EntityTatraK2_Back(null)
        };
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        tramsimtabvehicle = new TiMTab( event.getSide().isClient(),"Trams in Motion vehicles" , MODID ,"tramsimTabVeh");
        tramsimtabblock = new TiMTab(event.getSide().isClient(),"Trams in Motion blocks", MODID, "tramsimTabBlo");

        //blocks added
        //blockList.add(TiMGenericRegistry.registerBlock(TrainsInMotion.proxy.isClient(),new BlockTicketMachine_Kzkgop().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:ticketmachine_kzkgop"), null, "ticketmachine_kzkgop.name", null, proxy.getRenderBusStop()));
        //blockList.add(TiMGenericRegistry.registerBlock(TrainsInMotion.proxy.isClient(),new BlockTicketMachine_Brno().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:ticketmachine_brno"), null, "ticketmachine_brno.name", null, proxy.getRenderBusStop()));

        blockList.add(TiMGenericRegistry.registerBlock(TrainsInMotion.proxy.isClient(),new BusStop_2_Left_1().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/l_end"), null, "busstop_2_left_1", null, proxy.getRenderBusStop()));
        blockList.add(TiMGenericRegistry.registerBlock(TrainsInMotion.proxy.isClient(),new BusStop_2_Middle_1().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/m-glass-bench"), null, "busstop_2_middle_1", null, proxy.getRenderBusStop()));
        blockList.add(TiMGenericRegistry.registerBlock(TrainsInMotion.proxy.isClient(),new BusStop_2_Middle_2().setCreativeTab(this.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/m-glass"), null, "busstop_2_middle_2", null, proxy.getRenderBusStop()));
        blockList.add(TiMGenericRegistry.registerBlock(TrainsInMotion.proxy.isClient(),new BusStop_2_Middle_3().setCreativeTab(this.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/m-glass-ttable"), null, "busstop_2_middle_3", null, proxy.getRenderBusStop()));
        blockList.add(TiMGenericRegistry.registerBlock(TrainsInMotion.proxy.isClient(),new BusStop_2_Middle_4().setCreativeTab(this.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/m-pat"), null, "busstop_2_middle_4", null, proxy.getRenderBusStop()));
        blockList.add(TiMGenericRegistry.registerBlock(TrainsInMotion.proxy.isClient(),new BusStop_2_Middle_5().setCreativeTab(this.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/m-pat-timetable"), null, "busstop_2_middle_5", null, proxy.getRenderBusStop()));
        blockList.add(TiMGenericRegistry.registerBlock(TrainsInMotion.proxy.isClient(),new BusStop_2_Right_1().setCreativeTab(this.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/r_end"), null, "busstop_2_right_1", null, proxy.getRenderBusStop()));

        blockList.add(TiMGenericRegistry.registerBlock(TrainsInMotion.proxy.isClient(),new BusStop_3_Left_1().setCreativeTab(this.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var3/"), null, "busstop_3_left_1", null, proxy.getRenderBusStop()));
        blockList.add(TiMGenericRegistry.registerBlock(TrainsInMotion.proxy.isClient(),new BusStop_3_Middle_1().setCreativeTab(this.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var3/"), null, "busstop_3_middle_1", null, proxy.getRenderBusStop()));
        blockList.add(TiMGenericRegistry.registerBlock(TrainsInMotion.proxy.isClient(),new BusStop_3_Right_1().setCreativeTab(this.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var3/"), null, "busstop_3_right_1", null, proxy.getRenderBusStop()));


        /*
        if (flagmod==true)
        {
            FlagRegistry.flags.add(new Flag_Instance("tramsimsmf", Flag_Instance.types.SMALL_FLAG, FlagmodEurope.eusmf, "tramsim", "smallIco"));
            FlagRegistry.flags.add(new Flag_Instance("tramsimbgf", Flag_Instance.types.BIG_FLAG, FlagmodEurope.eubgf, "tramsim", "bigIco"));
            FlagRegistry.flags.add(new Flag_Instance("tramsimwlf", Flag_Instance.types.WALL_FLAG, FlagmodEurope.euwlf, "tramsim", "wallIco"));
        }
*/

        TiMGenericRegistry.registerTransports(event.getSide().isClient(), MODID, listElectricTrams(), null);
        TiMGenericRegistry.registerTransports(event.getSide().isClient(), MODID, listWagonTrams(), null);
        if (event.getSide().isClient()) {
            MinecraftForge.EVENT_BUS.register(ClientProxy.eventManager);
            FMLCommonHandler.instance().bus().register(ClientProxy.eventManager);
        }

    }

}
