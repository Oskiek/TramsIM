package tramsim.entities.wagons;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.RollingstockBase;
import ebf.tim.api.SkinRegistry;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.CommonUtil;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import tramsim.TramsIM;
import tramsim.models.bogies.ModelKT4_Bogie;
import tramsim.models.bogies.NullBogiePlaceHolder;
import tramsim.models.wagons.Bw305;
import tramsim.models.wagons.TatraB4;

import java.util.List;
import java.util.UUID;

import static ebf.tim.utility.CommonUtil.DefineStack;

public class EntityBeiwagen305 extends RollingstockBase {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};
    public static final Item thisItem = new ItemTransport(new EntityBeiwagen305(null), TramsIM.MODID, TramsIM.tramsimtabvehicle);

    public EntityBeiwagen305(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityBeiwagen305(World world){
        super(world);
    }

    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.65f,0.075f,0f,},{-1.65f,0.075f,0f}};}

    @Override
    public ModelBase[] bogieModels(){  return new ModelBase[]{new NullBogiePlaceHolder()};}


    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] rotationPoints() {
        return new float[]{1.65f, -1.65f};
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
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tw_green.png", "textures/trams/bogies/kt4_bogie.png",
                "company.1", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("used in the early 50s") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tw_yellow.png",
                "company.2", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("fitting with the classical wooden tram") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tw_orange.png",
                "company.3", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("used in frankfurt") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/tw_blue.png",
                "company.4", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("used in Zurich") + ".");
    }

    public String getDefaultSkin(){
        return "tramsim:company.1";
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
    public void manageFuel() {

    }

    @Override
    public float weightKg() {
        return 18143f;
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
        return "Beiwagen 305";
    }

    @Override
    public String transportcountry() {
        return "Germany";
    }

    @Override
    public String transportYear() {
        return "1947+";
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
    public float[][] getRiderOffsets(){return new float[][]{{0f,1.1f, 0f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{4.15f,2f,1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new Bw305()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}
