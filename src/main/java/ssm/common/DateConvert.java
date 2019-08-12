package ssm.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * Created by Frank on 2017/6/27.
 */
public class DateConvert implements org.springframework.core.convert.converter.Converter<String,Date> {

    @Override
    public Date convert(String source) {
        String date=(String)source;
        try {
            SimpleDateFormat format = new SimpleDateFormat();

//            if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", source)) {
                System.out.println("我在转换date");
//                format=new SimpleDateFormat("yyyy-MM-dd");
//            }el se if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}$", source)) {
//                System.out.println("我在转换datetime");
                format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            }else if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2}\\ d{2}:\\d{2}:\\d{2}$", source)) {
//                System.out.println("我在转换datetime2");
//                format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            }

            Date d=format.parse(date);
            System.out.println("转换后的结果"+d);
            return d;
        } catch (Exception e/*ParseException e*/) {
            e.printStackTrace();
            return null;
        }
    }
}
