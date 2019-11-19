package metroim.entities.wagons;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.RollingstockBase;
import ebf.tim.api.SkinRegistry;
import ebf.tim.items.ItemTransport;
import fexcraft.tmt.slim.ModelBase;
import metroim.MetroIM;
import metroim.models.bogies.FGV3700_Bogie;
import metroim.models.bogies.FGV4300_Bogie;
import metroim.models.wagons.Euskotren200Middle;
import metroim.models.wagons.Middle3600;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;

public class EntityEuskotren200Middle extends RollingstockBase {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};
    public static final Item thisItem = new ItemTransport(new EntityEuskotren200Middle(null), MetroIM.MODID, MetroIM.metroimtabvehicle);

    public EntityEuskotren200Middle(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityEuskotren200Middle(World world){
        super(world);
    }

    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.625f,0.1f,0},{-1.625f,0.1f,0}};}

    @Override
    public ModelBase[] bogieModels(){
        return new ModelBase[]{new FGV4300_Bogie()};
    }

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{1.625f, -1.625f};
    }

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f,-0.1f,0f}};
    }

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), MetroIM.MODID, "textures/trams/euskotren200_etfv_middle.png", "textures/trams/bogies/fgv4300_bogie.png",
                "default", "Standard livery used in Madrid.");
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
        return "Euskotren200_Middle";
    }

    @Override
    public String transportcountry() {
        return "Spain";
    }

    @Override
    public String transportYear() {
        return "1982-1987";
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
    public List<TrainsInMotion.transportTypes> getTypes() {
        return TrainsInMotion.transportTypes.PASSENGER.singleton();
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
    /**
     * <h2>Rider offsets</h2>
     */

    @Override
    public boolean shouldRiderSit(){
        return false;
    }

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0f,1f, 0f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{4.6875f,1.75f,1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new Euskotren200Middle()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}
