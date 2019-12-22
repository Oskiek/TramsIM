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
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import tramsim.TramsIM;
import tramsim.models.bogies.BNLRV_Bogie;
import tramsim.models.bogies.BNLRV_Gelenk;
import tramsim.models.trains.BNLRV_A;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class EntityBNLRV_A extends TrainBase {



    public static final Item thisItem = new ItemTransport(new EntityBNLRV_A(null), TramsIM.MODID,TramsIM.tramsimtabvehicle);


    public EntityBNLRV_A(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityBNLRV_A(World world){
        super(world);
    }

    @Override
    public String transportName(){return "BNLRV_A";}
    @Override
    public String transportcountry(){return "Belgium";}
    @Override
    public String transportYear(){return "1980+";}
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
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/bnlrv_1.png", "textures/trams/bogies/bnlrv_bogie.png",
                "company.tec", RailUtility.translate("standardlivery") + " " + RailUtility.translate("in.belgium") + ".");
    }

    public String[][] getTankFilters() {
        return FuelHandler.DefaultTanks.ELECTRIC.value();
    }
    @Override
    public float transportTopSpeed(){return 80f;}

    @Override
    public List<Double> getRenderBogieOffsets(){return  Arrays.asList(0.5, -2.5);}

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
        return new float[]{5.05f,1.75f,1.5f};
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
        return new float[][]{{0.5f,-0.1f,0},{-2.5f,-0.1f,0}};}
    @Override
    public ModelBase[] bogieModels(){  return new ModelBase[]{new BNLRV_Bogie(), new BNLRV_Gelenk()};}


    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{0.5f, -2.5f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() { return new float[][]{{0f,0.3125f,0f}}; }

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
    public ModelBase[] getModel(){return new ModelBase[]{new BNLRV_A()};}

    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}
