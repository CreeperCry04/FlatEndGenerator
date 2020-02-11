package xyz.creepercry.flatendgenerator.generator;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import xyz.creepercry.flatendgenerator.FlatEndGenerator;

public class EndChunkGenerator extends ChunkGenerator {

	public static final int GENERATOR_HEIGHT = FlatEndGenerator.getInstance().getConfig().getInt("height");

	@Override
	public ChunkData generateChunkData(World world, Random random, int chunkX, int chunkZ, BiomeGrid biome) {
		// final SimplexOctaveGenerator generator = new SimplexOctaveGenerator(new Random(world.getSeed()), 8);
		final ChunkData chunk = createChunkData(world);
		// generator.setScale(0.005D);
		
		for (int x = 0; x < 16; x++)
			for (int z = 0; z < 16; z++) {
				for (int y = GENERATOR_HEIGHT; y > 0; y--)
					chunk.setBlock(x, y, z, Material.ENDER_STONE);
				chunk.setBlock(x, 0, z, Material.BEDROCK);
			}
		return chunk;
	}
}