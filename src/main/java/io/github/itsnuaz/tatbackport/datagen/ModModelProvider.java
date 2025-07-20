package io.github.itsnuaz.tatbackport.datagen;

import io.github.itsnuaz.tatbackport.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHERRY_LEAVES);


        // Block texture pools
        BlockStateModelGenerator.BlockTexturePool bambooMosaicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BAMBOO_MOSAIC);
        bambooMosaicPool.stairs(ModBlocks.BAMBOO_MOSAIC_STAIRS);
        bambooMosaicPool.slab(ModBlocks.BAMBOO_MOSAIC_SLAB);
        bambooMosaicPool.fence(ModBlocks.BAMBOO_FENCE);
        bambooMosaicPool.fenceGate(ModBlocks.BAMBOO_FENCE_GATE);


        BlockStateModelGenerator.BlockTexturePool bambooPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BAMBOO_PLANKS);
        bambooPlanksPool.stairs(ModBlocks.BAMBOO_STAIRS);
        bambooPlanksPool.slab(ModBlocks.BAMBOO_SLAB);
        bambooPlanksPool.button(ModBlocks.BAMBOO_BUTTON);
        bambooPlanksPool.pressurePlate(ModBlocks.BAMBOO_PRESSURE_PLATE);


        BlockStateModelGenerator.BlockTexturePool cherryPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHERRY_PLANKS);
        cherryPlanksPool.stairs(ModBlocks.CHERRY_STAIRS);
        cherryPlanksPool.slab(ModBlocks.CHERRY_SLAB);
        cherryPlanksPool.fence(ModBlocks.CHERRY_FENCE);
        cherryPlanksPool.fenceGate(ModBlocks.CHERRY_FENCE_GATE);
        cherryPlanksPool.button(ModBlocks.CHERRY_BUTTON);
        cherryPlanksPool.pressurePlate(ModBlocks.CHERRY_PRESSURE_PLATE);


        // Doors and trapdoors
        blockStateModelGenerator.registerDoor(ModBlocks.BAMBOO_DOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.CHERRY_DOOR);

        blockStateModelGenerator.registerTrapdoor(ModBlocks.BAMBOO_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CHERRY_TRAPDOOR);

        // Wood logs alike rotation, 3 variations (x, Y, Z axis)
        blockStateModelGenerator.registerAxisRotated(ModBlocks.BAMBOO_BLOCK, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.STRIPPED_BAMBOO_BLOCK, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);

        // Furnace alike rotation, horizontal facing (NORTH, SOUTH, EAST, WEST)
        blockStateModelGenerator.registerNorthDefaultHorizontalRotated(ModBlocks.CHISELED_BOOKSHELF, TexturedModel.ORIENTABLE);

        blockStateModelGenerator.registerLog(ModBlocks.CHERRY_LOG).log(ModBlocks.CHERRY_LOG).wood(ModBlocks.CHERRY_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_CHERRY_LOG).log(ModBlocks.STRIPPED_CHERRY_LOG).wood(ModBlocks.STRIPPED_CHERRY_WOOD);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {}
}
