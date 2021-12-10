package tramsim.blocks.stops;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import tramsim.tiles.stops.TileEntityBusStop_3_Left_1;

public class BusStop_3_Left_1 extends BlockContainer {
	public BusStop_3_Left_1(){
		super(Material.iron);
		setBlockName("busstop_3_left_1");
		 this.setBlockBounds(0F, 0.0F, 0F, 1F, 2.5F, 1F);
	}

	 
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
    {

        int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2);
        }

        if (l == 1)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
        }

        if (l == 2)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
        }

        if (l == 3)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);
        }
    }
    
    @Override
    public TileEntity createNewTileEntity(World world, int var1)
    {
        return new TileEntityBusStop_3_Left_1();
    }
   
    @Override
    public int getRenderType()
    {
            return -1;
    }
    
    @Override
    public boolean isOpaqueCube()
    {
            return false;
    }
    
    public boolean renderAsNormalBlock()
    {
            return false;
    }
}

	

