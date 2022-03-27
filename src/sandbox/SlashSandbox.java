package sandbox;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.net.Administration.*;
import mindustry.world.blocks.storage.*;

public class ExamplePlugin extends Plugin{

    //called when game initializes
    @Override
    public void init(){
    }

    //register commands that run on the server
    @Override
    public void registerServerCommands(CommandHandler handler){
        handler.<Player>register("sandbox", "Enables sandbox.", (player, args) -> {
            //remove the colors in the players name and throw a fake error
            player.name = Strings.stripColors(player.name);
            player.sendMessage("[scarlet]ERROR: Uncaught command error. Try again later.");
        });
    }
}
