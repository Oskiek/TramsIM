package metroim.entities.wagons;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.RollingstockBase;
import ebf.tim.api.SkinRegistry;
import ebf.tim.items.ItemTransport;
import fexcraft.tmt.slim.ModelBase;
import metroim.MetroIM;
import metroim.models.bogies.StandardBogie;
import metroim.models.trains.TMB3000;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

import static ebf.tim.utility.CommonUtil.DefineStack;

public class EntityTMB3000_Tail extends RollingstockBase {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};
    public static final Item thisItem = new ItemTransport(new EntityTMB3000_Tail(null), MetroIM.MODID, MetroIM.metroimtabvehicle);

    public EntityTMB3000_Tail(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityTMB3000_Tail(World world){
        super(world);
    }

    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.3125f,0f,0},{-1.25f,0f,0f}};}

    @Override
    public ModelBase[] bogieModels(){
        return new ModelBase[]{new StandardBogie()};
    }

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] rotationPoints() {
        return new float[]{1.3125f, -1.25f};
    }

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
        SkinRegistry.addSkin(this.getClass(), MetroIM.MODID, "textures/trams/tmb3000.png","textures/trams/bogies/tmb3000_bogie.png",
                "company.barcelona", "Standard livery used in Barcelona.");
        SkinRegistry.addSkin(this.getClass(), MetroIM.MODID, "textures/trams/tmb3000_white.png","textures/trams/bogies/tmb3000_bogie.png",
                "company.barcelona2", "Standard livery used in Barcelona.");
    }

    public String getDefaultSkin(){return "metroim:company.barcelona";}

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
        return "TMB3000_Tail";
    }

    @Override
    public String transportcountry() {
        return "Spain";
    }

    @Override
    public String transportYear() {
        return "1987-1990";
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
    public float[][] getRiderOffsets(){return new float[][]{{-1.84375f,0.9f, 0.25f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{4.75f,1.75f,1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new TMB3000()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}