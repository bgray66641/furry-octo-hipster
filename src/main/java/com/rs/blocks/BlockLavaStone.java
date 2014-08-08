package com.rs.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockLavaStone extends Block
{
    public static String[] name = new String[] {"LavaStone", "LavaStoneBrick", "MossyLavaBrick", "CrackedLavaBrick", "ChiseledLavaBrick"};

    @SideOnly(Side.CLIENT)
    private IIcon[] icon;

    public BlockLavaStone(){
        super(Material.rock);
        for (int i = 0; i < name.length; i++)
        {
            setBlockTextureName("MB" + ":" + name[i]);
        }
        //setCreativeTab(MainRegistry.MB);
    }

    @Override
    public IIcon getIcon(int side, int meta)
    {
        if (meta < 0 || meta >= name.length){
            meta = 0;
        }
        return this.icon[meta];
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int p_149692_1_)
    {
        return p_149692_1_;
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        for (int i = 0; i < name.length; ++i)
        {
            p_149666_3_.add(new ItemStack(p_149666_1_, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.icon = new IIcon[name.length];

        for (int i = 0; i < this.icon.length; ++i)
        {
            String s = this.getTextureName();

            if (name[i] != null)
            {
                s = name[i];
            }

            this.icon[i] = p_149651_1_.registerIcon(s);
        }
    }
}