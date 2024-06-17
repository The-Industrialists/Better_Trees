package com.bettertrees.bettertrees.datagen;

import com.bettertrees.bettertrees.BetterTrees;
import com.bettertrees.bettertrees.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.bettertrees.bettertrees.setup.ModSetup.TAB_NAME;

public class TutLanguageProvider extends LanguageProvider {

    public TutLanguageProvider(DataGenerator gen, String locale) {
        super(gen, BetterTrees.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "BetterTrees");
        add(Registration.MARSH_MELLOW_TREE.get(), "Marash Mellow Wood");

    }
}

