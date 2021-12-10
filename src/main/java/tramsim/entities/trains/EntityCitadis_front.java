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
import tramsim.models.bogies.Combino_Bogie;
import tramsim.models.bogies.NullBogiePlaceHolder;
import tramsim.models.trains.Citadis_front;
import tramsim.models.trains.Combino_End;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class EntityCitadis_front extends TrainBase {



    public static final Item thisItem = new ItemTransport(new EntityCitadis_front(null), TramsIM.MODID,TramsIM.tramsimtabvehicle);


    public EntityCitadis_front(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityCitadis_front(World world){
        super(world);
    }

    @Override
    public String transportName(){return "Citadis";}
    @Override
    public String transportcountry(){return "France";}
    @Override
    public String transportYear(){return "2002-today";}
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
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/Citadis_wb_ratp.png", "textures/trams/bogies/combino_bogie.png",
                "RATP", CommonUtil.translate("Livery used on the Paris trams") + " " + CommonUtil.translate("in.Paris") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/Citadis_wb_madrid.png", "textures/trams/bogies/combino_bogie.png",
                "Metro ligero de Madrid ", CommonUtil.translate("Livery used on the metro ligero de madrid") + " " + CommonUtil.translate("in.Madrid") + ".");
        SkinRegistry.addSkin(this.getClass(),TramsIM.MODID, "textures/trams/Citadis_wb_parla.png", "textures/trams/bogies/combino_bogie.png",
                "Tranvia de Parla ", CommonUtil.translate("Livery used on the Parla tram") + " " + CommonUtil.translate("in.Parla") + ".");
    }
    @Override
    public String[][] getTankFilters() {
        return FuelHandler.DefaultTanks.ELECTRIC.value();
    }
    @Override
    public float transportTopSpeed(){return 70f;}

    @Override
    public List<Double> getRenderBogieOffsets(){return  Arrays.asList(0.25, -1.7125);}

    @Override
    public int getInventoryRows(){return 1;}

    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){return TrainsInMotion.transportTypes.ELECTRIC.singleton();}

    @Override
    public float getMaxFuel(){return 1;}

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-0.8125f,0.9f, 0f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{2.4f,1.75f,1.5f};
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
        return new float[][]{{0.25f,0.2f,0}};}
    @Override
    public ModelBase[] bogieModels(){  return new ModelBase[]{new NullBogiePlaceHolder()};}


    @Override
    public float[] rotationPoints() {
        return new float[]{1.25f,-0.2125f};
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
    public ModelBase[] getModel(){return new ModelBase[]{new Citadis_front()};}

    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}
