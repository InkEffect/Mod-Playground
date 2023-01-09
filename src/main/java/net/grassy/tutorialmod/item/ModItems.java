package net.grassy.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.grassy.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static final Item RAW_TANZANITE = registerItem(
            "raw_tanzanite",
            new Item(new Item.Settings()),
            ItemGroups.INGREDIENTS
        );

    public static final Item TANZANITE = registerItem(
            "tanzanite",
            new Item(new Item.Settings()),
            ItemGroups.INGREDIENTS
    );

    public static void registerModItems() {
            TutorialMod.LOGGER.debug("Registering mod items for " + TutorialMod.MOD_ID);
    }
}
