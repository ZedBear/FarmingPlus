package me.ZedBear.FarmingPlus.Items;

import me.ZedBear.FarmingPlus.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    private final Main plugin;

    public ItemManager(Main plugin) {
        this.plugin = plugin;
    }


    public ItemStack cactus(int arg) {
        ItemStack item = new ItemStack(Material.CACTUS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Cactus Tier [" + ChatColor.RED + arg + ChatColor.GOLD + "]");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "This is a special, tiered drop");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "You can sell it using /selldrops");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "You can view drops using /drops");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack carrot(int arg) {
        ItemStack item = new ItemStack(Material.CARROT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Carrot Tier [" + ChatColor.RED + arg + ChatColor.GOLD + "]");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "This is a special, tiered drop");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "You can sell it using /selldrops");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "You can view drops using /drops");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack potato(int arg) {
        ItemStack item = new ItemStack(Material.POTATO, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Potato Tier [" + ChatColor.RED + arg + ChatColor.GOLD + "]");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "This is a special, tiered drop");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "You can sell it using /selldrops");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "You can view drops using /drops");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack pumpkin(int arg) {
        ItemStack item = new ItemStack(Material.PUMPKIN, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "PUMKIN Tier [" + ChatColor.RED + arg + ChatColor.GOLD + "]");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "This is a special, tiered drop");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "You can sell it using /selldrops");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "You can view drops using /drops");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack melon(int arg) {
        ItemStack item = new ItemStack(Material.MELON, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Melon Tier [" + ChatColor.RED + arg + ChatColor.GOLD + "]");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "This is a special, tiered drop");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "You can sell it using /selldrops");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "You can view drops using /drops");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack wheatSeeds(int arg) {
        ItemStack item = new ItemStack(Material.WHEAT_SEEDS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Wheat Seeds Tier [" + ChatColor.RED + arg + ChatColor.GOLD + "]");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "This is a special, tiered drop");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "You can sell it using /selldrops");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "You can view drops using /drops");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }
    public ItemStack sugarCane(int arg) {
        ItemStack item = new ItemStack(Material.SUGAR_CANE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Sugarcane Tier [" + ChatColor.RED + arg + ChatColor.GOLD + "]");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "This is a special, tiered drop");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "You can sell it using /selldrops");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "You can view drops using /drops");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }
    public ItemStack netherWart(int arg) {
        ItemStack item = new ItemStack(Material.NETHER_WART, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Nether Wart Tier [" + ChatColor.RED + arg + ChatColor.GOLD + "]");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "This is a special, tiered drop");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "You can sell it using /selldrops");
        lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "You can view drops using /drops");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }
}
