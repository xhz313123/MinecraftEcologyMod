package ecomod.common.blocks.compat;

import ecomod.api.EcomodStuff;
import ecomod.common.tiles.compat.TileAnalyzerAdapter;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.classloading.FMLForgePlugin;

public class BlockAnalyzerAdapter extends Block implements ITileEntityProvider {

	public BlockAnalyzerAdapter() {
		super(Material.ROCK, MapColor.SILVER);
		
		this.setCreativeTab(EcomodStuff.ecomod_creative_tabs);
		
		this.setHardness(8F);
		this.setResistance(5F);
		
		this.setHarvestLevel("pickaxe", 1);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {

		return new TileAnalyzerAdapter();
	}

	
	public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
    {
        return Block.FULL_BLOCK_AABB;
    }
    
    @Override
    public BlockStateContainer createBlockState()
    {
		return new BlockStateContainer(this, new IProperty[0]);
    }
}
