package tramsim.tiles.stops.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.utility.DebugUtil;
import fexcraft.tmt.slim.TextureManager;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import tramsim.models.blocks.*;
import tramsim.tiles.stops.*;


@SideOnly(Side.CLIENT)
public class RenderBusStop extends TileEntitySpecialRenderer {

    public static int demandedType;


    //Busstop type int code:
    //First number: busstop id (0-99)
    //Second number: 0 - left, 1 - middle, 2 - right
    //Last number: variant of stop (0-9)


    private static ModelBusStop_2_Left_1 model201 = new ModelBusStop_2_Left_1();
    private static ModelBusStop_2_Middle_1 model211 = new ModelBusStop_2_Middle_1();
    private static ModelBusStop_2_Middle_2 model212 = new ModelBusStop_2_Middle_2();
    private static ModelBusStop_2_Middle_3 model213 = new ModelBusStop_2_Middle_3();
    private static ModelBusStop_2_Middle_4 model214 = new ModelBusStop_2_Middle_4();
    private static ModelBusStop_2_Middle_5 model215 = new ModelBusStop_2_Middle_5();
    private static ModelBusStop_2_Right_1 model221 = new ModelBusStop_2_Right_1();
    private static ModelBusStop_3_Left_1 model301 = new ModelBusStop_3_Left_1();
    private static ModelBusStop_3_Middle_1 model311 = new ModelBusStop_3_Middle_1();
    private static ModelBusStop_3_Right_1 model321 = new ModelBusStop_3_Right_1();


    public static String demandedTexture;

    private ResourceLocation texture = new ResourceLocation("tramsim:textures/blocks/" + demandedTexture);

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float p_147500_8_) {
        GL11.glPushMatrix();
        switch (tileEntity.getBlockMetadata()) {

            case 0: {
                GL11.glTranslatef((float) x + 0.4F, (float) y + 0.0F, (float) z + 0.5F);
                break;
            }
            case 2: {
                GL11.glTranslatef((float) x + 1.0F, (float) y + 0.0F, (float) z + 1.0F);
                break;
            }
            case 3: {
                GL11.glTranslatef((float) x + 0.0F, (float) y + 0.0F, (float) z + 1.0F);
                break;
            }
            case 5: {
                GL11.glTranslatef((float) x + 1.0F, (float) y + 0.0F, (float) z + 0.0F);
                break;
            }
            default: {
                GL11.glTranslatef((float) x, (float) y, (float) z);
                break;
            }
        }


        int rotation = 0;
        switch (tileEntity.getBlockMetadata() % 4) {
            case 0:
                rotation = 0;
                break;
            case 1:
                rotation = 270;
                break;
            case 2:
                rotation = 180;
                break;
            case 3:
                rotation = 90;
                break;
        }
        GL11.glRotatef(rotation, 0.0F, 1.0F, 0.0F);

        DebugUtil.println("About to render");

        GL11.glTranslatef(0F, 0f, 1f);
        GL11.glRotatef(180, 1, 0, 0);
        if (tileEntity instanceof TileEntityBusStop_2_Left_1) {
            DebugUtil.println("Rendering");
            TextureManager.bindTexture(texture);
            model201.render();
        }
        else if (tileEntity instanceof TileEntityBusStop_2_Middle_1) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            model211.render();
        }
        else if (tileEntity instanceof TileEntityBusStop_2_Middle_2) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            model212.render();
        }
        else if (tileEntity instanceof TileEntityBusStop_2_Middle_3) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            model213.render();
        }
        else if (tileEntity instanceof TileEntityBusStop_2_Middle_4) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            model214.render();
        }
        else if (tileEntity instanceof TileEntityBusStop_2_Middle_5) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            model215.render();
        }
        else if (tileEntity instanceof TileEntityBusStop_2_Right_1) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            model221.render();
        }
        else if (tileEntity instanceof  TileEntityBusStop_3_Left_1) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            model301.render();
        }
        else if (tileEntity instanceof  TileEntityBusStop_3_Middle_1) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            model311.render();
        }
        else if (tileEntity instanceof  TileEntityBusStop_3_Right_1) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            model321.render();
        }
        GL11.glPopMatrix();
    }

    private void adjustRotatePivotViaMeta(World world, int x, int y, int z)
    {
        GL11.glPushMatrix();
        GL11.glPopMatrix();
    }


    //Set the lighting stuff, so it changes it's brightness properly.
    private void adjustLightFixture(World world, int i, int j, int k, Block block)
    {
        Tessellator tess = Tessellator.instance;
        float brightness = block.getLightOpacity(world, i, j, k);
        int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
        int modulousModifier = skyLight % 65536;
        int divModifier = skyLight / 65536;
        tess.setColorOpaque_F(brightness, brightness, brightness);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  (float) modulousModifier,  divModifier);
    }


}