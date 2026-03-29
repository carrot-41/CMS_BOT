package response.Command.Public;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.jetbrains.annotations.NotNull;
import response.Util.EmbedUtil;

import java.awt.*;
import java.util.Objects;

public class ServerInfo {
    public static void serverInfo(@NotNull MessageReceivedEvent event) {
        EmbedUtil embedUtil = new EmbedUtil(event);
        String Info = "서버 이름 : " + event.getGuild().getName() + "\n"+
                    "서버 운영자 : " + Objects.requireNonNull(event.getGuild().getOwner()).getUser().getGlobalName() + "\n"+
                    "서버 총 인원 수 : " + event.getGuild().getMemberCount() + "\n"+
                    "현재 핑 : " + Ping.getping(event) + "\n";
        embedUtil.Embed("서버 정보",Info, Color.GREEN);
    }
}
