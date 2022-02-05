package com.themoderninho.teste.registry;

import com.themoderninho.teste.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {

    public static void registerFuels(){
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.FUEL, 2400);
    }
}
