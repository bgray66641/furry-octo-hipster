package com.rs.world;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class GenerateCastle extends WorldGenerator
{
    @Override
    public boolean generate(World world, Random random, int x, int y, int z)
    {
        for (int i = 0; i < 20; i++)
        {
            world.setBlock(x, y, z + i, Blocks.cobblestone);
        }
        return true;
    }
}
