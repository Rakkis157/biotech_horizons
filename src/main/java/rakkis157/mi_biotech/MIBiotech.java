package rakkis157.mi_biotech;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rakkis157.mi_biotech.block.MIBBlock;
import rakkis157.mi_biotech.item.MIBItem;
import rakkis157.mi_biotech.item.MIBItemGroup;

public class MIBiotech implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "mi_biotech";
	public static final String MOD_NAME = "Modern Industrialization: Biotech";
	public static final Logger LOGGER = LoggerFactory.getLogger("Modern Industrialization: Biotech");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		MIBItem.init();
		MIBBlock.init();

		LOGGER.info(MOD_NAME + " setup done!");
	}
}
