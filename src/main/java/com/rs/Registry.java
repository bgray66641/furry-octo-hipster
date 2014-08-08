package com.rs;

import com.rs.blocks.BlockEnergizedHellPortal;
import com.rs.blocks.BlockEnergizedOre;
import com.rs.blocks.BlockEnergizedSapling;
import com.rs.blocks.BlockEnergizedWood;
import com.rs.items.ItemBlockOre;
import com.rs.world.BiomeGenEnergized;
import cpw.mods.fml.common.registry.GameRegistry;

public class Registry
{
    public static void main()
    {
        initBlocks();
        initItems();
        initBiomes();
        register();
    }

    public static void initBlocks()
    {
        Repo.energizedWood = new BlockEnergizedWood();
        Repo.energizedOre = new BlockEnergizedOre();
        Repo.energizedSpaling = new BlockEnergizedSapling();
        Repo.energizedHellPortal = new BlockEnergizedHellPortal();
    }

    public static void initItems()
    {

    }

    public static void initBiomes()
    {
        Repo.energizedBiome = new BiomeGenEnergized(Repo.biomeID);
    }

    public static void register()
    {
        //blocks
        GameRegistry.registerBlock(Repo.energizedWood, Repo.energizedWood.getUnlocalizedName());
        GameRegistry.registerBlock(Repo.energizedDirt, Repo.energizedDirt.getUnlocalizedName());
        GameRegistry.registerBlock(Repo.energizedCobblestone, Repo.energizedCobblestone.getUnlocalizedName());
        GameRegistry.registerBlock(Repo.energizedBedrock, Repo.energizedBedrock.getUnlocalizedName());
        GameRegistry.registerBlock(Repo.energizedOre, ItemBlockOre.class, "EnergizedOre");
        GameRegistry.registerBlock(Repo.energizedGrass, Repo.energizedGrass.getUnlocalizedName());
        GameRegistry.registerBlock(Repo.energizedSpaling, "EnergizedSapling");
        GameRegistry.registerBlock(Repo.energizedHellPortal, "EnergizedHellPortal");

        //biomes
        //BiomeDictionary.registerBiomeType(Repo.energizedBiome, BiomeDictionary.Type.FOREST);
    }
}
