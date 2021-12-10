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
import tramsim.TramsIM;
import tramsim.models.bogies.PT8_Bogie;
import tramsim.models.bogies.PT8_Gelenk;
import tramsim.models.bogies.ST12_Bogie;
import tramsim.models.bogies.ST12_Gelenk;
import tramsim.models.trains.DuewagPT8;
import tramsim.models.trains.ST12_Front;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class EntityST12 extends TrainBase {



    public static final Item thisItem = new ItemTransport(new EntityST12(null), TramsIM.MODID,TramsIM.tramsimtabvehicle);


    public EntityST12(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityST12(World world){
        super(world);
    }

    @Override
    public String transportName(){return "ST12";}
    @Override
    public String transportcountry(){return "Germany";}
    @Override
    public String transportYear(){return "1972+";}
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
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/st12_darmstadt.png", "textures/trams/bogies/st12_bogie.png",
                "company.darmstadt", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.darmstadt") + ".");
    }
    @Override
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
    public List<Double> getRenderBogieOffsets(){return  Arrays.asList(0.125, -2.53125);}
    /**
     * <h2>Inventory Size</h2>
     * @return the size of the inventory not counting any fuel or crafting slots, those are defined by the type.
     */
    @Override
    public int getInventoryRows(){return 1;}
    /**
     * <h2>Type</h2>
     * @return the type which will define it's features, GUI, a degree of storage (like crafting slots), and a number of other things.
     */
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){return TrainsInMotion.transportTypes.ELECTRIC.singleton();}
    /**
     * <h2>Max Fuel</h2>
     * @return the maxstorage of fuel the train can store.
     * @see GenericRailTransport#getMaxFuel() for more info.
     * @see FuelHandler for information on fuel consumption.
     */
    @Override
    public float getMaxFuel(){return 1;}
    /**
     * <h2>Rider offset</h2>
     * @return defines the offsets of the riders in blocks, the first value is how far back, and the second is how high.
     *     Negative values are towards the front, ground, or right. In that order.
     *     Each set of floats represents a different rider.
     *     Only the first 3 values of each set of floats are actually used.
     */
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.25f,1.1f, 0.1f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{4.95f,1.75f,1.5f};
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

    /**
     * <h2>Hitbox offsets</h2>
     * @return defines the positions for the hitboxes in blocks. 0 being the center, negative values being towards the front. the first and last values define the positions of the couplers
     */

    /**
     * <h2>Animation radius</h2>
     * @return defines the radius in microblocks (1/16 of a block) for the piston rotations.
     */
    @Override
    public float getPistonOffset(){return 0f;}
    /**
     * <h2>Smoke offset</h2>
     * @return defines the array of positions in blocks for smoke.
     * the first number in the position defines the X/Z axis, negative values are towards the front of the train.
     * the second number defines the Y position, 0 is the rails, higher values are towards the sky.
     * the third number defines left to right, negative values are towards the right.
     * the forth number defines the grayscale color from 255 (white) to 0 (black)
     * the 5th number is for density, there's no min/max but larger numbers will create more lag.
     */

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{0.125f,-0.1f,0f},{-2.53125f,-0.1f,0f}};}
    @Override
    public ModelBase[] bogieModels(){  return new ModelBase[]{ new ST12_Bogie(), new ST12_Gelenk()};}


    @Override
    public float[] rotationPoints() {
        return new float[]{2.425f, -0.5125f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() { return new float[][]{{0f,0f,0.05f}}; }

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
            case 400:{return stack!=null && stack.getItem() == Items.redstone;}
            default:{return true;}
        }
    }

    @Override
    public void manageFuel(){
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
    public ModelBase[] getModel(){return new ModelBase[]{new ST12_Front()};}

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
