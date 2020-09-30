package me.cyberdie22.hypixelskyblockremake.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GiveItemCommand implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (command.getName().equalsIgnoreCase("giveitem")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (args.length < 2) {
                    player.sendMessage(ChatColor.RED + "Usage: /giveitem [item] [amount]");
                } else if (args.length == 2) {
                    try {
                        String item = args[0];
                        int amount = Integer.parseInt(args[1]);

                        return true;
                    } catch (Exception e) {
                        player.sendMessage(ChatColor.RED + "Usage: /giveitem [item] [amount]");
                    }
                } else if (args.length > 3) {
                    player.sendMessage(ChatColor.RED + "Usage: /giveitem [item] [amount]");
                } else {
                    sender.sendMessage(ChatColor.RED + "You need to be a player to execute this command!");
                    return true;
                }
            }


            return false;
        }
        return false;
    }

}
