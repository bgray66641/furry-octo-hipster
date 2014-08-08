package com.rs.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockLavaBrick extends ItemBlock
{
    public ItemBlockLavaBrick(Block block)
    {
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
    public int getMetadata(int par1)
    {
        return par1;
    }

    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    public String getUnlocalizedName(ItemStack par1ItemStack)
    {

        int i = par1ItemStack.getItemDamage();
        return i >= 0 && i < BlockLavaStone.name.length ? "tile." + BlockLavaStone.name[i] : super.getUnlocalizedName(par1ItemStack);

    }
}
