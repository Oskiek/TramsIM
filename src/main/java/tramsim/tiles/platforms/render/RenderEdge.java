package tramsim.tiles.platforms.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import tramsim.models.blocks.platforms.edges.*;
import tramsim.tiles.platforms.edges.*;


@SideOnly(Side.CLIENT)
public class RenderEdge extends TileEntitySpecialRenderer {

    public static int type;
    public static int demandedType;
    public static String textureName;


    private static ModelEdgeBritish modelEdgeBritish;
    private static ModelEdgeChecker modelEdgeChecker;
    private static ModelEdgeLed modelEdgeLed;
    private static ModelEdgeLedLined modelEdgeLedLined;
    private static ModelEdgeLeftCorner modelEdgeLeftCorner;
    private static ModelEdgeLined modelEdgeLined;
    private static ModelEdgePlain modelEdgePlain;
    private static ModelEdgeRightCorner modelEdgeRightCorner;
    private static ModelEdgeYellowLined modelEdgeYellowLined;
    private static ModelEdgeYellowThick modelEdgeYellowThick;

    public void Render() {
        modelEdgeBritish = new ModelEdgeBritish();
        modelEdgeChecker = new ModelEdgeChecker();
        modelEdgeLed = new ModelEdgeLed();
        modelEdgeLedLined = new ModelEdgeLedLined();
        modelEdgeLeftCorner = new ModelEdgeLeftCorner();
        modelEdgeLined = new ModelEdgeLined();
        modelEdgePlain=new ModelEdgePlain();
        modelEdgeRightCorner=new ModelEdgeRightCorner();
        modelEdgeYellowLined=new ModelEdgeYellowLined();
        modelEdgeYellowThick=new ModelEdgeYellowThick();
    }


    private ResourceLocation texture = new ResourceLocation("tramsim:textures/blocks/platforms/" + textureName);

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float p_147500_8_) {
        Render();
        GL11.glPushMatrix();
        switch (tileEntity.getBlockMetadata()) {
            default: {
                GL11.glTranslatef((float) x, (float) y, (float) z);
                break;
            }
            case 5: {
                GL11.glTranslatef((float) x + 0.5F, (float) y + 0.0F, (float) z + 0.0F);
                break;
            }
            case 2: {
                GL11.glTranslatef((float) x + 0.5F, (float) y + 0.0F, (float) z + 0.5F);
                break;
            }
            case 3: {
                GL11.glTranslatef((float) x + 0.5F, (float) y + 0.0F, (float) z + 1.0F);
                break;
            }
            case 4: {
                GL11.glTranslatef((float) x + 0.5F, (float) y + 0.0F, (float) z + 0.5F);
                break;
            }
        }


        int rotation = 0;
        switch (tileEntity.getBlockMetadata() % 4) {
            case 0:
                rotation = 270;
                break;
            case 1:
                rotation = 0;
                break;
            case 2:
                rotation = 90;
                break;
            case 3:
                rotation = 180;
                break;
        }
        GL11.glRotatef(rotation, 0.0F, 1.0F, 0.0F);


        GL11.glTranslatef(0F, 1.25f, 0f);
        GL11.glRotatef(180, 1, 0, 0);
        if (tileEntity instanceof TileEntityEdgeBritish) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            modelEdgeBritish.render();
        }if (tileEntity instanceof TileEntityEdgeChecker) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            modelEdgeChecker.render();
        }if (tileEntity instanceof TileEntityEdgeLed) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            modelEdgeLed.render();
        }if (tileEntity instanceof TileEntityEdgeLedLined) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            modelEdgeLedLined.render();
        }if (tileEntity instanceof TileEntityEdgeLeftCorner) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            modelEdgeLeftCorner.render();
        }if (tileEntity instanceof TileEntityEdgeLined) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            modelEdgeLined.render();
        }if (tileEntity instanceof TileEntityEdgePlain) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            modelEdgePlain.render();
        }if (tileEntity instanceof TileEntityEdgeRightCorner) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            modelEdgeRightCorner.render();
        }if (tileEntity instanceof TileEntityEdgeYellowLined) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            modelEdgeYellowLined.render();
        }if (tileEntity instanceof TileEntityEdgeYellowThick) {
            fexcraft.tmt.slim.TextureManager.bindTexture(texture);
            modelEdgeYellowThick.render();
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