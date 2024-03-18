package com.stereo528.example;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example implements ModInitializer {
	public static final String MODID = "example";
	public static final Logger LOGGER = LoggerFactory.getLogger("Example");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello world from Example!");
	}
}
