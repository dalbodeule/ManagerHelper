package space.mori.managerhelper

import org.bukkit.plugin.java.JavaPlugin

class ManagerHelper : JavaPlugin() {
    companion object {
        lateinit var instance: ManagerHelper
    }

    override fun onEnable() {
        instance = this
    }

    override fun onDisable() {

    }
}