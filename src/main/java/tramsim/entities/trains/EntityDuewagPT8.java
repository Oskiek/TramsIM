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
import net.minecraftforge.fluids.FluidRegistry;
import tramsim.TramsIM;
import tramsim.models.bogies.PT8_Bogie;
import tramsim.models.bogies.PT8_Gelenk;
import tramsim.models.trains.DuewagPT8;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class EntityDuewagPT8 extends TrainBase {



    public static final Item thisItem = new ItemTransport(new EntityDuewagPT8(null), TramsIM.MODID,TramsIM.tramsimtabvehicle);


    public EntityDuewagPT8(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityDuewagPT8(World world){
        super(world);
    }

    @Override
    public String transportName(){return "DuewagPT8";}
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
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/duewagPT8_frankfurt.png", "textures/trams/bogies/pt8bogie.png",
                "company.frankfurt", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.frankfurt") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/duewagPT8_silesia.png", "textures/trams/bogies/pt8bogie_szl.png",
                "company.silesia", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.silesia") + ".");
    }

    public String getDefaultSkin(){
        return "tramsim:company.silesia";
    }

    @Override
    public String[][] getTankFilters() {
        return FuelHandler.DefaultTanks.ELECTRIC.value();
    }
    @Override
    public float transportTopSpeed(){return 80f;}
    @Override
    public List<Double> getRenderBogieOffsets(){return  Arrays.asList(2.125, -0.25);}
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
        return new float[][]{{2.125f,-0.11f,0},{-0.25f,-0.11f,0}};}
    @Override
    public ModelBase[] bogieModels(){  return new ModelBase[]{ new PT8_Gelenk(), new PT8_Bogie()};}

    @Override
    public float[] rotationPoints() {
        return new float[]{2.125f, -0.25f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() { return new float[][]{{0f,0.11f,0f}}; }

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

    @Override
    public void manageFuel(){
        this.fuelHandler.manageElectric(this);
    }

    public Item getItem(){
        return thisItem;
    }

    @Override
    public Bogie[] getBogieModels(){return null;}

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new DuewagPT8()};}

    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}
