package io.github.itsnuaz.tatbackport.block;

import io.github.itsnuaz.tatbackport.TrailsAndTalesBackportMod;
import io.github.itsnuaz.tatbackport.block.custom.ChiseledBookshelfBlock;
import io.github.itsnuaz.tatbackport.block.entity.ModSignTypes;
import io.github.itsnuaz.tatbackport.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block BAMBOO_MOSAIC = register("bamboo_mosaic",
            new Block(FabricBlockSettings.of(Material.BAMBOO).strength(0.5f).sounds(BlockSoundGroup.BAMBOO)), ModItemGroups.TRAILS_AND_TALES);
    public static final Block BAMBOO_PLANKS = register("bamboo_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroups.TRAILS_AND_TALES);
    public static final Block CHERRY_LEAVES = register("cherry_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroups.TRAILS_AND_TALES);

    public static final Block BAMBOO_BLOCK = register("bamboo_block",
            new PillarBlock(
                    FabricBlockSettings.of(Material.WOOD)
                            .strength(0.5f)
                            .sounds(BlockSoundGroup.BAMBOO)
            ), ModItemGroups.TRAILS_AND_TALES
    );
    public static final Block STRIPPED_BAMBOO_BLOCK = register("stripped_bamboo_block",
            new PillarBlock(
                    FabricBlockSettings.of(Material.WOOD)
                            .strength(0.5f)
                            .sounds(BlockSoundGroup.BAMBOO)
            ), ModItemGroups.TRAILS_AND_TALES
    );

    public static final Block CHERRY_LOG = register("cherry_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroups.TRAILS_AND_TALES);
    public static final Block CHERRY_WOOD = register("cherry_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroups.TRAILS_AND_TALES);
    public static final Block STRIPPED_CHERRY_LOG = register("stripped_cherry_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroups.TRAILS_AND_TALES);
    public static final Block STRIPPED_CHERRY_WOOD = register("stripped_cherry_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroups.TRAILS_AND_TALES);

    public static final Block CHERRY_PLANKS = register("cherry_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroups.TRAILS_AND_TALES);

    public static final Block CHISELED_BOOKSHELF = register("chiseled_bookshelf",
            new ChiseledBookshelfBlock(FabricBlockSettings.of(Material.WOOD).strength(0.5f).sounds(BlockSoundGroup.WOOD)), ModItemGroups.TRAILS_AND_TALES);

    public static final Block BAMBOO_MOSAIC_STAIRS = register("bamboo_mosaic_stairs",
            new StairsBlock(ModBlocks.BAMBOO_MOSAIC.getDefaultState(), FabricBlockSettings.of(Material.BAMBOO).strength(0.5f).sounds(BlockSoundGroup.BAMBOO)), ModItemGroups.TRAILS_AND_TALES);
    public static final Block BAMBOO_STAIRS = register("bamboo_stairs",
            new StairsBlock(ModBlocks.BAMBOO_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS)), ModItemGroups.TRAILS_AND_TALES);
    public static final Block CHERRY_STAIRS = register("cherry_stairs",
            new StairsBlock(ModBlocks.CHERRY_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS)), ModItemGroups.TRAILS_AND_TALES);

    public static final Block BAMBOO_MOSAIC_SLAB = register("bamboo_mosaic_slab",
            new SlabBlock(FabricBlockSettings.of(Material.BAMBOO).strength(0.5f).sounds(BlockSoundGroup.BAMBOO)), ModItemGroups.TRAILS_AND_TALES);
    public static final Block BAMBOO_SLAB = register("bamboo_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroups.TRAILS_AND_TALES);
    public static final Block CHERRY_SLAB = register("cherry_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroups.TRAILS_AND_TALES);

    public static final Block BAMBOO_BUTTON = register("bamboo_button",
            new WoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON)), ModItemGroups.TRAILS_AND_TALES);
    public static final Block CHERRY_BUTTON = register("cherry_button",
            new WoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON)), ModItemGroups.TRAILS_AND_TALES);

    public static final Block BAMBOO_PRESSURE_PLATE = register("bamboo_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)), ModItemGroups.TRAILS_AND_TALES);
    public static final Block CHERRY_PRESSURE_PLATE = register("cherry_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)), ModItemGroups.TRAILS_AND_TALES);

    public static final Block BAMBOO_DOOR = register("bamboo_door",
            new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR)), ModItemGroups.TRAILS_AND_TALES);
    public static final Block CHERRY_DOOR = register("cherry_door",
            new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR)), ModItemGroups.TRAILS_AND_TALES);

    public static final Block BAMBOO_TRAPDOOR = register("bamboo_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR)), ModItemGroups.TRAILS_AND_TALES);
    public static final Block CHERRY_TRAPDOOR = register("cherry_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR)), ModItemGroups.TRAILS_AND_TALES);

    public static final Block BAMBOO_FENCE = register("bamboo_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)), ModItemGroups.TRAILS_AND_TALES);
    public static final Block CHERRY_FENCE = register("cherry_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)), ModItemGroups.TRAILS_AND_TALES);

    public static final Block BAMBOO_FENCE_GATE = register("bamboo_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE)), ModItemGroups.TRAILS_AND_TALES);
    public static final Block CHERRY_FENCE_GATE = register("cherry_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE)), ModItemGroups.TRAILS_AND_TALES);

    public static final Block BAMBOO_SIGN = registerWithoutItem("bamboo_sign",
            new SignBlock((FabricBlockSettings.copy(Blocks.OAK_SIGN)), ModSignTypes.BAMBOO));
    public static final Block CHERRY_SIGN = registerWithoutItem("cherry_sign",
            new SignBlock((FabricBlockSettings.copy(Blocks.OAK_SIGN)), ModSignTypes.CHERRY));

    public static final Block BAMBOO_WALL_SIGN = registerWithoutItem("bamboo_wall_sign",
            new WallSignBlock((FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN)), ModSignTypes.BAMBOO));
    public static final Block CHERRY_WALL_SIGN = registerWithoutItem("cherry_wall_sign",
            new WallSignBlock((FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN)), ModSignTypes.CHERRY));

    private static Block register(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(name), block);
    }

    private static Block registerWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void initialize() {}
}
