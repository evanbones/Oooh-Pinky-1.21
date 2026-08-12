package com.jerrylu086.oooh_pinky.data;

import com.jerrylu086.oooh_pinky.core.Configuration;
import com.mojang.serialization.MapCodec;
import net.neoforged.neoforge.common.conditions.ICondition;

public class EasyCraftingCondition implements ICondition {
    public static final MapCodec<EasyCraftingCondition> CODEC = MapCodec.unit(new EasyCraftingCondition());

    @Override
    public boolean test(IContext context) {
        return Configuration.EASY_CRAFTING.get();
    }

    @Override
    public MapCodec<? extends ICondition> codec() {
        return CODEC;
    }
}
