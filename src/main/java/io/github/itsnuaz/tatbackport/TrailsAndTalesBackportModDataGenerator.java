package io.github.itsnuaz.tatbackport;

import io.github.itsnuaz.tatbackport.datagen.ModBlockTagProvider;
import io.github.itsnuaz.tatbackport.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class TrailsAndTalesBackportModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		fabricDataGenerator.addProvider(ModBlockTagProvider::new);
		fabricDataGenerator.addProvider(ModModelProvider::new);
	}
}
