package me.diamond.commands;

import me.diamond.Main;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class GamemodeMain implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (sender.hasPermission("core.gamemodes")) {
            if (label.equalsIgnoreCase("gms")) {
                p.setGameMode(GameMode.SURVIVAL);
                p.sendTitle("SkyCore", "Gamemode Survival Applied!");
            }
            if (label.equalsIgnoreCase("gmc")) {
                p.setGameMode(GameMode.CREATIVE);
                p.sendTitle("SkyCore", "Gamemode Creative Applied!");
            }
            if (label.equalsIgnoreCase("gmsp")) {
                p.setGameMode(GameMode.SPECTATOR);
                p.sendTitle("SkyCore", "Gamemode Spectator Applied!");
            }
            if (label.equalsIgnoreCase("gma")) {
                p.setGameMode(GameMode.ADVENTURE);
                p.sendTitle("SkyCore", "Gamemode Adventure Applied!");
            }

            return true;

        }
        else {
            p.sendTitle("WARNING", "YOU DON'T HAVE PERMISSION!");

        }
        return true;
    }
}
