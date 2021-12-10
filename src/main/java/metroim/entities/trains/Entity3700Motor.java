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
import metroim.models.bogies.StandardBogie;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import metroim.models.bogies.FGV3700_Bogie;
import metroim.models.bogies.FGV3700_Gelenk;
import metroim.models.trains.Motor3700_v1;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class Entity3700Motor extends TrainBase {



    public static final Item thisItem = new ItemTransport(new Entity3700Motor(null), MetroIM.MODID, MetroIM.metroimtabvehicle);


    public Entity3700Motor(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public Entity3700Motor(World world){
        super(world);
    }

    @Override
    public String transportName(){return "FGV3700_Motor";}
    @Override
    public String transportcountry(){return "Spain";}
    @Override
    public String transportYear(){return "1987-1990";}
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
        SkinRegistry.addSkin(this.getClass(),MetroIM.MODID, "textures/trams/fgv3700_red.png", "textures/trams/bogies/fgv3700_bogie.png",
                "Metrovalencia livery", "livery used in the last years of service in Metrovalencia.");
        SkinRegistry.addSkin(this.getClass(), MetroIM.MODID, "textures/trams/fgv3700_yellow.png","textures/trams/bogies/fgv3700_bogie.png",
        "FGV livery", "livery used since its introduction in 1988 until the creation of the Product name Metrovalencia .");
    }

    public String getDefaultSkin(){return "metroim:FGV livery";}

    public String[][] getTankFilters() {
        return FuelHandler.DefaultTanks.ELECTRIC.value();
    }

    @Override
    public float transportTopSpeed(){return 80f;}
    /**
     * <h2>Bogie Offset</h2>
     * @return the list of offsets for the bogies, 0 being the center. negative values are towards the front of the train.
     * Must always go from front to back. First and last values must always be exact opposites.
     */
    @Override
    public List<Double> getRenderBogieOffsets(){return  Arrays.asList(0.5, -2.25);}
    /**
     * <h2>Inventory Size</h2>
     * @return the size of the inventory not counting any fuel or crafting slots, those are defined by the type.
     */
    @Override
    public int getInventoryRows(){return 1;}

    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){return TrainsInMotion.transportTypes.ELECTRIC.singleton();}

    @Override
    public float getMaxFuel(){return 1;}

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.84375f,0.9f, 0.25f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{4.6f,1.75f,1.5f};
    }

    /**
     * <h2>Acceleration</h2>
     * <h4>TRAINS ONLY.</h4>
     * @return defines the acceleration.
     */
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
        return new float[][]{{0.925f,0f,0},{-2.35f,0f,0}};}
    @Override
    public ModelBase[] bogieModels(){  return new ModelBase[]{ new StandardBogie(), new FGV3700_Gelenk()};}


    @Override
    public float[] rotationPoints() {
        return new float[]{2.1f,-1.85f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() { return new float[][]{{0f,0.2f,0f}}; }

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

    /**
     * <h2>pre-assigned values</h2>
     * These return values are defined from the top of the class.
     * These should only need modification for advanced users, and even that's a stretch.
     */
    public Item getItem(){
        return thisItem;
    }


    @Override
    public Bogie[] getBogieModels(){return null;}



    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new Motor3700_v1()};}

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
