package com.jerrylu086.oooh_pinky.compat.farmersdelight;

import com.jerrylu086.oooh_pinky.items.tiers.ModItemTier;
import com.jerrylu086.oooh_pinky.registry.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import vectorwing.farmersdelight.common.item.KnifeItem;
import vectorwing.farmersdelight.common.registry.ModCreativeTabs;

public class FDCompat {
    public static final DeferredItem<KnifeItem> ROSE_GOLD_KNIFE = ModItems.ITEMS.register(
            "rose_gold_knife", () -> new KnifeItem(ModItemTier.ROSE_GOLD,
                    new Item.Properties().attributes(KnifeItem.createAttributes(ModItemTier.ROSE_GOLD, 0.5F, -1.5F))));

    public static void addToFDTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == ModCreativeTabs.TAB_FARMERS_DELIGHT.get()) {
            event.insertAfter(
                    new ItemStack(vectorwing.farmersdelight.common.registry.ModItems.GOLDEN_KNIFE.get()),
                    new ItemStack(ROSE_GOLD_KNIFE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }

    public static void init() {}
}
