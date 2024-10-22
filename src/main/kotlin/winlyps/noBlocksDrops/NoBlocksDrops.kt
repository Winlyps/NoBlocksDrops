package winlyps.noBlocksDrops

import org.bukkit.plugin.java.JavaPlugin

class NoBlocksDrops : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doTileDrops", "false")
        }
        logger.info("NoBlocksDrops plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("NoBlocksDrops plugin has been disabled.")
    }
}