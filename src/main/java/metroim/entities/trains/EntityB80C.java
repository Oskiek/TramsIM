package metroim.entities.trains;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TrainBase;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.ItemStackSlot;
import fexcraft.tmt.slim.ModelBase;
import metroim.MetroIM;
import metroim.models.trains.B80C;
import metroim.models.trains.KVB_2300;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tramsim.models.bogies.NullBogiePlaceHolder;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class EntityB80C extends TrainBase {



    public static final Item thisItem = new ItemTransport(new EntityB80C(null), MetroIM.MODID,MetroIM.metroimtabvehicle);


    public EntityB80C(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityB80C(World world){
        super(world);
    }

    @Override
    public String transportName(){return "B80C_engine";}
    @Override
    public String transportcountry(){return "Germany";}
    @Override
    public String transportYear(){return "1981-1998";}
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
        SkinRegistry.addSkin(this.getClass(), MetroIM.MODID, "textures/trams/b80c_White.png",
        "KVB Neulack", "Standard livery used in Cologne.");
        SkinRegistry.addSkin(this.getClass(), MetroIM.MODID, "textures/trams/b80c_Red.png",
                "KVB Altlack", "Old livery used until 2012 in Cologne.");
        SkinRegistry.addSkin(this.getClass(), MetroIM.MODID, "textures/trams/b80c_Green.png",
                "SWB Bus und Bahn", "Standard livery used in Bonn.");
        SkinRegistry.addSkin(this.getClass(), MetroIM.MODID, "textures/trams/b80c_Yellow.png",
                "EVAG", "Standard livery used in Essen by the EVAG.");
        SkinRegistry.addSkin(this.getClass(), MetroIM.MODID, "textures/trams/b80c_Grey.png",
                "DSW21", "Livery used in Dortmund.");
        SkinRegistry.addSkin(this.getClass(), MetroIM.MODID, "textures/trams/b80c_Pink.png",
                "SWB Bus und Bahn 2", "New livery used in Bonn.");
    }

    public String[][] getTankFilters() {
        return FuelHandler.DefaultTanks.ELECTRIC.value();
    }

    @Override
    public float transportTopSpeed(){return 80f;}

    @Override
    public List<Double> getRenderBogieOffsets(){return  Arrays.asList(0.75, -2.4375);}

    @Override
    public int getInventoryRows(){return 1;}

    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){return TrainsInMotion.transportTypes.ELECTRIC.singleton();}

    @Override
    public float getMaxFuel(){return 1;}

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.75f,1f, 0.0625f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{4.8f,1.75f,1.5f};
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
        return new float[][]{{0.95f,0f,0},{-2.4375f,0f,0}};}
    @Override
    public ModelBase[] bogieModels(){  return new ModelBase[]{ new NullBogiePlaceHolder()};}


    @Override
    public float[] rotationPoints() {
        return new float[]{2.35f,-1.05f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() { return new float[][]{{-0.125f,0f,0f}}; }

    /**
     * <h2>rider sit or stand</h2>
     * @return true if the rider(s) should be sitting, false if the rider should be standing.
     */
    @Override
    public boolean shouldRiderSit(){
        return true;
    }

    /**
     * <h2>reinforced transport</h2>
     * this returns if this specific entity is reinforced (explosion proof and damage resistant).
     * since this is a function it can be conditional as well, for instance if it has a specific skin.
     */
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
    public ModelBase[] getModel(){return new ModelBase[]{new B80C()};}

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
