package com.stereo528.example;

import eu.midnightdust.lib.config.MidnightConfig;
import com.stereo528.example.Config.ModConfig;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

import static com.stereo528.example.Example.MODID;

public class ExampleClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		MidnightConfig.init(MODID, ModConfig.class);
	}
}
