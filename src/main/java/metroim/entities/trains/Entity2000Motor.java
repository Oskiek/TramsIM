package metroim.entities.trains;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TrainBase;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import metroim.MetroIM;
import metroim.models.bogies.Metro2000_Bogie;
import metroim.models.trains.Motor2000;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class Entity2000Motor extends TrainBase {



    public static final Item thisItem = new ItemTransport(new Entity2000Motor(null), MetroIM.MODID, MetroIM.metroimtabvehicle);


    public Entity2000Motor(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public Entity2000Motor(World world){
        super(world);
    }

    @Override
    public String transportName(){return "Metro2000_Motor";}
    @Override
    public String transportcountry(){return "Spain";}
    @Override
    public String transportYear(){return "1985+";}
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
        SkinRegistry.addSkin(this.getClass(),MetroIM.MODID, "textures/trams/2000_Blue.png", "textures/trams/bogies/2000_bogie.png",
                "skin1", "Standard livery used in Madrid.");
        SkinRegistry.addSkin(this.getClass(),MetroIM.MODID, "textures/trams/2000_Orange.png", "textures/trams/bogies/2000_bogie.png",
                "skin2", "Original livery used in its first years in Madrid.");
        SkinRegistry.addSkin(this.getClass(),MetroIM.MODID, "textures/trams/2000_Red.png", "textures/trams/bogies/2000_bogie.png",
                "skin3", "Old livery used in the early 2000s in Madrid.");
    }

    public String getDefaultSkin(){return "metroim:skin1";}

    public String[][] getTankFilters() {
        return FuelHandler.DefaultTanks.ELECTRIC.value();
    }

    @Override
    public float transportTopSpeed(){return 80f;}
    @Override
    public List<Double> getRenderBogieOffsets(){return  Arrays.asList(1.40625, -1.46875);}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){return TrainsInMotion.transportTypes.ELECTRIC.singleton();}
    @Override
    public float getMaxFuel(){return 1;}
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.8125f,0.9f, 0f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{4.75f,1.75f,1.5f};
    }

    @Override
    public float transportMetricHorsePower(){return 65f;}

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
        return new float[][]{{1.40625f,-0.05f,0},{-1.46875f,-0.05f,0}};}
    @Override
    public ModelBase[] bogieModels(){  return new ModelBase[]{new Metro2000_Bogie()};}

    @Override
    public float[] rotationPoints() {
        return new float[]{1.40625f, -1.46875f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() { return new float[][]{{0f,-0.0625f,0f}}; }

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
            case 400:{return stack!=null && stack.getItem() ==Items.redstone;}
            default:{return true;}
        }
    }
    @Override
    public void manageFuel() {
        this.fuelHandler.manageElectric(this);
    }

    public Item getItem(){
        return thisItem;
    }

    @Override
    public Bogie[] getBogieModels(){return null;}

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new Motor2000()};}

    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}
