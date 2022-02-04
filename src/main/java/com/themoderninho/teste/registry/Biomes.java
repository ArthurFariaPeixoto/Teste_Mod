package com.themoderninho.teste.registry;

import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class Biomes {

    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> CUSTOM_SURFACE_BUILDER = SurfaceBuilder.DEFAULT.withConfig(new TernarySurfaceConfig(
            Blocks.GRASS_BLOCK.getDefaultState(),
            Blocks.STONE.getDefaultState(),
            Blocks.GRAVEL.getDefaultState())
    );

    public static Biome SNOWY_FIELDS = createBiome();

    public static Biome createBiome(){
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(CUSTOM_SURFACE_BUILDER);

        DefaultBiomeFeatures.addMonsters(spawnSettings, 46, 4, 50);
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addSnowyMobs(spawnSettings);


        DefaultBiomeFeatures.addSnowySpruceTrees(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addAmethystGeodes(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
        DefaultBiomeFeatures.addDefaultFlowers(generationSettings);
        DefaultBiomeFeatures.addDefaultLakes(generationSettings);

        return (new Biome.Builder())
                .precipitation(Biome.Precipitation.SNOW)
                .category(Biome.Category.ICY)
                .depth(0.125F)
                .scale(0.05F)
                .temperature(0.0F)
                .downfall(0.4F)
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x000BB6)
                        .waterFogColor(0x000BB6)
                        .skyColor(0x00ACFF)
                        .fogColor(0)
                        .build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build())
                .build();
    }

    public static final RegistryKey<Biome> SNOWY_FIELDS_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("teste", "snowyfields"));

    public static void registerBiome(){
        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier("teste", "grass_block"), CUSTOM_SURFACE_BUILDER);
        Registry.register(BuiltinRegistries.BIOME, SNOWY_FIELDS_KEY.getValue(), SNOWY_FIELDS);

        OverworldBiomes.addContinentalBiome(SNOWY_FIELDS_KEY, OverworldClimate.SNOWY, 20);
        //OverworldBiomes.addContinentalBiome(SNOWY_FIELDS_KEY, OverworldClimate.COOL, 20);

    }
}
