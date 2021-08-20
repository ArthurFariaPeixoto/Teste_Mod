package com.themoderninho.teste;

import com.themoderninho.teste.registry.ModBlocks;
import com.themoderninho.teste.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Teste implements ModInitializer {

    public static final String MOD_ID = "teste";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();

    }
}
