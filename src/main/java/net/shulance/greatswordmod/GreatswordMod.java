package net.shulance.greatswordmod;

import net.fabricmc.api.ModInitializer;
import net.shulance.greatswordmod.item.ModItemGroup;
import net.shulance.greatswordmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreatswordMod implements ModInitializer {
	public static final String MOD_ID = "greatswordmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();
	}
}
