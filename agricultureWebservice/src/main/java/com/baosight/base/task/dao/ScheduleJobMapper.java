package com.baosight.base.task.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baosight.base.task.domain.ScheduleJob;
import com.baosight.base.task.domain.ScheduleJobQuery;





public interface ScheduleJobMapper {
	  int countByExample(ScheduleJobQuery example);

	    int deleteByExample(ScheduleJobQuery example);

	    int deleteByPrimaryKey(Integer jobId);

	    int insert(ScheduleJob record);

	    int insertSelective(ScheduleJob record);

	    List<ScheduleJob> selectByExample(ScheduleJobQuery example);

	    ScheduleJob selectByPrimaryKey(Integer jobId);

	    int updateByExampleSelective(@Param("record") ScheduleJob record, @Param("example") ScheduleJobQuery example);

	    int updateByExample(@Param("record") ScheduleJob record, @Param("example") ScheduleJobQuery example);

	    int updateByPrimaryKeySelective(ScheduleJob record);

	    int updateByPrimaryKey(ScheduleJob record);
}