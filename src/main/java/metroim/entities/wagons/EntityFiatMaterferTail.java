package metroim.entities.wagons;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.RollingstockBase;
import ebf.tim.api.SkinRegistry;
import ebf.tim.items.ItemTransport;
import fexcraft.tmt.slim.ModelBase;
import metroim.MetroIM;
import metroim.models.bogies.StandardBogie;
import metroim.models.wagons.Tail5000;
import metroim.models.wagons.TailFiatMaterfer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import tramsim.models.bogies.NullBogiePlaceHolder;

import java.util.List;
import java.util.UUID;

import static ebf.tim.utility.CommonUtil.DefineStack;

public class EntityFiatMaterferTail extends RollingstockBase {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};
    public static final Item thisItem = new ItemTransport(new EntityFiatMaterferTail(null), MetroIM.MODID, MetroIM.metroimtabvehicle);

    public EntityFiatMaterferTail(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityFiatMaterferTail(World world){
        super(world);
    }

    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.45f,-0.05f,0},{-1.475f,-0.05f,0}};}

    @Override
    public ModelBase[] bogieModels(){
        return new ModelBase[]{new NullBogiePlaceHolder()};
    }

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] rotationPoints() {
        return new float[]{1.25f, -1.375f};
    }

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.0f,0f,0f}};
    }

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),MetroIM.MODID, "textures/trams/fiat_materfer_old.png", "textures/trams/bogies/5000_bogie.png",
                "ferrovias old", "Standard livery used in Madrid.");
        SkinRegistry.addSkin(this.getClass(), MetroIM.MODID, "textures/trams/fiat_materfer_new.png", "textures/trams/bogies/5000_bogie.png",
                "ferrovias new", "New Livery used on the Subte network in Buenos Aires.");
        ;
    }

    public String getDefaultSkin(){return "metroim:ferrovias old";}

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
        return "FiatMaterfer_Tail";
    }

    @Override
    public String transportcountry() {
        return "Spain";
    }

    @Override
    public String transportYear() {
        return "1975";
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
    public float[][] getRiderOffsets(){return new float[][]{{0.8125f,0.9f, 0.40625f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{4.875f,1.75f,1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new TailFiatMaterfer()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}
