package com.bettertrees.bettertrees.init;

import com.bettertrees.bettertrees.BetterTrees;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterTrees.MOD_ID);

    public static final RegistryObject<Item> MARSHMELLOW = ITEMS.register("marshmellow",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));


    public static class ModCreativeTab extends CreativeModeTab {
        public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length, "BetterTrees");
        private ModCreativeTab(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MARSHMELLOW.get());
        }
    }


}
