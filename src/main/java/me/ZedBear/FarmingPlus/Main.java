package me.ZedBear.FarmingPlus;

import me.ZedBear.FarmingPlus.Commands.FarmingPlus;
import me.ZedBear.FarmingPlus.Commands.GiveDrop;
import me.ZedBear.FarmingPlus.Commands.SellDrops;
import me.ZedBear.FarmingPlus.Items.ItemManager;
import me.ZedBear.FarmingPlus.Listeners.BreakBlocksListener;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Economy econ = null;
    public static Main instance;
    private ItemManager itemManager;

    public void onEnable() {

        instance = this;
        itemManager = new ItemManager(this);

        //config
        final FileConfiguration config = this.getConfig();
        this.saveDefaultConfig();

        this.getCommand("givedrops").setExecutor(new GiveDrop(this));
        this.getCommand("givedrops").setTabCompleter(new me.ZedBear.FarmingPlus.TabComplete.GiveDropsTab(this));
        this.getCommand("selldrops").setExecutor(new SellDrops(this));
        this.getCommand("farmingplus").setExecutor(new FarmingPlus(this));
        getServer().getPluginManager().registerEvents(new BreakBlocksListener(this), this);

        if (!setupEconomy() ) {
            getLogger().severe(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

    }

    public void onDisable() {

    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return true;
    }

    public Economy getEconomy() {
        return econ;
    }

    public ItemManager getItemManager() {return itemManager;}

}
