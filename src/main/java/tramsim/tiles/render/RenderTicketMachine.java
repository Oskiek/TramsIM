package tramsim.tiles.render;

import org.lwjgl.opengl.GL11;

import tramsim.models.blocks.ModelTicketMachine;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

@SideOnly(Side.CLIENT)
public class RenderTicketMachine extends TileEntitySpecialRenderer {

	private ModelTicketMachine model;
	public static String textureName;
	private ResourceLocation texture = new ResourceLocation("tramsim:textures/blocks/" + textureName);
	
	
	
	public RenderTicketMachine()
	{
		model = new ModelTicketMachine();
	}


	
	
    private void adjustRotatePivotViaMeta(World world, int x, int y, int z)
    {
            int meta = world.getBlockMetadata(x, y, z);
            GL11.glPushMatrix();
            GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
            GL11.glPopMatrix();
    }

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale)
    {
    //The PushMatrix tells the renderer to "start" doing something.
            GL11.glPushMatrix();
            switch (te.getBlockMetadata() % 4) {
            case 0:
                GL11.glTranslatef((float) x + 0.53F, (float) y + 0.0F, (float) z + 0.53F);
                break;
            case 1:
                GL11.glTranslatef((float) x + 0.33F, (float) y + 0.0F, (float) z + 0.53F);
                break;
            case 2:
                GL11.glTranslatef((float) x + 0.33F, (float) y + 0.0F, (float) z + 0.33F);
                break;
            case 3:
                GL11.glTranslatef((float) x + 0.53F, (float) y + 0.0F, (float) z + 0.33F);
                break;
            
        }
            
    //This is setting the initial location.
            bindTexture(texture);
     //This rotation part is very important! Without it, your model will render upside-down! And for some reason you DO need PushMatrix again!                      
            GL11.glPushMatrix();
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            GL11.glScalef(0.8F,0.9F,0.8F);
            
                int rotation = 0;
                switch (te.getBlockMetadata() % 4) {
                    case 0:
                        rotation = 90;
                        break;
                    case 1:
                        rotation = 180;
                        break;
                    case 2:
                        rotation = 270;
                        break;          
                    case 3:
                        rotation = 0;
                        break;
                }
              GL11.glRotatef(rotation, 0.0F, 1.0F, 0.0F);
              GL11.glTranslatef(0.1F, -1F,0.1F);
              
              
             
    //A reference to your Model file. Again, very important.
            this.model.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
    //Tell it to stop rendering for both the PushMatrix's
            GL11.glPopMatrix();
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