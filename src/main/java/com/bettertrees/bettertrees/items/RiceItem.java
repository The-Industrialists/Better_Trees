package com.bettertrees.bettertrees.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class RiceItem extends Item {

    public RiceItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public int getItemStackLimit(ItemStack stack) {
        return 128; // Set the desired stack size here
    }


}
