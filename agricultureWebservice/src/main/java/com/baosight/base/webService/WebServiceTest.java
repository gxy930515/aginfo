package com.baosight.base.webService;

import java.util.List;

import javax.jws.WebService;

import com.baosight.base.task.domain.ScheduleJob;
@WebService
public interface WebServiceTest {
	/**
	 * 从数据库中取 区别于getAllJob
	 * 
	 * @return
	 */
	public List<ScheduleJob> getAllTask() ;
}
