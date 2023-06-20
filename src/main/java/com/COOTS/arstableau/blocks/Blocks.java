package com.COOTS.arstableau.blocks;

import java.util.function.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

public class Blocks {

    public static final RegistryObject<Block> ARCHWOOD_CRAFTING_TABLE = register("archwood_crafting_table", () ->
            new CraftingBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> BLACK_ARCHWOOD_CRAFTING_TABLE = register("black_archwood_crafting_table", () ->
            new CraftingBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> BLUE_ARCHWOOD_CRAFTING_TABLE = register("blue_archwood_crafting_table", () ->
            new CraftingBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> BROWN_ARCHWOOD_CRAFTING_TABLE = register("brown_archwood_crafting_table", () ->
            new CraftingBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> CYAN_ARCHWOOD_CRAFTING_TABLE = register("cyan_archwood_crafting_table", () ->
            new CraftingBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> GRAY_ARCHWOOD_CRAFTING_TABLE = register("gray_archwood_crafting_table", () ->
            new CraftingBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> GREEN_ARCHWOOD_CRAFTING_TABLE = register("green_archwood_crafting_table", () ->
            new CraftingBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> LIGHTBLUE_ARCHWOOD_CRAFTING_TABLE = register("lightblue_archwood_crafting_table", () ->
            new CraftingBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> LIGHTGRAY_ARCHWOOD_CRAFTING_TABLE = register("lightgray_archwood_crafting_table", () ->
            new CraftingBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> LIME_ARCHWOOD_CRAFTING_TABLE = register("lime_archwood_crafting_table", () ->
            new CraftingBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> MAGENTA_ARCHWOOD_CRAFTING_TABLE = register("magenta_archwood_crafting_table", () ->
            new CraftingBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> ORANGE_ARCHWOOD_CRAFTING_TABLE = register("orange_archwood_crafting_table", () ->
            new CraftingBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> PINK_ARCHWOOD_CRAFTING_TABLE = register("pink_archwood_crafting_table", () ->
            new CraftingBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> RED_ARCHWOOD_CRAFTING_TABLE = register("red_archwood_crafting_table", () ->
            new CraftingBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> WHITE_ARCHWOOD_CRAFTING_TABLE = register("white_archwood_crafting_table", () ->
            new CraftingBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)));
    public static final RegistryObject<Block> YELLOW_ARCHWOOD_CRAFTING_TABLE = register("yellow_archwood_crafting_table", () ->
            new CraftingBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE)));

    static void register() {}
    public static <T extends Block>RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name,() -> new BlockItem(ret.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
        return ret;
    }

}
