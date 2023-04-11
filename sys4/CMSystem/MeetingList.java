import java.util.ArrayList;
import java.util.List;

/**
 * @author xh
 * @Date 2023/4/11
 */
public class MeetingList {

    public List<Announcement> meetingList = new ArrayList<>();


    /**
     * 添加会议通知
     */
    public void addAnnouncement(Announcement announcement) {

        meetingList.add(announcement);

    }

    /**
     * 移除会议通知
     */
    public void removeAnnouncement(Announcement announcement) {

        meetingList.remove(announcement);

    }

    /**
     * 发送会议通知
     */
    public void sendMeetingNotify() {
        System.out.println("会议通知正在发送给已注册员工");
        for(Object mt : meetingList) {
            ((Announcement)mt).send();
        }
    }

}
