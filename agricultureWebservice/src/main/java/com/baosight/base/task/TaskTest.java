package com.baosight.base.task;

import java.nio.charset.Charset;
import java.util.Date;
import java.util.List;
import java.util.Map;


import org.apache.log4j.Logger;

import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.baosight.base.SpringContextUtils;
import com.baosight.base.task.dao.ScheduleJobMapper;
import com.baosight.base.task.domain.ScheduleJob;
import com.baosight.base.task.domain.ScheduleJobQuery;
import com.baosight.base.task.service.JobTaskService;



@Service
public class TaskTest {
	public final Logger log = Logger.getLogger(this.getClass());
 
	public void run() {
		for (int i = 0; i < 1; i++) {
			log.debug(i+" run......................................" + (new Date()));
		}

	}
	
	
	public void run1() throws SchedulerException {
		System.out.println("被调用了");

		JobTaskService taskService = (JobTaskService) SpringContextUtils.getBean("jobTaskService");	
		List<ScheduleJob> allJob = taskService.getAllJob();
		System.out.println(allJob);
	}
	
	public static void main(String[] args) {
		
		
/*	    Map<String, Charset> charsets = Charset.availableCharsets();
	    for (Map.Entry<String, Charset> entry : charsets.entrySet()) {
	       System.out.println(entry.getKey());
	    }*/
		System.out.println((char)65);
		
		
		String restlt="";
		int n=26*26;
		String str = "";
		String result="";
	     while(n!=0){
	         str = n%26+str;
	         n = n/26;
	     }
	     
	     
	         System.out.println(str);
	         
	         for (int i = 0; i <str.length(); i++) {
	        	 if(str.charAt(i)=='0'){
	        		 
	        		 restlt="Z";
	        		 
	        	 }
	        	else{
	        		if(i<str.length()){}
	        		int aa=64+Integer.valueOf(String.valueOf(str.charAt(i)));
	        		 System.out.println(((char)aa));
	        		 restlt=String.valueOf((char)aa);
	        		 
	        	 }
	        	 result+=restlt;
			}
	        
	         System.out.println(result);
	}
}
