package me.diamond;

import me.diamond.commands.GamemodeGUI.CommandMenu;
import me.diamond.commands.GamemodeGUI.Events;
import me.diamond.commands.GamemodeMain;
import me.diamond.commands.Medic;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    @Override
    public void onEnable() {
        this.getServer().getLogger().info("SkyCore Enabled Successfully!");
        getCommand("gms").setExecutor(new GamemodeMain());
        getCommand("gmc").setExecutor(new GamemodeMain());
        getCommand("gma").setExecutor(new GamemodeMain());
        getCommand("gmsp").setExecutor(new GamemodeMain());
        getCommand("medic").setExecutor(new Medic());
        getCommand("gamemodes").setExecutor(new CommandMenu());
        register(new Events());
        register("gamemodes", new CommandMenu());
    }

    public void register(Listener l) {
        Bukkit.getPluginManager().registerEvents(l,this);
    }
    public void register(String n, CommandExecutor ce) {
        getCommand(n).setExecutor(ce);
    }

    public void onDisable() {
        this.getServer().getLogger().info("SkyCore disabled successfully");
    }


}
