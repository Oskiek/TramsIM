package spanish_pack.entities.wagons;

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
import spanish_pack.Spanish_pack;
import spanish_pack.models.bogies.Renfe_440R_bogie;
import spanish_pack.models.bogies.Renfe_446_Bogie;
import spanish_pack.models.trains.Renfe465;
import spanish_pack.models.wagons.Renfe450tail;

import java.util.List;
import java.util.UUID;

import static ebf.tim.utility.CommonUtil.DefineStack;

public class EntityCivia_tail extends RollingstockBase {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};
    public static final Item thisItem = new ItemTransport(new EntityCivia_tail(null), Spanish_pack.MODID, Spanish_pack.spanish_pack);

    public EntityCivia_tail(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityCivia_tail(World world){
        super(world);
    }

    /**
     * <h1>Variable Overrides</h1>
     */


    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.2f,0.05f,0}};}

    @Override
    public ModelBase[] bogieModels(){
        return new ModelBase[]{new Renfe_440R_bogie()};
    }

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] rotationPoints() {
        return new float[]{2.525f, -1.8725f};
    }

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.07f,0.05f,0f}};
    }

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), Spanish_pack.MODID, "textures/trams/civia_coupler.png", "textures/trams/bogies/446_bogie.png",
                "company.renfe new", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.spain") + ".");
        SkinRegistry.addSkin(this.getClass(), Spanish_pack.MODID, "textures/trams/civia_w_haube.png", "textures/trams/bogies/446_bogie.png",
                "renfe new", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.spain") + ".");
        SkinRegistry.addSkin(this.getClass(), Spanish_pack.MODID, "textures/trams/civia_original.png", "textures/trams/bogies/446_bogie.png",
                "renfe.old", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.spain") + ".");
        SkinRegistry.addSkin(this.getClass(), Spanish_pack.MODID, "textures/trams/civia_rodalies.png", "textures/trams/bogies/446_bogie.png",
                "Rodalies", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in Catalonia") + ".");
        SkinRegistry.addSkin(this.getClass(), Spanish_pack.MODID, "textures/trams/civia_mt.png", "textures/trams/bogies/446_bogie.png",
                "company.invent", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.spain") + ".");

    }
    public String getDefaultSkin(){
        return "spanish_pack:renfe.old";
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
        return "Renfe465_tail";
    }

    @Override
    public String transportcountry() {
        return "Spain";
    }

    @Override
    public String transportYear() {
        return "2003";
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
    public float[][] getRiderOffsets(){return new float[][]{{0.35f,0.85f, 0.4f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{5.25f,1.75f,1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new Renfe465()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}
