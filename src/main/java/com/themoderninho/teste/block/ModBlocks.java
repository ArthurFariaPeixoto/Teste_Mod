package com.themoderninho.teste.block;

import com.themoderninho.teste.Teste;
import com.themoderninho.teste.block.custom.ModPressurePlateBlock;
import com.themoderninho.teste.block.custom.ModStairsBlock;
import com.themoderninho.teste.block.custom.ModWoodenButtonBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block NIOBIO_ORE = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(3.0f, 20.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block NIOBIO_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5.0f, 30.0f)
            .sounds(BlockSoundGroup.METAL));

    public static final Block BAOBAB_PLANKS = new Block(FabricBlockSettings
            .of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .strength(3.0f, 10.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final ModStairsBlock BAOBAB_PLANKS_STAIR = new ModStairsBlock(ModBlocks.BAOBAB_PLANKS.getDefaultState(),FabricBlockSettings
            .of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .strength(3.0f, 10.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final SlabBlock BAOBAB_PLANKS_SLAB = new SlabBlock(FabricBlockSettings
            .of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .strength(3.0f, 10.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block BAOBAB_FENCE = new FenceBlock(FabricBlockSettings
            .of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .strength(3.0f, 10.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block BAOBAB_FENCE_GATE = new FenceGateBlock(FabricBlockSettings
            .of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .strength(3.0f, 10.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block BAOBAB_BUTTON = new ModWoodenButtonBlock(FabricBlockSettings
            .of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .strength(3.0f, 10.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block BAOBAB_PRESSURE_PLATE = new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings
            .of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .strength(3.0f, 10.0f)
            .sounds(BlockSoundGroup.WOOD));


    public static void registerBlocks(){

        Registry.register(Registry.BLOCK, new Identifier(Teste.MOD_ID, "niobio_ore"), NIOBIO_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Teste.MOD_ID, "niobio_block"), NIOBIO_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Teste.MOD_ID, "baobab_planks"), BAOBAB_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Teste.MOD_ID, "baobab_planks_stair"), BAOBAB_PLANKS_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Teste.MOD_ID, "baobab_planks_slab"), BAOBAB_PLANKS_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Teste.MOD_ID, "baobab_fence"), BAOBAB_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Teste.MOD_ID, "baobab_fence_gate"), BAOBAB_FENCE_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Teste.MOD_ID, "baobab_button"), BAOBAB_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Teste.MOD_ID, "baobab_pressure_plate"), BAOBAB_PRESSURE_PLATE);

    }
}
