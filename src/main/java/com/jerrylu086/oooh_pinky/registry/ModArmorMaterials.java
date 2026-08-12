package com.jerrylu086.oooh_pinky.registry;

import com.jerrylu086.oooh_pinky.OoohPinky;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.Map;

public class ModArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, OoohPinky.MOD_ID);

    public static final Holder<ArmorMaterial> ROSE_GOLD = ARMOR_MATERIALS.register("rose_gold", () -> new ArmorMaterial(
            Map.of(
                    ArmorItem.Type.BOOTS, 2,
                    ArmorItem.Type.LEGGINGS, 5,
                    ArmorItem.Type.CHESTPLATE, 7,
                    ArmorItem.Type.HELMET, 3
            ),
            21,
            SoundEvents.ARMOR_EQUIP_GOLD,
            () -> Ingredient.of(ModTags.ROSE_GOLD_INGOT),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(OoohPinky.MOD_ID, "rose_gold"))),
            1.0F,
            0.0F
    ));
}
