package tramsim.entities.trains;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TrainBase;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tramsim.TramsIM;
import tramsim.models.bogies.ModelKT4_Bogie;
import tramsim.models.trains.TatraT3;
import tramsim.models.trains.TatraT4;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class EntityTatraT4 extends TrainBase {



    public static final Item thisItem = new ItemTransport(new EntityTatraT4(null), TramsIM.MODID,TramsIM.tramsimtabvehicle);


    public EntityTatraT4(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityTatraT4(World world){
        super(world);
    }

    @Override
    public String transportName(){return "TatraT4";}
    @Override
    public String transportcountry(){return "Czechia";}
    @Override
    public String transportYear(){return "1962+";}
    public String transportEra(){return "Electric";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public float transportTractiveEffort(){return 0;}
    @Override
    public String transportFuelType() {
        return "electric";
    }

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tatrat4_bucharest.png", "textures/trams/bogies/kt4_bogie.png",
                "company.bucharest", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.bucharest") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tatrat4_dresden.png", "textures/trams/bogies/kt4_bogie.png",
                "company.dresden", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.dresden") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tatrat4_lvlv.png", "textures/trams/bogies/kt4_bogie.png",
                "company.lviv", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.lviv") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tatrat4_zagreb.png", "textures/trams/bogies/kt4_bogie.png",
                "company.zagreb", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.zagreb") + "." + " I'm blue da ba dee...");
    }

    public String getDefaultSkin(){
        return "tramsim:company.bucharest";
    }


    @Override
    public String[][] getTankFilters() {
        return FuelHandler.DefaultTanks.ELECTRIC.value();
    }

    @Override
    public float transportTopSpeed(){return 62f;}

    @Override
    public List<Double> getRenderBogieOffsets(){return  Arrays.asList(-2.0, 2.0);}

    @Override
    public int getInventoryRows(){return 1;}

    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){return TrainsInMotion.transportTypes.ELECTRIC.singleton();}
    @Override
    public float getMaxFuel(){return 1;}
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-2.85f,1f, 0.1875f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{7f,2f,1.5f};
    }

    @Override
    public float transportMetricHorsePower(){return 75f;}

    @Override
    public String[] additionalItemText() {
        return null;
    }

    @Override
    public float weightKg(){return 10886.2169f;}

    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        };
    }


    @Override
    public float getPistonOffset(){return 0.5f;}


    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.65f,0.075f,0f,},{-1.65f,0.075f,0f}};}

    @Override
    public ModelBase[] bogieModels() { return new ModelBase[]{new ModelKT4_Bogie()};}

    @Override
    public float[] rotationPoints() {
        return new float[]{1.65f, -1.65f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() { return new float[][]{{0,-0.15f,0}}; }

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

    @Override
    public void manageFuel(){
        this.fuelHandler.manageElectric(this);
    }

    public Item getItem(){
        return thisItem;
    }

    @Override
    public Bogie[] getBogieModels(){return null;}

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new TatraT4()};}

    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}