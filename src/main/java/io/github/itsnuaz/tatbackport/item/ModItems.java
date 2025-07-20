package io.github.itsnuaz.tatbackport.item;

import io.github.itsnuaz.tatbackport.TrailsAndTalesBackportMod;
import io.github.itsnuaz.tatbackport.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item BAMBOO_SIGN = register("bamboo_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroups.TRAILS_AND_TALES).maxCount(16), ModBlocks.BAMBOO_SIGN, ModBlocks.BAMBOO_WALL_SIGN));

    public static final Item CHERRY_SIGN = register("cherry_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroups.TRAILS_AND_TALES).maxCount(16), ModBlocks.CHERRY_SIGN, ModBlocks.CHERRY_WALL_SIGN));

    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(name), item);
    }

    public static void initialize() {}
}
