package com.gamerclub.bot.events;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

public class Ready extends ListenerAdapter {
    @Override
    public void onReady(ReadyEvent event) {
        System.out.println("Connected to Discord Gateway! Now Getting guild member count...");
        Guild guildId = event.getJDA().getGuildById("957321853414809730");

        assert guildId != null;

        Objects.requireNonNull(guildId.getTextChannelById("1067989957760778311")).getManager().setTopic("Atualmente estamos com " + guildId.getMemberCount() + "membros no servidor!").queue();
    }
}
