package net.shulance.greatswordmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.shulance.greatswordmod.GreatswordMod;

public class ModItemGroup {
    public static ItemGroup GREATSWORDS;

        public static void registerItemGroups() {
            GREATSWORDS = FabricItemGroup.builder(new Identifier(GreatswordMod.MOD_ID, "greatswords"))
                .displayName(Text.translatable("itemgroup.greatswords"))
                    .icon(() -> new ItemStack(ModItems.IRON_GREATSWORD)).build();
    }
}
