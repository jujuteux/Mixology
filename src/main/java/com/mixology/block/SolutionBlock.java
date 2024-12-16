package com.mixology.block;


import com.mixology.init.MixologyModFluids;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fluids.BlockFluidFinite;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.awt.*;

public class SolutionBlock extends BlockFluidFinite {
	private static final ResourceLocation STILL_TEXTURE = new ResourceLocation("minecraft:block/water_overlay");
	private static final ResourceLocation FLOWING_TEXTURE = new ResourceLocation("minecraft:block/water_flow");

	public SolutionBlock() {
//		super(() -> MixologyModFluids.SOLUTION,
//				BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).lightLevel(s -> 1).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
		super(new Fluid("solution",
						STILL_TEXTURE,
						FLOWING_TEXTURE,
						Material.WATER.getMaterialMapColor().colorValue),
				Material.WATER);
		this.setRegistryName("solution");
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
//		this.setLightLevel(0.2F);
		this.setTickRandomly(true);
	}

	@Override
	public int getQuantaValue(IBlockAccess world, BlockPos pos) {
		return 1;
	}

	@Override
	public boolean canCollideCheck(@Nonnull IBlockState state, boolean fullHit) {
		return true;
	}

	@Override
	public int getMaxRenderHeightMeta() {
		return 0;
	}

	@Override
	public int place(World world, BlockPos pos, @Nonnull FluidStack fluidStack, boolean doPlace) {
		return 0;
	}

	@Nullable
	@Override
	public FluidStack drain(World world, BlockPos pos, boolean doDrain) {
		return null;
	}

	@Override
	public boolean canDrain(World world, BlockPos pos) {
		return false;
	}
}
