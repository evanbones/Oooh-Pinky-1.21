package com.jerrylu086.oooh_pinky;

import com.jerrylu086.oooh_pinky.compat.farmersdelight.FDCompat;
import com.jerrylu086.oooh_pinky.core.Configuration;
import com.jerrylu086.oooh_pinky.registry.ModArmorMaterials;
import com.jerrylu086.oooh_pinky.registry.ModBlocks;
import com.jerrylu086.oooh_pinky.registry.ModCodecs;
import com.jerrylu086.oooh_pinky.registry.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(OoohPinky.MOD_ID)
public class OoohPinky {
    public static final String MOD_ID = "oooh_pinky";
    public static final Logger LOGGER = LogManager.getLogger("Oooh, Pinky!");

    public OoohPinky(IEventBus modEventBus, ModContainer modContainer) {
        Configuration.init(modContainer);

        ModArmorMaterials.ARMOR_MATERIALS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModCodecs.CODECS.register(modEventBus);

        if (ModList.get().isLoaded("farmersdelight")) {
            FDCompat.init();
        }

        modEventBus.addListener(ModItems::addToTabs);
    }

    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
