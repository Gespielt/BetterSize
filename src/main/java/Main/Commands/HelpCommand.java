package Main.Commands;

import Main.Main;
import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class HelpCommand extends Command {
    private Main plugin;

    public HelpCommand(Main plugin) {
        super("shelp", "Zeigt dir die commands von size an.", "shelp");
        this.plugin = plugin;
    }

    public boolean execute(CommandSender sender, String s, String[] args) {
        Player p = (Player)sender;
        sender.sendMessage("§2<§3==========§2>");
        sender.sendMessage("");
        sender.sendMessage("§3/sz <Nummer>");
        sender.sendMessage("");
        sender.sendMessage("§2<§3==========§2>");
        return false;
    }
}
