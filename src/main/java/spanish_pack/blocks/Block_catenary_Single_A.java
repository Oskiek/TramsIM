package spanish_pack.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import spanish_pack.tiles.TileEntityCatenary_single_A;

public class Block_catenary_Single_A extends BlockContainer {
	public Block_catenary_Single_A(){
		super(Material.iron);
		setBlockName("Catenary_single_A");
		 this.setBlockBounds(0.1F, 0.0F, 0.1F, 0.8F, 2F, 0.8F);
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
        return new TileEntityCatenary_single_A();
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

	

