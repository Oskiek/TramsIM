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
import tramsim.models.bogies.MGT6D_Bogie;
import tramsim.models.bogies.NullBogiePlaceHolder;
import tramsim.models.trains.BNLRV_A;
import tramsim.models.trains.MGT6D;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class EntityMGT6D extends TrainBase {



    public static final Item thisItem = new ItemTransport(new EntityMGT6D(null), TramsIM.MODID,TramsIM.tramsimtabvehicle);


    public EntityMGT6D(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityMGT6D(World world){
        super(world);
    }

    @Override
    public String transportName(){return "MGT6D";}
    @Override
    public String transportcountry(){return "Germany";}
    @Override
    public String transportYear(){return "1988+";}
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
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/mgt6d.png", "textures/trams/bogies/mgt6d_bogie.png",
        "company.vbbr", "Standard livery used in Germany.");
    }
    @Override
    public String[][] getTankFilters() {
        return new String[0][];
    }
    @Override
    public float transportTopSpeed(){return 70f;}
    /**
     * <h2>Bogie Offset</h2>
     * @return the list of offsets for the bogies, 0 being the center. negative values are towards the front of the train.
     * Must always go from front to back. First and last values must always be exact opposites.
     */
    @Override
    public List<Double> getRenderBogieOffsets(){return  Arrays.asList(0.375, -2.0);}
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
    public TrainsInMotion.transportTypes getType(){return TrainsInMotion.transportTypes.ELECTRIC;}
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
    public float[][] getRiderOffsets(){return new float[][]{{-1.90625f,1.1f, 0f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{3.625f,1.75f,1.5f};
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
        return new float[][]{{0.375f,-0.1f,0},{-2f,-0.1f,0}};}
    @Override
    public ModelBase[] bogieModels(){  return new ModelBase[]{new MGT6D_Bogie(), new NullBogiePlaceHolder()};}


    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{0.375f, -2f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() { return new float[][]{{0f,0f,0f}}; }

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

    /**
     * <h2>Fluid Tank Capacity</h2>
     */
    @Override
    public int[] getTankCapacity(){return new int[]{91610, 8000};}

    /**
     * <h2>fluid filter</h2>
     * defines what fluids can and can't be stored in the tank.
     * for instance if you have a wooden tanker car, you can deny fluids that are fire sources (like lava).
     */

    //todo: maybe make some util functions or something to simplify this stuff?
    //seems kinda complicated for something that should be the difficulty of a config file.
    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack){
        switch (slot){
            case 400:{return stack!=null && stack.getItem() == Items.redstone;}
            default:{return true;}
        }
    }

    /**
     * <h2>fuel management</h2>
     * defines how the transport manages burnHeat, both in consuming items, and in managing the burnHeat.
     */
    @Override
    public void manageFuel(){
        fuelHandler.manageElectric(this);
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
    public ModelBase[] getModel(){return new ModelBase[]{new MGT6D()};}

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
