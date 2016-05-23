package com.snowshock35.packfixer.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTitaniumOre extends BlockPackFixer {

    public static final String TITANIUM_ORE_NAME = "titanium_ore";

    public BlockTitaniumOre() {
        super(Material.rock);
        this.setHardness(3.0F);
        this.setResistance(15.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockName(TITANIUM_ORE_NAME);
        this.setBlockTextureName(TITANIUM_ORE_NAME);
    }
}
