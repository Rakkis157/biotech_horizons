package rakkis157.biotech_horizons;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rakkis157.biotech_horizons.block.BHBlock;
import rakkis157.biotech_horizons.item.BHItem;

public class BiotechHorizons implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "biotech_horizons";
	public static final String MOD_NAME = "Biotech Horizons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		BHItem.init();
		BHBlock.init();

		LOGGER.info(MOD_NAME + " setup done!");
	}
}
