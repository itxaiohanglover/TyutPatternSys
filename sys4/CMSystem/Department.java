import java.util.ArrayList;
import java.util.List;

/**
 * @author xh
 * @Date 2023/4/11
 */
public class Department implements Announcement {

    private List<Employee> list = new ArrayList<>();


    public void add(Employee employee) {

        list.add(employee);

    }


    public void remove(Employee employee) {

        list.remove(employee);

    }


    @Override
    public void send() {

        System.out.println("正在给部门的每个部员发送会议通知");
        for (Object object : list) {

            ((Employee) object).send();

        }
        System.out.println("发送完成！");

    }
}
