package com.bettertrees.bettertrees.item;

import com.bettertrees.bettertrees.BetterTrees;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterTrees.MOD_ID);

    public static final RegistryObject<Item> MARSHMELLOW = ITEMS.register("marshmellow",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.BETTERTREES)));

    public static final RegistryObject<Item> MARSHMELLOWSWORD = ITEMS.register("marsh_sword",
            () -> new SwordItem(ModTiers.MARSHMELLOW, 2, 3f,
                    new Item.Properties().tab(ModCreativeTab.BETTERTREES)));


    public static class ModCreativeTab extends CreativeModeTab {
        public static final ModItems.ModCreativeTab BETTERTREES = new ModItems.ModCreativeTab(CreativeModeTab.TABS.length, "bettertrees");
        private ModCreativeTab(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MARSHMELLOW.get());
        }
    }

}
