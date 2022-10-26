package tramsim;

//import Oskiek.FlagmodEurope.FlagRegistry;
//import Oskiek.FlagmodEurope.Flag_Instance;
//import Oskiek.FlagmodEurope.FlagmodEurope;
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
import tramsim.blocks.BlockOrensePole;
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
    public static final String MOD_VERSION="Pre-release 3.0";

    @SidedProxy(clientSide="tramsim.ClientProxy", serverSide = "tramsim.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs tramsimtabvehicle;
    public static CreativeTabs tramsimtabblock;

    private Boolean flagmod=false;


    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event) {
        TramsIM_Blocks.registerBlocks();
        proxy.registerRenderers();

        GameRegistry.registerTileEntity(TileEntityTicketMachine_Kzkgop.class, "ticketmachine_kzkgop");
        GameRegistry.registerTileEntity(TileEntityTicketMachine_Brno.class, "ticketmachine_brno");

        GameRegistry.registerTileEntity(TileEntityBusStop_2_Left_1.class, "busstop_2_left_1");
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

        /*
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
//                new EntityKonstalN(null),
                new EntityKonstal105NaMl(null),
                new EntityKonstal105Na135R(null),
                new EntitySD_100_motor(null),
                new EntityTatraT3(null),
                //       new EntityBombardierCR4000(null),
                new EntityDuewagPT8 (null),
                new EntityModerusAlfa (null),
                new EntityPCC( null),
                new EntityTriebwagen105(null),
                new EntityBNLRV_A(null),
                new EntityKawasakiLRV(null),
                new EntityTatraT3Short(null),
//                new EntityCombinoEnd(null),
                new EntityRussiaOne(null),
                new EntityMGT6D(null),
                new EntityTatraK2_End(null),
                new EntityLohnerE1(null),
                new EntityModerusBeta_End(null),
                new EntityTatraK5(null),
                new EntityTatraT4(null),
                new EntityST12(null),
                new EntityM8C(null),
                new EntityCitadis_front(null),
                new EntityTriebwagen305(null),
//2.2 blocked                new EntityM8S(null)
        };
    }
    public static GenericRailTransport[] listWagonTrams() {
        return new GenericRailTransport[]{
                //       new EntityBombardierCR4000_Middle(null)
                new EntityDuewagPT8_Middle(null),
                new EntityBNLRV_B( null),
//                new EntityCombino_Halfmiddle_1(null),
//                new EntityCombino_Halfmiddle_2(null),
//                new EntityCombino_Middle(null),
//                new EntityCombino_Halfmiddle_2_ticket(null),
//                new EntityCombino_Halfmiddle_1_bidir(null),
                new EntityCitadis_suspended_middle(null),
                new EntityCitadis_suspended_middle_panto(null),
                new EntityCitadis_middle(null),
                new EntitySD_100_tail(null),
                new EntityRussiaOne_Middle(null),
                new EntityRussiaOne_NoPanto(null),
                new EntityMGT6D_Middle(null),
                new EntityTatraK2_Back(null),
                new EntityLohnerE1_Back(null),
                new EntityModerusBeta_Middle(null),
                new EntityTatraK5_Back(null),
                new EntityTatraB4(null),
                new EntityST12_Back(null),
                new EntityST12_Middle(null),
                new EntityM8C_Middle(null),
                new EntityM8C_Tail(null),
                new EntityBeiwagen305(null),
//2.2 blocked                new EntityM8S_Middle(null),
//2.2 blocked                new EntityM8S_Tail(null)

        };
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        tramsimtabvehicle = new TiMTab("Trams in Motion vehicles" , MODID ,"tramsimTabVeh");
        tramsimtabblock = new TiMTab("Trams in Motion blocks", MODID, "tramsimTabBlo");

        //TramsIM_Blocks.registerBlocks();

        /*/blocks added
        blockList.add(TiMGenericRegistry.registerBlock(new BlockTicketMachine_Kzkgop().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/iconTicketmachineKZKGOP"), null, "ticketmachine_kzkgop", null, proxy.getRenderTicketMachine()));
        blockList.add(TiMGenericRegistry.registerBlock(new BlockTicketMachine_Brno().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/iconTicketmachineBrno"), null, "ticketmachine_brno", null, proxy.getRenderTicketMachine()));

        blockList.add(TiMGenericRegistry.registerBlock(new BlockOrensePole().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/icon_orense_pole"), null, "stop_pole_Orense", null, proxy.getRenderPole()));

        blockList.add(TiMGenericRegistry.registerBlock(new BusStop_2_Left_1().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/l_end"), null, "busstop_2_left_1", null, proxy.getRenderBusStop()));
        blockList.add(TiMGenericRegistry.registerBlock(new BusStop_2_Middle_1().setCreativeTab(TramsIM.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/m-glass-bench"), null, "busstop_2_middle_1", null, proxy.getRenderBusStop()));
        blockList.add(TiMGenericRegistry.registerBlock(new BusStop_2_Middle_2().setCreativeTab(this.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/m-glass"), null, "busstop_2_middle_2", null, proxy.getRenderBusStop()));
        blockList.add(TiMGenericRegistry.registerBlock(new BusStop_2_Middle_3().setCreativeTab(this.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/m-glass-ttable"), null, "busstop_2_middle_3", null, proxy.getRenderBusStop()));
        blockList.add(TiMGenericRegistry.registerBlock(new BusStop_2_Middle_4().setCreativeTab(this.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/m-pat"), null, "busstop_2_middle_4", null, proxy.getRenderBusStop()));
        blockList.add(TiMGenericRegistry.registerBlock(new BusStop_2_Middle_5().setCreativeTab(this.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/m-pat-timetable"), null, "busstop_2_middle_5", null, proxy.getRenderBusStop()));
        blockList.add(TiMGenericRegistry.registerBlock(new BusStop_2_Right_1().setCreativeTab(this.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var2/r_end"), null, "busstop_2_right_1", null, proxy.getRenderBusStop()));

        blockList.add(TiMGenericRegistry.registerBlock(new BusStop_3_Left_1().setCreativeTab(this.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var3/left"), null, "busstop_3_left_1", null, proxy.getRenderBusStop()));
        blockList.add(TiMGenericRegistry.registerBlock(new BusStop_3_Middle_1().setCreativeTab(this.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var3/middle"), null, "busstop_3_middle_1", null, proxy.getRenderBusStop()));
        blockList.add(TiMGenericRegistry.registerBlock(new BusStop_3_Right_1().setCreativeTab(this.tramsimtabblock).setBlockTextureName("tramsim:icon/shelter/var3/right"), null, "busstop_3_right_1", null, proxy.getRenderBusStop()));
        */

        /*
        if (flagmod==true)
        {
            FlagRegistry.flags.add(new Flag_Instance("tramsimsmf", Flag_Instance.types.SMALL_FLAG, FlagmodEurope.eusmf, "tramsim", "smallIco"));
            FlagRegistry.flags.add(new Flag_Instance("tramsimbgf", Flag_Instance.types.BIG_FLAG, FlagmodEurope.eubgf, "tramsim", "bigIco"));
            FlagRegistry.flags.add(new Flag_Instance("tramsimwlf", Flag_Instance.types.WALL_FLAG, FlagmodEurope.euwlf, "tramsim", "wallIco"));
        }
*/

        TiMGenericRegistry.registerTransports(MODID, listElectricTrams(), (Object)null);
        TiMGenericRegistry.registerTransports(MODID, listWagonTrams(), (Object)null);
        if (event.getSide().isClient()) {
            MinecraftForge.EVENT_BUS.register(eventManager);
            FMLCommonHandler.instance().bus().register(ClientProxy.eventManager);
        }

    }
    public static EventManager eventManager = new EventManager();
}
