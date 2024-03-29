package com.example.worldedit;

import com.willapi.CommandExecutor;
import com.willapi.Player;
import com.willapi.WillAPI;

public class WorldEditPlugin {

    public WorldEditPlugin() {
        WillAPI.getInstance().registerCommand("wand", new WandCommandExecutor());
        // Register other WorldEdit commands here
    }

    private class WandCommandExecutor implements CommandExecutor {
        @Override
        public boolean onCommand(Player player, String commandLabel, String[] args) {
            if (!WillAPI.getInstance().hasPermission(player, "worldedit.wand")) {
                player.sendMessage("You don't have permission to use this command.");
                return false;
            }
            // give player a wand tool
            player.sendMessage("wand given!");
            return true;
        }
    }
}