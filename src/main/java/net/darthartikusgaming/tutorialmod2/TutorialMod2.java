package net.darthartikusgaming.tutorialmod2;

import net.darthartikusgaming.tutorialmod2.block.ModBlocks;
import net.darthartikusgaming.tutorialmod2.item.ModItemGroups;
import net.darthartikusgaming.tutorialmod2.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod2 implements ModInitializer {
	public static final String MOD_ID = "tutorialmod2";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}