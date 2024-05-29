package com.clapter.httpautomator.platform.services;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public interface IBlockRegistry {

    void registerBlock(ResourceLocation identifier, Supplier<Block> block);

}
