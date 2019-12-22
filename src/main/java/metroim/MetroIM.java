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
    public static final String MOD_VERSION="0.1 prerelease";

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
/*/Pre-release 1 blocked*/                new Entity4300Motor(null),
                new Entity3700Motor(null),
/*/Pre-release 1 blocked*/                new Entity3700Motor_v2(null),
/*/Pre-release 1 blocked*/                new EntityBVG_G(null),
                new Entity3600Motor(null),
/*/Pre-release 1 blocked*/                 new EntityEuskotren200(null),
/*/Pre-release 1 blocked*/                 new EntityRenfe440(null)
        };
    }
    public static GenericRailTransport[] listWagonTrams() {
        return new GenericRailTransport[]{
/*/Pre-release 1 blocked*/                new EntityFGV4300_Middle_Bogie(null),
/*/Pre-release 1 blocked*/                new EntityFGV4300_Tail(null),
                new EntityFGV3700_Tail_v1(null),
/*/Pre-release 1 blocked*/                new EntityFGV3700_Tail_v2(null),
                new EntityFGV3600_Tail(null),
                new EntityFGV3600_Middle(null),
/*/Pre-release 1 blocked*/                 new EntityEuskotren200Middle(null)

        };
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {


        metroimtabvehicle = new TiMTab("Metro in Motion vehicles" , MODID ,"metroimTabVeh");
        metroimtabblock = new TiMTab("Metro in Motion blocks", MODID, "metroimTabBlo");

        TiMGenericRegistry.registerTransports(MODID, listElectricTrams(), (Object)null);
        TiMGenericRegistry.registerTransports(MODID, listWagonTrams(), (Object)null);
        if (event.getSide().isClient()) {
            MinecraftForge.EVENT_BUS.register(ClientProxy.eventManager);
            FMLCommonHandler.instance().bus().register(ClientProxy.eventManager);
        }

    }

}
