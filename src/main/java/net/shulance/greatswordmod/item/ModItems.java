package net.shulance.greatswordmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.shulance.greatswordmod.GreatswordMod;

public class ModItems {

    public static final Item IRON_GREATSWORD = registerItem("iron_greatsword",
            new Greatsword(ToolMaterials.IRON, 8, -3.3F,
                    new FabricItemSettings()));
    public static final Item DIAMOND_GREATSWORD = registerItem("diamond_greatsword",
            new Greatsword(ToolMaterials.DIAMOND, 8, -3.3F,
                    new FabricItemSettings()));
    public static final Item NETHERITE_GREATSWORD = registerItem("netherite_greatsword",
                new Greatsword(ToolMaterials.NETHERITE, 8, -3.3F,
                        new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GreatswordMod.MOD_ID, name), item);
    }

    //Item Groups

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.GREATSWORDS, IRON_GREATSWORD);
        addToItemGroup(ModItemGroup.GREATSWORDS, DIAMOND_GREATSWORD);
        addToItemGroup(ModItemGroup.GREATSWORDS, NETHERITE_GREATSWORD);

        addToItemGroup(ItemGroups.COMBAT, IRON_GREATSWORD);
        addToItemGroup(ItemGroups.COMBAT, DIAMOND_GREATSWORD);
        addToItemGroup(ItemGroups.COMBAT, NETHERITE_GREATSWORD);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        GreatswordMod.LOGGER.debug("Registering Mod Items for " + GreatswordMod.MOD_ID);

        addItemsToItemGroup();
    }
}

