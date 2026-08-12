package com.jerrylu086.oooh_pinky.items.tiers;

import com.jerrylu086.oooh_pinky.registry.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModItemTier {
    public static final Tier ROSE_GOLD = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 810, 10.0F, 2.0F, 18, () -> Ingredient.of(ModTags.ROSE_GOLD_INGOT));
}
