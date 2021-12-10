package tramsim.entities.trains;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TrainBase;
import ebf.tim.entities.GenericRailTransport;
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
import net.minecraftforge.fluids.FluidRegistry;
import tramsim.TramsIM;
import tramsim.models.bogies.ModelKT4_Bogie;
import tramsim.models.trains.Konstal105Na;
import tramsim.models.trains.TatraT3;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class EntityTatraT3 extends TrainBase {



    public static final Item thisItem = new ItemTransport(new EntityTatraT3(null), TramsIM.MODID,TramsIM.tramsimtabvehicle);


    public EntityTatraT3(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityTatraT3(World world){
        super(world);
    }

    @Override
    public String transportName(){return "TatraT3";}
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
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tatrat3_brno.png", "textures/trams/bogies/kt4_bogie.png",
                "company.brno", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.brno") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tatrat3_olomouc.png", "textures/trams/bogies/kt4_bogie.png",
                "company.olomouc", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.olomouc") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tatrat3_praha.png", "textures/trams/bogies/kt4_bogie.png",
                "company.praha", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.praha") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tatrat3_ostrava.png", "textures/trams/bogies/kt4_bogie.png",
                "company.ostrava", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.ostrava") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tatrat3_most.png", "textures/trams/bogies/kt4_bogie.png",
                "company.most", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.most") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tatrat3_halle.png", "textures/trams/bogies/kt4_bogie.png",
                "company.halle", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.halle") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tatrat3_odessa.png", "textures/trams/bogies/kt4_bogie.png",
                "company.odessa", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.odessa") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tatrat3_liberec.png", "textures/trams/bogies/kt4_bogie.png",
                "company.liberec", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.liberec") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tatrat3_riga.png", "textures/trams/bogies/kt4_bogie.png",
                "company.riga", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.riga") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tatra_t3_anniv.png", "textures/trams/bogies/kt4_bogie.png",
                "anniversary", CommonUtil.translate("anniversary.description"));
    }

    public String getDefaultSkin(){
        return "tramsim:company.brno";
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
        return new float[][]{{1.65f,-0.035f,0f,},{-1.65f,-0.035f,0f}};}

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
    public float[][] modelOffsets() { return new float[][]{{0,0f,0}}; }

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
    public ModelBase[] getModel(){return new ModelBase[]{new TatraT3()};}

    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}