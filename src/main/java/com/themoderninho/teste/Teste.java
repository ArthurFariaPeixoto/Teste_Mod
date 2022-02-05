package com.themoderninho.teste;

import com.themoderninho.teste.registry.Biomes;
import com.themoderninho.teste.block.ModBlocks;
import com.themoderninho.teste.item.ModItems;
import com.themoderninho.teste.registry.ModRegistries;
import net.fabricmc.api.ModInitializer;

public class Teste implements ModInitializer {

    //Mod ID
    public static final String MOD_ID = "teste";

    //Grupos de Item

    @Override
    public void onInitialize() {
        Biomes.registerBiomes();
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModRegistries.registerFuels();

    }
}
