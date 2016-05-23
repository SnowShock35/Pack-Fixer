package com.snowshock35.packfixer.blocks;

import com.snowshock35.packfixer.utils.LanguageHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import static com.snowshock35.packfixer.PackFixer.MOD_ID;

public class BlockPackFixer extends Block {
    public BlockPackFixer(Material material) {
        super(material);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("tile.%s:%s", MOD_ID, unwrapUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String unwrapUnlocalizedName(String unlocalizedName) {
        return LanguageHelper.unwrapUnlocalizedName(unlocalizedName);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(String.format("%s:%s", MOD_ID ,getTextureName()));
    }
}
