package com.mixology.init;

import com.mixology.MixologyMod;
import com.mixology.block.SolutionBlock;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = MixologyMod.MODID)
public class MixologyModBlocks {

	@SubscribeEvent
	public static void onRegisterBlocksEvent(@Nonnull final RegistryEvent.Register<Block> event) {
		SolutionBlock sb = new SolutionBlock();

		event.getRegistry().registerAll(sb);
		ModelLoader.setCustomStateMapper(sb, new StateMap.Builder().ignore(BlockFluidBase.LEVEL).build());
	}
}
