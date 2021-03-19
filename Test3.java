package work;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        //输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
        SimpleDateFormat sdt = new   SimpleDateFormat("yyyy-mm-dd");
        String s="1998-2-18";
        Date d1 = sdt.parse(s);
        Date d2=new Date();
        long l1=d2.getTime()-d1.getTime();
        long a=l1/(7L*24*60*60*1000);
        System.out.println("从我出生开始经过了"+a+"周");
    }
}
