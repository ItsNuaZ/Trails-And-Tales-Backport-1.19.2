package io.github.itsnuaz.tatbackport;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrailsAndTalesBackportMod implements ModInitializer {
	public static final String MOD_ID = "trailsandtalesbackportmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}