package Main.Commands;

import Main.Main;
import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class ScaleCommand extends Command {
    private Main plugin;

    public ScaleCommand(Main plugin) {
        super("sz", "Bestimme deine größe", "sz");
        this.plugin = plugin;
    }

    public boolean execute(CommandSender sender, String s, String[] args) {
        if (!sender.hasPermission("size.cmd")) {
            sender.sendMessage("§cDu hast keine rechte daf");
            return true;
        }
        Player p = (Player)sender;
        if (args.length == 1)
            p.setScale(Float.parseFloat(args[0]));
        ((Player)sender).sendMessage("§2Du hast deine größe bestimmt");
        return false;
    }
}
