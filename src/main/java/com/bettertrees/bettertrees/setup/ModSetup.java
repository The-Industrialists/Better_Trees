package com.bettertrees.bettertrees.setup;

import net.minecraft.world.item.Items;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModSetup {
    public static final String TAB_NAME = "BetterTrees";

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.OAK_LOG);
        }
    };
    public static void init(final FMLCommonSetupEvent event) {



    }
}
