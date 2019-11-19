package tramsim.entities.wagons;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.RollingstockBase;
import ebf.tim.api.SkinRegistry;
import ebf.tim.items.ItemTransport;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import tramsim.TramsIM;
import ebf.tim.entities.GenericRailTransport;
import tramsim.models.bogies.NullBogiePlaceHolder;
import tramsim.models.wagons.DuewagPT8_Middle;

import java.util.List;
import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;

public class EntityDuewagPT8_Middle extends RollingstockBase {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};
    public static final Item thisItem = new ItemTransport(new EntityDuewagPT8_Middle(null), TramsIM.MODID, TramsIM.tramsimtabvehicle);

    public EntityDuewagPT8_Middle(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityDuewagPT8_Middle(World world){
        super(world);
    }

    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.65625f,0,0},{-1.65625f,0,0}};
    }

    @Override
    public ModelBase[] bogieModels(){  return new ModelBase[]{new NullBogiePlaceHolder()};}

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] bogieLengthFromCenter(){return new float[]{1.65625f,-1.65625f};}

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f,0f,0f}};
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/duewagPT8_middle_frankfurt.png",
                "Frankfurt", "Standard livery used in Frankfurt.");
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/duewagPT8_middle_silesia.png",
                "Silesia", "Standard livery used in Silesia.");
    }

    @Override
    public boolean isReinforced() {
        return false;
    }

    @Override
    public int[] getTankCapacity() {
        return null;
    }

    @Override
    public String[][] getTankFilters() {
        return (String[][])null;
    }

    @Override
    public int getRFCapacity() {
        return 0;
    }

    @Override
    public void manageFuel() {

    }

    @Override
    public float weightKg() {
        return 1814.3f;
    }

    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                DefineStack(Items.bed, 1), null, null,
                null, null, null,
                null, null, null
        };
    }

    @Override
    public String transportName() {
        return "DuewagPT8_MiddleSegment";
    }

    @Override
    public String transportcountry() {
        return "Germany";
    }

    @Override
    public String transportYear() {
        return "1972+";
    }

    @Override
    public String transportFuelType() {
        return "Electric";
    }

    @Override
    public float transportTopSpeed() {
        return 0;
    }

    @Override
    public boolean isFictional() {
        return false;
    }

    @Override
    public float transportTractiveEffort() {
        return 0;
    }

    @Override
    public float transportMetricHorsePower() {
        return 0;
    }

    @Override
    public String[] additionalItemText() {
        return null;
    }

    @Override
    public float getMaxFuel() {
        return 0;
    }

    /**
     * <h2>Inventory Size</h2>
     */
    @Override
    public int getInventoryRows(){return 0;}
    /**
     * <h2>Type</h2>
     */
    @Override
    public List<TrainsInMotion.transportTypes> getTypes() {
        return TrainsInMotion.transportTypes.PASSENGER.singleton();
    }
    /**
     * <h2>Rider offsets</h2>
     */
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0.125f,1f, 0.375f},{0.125f,1f, -0.375f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{3,2,1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new DuewagPT8_Middle()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}
