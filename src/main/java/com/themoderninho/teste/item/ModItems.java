package com.themoderninho.teste.item;

import com.themoderninho.teste.Teste;
import com.themoderninho.teste.block.ModBlocks;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Itens
    public static final Item NIOBIO_INGOT = new Item(new Item.Settings().group(ModItemGroup.ITEM_GROUP_MATERIAL));
    public static final Item RAW_NIOBIO = new Item(new Item.Settings().group(ModItemGroup.ITEM_GROUP_MATERIAL));
    public static final Item REINFORCED_IRON_INGOT = new Item(new Item.Settings().group(ModItemGroup.ITEM_GROUP_MATERIAL));

    //Itens de Blocos
    public static final BlockItem NIOBIO_ORE = new BlockItem(ModBlocks.NIOBIO_ORE, new Item.Settings().group(ModItemGroup.ITEM_GROUP_BLOCKS));
    public static final BlockItem NIOBIO_BLOCK = new BlockItem(ModBlocks.NIOBIO_BLOCK, new Item.Settings().group(ModItemGroup.ITEM_GROUP_BLOCKS));
    public static final BlockItem BAOBAB_PLANKS = new BlockItem(ModBlocks.BAOBAB_PLANKS, new Item.Settings().group(ModItemGroup.ITEM_GROUP_BLOCKS));
    public static final BlockItem BAOBAB_PLANKS_SLAB = new BlockItem(ModBlocks.BAOBAB_PLANKS_SLAB, new Item.Settings().group(ModItemGroup.ITEM_GROUP_BLOCKS));
    public static final BlockItem BAOBAB_PLANKS_STAIR = new BlockItem(ModBlocks.BAOBAB_PLANKS_STAIR, new Item.Settings().group(ModItemGroup.ITEM_GROUP_BLOCKS));
    public static final BlockItem BAOBAB_FENCE = new BlockItem(ModBlocks.BAOBAB_FENCE, new Item.Settings().group(ModItemGroup.ITEM_GROUP_BLOCKS));
    public static final BlockItem BAOBAB_FENCE_GATE = new BlockItem(ModBlocks.BAOBAB_FENCE_GATE, new Item.Settings().group(ModItemGroup.ITEM_GROUP_BLOCKS));
    public static final BlockItem BAOBAB_BUTTON = new BlockItem(ModBlocks.BAOBAB_BUTTON, new Item.Settings().group(ModItemGroup.ITEM_GROUP_BLOCKS));
    public static final BlockItem BAOBAB_PRESSURE_PLATE = new BlockItem(ModBlocks.BAOBAB_PRESSURE_PLATE, new Item.Settings().group(ModItemGroup.ITEM_GROUP_BLOCKS));

    //Itens de comida
    public static final Item PEPPER = new Item(new Item.Settings()
            .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).snack().statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100 , 1), 1.0F).alwaysEdible().build())
            .group(ModItemGroup.ITEM_GROUP_FOOD));

    //Itens de combustivel
    public static final Item FUEL = new Item(new Item.Settings().group(ModItemGroup.ITEM_GROUP_MATERIAL));


    public static void registerItems(){
        //Itens
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "niobio_ingot"), NIOBIO_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "raw_niobio"), RAW_NIOBIO);
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "reinforced_iron_ingot"), REINFORCED_IRON_INGOT);

        //Itens de Blocos
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "niobio_ore"), NIOBIO_ORE);
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "niobio_block"), NIOBIO_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "baobab_planks"), BAOBAB_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "baobab_planks_slab"), BAOBAB_PLANKS_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "baobab_planks_stair"), BAOBAB_PLANKS_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "baobab_fence"), BAOBAB_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "baobab_fence_gate"), BAOBAB_FENCE_GATE);
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "baobab_button"), BAOBAB_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "baobab_pressure_plate"), BAOBAB_PRESSURE_PLATE);


        //Itens Comestiveis
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "pepper"), PEPPER);

        //Itens de combustivel
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "fuel"), FUEL);
    }
}
