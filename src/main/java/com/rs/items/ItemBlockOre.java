package com.rs.items;

import com.rs.blocks.BlockEnergizedOre;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockOre extends ItemBlock
{
    public ItemBlockOre(Block block)
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
            return i >= 0 && i < BlockEnergizedOre.name.length ? "tile." + BlockEnergizedOre.name[i] : super.getUnlocalizedName(par1ItemStack);

    }
}
