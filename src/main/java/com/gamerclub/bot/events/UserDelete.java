package com.gamerclub.bot.events;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

public class UserDelete extends ListenerAdapter {
    @Override
    public void onGuildMemberRemove(GuildMemberRemoveEvent event) {
        Guild guildId = event.getJDA().getGuildById("957321853414809730");

        assert guildId != null;

        Objects.requireNonNull(guildId.getTextChannelById("1067989957760778311")).getManager().setTopic("Atualmente estamos com " + guildId.getMemberCount() + "membros no servidor!").queue();
    }
}
