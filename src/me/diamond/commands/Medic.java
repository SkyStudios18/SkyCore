package me.diamond.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Medic implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if(command.getName().equalsIgnoreCase("medic")) {
            p.setHealth(20);
            p.setFoodLevel(20);
        }

        return false;
    }
}
