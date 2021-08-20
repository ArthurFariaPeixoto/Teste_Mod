package com.themoderninho.teste.registry;

import com.themoderninho.teste.Teste;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    //Itens
    public static final Item NIOBIO_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item RAW_NIOBIO = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    //Itens de Blocos
    public static final BlockItem NIOBIO_ORE = new BlockItem(ModBlocks.NIOBIO_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems(){
        //Itens
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "niobio_ingot"), NIOBIO_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "raw_niobio"), RAW_NIOBIO);

        //Itens de Blocos
        Registry.register(Registry.ITEM, new Identifier(Teste.MOD_ID, "niobio_ore"), NIOBIO_ORE);
    }
}
