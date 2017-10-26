package util;

import java.util.UUID;
import java.util.regex.*;



public class UUIDUtil {
	public static String getUUID(){
        UUID uuid=UUID.randomUUID();
        String str = uuid.toString(); 
        String uuidStr=str.replace("-", "");
        return uuidStr;
      }
	public static void main(String[] args) {
		System.out.println(UUIDUtil.getUUID());
		System.out.println(isConSpeCharacters("王五￥%^*"));
		String str = "王五王五￥%^*";
		String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";//所有特殊符号

		  Pattern p = Pattern.compile(regEx);

		  Matcher m = p.matcher(str);

		  System.out.println(m.find());//true 提供的参数string包含特殊字符
	}
	/**
	* 功能：判断一个字符串是否包含特殊字符
	* @param string 要判断的字符串
	* @return true 提供的参数string包含特殊字符
	* @return false 提供的参数string不包含特殊字符
	*/
	private static boolean isConSpeCharacters(String string) {

	   if(string.replaceAll("[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]", "").length()==0){
	    //如果不包含特殊字符
	    return true;
	   }
	   return false;
	}
	
	/**
	* 功能：判断一个字符串是否包含特殊字符
	* @param string 要判断的字符串
	* @return true 提供的参数string包含特殊字符
	* @return false 提供的参数string不包含特殊字符
	*/
	private static boolean isConSpecialty(String string) {

	   if(string.replaceAll("[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】]", "").length()==0){
	    //如果不包含特殊字符
	    return true;
	   }
	   return false;
	}
}
