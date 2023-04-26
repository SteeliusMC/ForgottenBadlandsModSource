
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgottenbadlands.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.forgottenbadlands.world.features.BadlandsruinedbarnFeature;
import net.mcreator.forgottenbadlands.world.features.BadlandsgoldsiteFeature;
import net.mcreator.forgottenbadlands.ForgottenbadlandsMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class ForgottenbadlandsModFeatures {
	public static void load() {
		register("badlandsruinedbarn", BadlandsruinedbarnFeature.feature(), BadlandsruinedbarnFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
		register("badlandsgoldsite", BadlandsgoldsiteFeature.feature(), BadlandsgoldsiteFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(Registry.FEATURE, new ResourceLocation(ForgottenbadlandsMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(ForgottenbadlandsMod.MODID, registryName)));
	}
}
