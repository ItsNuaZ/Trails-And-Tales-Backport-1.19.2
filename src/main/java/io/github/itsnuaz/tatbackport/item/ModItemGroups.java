package io.github.itsnuaz.tatbackport.item;

import io.github.itsnuaz.tatbackport.TrailsAndTalesBackportMod;
import io.github.itsnuaz.tatbackport.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TRAILS_AND_TALES = FabricItemGroupBuilder.build(
            new Identifier("trails_and_tales"), () -> new ItemStack(ModBlocks.BAMBOO_MOSAIC));
}
