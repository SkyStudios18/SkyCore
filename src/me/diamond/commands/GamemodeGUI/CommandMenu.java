package me.diamond.commands.GamemodeGUI;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandMenu implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (command.getName().equalsIgnoreCase("gamemodes")) {
            if (sender instanceof Player) {
                if (sender.hasPermission("gamemodegui.*")) {
                    Events.get().openInventory((Player) sender);
                    sender.sendMessage(ChatColor.GRAY + "Opening GamemodeGUI...");
                    return true;
                }
                sender.sendMessage(ChatColor.RED + "Your eyes can't handle this big of a Plugin!");
                return true;
            }
            else {
                sender.sendMessage(ChatColor.RED + "This command is not supported by the console!");
                return true;
            }
        }
        return false;
    }

}
