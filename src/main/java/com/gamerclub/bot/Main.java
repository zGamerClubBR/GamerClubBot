package com.gamerclub.bot;

import com.gamerclub.bot.events.Ready;
import com.gamerclub.bot.events.UserDelete;
import com.gamerclub.bot.events.UserJoin;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class Main extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {
        JDABuilder.createLight(Settings.TOKEN, EnumSet.noneOf(GatewayIntent.class)).enableIntents(GatewayIntent.GUILD_MEMBERS)
                .setStatus(OnlineStatus.ONLINE)
                .addEventListeners(new Main(), new Ready(), new UserJoin(), new UserDelete()).build();
    }
}