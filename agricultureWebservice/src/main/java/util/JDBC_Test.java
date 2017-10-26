package util;
import java.sql.DriverManager;    
import java.sql.PreparedStatement;    
import java.sql.ResultSet;    
import java.sql.Statement;
import java.util.Properties;
import java.io.InputStream;
import java.sql.* ; 
public class JDBC_Test {
	 //orcl为oracle数据库中的数据库名，localhost表示连接本机的oracle数据库     
	   //1521为连接的端口号     
	    private static String url="jdbc:oracle:thin:@10.25.72.74:1521:agriculture";    
	    //system为登陆oracle数据库的用户名     
	    private static String user="iagriculture";    
	    //manager为用户名的密码     
	    private  String password="iagriculture";    
	    public  Connection con;    
	    public  PreparedStatement pst;    
	    public  ResultSet rs;    
	    public  Statement st ;    
	    //连接数据库的方法     
	    public Connection getConnection(){    
	        try {    
	            //初始化驱动包     
	            Class.forName("oracle.jdbc.driver.OracleDriver");    
	            //根据数据库连接字符，名称，密码给conn赋值     
	            con=DriverManager.getConnection(url, user, password);    
	                
	        } catch (Exception e) {    
	            // TODO: handle exception     
	            e.printStackTrace();    
	        }
	        return con;
	    } 
	    public   Connection getConnections()
		{
		   
		    try{
	  		 
				String driver,strUrl,username,password;
				InputStream stream=this.getClass().getResourceAsStream("/jdbc.properties");
	            Properties properties=new Properties();
	    		properties.load(stream);
	    		strUrl=properties.getProperty("jdbc.url");
	            username=properties.getProperty("jdbc.username");
	            password=properties.getProperty("jdbc.password");
	            driver=properties.getProperty("jdbc.driverClassName");
	        	Class.forName(driver);
	        	con = DriverManager.getConnection(strUrl, username, password);
	        	
		}catch(Exception e){
			e.printStackTrace();
		}
		    return con;
}
	  //关闭方法
		public void close(Connection con,PreparedStatement pst,ResultSet rs){
			try {
				if(rs!=null){
					rs.close();
				}
				if(pst!=null){
					pst.close();
				}
				if(con!=null){
					con.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	     //测试能否与oracle数据库连接成功     
	   /*public static void main(String[] args) {
		   JDBC_Test basedao=new JDBC_Test();    
	        Connection con=basedao.getConnection();    
	        if(con==null){    
	            System.out.println("与oracle数据库连接失败！");    
	        }else{    
	            System.out.println("与oracle数据库连接成功！");    
	        }    
	}*/
}
