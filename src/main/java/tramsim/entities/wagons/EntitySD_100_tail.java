package tramsim.entities.wagons;

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
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tramsim.TramsIM;
import tramsim.models.bogies.SD_100_Bogie;
import tramsim.models.bogies.SD_100_articulation;
import tramsim.models.trains.SD_100_front;
import tramsim.models.wagons.SD_100_tail;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class EntitySD_100_tail extends TrainBase {



    public static final Item thisItem = new ItemTransport(new EntitySD_100_tail(null), TramsIM.MODID,TramsIM.tramsimtabvehicle);


    public EntitySD_100_tail(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntitySD_100_tail(World world){
        super(world);
    }

    @Override
    public String transportName(){return "SD_100_tail";}
    @Override
    public String transportcountry(){return "USA";}
    @Override
    public String transportYear(){return "1990+";}
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
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/SD_100_mts.png", "textures/trams/bogies/SD100_articulation_mts.png",
        "MTS San diego", "Standard livery used in San Diego.");
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/SD_100_rtd_denver.png", "textures/trams/bogies/SD100_articulation_rtd.png",
                "RTD Rail Denver", "Standard livery used in Denver before modernisation.");
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/SD_100_sacrt_old.png", "textures/trams/bogies/SD100_articulation_sacrt.png",
                "Sacramento Rapid Transit", "Old livery inspired by the Sacramento RT CAF cars.");
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/SD_100_custom.png", "textures/trams/bogies/SD100_articulation_custom.png",
                "Your transit agency", "this is a placeholder for an livery of your own creation");
    }

    public String[][] getTankFilters() {
        return FuelHandler.DefaultTanks.ELECTRIC.value();
    }

    @Override
    public float transportTopSpeed(){return 80f;}
    @Override
    public List<Double> getRenderBogieOffsets(){return  Arrays.asList(0.625, -2.575);}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){return TrainsInMotion.transportTypes.ELECTRIC.singleton();}
    @Override
    public float getMaxFuel(){return 1;}
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-0.130f,1f, 0.3f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{4.65f,1.75f,1.5f};
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
        return new float[][]{{0.175f,-0.06f,0f}};}
    @Override
    public ModelBase[] bogieModels(){  return new ModelBase[]{new SD_100_Bogie()};}


    @Override
    public float[] rotationPoints() {
        return new float[]{2.275f, -1.2375f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() { return new float[][]{{-0.2f,0f,0f}}; }

    /**
     * <h2>rider sit or stand</h2>
     * @return true if the rider(s) should be sitting, false if the rider should be standing.
     */
    @Override
    public boolean shouldRiderSit(){
        return true;
    }

    /**
     * <h2>reinforced transport</h2>
     * this returns if this specific entity is reinforced (explosion proof and damage resistant).
     * since this is a function it can be conditional as well, for instance if it has a specific skin.
     */
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
    public ModelBase[] getModel(){return new ModelBase[]{new SD_100_tail()};}

    /**
     * <h2>sets the resource location for sounds, like horn and the sound made for the engine running</h2>
     */
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}
