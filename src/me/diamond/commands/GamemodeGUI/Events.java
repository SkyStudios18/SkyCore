package me.diamond.commands.GamemodeGUI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;

public class Events implements Listener {

    private static HashMap<Player, String> current = new HashMap<>();

    private static Events g = new Events();
    public static Events get() { return g; }


    public void openInventory(Player p) {

        Inventory gui = Bukkit.createInventory(null,9, ChatColor.AQUA + "Gamemodes GUI");

        ItemStack glasspane = new ItemStack(Material.THIN_GLASS);
        ItemMeta gp = glasspane.getItemMeta();
        glasspane.setItemMeta(gp);
        gui.setItem(0, glasspane);
        gui.setItem(2, glasspane);
        gui.setItem(4, glasspane);
        gui.setItem(6, glasspane);
        gui.setItem(8, glasspane);

        ItemStack dsword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta ds = dsword.getItemMeta();
        ds.setDisplayName("Creative");
        dsword.setItemMeta(ds);
        gui.setItem(1, dsword);
        ItemStack isword = new ItemStack(Material.IRON_SWORD);
        ItemMeta is = isword.getItemMeta();
        is.setDisplayName("Survival");
        isword.setItemMeta(is);
        gui.setItem(3, isword);
        ItemStack gsword = new ItemStack(Material.GOLD_SWORD);
        ItemMeta gs = gsword.getItemMeta();
        gs.setDisplayName("Speactator");
        gsword.setItemMeta(gs);
        gui.setItem(5, gsword);
        ItemStack ssword = new ItemStack(Material.STONE_SWORD);
        ItemMeta ss = ssword.getItemMeta();
        ss.setDisplayName("Adventure");
        ssword.setItemMeta(ss);
        gui.setItem(7, ssword);

        p.openInventory(gui);
        current.put(p, "first");
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.isLeftClick()) {
            Player p = (Player) e.getWhoClicked();
            int slot = e.getRawSlot();


            if (current.containsKey(p) && current.get(p).equals("first")) {
                e.setCancelled(true);
                if (slot == 0) {
                    p.sendMessage(ChatColor.RED + "Please click a gamemode!");
                    p.closeInventory();
                }
                if (slot == 1) {
                    p.performCommand("gmc");
                    p.closeInventory();
                }
                if (slot == 2) {
                    p.sendMessage(ChatColor.RED + "Please click a gamemode!");
                    p.closeInventory();
                }
                if (slot == 3) {
                    p.performCommand("gms");
                    p.closeInventory();
                }
                if (slot == 4) {
                    p.sendMessage(ChatColor.RED + "Please click a gamemode!");
                    p.closeInventory();
                }
                if (slot == 5) {
                    p.performCommand("gmsp");                    p.closeInventory();
                }
                if (slot == 6) {
                    p.sendMessage(ChatColor.RED + "Please click a gamemode!");
                    p.closeInventory();
                }
                if (slot == 7) {
                    p.performCommand("gma");                    p.closeInventory();
                }
                if (slot == 8) {
                    p.sendMessage(ChatColor.RED + "Please click a gamemode!");
                    p.closeInventory();
                }
            }
        }
    }
}
