package com.rs.world;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenEnergized extends BiomeGenBase
{
    public BiomeGenEnergized(int par1)
    {
        super(par1);
        this.topBlock = Blocks.grass;
        this.fillerBlock = Blocks.dirt;
        this.theBiomeDecorator.treesPerChunk = 5;
        this.enableRain = false;
        this.enableSnow = false;
    }
}
