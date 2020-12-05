package Main;

import Main.Commands.HelpCommand;
import Main.Commands.ScaleCommand;
import cn.nukkit.command.Command;
import cn.nukkit.command.SimpleCommandMap;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {
    public void onEnable() {
        getLogger().info("Das Plugin wurde erfolgreich aktiviert.");
        getLogger().warning("§cDas plugin ist in der Beta");
                registerCommand();
    }

    public void onDisable() {
        getLogger().warning("Plugin wurde deactiviert.");
    }

    private void registerCommand() {
        SimpleCommandMap simpleCommandMap = getServer().getCommandMap();
        simpleCommandMap.register("shelp", (Command)new HelpCommand(this));
        simpleCommandMap.register("size", (Command)new ScaleCommand(this));
    }
}
