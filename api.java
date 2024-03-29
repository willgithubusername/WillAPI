package com.willapi;

public class WillAPI {

    private static WillAPI instance;

    private WillAPI() {}

    public static WillAPI getInstance() {
        if (instance == null) {
            instance = new WillAPI();
        }
        return instance;
    }

    public void registerEvents(Listener listener) {
        // Logic for registering events
    }

    public void unregisterEvents(Listener listener) {
        // Logic for unregistering events
    }

    public void registerCommand(String command, CommandExecutor executor) {
        // Logic for registering commands
    }

    public void unregisterCommand(String command) {
        // Logic for unregistering commands
    }

    // Other API methods for plugin management, permissions, etc.
}