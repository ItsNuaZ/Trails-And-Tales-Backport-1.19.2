package io.github.itsnuaz.tatbackport.datagen;

import io.github.itsnuaz.tatbackport.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.tag.BlockTags;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.CHERRY_LOG)
                .add(ModBlocks.CHERRY_WOOD)
                .add(ModBlocks.STRIPPED_CHERRY_LOG)
                .add(ModBlocks.STRIPPED_CHERRY_WOOD);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.BAMBOO_PLANKS)
                .add(ModBlocks.CHERRY_PLANKS);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.BAMBOO_STAIRS)
                .add(ModBlocks.CHERRY_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.BAMBOO_SLAB)
                .add(ModBlocks.CHERRY_SLAB);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.BAMBOO_BLOCK)
                .add(ModBlocks.STRIPPED_BAMBOO_BLOCK)
                .add(ModBlocks.BAMBOO_MOSAIC)
                .add(ModBlocks.BAMBOO_MOSAIC_STAIRS)
                .add(ModBlocks.BAMBOO_MOSAIC_SLAB)
                .add(ModBlocks.BAMBOO_FENCE_GATE)
                .add(ModBlocks.BAMBOO_SIGN)
                .add(ModBlocks.BAMBOO_WALL_SIGN)
                .add(ModBlocks.CHERRY_FENCE_GATE)
                .add(ModBlocks.CHERRY_SIGN)
                .add(ModBlocks.CHERRY_WALL_SIGN)
                .add(ModBlocks.CHISELED_BOOKSHELF);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.BAMBOO_DOOR)
                .add(ModBlocks.CHERRY_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.BAMBOO_TRAPDOOR)
                .add(ModBlocks.CHERRY_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.BAMBOO_FENCE)
                .add(ModBlocks.CHERRY_FENCE);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.BAMBOO_FENCE)
                .add(ModBlocks.CHERRY_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.BAMBOO_FENCE_GATE)
                .add(ModBlocks.CHERRY_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.LEAVES).add(ModBlocks.CHERRY_LEAVES);
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE).add(ModBlocks.CHERRY_LEAVES);

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(ModBlocks.BAMBOO_SIGN)
                .add(ModBlocks.CHERRY_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(ModBlocks.BAMBOO_WALL_SIGN)
                .add(ModBlocks.CHERRY_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_POST_OVERRIDE)
                .add(ModBlocks.BAMBOO_SIGN)
                .add(ModBlocks.BAMBOO_WALL_SIGN)
                .add(ModBlocks.CHERRY_SIGN)
                .add(ModBlocks.CHERRY_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.BAMBOO_BUTTON)
                .add(ModBlocks.CHERRY_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.BAMBOO_PRESSURE_PLATE)
                .add(ModBlocks.CHERRY_PRESSURE_PLATE);
    }
}
