package work;

import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        //使用Date输出当前系统时间，以及3天后这一刻的时间
        Date d1=new Date();
        System.out.println(d1);
        long lg=d1.getTime()+3L*24*60*60*1000;
        d1.setTime(lg);
        System.out.println(d1);

    }
}
