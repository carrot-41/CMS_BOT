package response;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Objects;

public class HighestPerm {
    //현재는 그냥 채팅 친 유저의 권한만 얻는거(추가할거 : 원하는 타겟의 권한과 이 봇의 권한을 얻어오기)
    public static String GetHighestPerm(@NotNull MessageReceivedEvent messageReceivedEvent) {
        return Objects.requireNonNull(messageReceivedEvent.getMember())
                .getPermissions().stream()
                .max(Comparator.comparingLong(Permission::getRawValue))
                .map(Permission::getName)
                .orElse("권한 없음");
    }

}
