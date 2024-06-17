package com.bettertrees.bettertrees.datagen;

import com.bettertrees.bettertrees.BetterTrees;
import com.bettertrees.bettertrees.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutBlockStates extends BlockStateProvider {

    public TutBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, BetterTrees.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.MARSH_MELLOW_TREE.get());

    }
}
