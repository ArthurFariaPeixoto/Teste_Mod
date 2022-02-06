package com.themoderninho.teste.item;

import com.themoderninho.teste.Teste;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ITEM_GROUP_BLOCKS = FabricItemGroupBuilder.build(
            new Identifier(Teste.MOD_ID, "block"),
            () -> new ItemStack(ModItems.NIOBIO_ORE)
    );
    public static final ItemGroup ITEM_GROUP_DECORATION_BLOCK= FabricItemGroupBuilder.build(
            new Identifier(Teste.MOD_ID, "decoration"),
            () -> new ItemStack(ModItems.BAOBAB_FENCE)
    );
    public static final ItemGroup ITEM_GROUP_REDSTONE = FabricItemGroupBuilder.build(
            new Identifier(Teste.MOD_ID, "redstone"),
            () -> new ItemStack(ModItems.BAOBAB_BUTTON)
    );
    public static final ItemGroup ITEM_GROUP_MATERIAL = FabricItemGroupBuilder.build(
            new Identifier(Teste.MOD_ID, "material"),
            () -> new ItemStack(ModItems.NIOBIO_INGOT)
    );
    public static final ItemGroup ITEM_GROUP_FOOD = FabricItemGroupBuilder.build(
            new Identifier(Teste.MOD_ID, "food"),
            () -> new ItemStack(ModItems.PEPPER)
    );
}
