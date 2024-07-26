package com.bettertrees.bettertrees.init;

import com.bettertrees.bettertrees.BetterTrees;
import com.bettertrees.bettertrees.util.ModItemTier;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {



    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterTrees.MOD_ID);

    public static final RegistryObject<Item> MARSHMELLOW = ITEMS.register("marshmellow",
            () -> new Item(new Item.Properties().tab(ItemInit.ModCreativeTab.BETTERTREES)));


    public static final RegistryObject<Item> RICEBOWL = ITEMS.register("rice_bowl",
            () -> new Item(new Item.Properties().tab(ItemInit.ModCreativeTab.BETTERTREES)));

    public static final RegistryObject<Item> RICEITEM = ITEMS.register("rice",
            () -> new Item(new Item.Properties().tab(ItemInit.ModCreativeTab.BETTERTREES)));

    public static final RegistryObject<Item> RICECLUMP = ITEMS.register("rice_clump",
            () -> new Item(new Item.Properties().tab(ItemInit.ModCreativeTab.BETTERTREES)));

    public static final RegistryObject<Item> RICEBALL = ITEMS.register("rice_ball",
            () -> new Item(new Item.Properties().tab(ItemInit.ModCreativeTab.BETTERTREES)));


    public static final RegistryObject<Item> MARSHMELLOWSWORD = ITEMS.register("marshmellow_sword",
            () -> new SwordItem(ModItemTier.MARSHMELLOW, 3, -2.4F, new Item.Properties().tab(ItemInit.ModCreativeTab.BETTERTREES)));





    public static class ModCreativeTab extends CreativeModeTab {

        public static final ModCreativeTab BETTERTREES = new ModCreativeTab(CreativeModeTab.TABS.length, "bettertrees");
        private ModCreativeTab(int index, String label) {
            super(index, label);
        }



        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MARSHMELLOW.get());
        }
    }
}
