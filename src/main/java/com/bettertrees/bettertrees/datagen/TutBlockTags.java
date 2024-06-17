package com.bettertrees.bettertrees.datagen;

import com.bettertrees.bettertrees.BetterTrees;
import com.bettertrees.bettertrees.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;



public class TutBlockTags extends BlockTagsProvider {

    public TutBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, BetterTrees.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(Registration.MARSH_MELLOW_TREE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.MARSH_MELLOW_TREE.get());

        tag(Tags.Blocks.ORES)
                .add(Registration.MARSH_MELLOW_TREE.get());

    }

    @Override
    public String getName() {
        return "Tutorial Tags";
    }
}