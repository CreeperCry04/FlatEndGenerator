package xyz.creepercry.flatendgenerator;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

import xyz.creepercry.flatendgenerator.generator.EndChunkGenerator;

public class FlatEndGenerator extends JavaPlugin {

	private static FlatEndGenerator instance;

	@Override
	public void onEnable() {
		instance = this;

		getConfig().options().copyDefaults(true);
		getConfig().options().copyHeader(true);
		saveConfig();
	}

	@Override
	public void onDisable() {
		instance = null;
	}

	public static FlatEndGenerator getInstance() {
		return instance;
	}
	
	@Override
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
		return new EndChunkGenerator();
	}
}