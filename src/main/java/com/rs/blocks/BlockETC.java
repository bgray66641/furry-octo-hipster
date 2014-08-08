package com.rs.blocks;

import com.rs.lib.Strings;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public abstract class BlockETC extends BlockContainer
{
    public BlockETC(String name)
    {
        super(Material.rock);
        setBlockTextureName(Strings.MODID + ":" + name);
        setHardness(0.75F);
        setBlockName(name);
        //setCreativeTab(MainRegistry.etc);
    }
}
