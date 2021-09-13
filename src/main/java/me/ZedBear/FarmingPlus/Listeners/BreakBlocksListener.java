package me.ZedBear.FarmingPlus.Listeners;

import me.ZedBear.FarmingPlus.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BreakBlocksListener implements Listener {
    private final Main plugin;

    public BreakBlocksListener(Main plugin) {
        this.plugin = plugin;
    }

    public int tier1(int returner) {
        return returner;
    }

    public int tier2(int returner) {
        return returner;
    }

    public int tier3(int returner) {
        return returner;
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        if(plugin.getConfig().getBoolean("enable-tiered-farming-drops")) {
            if (event.getBlock().getType() == Material.CACTUS) {
                int cactusChance1 = plugin.getConfig().getInt("drop-chances.cactus.1");
                int cactusChance2 = plugin.getConfig().getInt("drop-chances.cactus.2");
                int cactusChance3 = plugin.getConfig().getInt("drop-chances.cactus.3");
                double random = generateRandom();
                if (random <= cactusChance1) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().cactus(1));
                } else if (random <= cactusChance2) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().cactus(2));
                } else if (random <= cactusChance3) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().cactus(3));
                }
            } else if (event.getBlock().getType() == Material.CARROT) {
                int carrotChance1 = plugin.getConfig().getInt("drop-chances.carrot.1");
                int carrotChance2 = plugin.getConfig().getInt("drop-chances.carrot.2");
                int carrotChance3 = plugin.getConfig().getInt("drop-chances.carrot.3");
                double random = generateRandom();
                if (random <= carrotChance1) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().carrot(1));
                } else if (random <= carrotChance2) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().carrot(2));
                } else if (random <= carrotChance3) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().carrot(3));
                }
            }
            else if (event.getBlock().getType() == Material.POTATO) {
                int potatoChance1 = plugin.getConfig().getInt("drop-chances.potato.1");
                int potatoChance2 = plugin.getConfig().getInt("drop-chances.potato.2");
                int potatoChance3 = plugin.getConfig().getInt("drop-chances.potato.3");
                double random = generateRandom();
                if (random <= potatoChance1) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().potato(1));
                } else if (random <= potatoChance2) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().potato(2));
                } else if (random <= potatoChance3) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().potato(3));
                }
            } else if (event.getBlock().getType() == Material.PUMPKIN) {
                int pumpkinChance1 = plugin.getConfig().getInt("drop-chances.pumpkin.1");
                int pumpkinChance2 = plugin.getConfig().getInt("drop-chances.pumpkin.2");
                int pumpkinChance3 = plugin.getConfig().getInt("drop-chances.pumpkin.3");
                double random = generateRandom();
                if (random <= pumpkinChance1) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().pumpkin(1));
                } else if (random <= pumpkinChance2) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().pumpkin(2));
                } else if (random <= pumpkinChance3) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().pumpkin(3));
                }
            } else if (event.getBlock().getType() == Material.MELON) {
                int melonChance1 = plugin.getConfig().getInt("drop-chances.melon.1");
                int melonChance2 = plugin.getConfig().getInt("drop-chances.melon.2");
                int melonChance3 = plugin.getConfig().getInt("drop-chances.melon.3");
                double random = generateRandom();
                if (random <= melonChance1) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().melon(1));
                } else if (random <= melonChance2) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().melon(2));
                } else if (random <= melonChance3) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().melon(3));
                }
            } else if (event.getBlock().getType() == Material.WHEAT_SEEDS) {
                int wheat_seedsChance1 = plugin.getConfig().getInt("drop-chances.wheat-seeds.1");
                int wheat_seedsChance2 = plugin.getConfig().getInt("drop-chances.wheat-seeds.2");
                int wheat_seedsChance3 = plugin.getConfig().getInt("drop-chances.wheat-seeds.3");
                double random = generateRandom();
                if (random <= wheat_seedsChance1) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().wheatSeeds(1));
                } else if (random <= wheat_seedsChance2) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().wheatSeeds(2));
                } else if (random <= wheat_seedsChance3) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().wheatSeeds(3));
                }
            } else if (event.getBlock().getType() == Material.SUGAR_CANE) {
                int sugarcaneChance1 = plugin.getConfig().getInt("drop-chances.sugarcane.1");
                int sugarcaneChance2 = plugin.getConfig().getInt("drop-chances.sugarcane.2");
                int sugarcaneChance3 = plugin.getConfig().getInt("drop-chances.sugarcane.3");
                double random = generateRandom();
                if (random <= sugarcaneChance1) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().sugarCane(1));
                } else if (random <= sugarcaneChance2) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().sugarCane(2));
                } else if (random <= sugarcaneChance3) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().sugarCane(3));
                }
            } else if (event.getBlock().getType() == Material.NETHER_WART) {
                int nether_wartChance1 = plugin.getConfig().getInt("drop-chances.nether_wart.1");
                int nether_wartChance2 = plugin.getConfig().getInt("drop-chances.nether_wart.2");
                int nether_wartChance3 = plugin.getConfig().getInt("drop-chances.nether_wart.3");
                double random = generateRandom();
                if (random <= nether_wartChance1) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().netherWart(1));
                } else if (random <= nether_wartChance2) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().netherWart(2));
                } else if (random <= nether_wartChance3) {
                    event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), plugin.getItemManager().netherWart(3));
                }
            }
        }
    }

    public static double generateRandom(){
        int max = 100;
        int min = 0;

        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

}
