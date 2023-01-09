package net.grassy.tutorialmod;


import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.grassy.tutorialmod.block.ModBlocks;
import net.grassy.tutorialmod.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registeredModBlocks();
	}
}
