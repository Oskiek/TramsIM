package spanish_pack;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.TiMTab;
import ebf.tim.registry.TiMGenericRegistry;
import spanish_pack.blocks.Block_catenary_Single_A;
import spanish_pack.entities.trains.*;
import spanish_pack.entities.wagons.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import spanish_pack.blocks.*;
import spanish_pack.tiles.*;
import static spanish_pack.Spanish_pack_Blocks.blockList;

//train imports
//block imports


@Mod(modid = Spanish_pack.MODID, version = Spanish_pack.MOD_VERSION, name = "Spanish Pack", dependencies = "required-after:trainsinmotion")
public class Spanish_pack {

    public static final String MODID = "spanish_pack";
    public static final String MOD_VERSION="0.1 prerelease";

    @SidedProxy(clientSide="spanish_pack.ClientProxy", serverSide = "spanish_pack.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs spanish_pack;
    public static CreativeTabs spanish_pack_block;

    private Boolean flagmod=false;

    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event) {

        proxy.registerRenderers();
        GameRegistry.registerTileEntity(TileEntityCatenary_single_A.class, "Catenary_single_A");


    }
    public static GenericRailTransport[] listElectricTrams() {
        return new GenericRailTransport[]{
                                         new EntityEuskotren200(null),
                                          new EntityEuskotren300(null),
/*/Pre-release 1 blocked*/                new EntityRenfe440(null),
                                         new EntityRenfe446(null),
/*/Pre-release 1 blocked*/                new EntityRenfe450motor(null),
/*/Pre-release 1 blocked*/                new EntityRenfe592motor(null),
/*/Pre-release 1 blocked*/                new EntityRenfe269(null),
/*/Pre-release 1 blocked*/                new EntityRenfe440R(null),
                /*/Pre-release 1 blocked*/      new Entityfeve3300(null)
        };
    }
    public static GenericRailTransport[] listWagonTrams() {
        return new GenericRailTransport[]{
                                         new EntityEuskotren200Middle(null),
                                         new EntityRenfe446_Middle(null),
/*/Pre-release 1 blocked*/                new EntityRenfe592tail(null),
/*/Pre-release 1 blocked*/                new EntityRenfe450middle(null),
/*/Pre-release 1 blocked*/                new EntityRenfe450tail(null),
/*/Pre-release 1 blocked*/                new EntityRenfe440tail(null),
/*/Pre-release 1 blocked*/                new EntityRenfe440Rtail(null),
/*/Pre-release 1 blocked*/                new EntityRenfe440Rmiddle(null),
                                          new EntityEuskotren300tail(null),
                /*/Pre-release 1 blocked*/      new EntityRenfeCivia(null),
                /*/Pre-release 1 blocked*/      new EntityCivia_Middle(null),
                /*/Pre-release 1 blocked*/      new EntityCivia_Middle2(null),
                /*/Pre-release 1 blocked*/      new EntityCivia_tail(null),
                /*/Pre-release 1 blocked*/      new EntityRenfeCivia_w_Panto(null),
                /*/Pre-release 1 blocked*/      new Entityfeve3300tail(null),
                /*/Pre-release 1 blocked*/      new Entitytalgomiddlestandard(null),
                /*/Pre-release 1 blocked*/      new Entitytalgoendcar1(null),
                /*/Pre-release 1 blocked*/      new Entitytalgoendcar2(null)
        };
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {


        spanish_pack = new TiMTab("Spanish pack vehicles" , MODID ,"spack_TabVeh");
        spanish_pack_block = new TiMTab("Spanish pack blocks", MODID, "spack_TabBlo");

        blockList.add(TiMGenericRegistry.registerBlock(new Block_catenary_Single_A().setCreativeTab(Spanish_pack.spanish_pack_block).setBlockTextureName("spanish_pack:icon/Catenary_single_A_icon"), null, "Catenary_single_A", null, proxy.getRenderCatenary()));
        blockList.add(TiMGenericRegistry.registerBlock(new Block_catenary_Single_B().setCreativeTab(Spanish_pack.spanish_pack_block).setBlockTextureName("spanish_pack:icon/Catenary_single_B_icon"), null, "Catenary_single_B", null, proxy.getRenderCatenary()));
        blockList.add(TiMGenericRegistry.registerBlock(new Block_catenary_double_C().setCreativeTab(Spanish_pack.spanish_pack_block).setBlockTextureName("spanish_pack:icon/Catenary_double_C_icon"), null, "Catenary_double_C", null, proxy.getRenderCatenary()));
        TiMGenericRegistry.registerTransports(MODID, listElectricTrams(), (Object)null);
        TiMGenericRegistry.registerTransports(MODID, listWagonTrams(), (Object)null);
        if (event.getSide().isClient()) {
            MinecraftForge.EVENT_BUS.register(ClientProxy.eventManager);
            FMLCommonHandler.instance().bus().register(ClientProxy.eventManager);
        }

    }

}
