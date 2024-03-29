package com.example.worldedit;

import com.willapi.CommandExecutor;
import com.willapi.Player;
import com.willapi.WillAPI;

public class WorldEditPlugin {

    public WorldEditPlugin() {
        WillAPI.getInstance().registerCommand("wand", new WandCommandExecutor());
        WillAPI.getInstance().registerCommand("pos1", new Position1CommandExecutor());
        WillAPI.getInstance().registerCommand("pos2", new Position2CommandExecutor());
        // add docs later
    }

    private class WandCommandExecutor implements CommandExecutor {
        @Override
        public boolean onCommand(Player player, String commandLabel, String[] args) {
            if (!WillAPI.getInstance().hasPermission(player, "worldedit.wand")) {
                player.sendMessage("You don't have permission to use this command.");
                return false;
            }
            // give player a wand tool
            player.sendMessage("You've been given the wand tool!");
            return true;
        }
    }

    private class Position1CommandExecutor implements CommandExecutor {
        @Override
        public boolean onCommand(Player player, String commandLabel, String[] args) {
            if (!WillAPI.getInstance().hasPermission(player, "worldedit.pos")) {
                player.sendMessage("You don't have permission to use this command.");
                return false;
            }
            // position 1
            player.sendMessage("Position 1 set!");
            return true;
        }
    }

    private class Position2CommandExecutor implements CommandExecutor {
        @Override
        public boolean onCommand(Player player, String commandLabel, String[] args) {
            if (!WillAPI.getInstance().hasPermission(player, "worldedit.pos")) {
                player.sendMessage("You don't have permission to use this command.");
                return false;
            }
            // Logic to set position 2
            player.sendMessage("Position 2 set!");
            return true;
        }
    }

    // Implement other WorldEdit commands later
}