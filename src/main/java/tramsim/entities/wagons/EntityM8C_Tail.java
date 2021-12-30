package tramsim.entities.wagons;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.RollingstockBase;
import ebf.tim.api.SkinRegistry;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.CommonUtil;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import tramsim.TramsIM;
import tramsim.models.bogies.M8C_Bogie;
import tramsim.models.bogies.NullBogiePlaceHolder;
import tramsim.models.wagons.M8C_Middle;
import tramsim.models.wagons.M8C_Tail;

import java.util.List;
import java.util.UUID;

public class EntityM8C_Tail extends RollingstockBase {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};
    public static final Item thisItem = new ItemTransport(new EntityM8C_Tail(null), TramsIM.MODID, TramsIM.tramsimtabvehicle);

    public EntityM8C_Tail(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityM8C_Tail(World world){
        super(world);
    }

    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{0.625f,0,0},{-2.1f,0,0}};
    }

    @Override
    public ModelBase[] bogieModels(){  return new ModelBase[]{new M8C_Bogie(), new NullBogiePlaceHolder()};}

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] rotationPoints(){return new float[]{2.125f,-0.9f};}

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
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/m8c_mainz_old.png","textures/trams/bogies/m8c_bogie_mainz.png",
                "company.mainz", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.mainz") + ".");
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/m8c_ruhrbahn.png","textures/trams/bogies/m8c_bogie_ruhrbahn.png",
                "company.ruhrbahn", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.ruhrbahn") + ".");
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/m8c_krefeld.png","textures/trams/bogies/m8c_bogie_krefeld.png",
                "company.krefeld", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.krefeld") + ".");
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/m8c_mhvg.png","textures/trams/bogies/m8c_bogie_krefeld.png",
                "Mülheimer Verkehrsgesellschaft", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("Livery used in Mülheim a.d. Ruhr") + ".");
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/m8c_evag.png","textures/trams/bogies/m8c_bogie_evag.png",
                "EVAG Essen", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("Livery used in Mülheim a.d. Ruhr") + ".");
        SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/m8c_kassel_old.png","textures/trams/bogies/m8c_bogie_kassel_old.png",
                "KVG Kassel", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("old livery that was used in Kassel") + ".");
    }
    public String getDefaultSkin(){
        return "tramsim:company.ruhrbahn";
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
                null, null, null,
                null, null, null,
                null, null, null
        };
    }

    @Override
    public String transportName() {
        return "M8C_Tail";
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
    public float[][] getRiderOffsets(){return new float[][]{{0.125f,1f, 0.375f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{4.1f,2,1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new M8C_Tail()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}
