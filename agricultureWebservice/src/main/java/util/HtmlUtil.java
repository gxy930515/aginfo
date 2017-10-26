package util;
import java.util.regex.Matcher;  
import java.util.regex.Pattern;


/**
 * 
 * 过滤html标签
 * */
public class HtmlUtil {
	/**
	 * 
	 * 过滤html标签,返回文本
	 * */
	 public static String Html2Text(String inputString) {
	        String htmlStr = inputString; // 含html标签的字符串
	        String textStr = "";
	        Pattern p_script;
	        Matcher m_script;
	        Pattern p_style;
	        Matcher m_style;
	        Pattern p_html;
	        Matcher m_html;
	 
	        try {
	            String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>"; // 定义script的正则表达式{或<script[^>]*?>[\\s\\S]*?<\\/script>
	                                                                                                        // }
	            String regEx_style = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>"; // 定义style的正则表达式{或<style[^>]*?>[\\s\\S]*?<\\/style>
	                                                                                                    // }
	            String regEx_html = "<[^>]+>"; // 定义HTML标签的正则表达式
	 
	            p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
	            m_script = p_script.matcher(htmlStr);
	            htmlStr = m_script.replaceAll(""); // 过滤script标签
	 
	            p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);
	            m_style = p_style.matcher(htmlStr);
	            htmlStr = m_style.replaceAll(""); // 过滤style标签
	 
	            p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
	            m_html = p_html.matcher(htmlStr);
	            htmlStr = m_html.replaceAll(""); // 过滤html标签
	 
	            textStr = htmlStr;
	 
	        } catch (Exception e) {
	            System.err.println("Html2Text: " + e.getMessage());
	        }
	 
	        return textStr;// 返回文本字符串
	    }    
	      
	    public static void main(String[] args) {  
	        String str = "<div style='text-align:center;'> 整治“四风”   清弊除垢<br/><span style='font-size:14px;'> </span><span style='font-size:18px;'>公司召开党的群众路线教育实践活动动员大会</span><br/></div>";  
	        String str1="<p><img src=\"/agexpert/ueditor/jsp/upload/image/20170829/1503987539232001266.jpg\" title=\"1503987539232001266.jpg\" alt=\"date.jpg\"/>哈哈哈</p>";
	       
	     
	        System.out.println(Html2Text(str));
	        System.out.println(Html2Text(str1));
	    }  
}
