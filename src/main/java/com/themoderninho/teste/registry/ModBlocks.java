package com.themoderninho.teste.registry;

import com.themoderninho.teste.Teste;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block NIOBIO_ORE = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(2.0f, 20.0f)
            .sounds(BlockSoundGroup.STONE));

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(Teste.MOD_ID, "niobio_ore"), NIOBIO_ORE);
    }
}
