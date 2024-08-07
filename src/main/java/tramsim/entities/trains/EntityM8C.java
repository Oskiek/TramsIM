package tramsim.entities.trains;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TrainBase;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tramsim.TramsIM;
import tramsim.models.bogies.*;
import tramsim.models.trains.DuewagPT8;
import tramsim.models.trains.M8C_End;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class EntityM8C extends TrainBase {



    public static final Item thisItem = new ItemTransport(new EntityM8C(null), TramsIM.MODID,TramsIM.tramsimtabvehicle);


    public EntityM8C(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityM8C(World world){
        super(world);
    }

    @Override
    public String transportName(){return "M8C";}
    @Override
    public String transportcountry(){return "Germany";}
    @Override
    public String transportYear(){return "1984+";}
    @Override
    public String transportFuelType() {
        return "Electric";
    }
    @Override
    public boolean isFictional(){return false;}
    @Override
    public float transportTractiveEffort(){return 0;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/M8C_Orange.png", "textures/trams/bogies/m8c_bogie_mainz.png",
                "Mainzer Verkehrsgesellschaft", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.mainz") + ".");
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/m8c_ruhrbahn.png","textures/trams/bogies/m8c_bogie_ruhrbahn.png",
                "Ruhrbahn", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.ruhrbahn") + ".");
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/M8C_Pink.png","textures/trams/bogies/m8c_bogie_krefeld.png",
                "SWK krefeld", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.krefeld") + ".");
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/m8c_mhvg.png","textures/trams/bogies/m8c_bogie_mhvg.png",
                "Mülheimer Verkehrsgesellschaft", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("Livery used in Mülheim a.d. Ruhr") + ".");
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/M8C_Yellow.png","textures/trams/bogies/m8c_bogie_evag.png",
                "EVAG Essen", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("Old livery used in Essen") + ".");
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/m8c_kassel_old.png","textures/trams/bogies/m8c_bogie_kassel_old.png",
                "KVG Kassel", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("old livery that was used in Kassel") + ".");
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/M8C_Brown.png","textures/trams/bogies/m8c_bogie_kassel_old.png",
                "Dortmunder Stadtwerke", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("old livery that was used in Dortmund") + ".");
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/M8C_Red.png","textures/trams/bogies/m8c_bogie_kassel_old.png",
                "DSW 21", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("Last livery that was used in Dortmund until 2011") + ".");
    }

    public String getDefaultSkin(){
        return "tramsim:Ruhrbahn";
    }
    @Override
    public String[][] getTankFilters() {
        return FuelHandler.DefaultTanks.ELECTRIC.value();
    }
    @Override
    public float transportTopSpeed(){return 80f;}
    @Override
    public List<Double> getRenderBogieOffsets(){return  Arrays.asList(0.625, -2.1);}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){return TrainsInMotion.transportTypes.ELECTRIC.singleton();}
    @Override
    public float getMaxFuel(){return 1;}
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.75f,1f, 0.1f}};}
    @Override
    public float[] getHitboxSize() {
        return new float[]{4.2f,1.75f,1.5f};
    }
    @Override
    public float transportMetricHorsePower(){return 75f;}
    @Override
    public String[] additionalItemText() {
        return null;
    }
    @Override
    public float weightKg(){return 11500f;}
    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        };
    }
    @Override
    public float getPistonOffset(){return 0f;}

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{0.625f,0.f,0},{-2.08f,0.0f,0}};}
    @Override
    public ModelBase[] bogieModels(){  return new ModelBase[]{ new NullBogiePlaceHolder()};}

    @Override
    public float[] rotationPoints() {
        return new float[]{2.125f, -0.9f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() { return new float[][]{{0.1f,-0.025f,0f}}; }

    @Override
    public boolean shouldRiderSit(){
        return true;
    }

    @Override
    public boolean isReinforced(){return false;}

    @Override
    public int[] getTankCapacity(){return new int[]{8000};}

    @Override
    public ItemStackSlot fuelSlot(){
        return new ItemStackSlot(this, 400,114,32).setOverlay(Items.redstone);
    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack){
        switch (slot){
            case 400:{return stack!=null && stack.getItem() == Items.redstone;}
            default:{return true;}
        }
    }

    public Item getItem(){
        return thisItem;
    }

    @Override
    public Bogie[] getBogieModels(){return null;}

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new M8C_End()};}

    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("Roll.ogg");}
}
