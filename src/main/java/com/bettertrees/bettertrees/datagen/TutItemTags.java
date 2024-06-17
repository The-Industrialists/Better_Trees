package com.bettertrees.bettertrees.datagen;


import com.bettertrees.bettertrees.BetterTrees;
import com.bettertrees.bettertrees.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;


public class TutItemTags extends ItemTagsProvider {

    public TutItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, BetterTrees.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.MARSH_MELLOW_TREE_ITEM.get());

    }

    @Override
    public String getName() {
        return "Tutorial Tags";
    }
}
