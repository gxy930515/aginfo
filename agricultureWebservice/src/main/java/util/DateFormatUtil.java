package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatUtil {
	/**
	* 日期转换成字符串
	* @param date
	* @return string
	*/
	public static String DataToString(Date date){
		String dateStrig="";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		dateStrig=formatter.format(date);
		return dateStrig;
	}
	
	/**
	* 字符串转换成日期
	* @param string
	* @return date
	*/
	public static Date StringToDate(String str) {
	  
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	   Date date = null;
	   try {
	    date = format.parse(str);
	   } catch (Exception e) {
	    e.printStackTrace();
	   }
	   return date;
	}
	
	/**
	* 日期转换成字符串
	* @param date
	* @return string
	*/
	public static String DataTimeToString(Date date){
		String dateStrig="";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateStrig=formatter.format(date);
		return dateStrig;
	}
	
	/**
	* 字符串转换成日期
	* @param string
	* @return date
	*/
	public static Date StringToDateTime(String str) {
	  
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   Date date = null;
	   try {
	    date = format.parse(str);
	   } catch (Exception e) {
	    e.printStackTrace();
	   }
	   return date;
	}
	/**
	* 计算两时间相差分钟数
	* @param string
	* @return date
	*/
    public static Long dateDiff(String startTime, String endTime,  String format, String str) {   
        // 按照传入的格式生成一个simpledateformate对象    
        SimpleDateFormat sd = new SimpleDateFormat(format);    
        long nd = 1000 * 24 * 60 * 60;// 一天的毫秒数    
        long nh = 1000 * 60 * 60;// 一小时的毫秒数    
        long nm = 1000 * 60;// 一分钟的毫秒数    
        long ns = 1000;// 一秒钟的毫秒数    
        long diff;    
        long day = 0;    
        long hour = 0;    
        long min = 0;    
        long sec = 0;    
        // 获得两个时间的毫秒时间差异    
        try {    
            diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();    
            day = diff / nd;// 计算差多少天    
            hour = diff % nd / nh + day * 24;// 计算差多少小时    
            min = diff % nd % nh / nm + day * 24 * 60;// 计算差多少分钟    
            sec = diff % nd % nh % nm / ns;// 计算差多少秒    
            // 输出结果    
            System.out.println("时间相差：" + day + "天" + (hour - day * 24) + "小时"   
                    + (min - day * 24 * 60) + "分钟" + sec + "秒。");    
            System.out.println("hour=" + hour + ",min=" + min);    
            if (str.equalsIgnoreCase("h")) {    
                return hour;    
            } else {    
                return min;    
            }    
   
        } catch (Exception e) {    
            // TODO Auto-generated catch block    
            e.printStackTrace();    
        }    
        if (str.equalsIgnoreCase("h")) {    
            return hour;    
        } else {    
            return min;    
        }    
    }  //
    /**
     * 根据出生日期计算年龄
     */
    public static int getAge(String str) {
    	Date dateOfBirth=StringToDate(str);
        int age = 0;
        Calendar born = Calendar.getInstance();
        Calendar now = Calendar.getInstance();
        if (dateOfBirth != null) {
            now.setTime(new Date());
            born.setTime(dateOfBirth);
            if (born.after(now)) {
                throw new IllegalArgumentException("年龄不能超过当前日期");
            }
            age = now.get(Calendar.YEAR) - born.get(Calendar.YEAR);
            int nowDayOfYear = now.get(Calendar.DAY_OF_YEAR);
            int bornDayOfYear = born.get(Calendar.DAY_OF_YEAR);
            System.out.println("nowDayOfYear:" + nowDayOfYear + " bornDayOfYear:" + bornDayOfYear);
            if (nowDayOfYear < bornDayOfYear) {
                age -= 1;
            }
        }
        return age;
    }

    public static void main(String[] args) throws Exception {
      
        System.out.println(getAge("1993-09-01"));
    }
    
}
