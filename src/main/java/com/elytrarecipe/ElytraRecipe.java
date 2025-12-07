package com.elytrarecipe;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElytraRecipe implements ModInitializer {


	public static final String MOD_ID = "elytra-recipe";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

        try {
            ModItems.initialize();
            LOGGER.info("Mod loaded successfully");
        }
        catch (Exception e) {
            LOGGER.info("An error occurred and the mod may not be working correctly. Java Exception data: {}", String.valueOf(e));
        }

	}
}