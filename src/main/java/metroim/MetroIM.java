package metroim;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.TiMTab;
import ebf.tim.registry.TiMGenericRegistry;
import metroim.entities.trains.*;
import metroim.entities.wagons.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

//train imports
//block imports


@Mod(modid = MetroIM.MODID, version = MetroIM.MOD_VERSION, name = "Metro in Motion", dependencies = "required-after:trainsinmotion")
public class MetroIM {

    public static final String MODID = "metroim";
    public static final String MOD_VERSION="Pre-release 2.0";

    @SidedProxy(clientSide="metroim.ClientProxy", serverSide = "metroim.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs metroimtabvehicle;
    public static CreativeTabs metroimtabblock;

    private Boolean flagmod=false;

    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event) {

        proxy.registerRenderers();


    }
    public static GenericRailTransport[] listElectricTrams() {
        return new GenericRailTransport[]{
                                          new Entity4300Motor(null),
                                          new Entity3700Motor(null),
/*/Pre-release 1 blocked*/                new Entity3700Motor_v2(null),
/*/Pre-release 1 blocked*/                new EntityBVG_G(null),
/*/Pre-release 1 blocked*/                new Entity3600Motor(null),
//                new EntityB80DMotor(null),
                /*/Pre-release 1 blocked*/                new EntityKVB2300Motor(null),
                                          new Entity5000Motor(null),
                /*/Pre-release 1 blocked*/                new Entity5500Motor(null),
//                new EntityB100SMotor(null),
/*/Pre-release 1 blocked*/                new EntityBN_S1_S2Motor(null),
                                          new EntityTMB3000Motor(null),
/*/Pre-release 1 blocked*/                new Entity2000Motor(null),
/*/Pre-release 1 blocked*/                new EntityViennaU(null),
/*/Pre-release 1 blocked*/                new EntityMunichA(null),
                /*/Pre-release 1 blocked*/                new EntityB80C(null),
                /*/Pre-release 1 blocked*/                new EntityFiatMaterferMotor(null),
                /*/Pre-release 1 blocked*/                new EntityCAFGEE(null),
                /*/Pre-release 1 blocked*/                new Entity3000Motor(null),
        };
    }
    public static GenericRailTransport[] listWagonTrams() {
        return new GenericRailTransport[]{
                new EntityFGV4300_Middle_Bogie(null),
                new EntityFGV4300_Tail(null),
                new EntityFGV3700_Tail_v1(null),
/*/Pre-release 1 blocked*/               new EntityFGV3700_Tail_v2(null),
/*/Pre-release 1 blocked*/                new EntityFGV3600_Tail(null),
/*/Pre-release 1 blocked*/                new EntityFGV3600_Middle(null),
//                new EntityB80DTail(null),
                /*/Pre-release 1 blocked*/                new EntityKVB2300tail(null),
                                          new Entity5000_Tail(null),
                /*/Pre-release 1 blocked*/                new Entity5500_Tail(null),
//                new EntityB100STail(null),
/*/Pre-release 1 blocked*/                new EntityBN_S1_S2Tail(null),
                                          new EntityTMB3000_Tail(null),
                                          new EntityTMB3000_Middle(null),
/*/Pre-release 1 blocked*/                new Entity2000_Tail(null),
/*/Pre-release 1 blocked*/                new Entity3900motor(null),
/*/Pre-release 1 blocked*/                new Entity3900middle(null),
                /*/Pre-release 1 blocked*/                new EntityMunichA_tail(null),
                /*/Pre-release 1 blocked*/                new EntityB80C_tail(null),
                /*/Pre-release 1 blocked*/                new EntityFiatMaterferTail(null),
                /*/Pre-release 1 blocked*/                new EntityFiatMaterferMiddle(null),
                /*/Pre-release 1 blocked*/                new EntityMiddleCAFGEE(null),
                /*/Pre-release 1 blocked*/                new EntityMM3000_Middle(null),
        };
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {


        metroimtabvehicle = new TiMTab("Metro in Motion vehicles" , MODID ,"metroimTabVeh");
        //metroimtabblock = new TiMTab("Metro in Motion blocks", MODID, "metroimTabBlo");

        TiMGenericRegistry.registerTransports(MODID, listElectricTrams(), (Object)null);
        TiMGenericRegistry.registerTransports(MODID, listWagonTrams(), (Object)null);
        if (event.getSide().isClient()) {
            MinecraftForge.EVENT_BUS.register(ClientProxy.eventManager);
            FMLCommonHandler.instance().bus().register(ClientProxy.eventManager);
        }

    }

}
