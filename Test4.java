package work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
        // * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
        String s1="2018-2-14";
        int a=200;
        Calendar c1= Calendar.getInstance();
        SimpleDateFormat sdt = new   SimpleDateFormat("yyyy-mm-dd");
        Date d1=sdt.parse(s1);
        c1.setTime(d1);
        c1.add(Calendar.DAY_OF_MONTH,200);
        c1.add(Calendar.WEEK_OF_MONTH,-2);
        c1.set(Calendar.WEEK_OF_MONTH,4);
        System.out.println(c1.getTime());
    }
}
