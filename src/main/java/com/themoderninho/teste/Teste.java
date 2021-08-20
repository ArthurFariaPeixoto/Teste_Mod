package com.themoderninho.teste;

import com.themoderninho.teste.registry.ModBlocks;
import com.themoderninho.teste.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Teste implements ModInitializer {

    public static final String MOD_ID = "teste";

    public static final ItemGroup ITEM_GROUP_MATERIAL = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "material"),
            () -> new ItemStack(ModItems.NIOBIO_INGOT)
    );
    public static final ItemGroup ITEM_GROUP_BLOCKS = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "block"),
            () -> new ItemStack(ModItems.NIOBIO_BLOCK)
    );


    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();

    }
}
