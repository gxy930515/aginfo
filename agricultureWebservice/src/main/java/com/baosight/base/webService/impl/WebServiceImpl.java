package com.baosight.base.webService.impl;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.baosight.base.task.dao.ScheduleJobMapper;
import com.baosight.base.task.domain.ScheduleJob;
import com.baosight.base.task.domain.ScheduleJobQuery;
import com.baosight.base.webService.WebServiceTest;

@Component("webServiceTest")
@WebService
public class WebServiceImpl implements WebServiceTest {
	@Autowired
	private ScheduleJobMapper scheduleJobMapper;

	/**
	 * 从数据库中取 区别于getAllJob
	 * 
	 * @return
	 */
	public List<ScheduleJob> getAllTask() {
//		System.out.println(scheduleJobMapper.selectByExample(new ScheduleJobQuery()));
		System.out.println("暴露成功");
		return scheduleJobMapper.selectByExample(new ScheduleJobQuery());
		
	}
}
