package com.snowshock35.packfixer.init;

import com.snowshock35.packfixer.blocks.BlockPackFixer;
import com.snowshock35.packfixer.blocks.BlockTitaniumOre;
import cpw.mods.fml.common.registry.GameRegistry;

import static com.snowshock35.packfixer.PackFixer.MOD_ID;

public class InitModBlocks {

    public static BlockTitaniumOre titaniumOre;

    public static void preInit() {
        titaniumOre = new BlockTitaniumOre();
        GameRegistry.registerBlock(titaniumOre, BlockTitaniumOre.TITANIUM_ORE_NAME);
    }
}
