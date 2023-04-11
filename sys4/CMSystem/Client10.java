/**
 * @author xh
 * @Date 2023/4/11
 */
public class Client10 {
    public static void main(String[] args) {

        System.out.println("软件2029班 刘宇航 2020007694");

        // 1.两个员工、一个部门
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Department dep = new Department();
        // 部门添加员工
        dep.add(emp1);
        dep.add(emp2);

        System.out.println("----给部门发消息----");
        dep.send();
        System.out.println("----给员工发消息----");
        emp1.send();
        System.out.println("----发送会议通知----");
        // 2.会议列表
        MeetingList meetingList = new MeetingList();
        meetingList.addAnnouncement(emp1);
        meetingList.addAnnouncement(emp2);
        meetingList.sendMeetingNotify();

    }
}
