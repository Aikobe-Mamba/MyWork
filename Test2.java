package work;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test2 {
    public static void main(String[] args) {
        //将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
        Calendar c1= Calendar.getInstance();
        SimpleDateFormat sdt = new   SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        System.out.println(sdt.format(c1.getTime()));


    }
}
