package tramsim.entities.trains;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TrainBase;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tramsim.TramsIM;
import tramsim.models.bogies.M8C_Bogie;
import tramsim.models.bogies.M8C_Gelenk;
import tramsim.models.bogies.M8S_Bogie;
import tramsim.models.bogies.M8S_Gelenk;
import tramsim.models.trains.M8C_End;
import tramsim.models.trains.M8S_End;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class EntityM8S extends TrainBase {



    public static final Item thisItem = new ItemTransport(new EntityM8S(null), TramsIM.MODID,TramsIM.tramsimtabvehicle);


    public EntityM8S(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityM8S(World world){
        super(world);
    }

    @Override
    public String transportName(){return "M8S";}
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
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/m8s_mainz_new.png", "textures/trams/bogies/m8s_bogie_mainz.png",
                "company.mainz", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.mainz") + ".");
    }
    @Override
    public String[][] getTankFilters() {
        return FuelHandler.DefaultTanks.ELECTRIC.value();
    }
    @Override
    public float transportTopSpeed(){return 80f;}
    @Override
    public List<Double> getRenderBogieOffsets(){return  Arrays.asList(0.625, -2.1);}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){return TrainsInMotion.transportTypes.ELECTRIC.singleton();}
    @Override
    public float getMaxFuel(){return 1;}
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.75f,1f, 0.1f}};}
    @Override
    public float[] getHitboxSize() {
        return new float[]{4.75f,1.75f,1.5f};
    }
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
        return new float[][]{{0.625f,0.f,0},{-2.1f,0.0f,0}};}
    @Override
    public ModelBase[] bogieModels(){  return new ModelBase[]{ new M8S_Bogie(), new M8S_Gelenk()};}

    @Override
    public float[] rotationPoints() {
        return new float[]{0.625f, -2.1f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() { return new float[][]{{0f,0f,0f}}; }

    @Override
    public boolean shouldRiderSit(){
        return true;
    }

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

    public Item getItem(){
        return thisItem;
    }

    @Override
    public Bogie[] getBogieModels(){return null;}

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new M8S_End()};}

    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}
