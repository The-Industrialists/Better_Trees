package com.bettertrees.bettertrees.datagen;

import com.bettertrees.bettertrees.BetterTrees;
import com.bettertrees.bettertrees.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutItemModels extends ItemModelProvider {

    public TutItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, BetterTrees.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.MARSH_MELLOW_TREE_ITEM.getId().getPath(), modLoc("block/marsh_mellow_tree_item"));

    }
}