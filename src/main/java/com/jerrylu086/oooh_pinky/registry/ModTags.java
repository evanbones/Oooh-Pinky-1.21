package com.jerrylu086.oooh_pinky.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    // Item
    public static final TagKey<Item> ROSE_GOLD_INGOT =
            TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "ingots/rose_gold"));
    public static final TagKey<Item> ROSE_GOLD_NUGGET =
            TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "nuggets/rose_gold"));
    public static final TagKey<Item> ROSE_GOLD_STORAGE_BLOCK_ITEM =
            TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/rose_gold"));

    // Block
    public static final TagKey<Block> ROSE_GOLD_STORAGE_BLOCK =
            TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/rose_gold"));
}
