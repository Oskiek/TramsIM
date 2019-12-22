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
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tramsim.TramsIM;
import tramsim.models.bogies.BNLRV_Bogie;
import tramsim.models.bogies.BNLRV_Gelenk;
import tramsim.models.bogies.LohnerE1_Bogie;
import tramsim.models.bogies.LohnerE1_Gelenk;
import tramsim.models.trains.BNLRV_A;
import tramsim.models.trains.LohnerE1;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class EntityLohnerE1 extends TrainBase {



    public static final Item thisItem = new ItemTransport(new EntityLohnerE1(null), TramsIM.MODID,TramsIM.tramsimtabvehicle);


    public EntityLohnerE1(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityLohnerE1(World world){
        super(world);
    }

    @Override
    public String transportName(){return "LohnerE1";}
    @Override
    public String transportcountry(){return "Germany";}
    @Override
    public String transportYear(){return "1959";}
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
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/lohner_e1_front_darmstadt.png", "textures/trams/bogies/lohner_e1_bogie_darmstadt.png",
                "company.tec", RailUtility.translate("standardlivery") + " " + RailUtility.translate("in.belgium") + ".");
    }

    public String[][] getTankFilters() {
        return FuelHandler.DefaultTanks.ELECTRIC.value();
    }
    @Override
    public float transportTopSpeed(){return 80f;}

    @Override
    public List<Double> getRenderBogieOffsets(){return  Arrays.asList(0.625, -2.25);}

    @Override
    public int getInventoryRows(){return 1;}

    @Override
    public TrainsInMotion.transportTypes getType(){return TrainsInMotion.transportTypes.ELECTRIC;}

    @Override
    public float getMaxFuel(){return 1;}

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.90625f,1.1f, 0f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{4.125f,1.75f,1.5f};
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
        return new float[][]{{0.625f,-0.1f,0},{-2.25f,-0.1f,0}};}
    @Override
    public ModelBase[] bogieModels(){  return new ModelBase[]{new LohnerE1_Bogie(), new LohnerE1_Gelenk()};}


    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{0.625f, -2.25f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() { return new float[][]{{0f,-0.15f,0f}}; }

    @Override
    public boolean shouldRiderSit(){
        return true;
    }

    @Override
    public boolean isReinforced(){return false;}

    @Override
    public int[] getTankCapacity(){return new int[]{8000};}


    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack){
        switch (slot){
            case 400:{return stack!=null && stack.getItem() == Items.redstone;}
            default:{return true;}
        }
    }

    @Override
    public void manageFuel(){
        fuelHandler.manageElectric(this);
    }

    public Item getItem(){
        return thisItem;
    }


    @Override
    public Bogie[] getBogieModels(){return null;}



    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new LohnerE1()};}

    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}
