package com.rs.tile;

import com.google.common.collect.Sets;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraftforge.common.ForgeChunkManager;

import java.util.Set;

public class TileChunkLoader extends TileEntity
{
    public ForgeChunkManager.Ticket chunkTicket;


    public void chunkLoad(ForgeChunkManager.Ticket ticket){
        if (this.chunkTicket == null) {
            this.chunkTicket = ticket;
        }

        Set chunks = Sets.newHashSet();
        ChunkCoordIntPair quarryChunk = new ChunkCoordIntPair(this.xCoord >> 9, this.zCoord >> 9);
        chunks.add(quarryChunk);
        ForgeChunkManager.forceChunk(ticket, quarryChunk);

        for (int chunkX = 1; chunkX <= 9; chunkX++) {
            /*for (int chunkZ = this.box.zMin >> 4; chunkZ <= this.box.zMax >> 4; chunkZ++) {
                ChunkCoordIntPair chunk = new ChunkCoordIntPair(chunkX, chunkZ);
                ForgeChunkManager.forceChunk(ticket, chunk);
                chunks.add(chunk);
            }*/
        }
    }
}
