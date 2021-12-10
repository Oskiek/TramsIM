package tramsim.entities.trains;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TrainBase;
import ebf.tim.api.skin;
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
import tramsim.models.bogies.Konstal105NaBogie;
import tramsim.models.bogies.ModelKT4_Bogie;
import tramsim.models.decorations.Konstal105Na_Christmas_lights;
import tramsim.models.trains.Konstal105Na;
import tramsim.models.trains.TatraT3;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class EntityKonstal105Na extends TrainBase {



    public static final Item thisItem = new ItemTransport(new EntityKonstal105Na(null), TramsIM.MODID,TramsIM.tramsimtabvehicle);

    private LocalDateTime now = LocalDateTime.now();

    public EntityKonstal105Na(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityKonstal105Na(World world){
        super(world);
    }

    @Override
    public String transportName(){return "Konstal 105Na";}
    @Override
    public String transportcountry(){return "Poland";}
    @Override
    public String transportYear(){return "1997+";}
    public String transportEra(){return "Electric";}
    @Override
    public boolean isFictional(){return false;}
    @Override
    public float transportTractiveEffort(){return 0;}
    @Override
    public String transportFuelType() {
        return "electric";
    }

    @Override
    public void registerSkins(){
        if(now.getMonthValue()==12||now.getMonthValue()==1)
        {
            SkinRegistry.addSkin(this.getClass(), new skin(TramsIM.MODID, new String[]{"textures/trams/konstal105na_silesia.png", "textures/trams/decorations/105na_christmas_lights.png"},
                    "company.silesia", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.silesia") + ".").setBogieTextures("textures/trams/bogies/105nabogie.png"));

            SkinRegistry.addSkin(this.getClass(), new skin(TramsIM.MODID, new String[]{"textures/trams/konstal105na_krakow.png", "textures/trams/decorations/105na_christmas_lights.png"},
                    "company.krakow", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.krakow") + ".").setBogieTextures("textures/trams/bogies/105nabogie.png"));
        }
        else {
            SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/konstal105na_silesia.png", "textures/trams/bogies/105nabogie.png",
                    "company.silesia", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.silesia") + ".");
            SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/konstal105na_krakow.png", "textures/trams/bogies/105nabogie.png",
                    "company.krakow", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.krakow") + ".");
            SkinRegistry.addSkin(this.getClass(), TramsIM.MODID, "textures/trams/konstal105na_elblag.png", "textures/trams/bogies/105nabogie.png",
                    "company.silesia", CommonUtil.translate("standardlivery") + " " + CommonUtil.translate("in.silesia") + ".");

        }

    }

    public String getDefaultSkin(){
        return "tramsim:company.silesia";
    }

    @Override
    public float transportTopSpeed(){return 72f;}

    @Override
    public List<Double> getRenderBogieOffsets(){return  Arrays.asList(-1.9, 1.9);}

    @Override
    public int getInventoryRows(){return 1;}

    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){return TrainsInMotion.transportTypes.ELECTRIC.singleton();}

    @Override
    public float getMaxFuel(){return 1;}

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-3.375f,1.1f, 0.0625f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{8f,2.25f,1.5f};
    }

    @Override
    public float transportMetricHorsePower(){return 75f;}

    @Override
    public String[] additionalItemText() {
        return null;
    }

    @Override
    public float weightKg(){return 17000f;}

    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        };
    }

    @Override
    public float getPistonOffset(){return 0.5f;}

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.9f,-0.26f,0f,},{-1.9f,-0.26f,0f}};}

    @Override
    public ModelBase[] bogieModels() { return new ModelBase[]{new Konstal105NaBogie()};}

    @Override
    public float[] rotationPoints() {
        return new float[]{1.9f, -1.9f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() { return new float[][]{{0,0.0625f,0}}; }

    @Override
    public boolean shouldRiderSit(){
        return true;
    }

    @Override
    public boolean isReinforced(){return false;}

    /**
     * <h2>Fluid Tank Capacity</h2>
     */
    @Override
    public int[] getTankCapacity(){return new int[]{8000};}

    @Override
    public ItemStackSlot fuelSlot(){
        return new ItemStackSlot(this, 400,114,32).setOverlay(Items.redstone);
    }


    @Override
    public String[][] getTankFilters() {
        return FuelHandler.DefaultTanks.ELECTRIC.value();
    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack){
        switch (slot){
            case 400:{return stack!=null && stack.getItem() ==Items.redstone;}
            default:{return true;}
        }
    }
    @Override
    public void manageFuel() {
        this.fuelHandler.manageElectric(this);
    }

    /**
     * <h2>pre-assigned values</h2>
     * These return values are defined from the top of the class.
     * These should only need modification for advanced users, and even that's a stretch.
     */
    public Item getItem(){
        return thisItem;
    }


    @Override
    public Bogie[] getBogieModels(){return null;}

    @Override
    public ModelBase[] getModel(){
        if(now.getMonthValue()==12||now.getMonthValue()==1)
        {
        return new ModelBase[]{new Konstal105Na(), new Konstal105Na_Christmas_lights()};
        }
        else
        {
        return new ModelBase[]{new Konstal105Na()};
        }
    }

    /**
     * <h2>sets the resource location for sounds, like horn and the sound made for the engine running</h2>
     */
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}