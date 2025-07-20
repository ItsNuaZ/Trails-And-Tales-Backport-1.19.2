package io.github.itsnuaz.tatbackport.util;

import io.github.itsnuaz.tatbackport.TrailsAndTalesBackportMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {
    public static class Blocks {


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, Identifier.of(TrailsAndTalesBackportMod.MOD_ID, name));
        }
    }

    public static class Items {


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, Identifier.of(TrailsAndTalesBackportMod.MOD_ID, name));
        }
    }
}
