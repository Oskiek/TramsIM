package spanish_pack.tiles.render;

import fexcraft.tmt.slim.TextureManager;
import org.lwjgl.opengl.GL11;

import spanish_pack.models.blocks.*;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import spanish_pack.tiles.*;

@SideOnly(Side.CLIENT)
public class RenderCatenary extends TileEntitySpecialRenderer {
    public static int type;
    public static int demandedType;
    public static String textureName;

    private static Catenary_single_A catenarySingleA;
    private static Catenary_single_B catenarySingleB;
    private static Catenary_double_C catenarydoubleC;
    public void Render() {
        catenarySingleA = new Catenary_single_A();
        catenarySingleB = new Catenary_single_B();
        catenarydoubleC = new Catenary_double_C();
    }


    private ResourceLocation texture = new ResourceLocation("spanish_pack:textures/blocks/" + textureName);

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
                GL11.glTranslatef((float) x + 0.5F, (float) y + -0.1F, (float) z + 0.4F);
                break;
            }
            case 2: {
                GL11.glTranslatef((float) x + 0.6F, (float) y + -0.1F, (float) z + 0.5F);
                break;
            }
            case 3: {
                GL11.glTranslatef((float) x + 0.5F, (float) y + -0.1F, (float) z + 0.6F);
                break;
            }
            case 4: {
                GL11.glTranslatef((float) x + 0.4F, (float) y + -0.1F, (float) z + 0.5F);
                break;
            }
        }


        int rotation = 0;
        switch (tileEntity.getBlockMetadata() % 4) {
            case 0:
                rotation = 90;
                break;
            case 1:
                rotation = 0;
                break;
            case 2:
                rotation = 270;
                break;
            case 3:
                rotation = 180;
                break;
        }
        GL11.glRotatef(rotation, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(0F, 0.75f, 0f);
        GL11.glRotatef(180, 1, 0, 0);
        if (tileEntity instanceof TileEntityCatenary_single_A) {
            TextureManager.bindTexture(texture);
            catenarySingleA.render();
        }
        if (tileEntity instanceof TileEntityCatenary_single_B) {
            TextureManager.bindTexture(texture);
            catenarySingleB.render();
        }
        if (tileEntity instanceof TileEntityCatenary_double_C) {
            TextureManager.bindTexture(texture);
            catenarydoubleC.render();
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