package com.baosight.base.task.domain;

import java.util.ArrayList;
import java.util.List;

public class ScheduleJobQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public ScheduleJobQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andJobIdIsNull() {
            addCriterion("JOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("JOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("JOB_ID =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("JOB_ID <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("JOB_ID >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("JOB_ID >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("JOB_ID <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("JOB_ID <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("JOB_ID in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("JOB_ID not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("JOB_ID between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("JOB_ID not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("UPDATE_TIME like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("UPDATE_TIME not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("JOB_NAME is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("JOB_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("JOB_NAME =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("JOB_NAME <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("JOB_NAME >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_NAME >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("JOB_NAME <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("JOB_NAME <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("JOB_NAME like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("JOB_NAME not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("JOB_NAME in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("JOB_NAME not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("JOB_NAME between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("JOB_NAME not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobGroupIsNull() {
            addCriterion("JOB_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andJobGroupIsNotNull() {
            addCriterion("JOB_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andJobGroupEqualTo(String value) {
            addCriterion("JOB_GROUP =", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotEqualTo(String value) {
            addCriterion("JOB_GROUP <>", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThan(String value) {
            addCriterion("JOB_GROUP >", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_GROUP >=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThan(String value) {
            addCriterion("JOB_GROUP <", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThanOrEqualTo(String value) {
            addCriterion("JOB_GROUP <=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLike(String value) {
            addCriterion("JOB_GROUP like", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotLike(String value) {
            addCriterion("JOB_GROUP not like", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupIn(List<String> values) {
            addCriterion("JOB_GROUP in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotIn(List<String> values) {
            addCriterion("JOB_GROUP not in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupBetween(String value1, String value2) {
            addCriterion("JOB_GROUP between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotBetween(String value1, String value2) {
            addCriterion("JOB_GROUP not between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobStatusIsNull() {
            addCriterion("JOB_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andJobStatusIsNotNull() {
            addCriterion("JOB_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andJobStatusEqualTo(String value) {
            addCriterion("JOB_STATUS =", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotEqualTo(String value) {
            addCriterion("JOB_STATUS <>", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusGreaterThan(String value) {
            addCriterion("JOB_STATUS >", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_STATUS >=", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusLessThan(String value) {
            addCriterion("JOB_STATUS <", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusLessThanOrEqualTo(String value) {
            addCriterion("JOB_STATUS <=", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusLike(String value) {
            addCriterion("JOB_STATUS like", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotLike(String value) {
            addCriterion("JOB_STATUS not like", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusIn(List<String> values) {
            addCriterion("JOB_STATUS in", values, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotIn(List<String> values) {
            addCriterion("JOB_STATUS not in", values, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusBetween(String value1, String value2) {
            addCriterion("JOB_STATUS between", value1, value2, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotBetween(String value1, String value2) {
            addCriterion("JOB_STATUS not between", value1, value2, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andCronExpressionIsNull() {
            addCriterion("CRON_EXPRESSION is null");
            return (Criteria) this;
        }

        public Criteria andCronExpressionIsNotNull() {
            addCriterion("CRON_EXPRESSION is not null");
            return (Criteria) this;
        }

        public Criteria andCronExpressionEqualTo(String value) {
            addCriterion("CRON_EXPRESSION =", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotEqualTo(String value) {
            addCriterion("CRON_EXPRESSION <>", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionGreaterThan(String value) {
            addCriterion("CRON_EXPRESSION >", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("CRON_EXPRESSION >=", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionLessThan(String value) {
            addCriterion("CRON_EXPRESSION <", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionLessThanOrEqualTo(String value) {
            addCriterion("CRON_EXPRESSION <=", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionLike(String value) {
            addCriterion("CRON_EXPRESSION like", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotLike(String value) {
            addCriterion("CRON_EXPRESSION not like", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionIn(List<String> values) {
            addCriterion("CRON_EXPRESSION in", values, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotIn(List<String> values) {
            addCriterion("CRON_EXPRESSION not in", values, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionBetween(String value1, String value2) {
            addCriterion("CRON_EXPRESSION between", value1, value2, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotBetween(String value1, String value2) {
            addCriterion("CRON_EXPRESSION not between", value1, value2, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andBeanClassIsNull() {
            addCriterion("BEAN_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andBeanClassIsNotNull() {
            addCriterion("BEAN_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andBeanClassEqualTo(String value) {
            addCriterion("BEAN_CLASS =", value, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassNotEqualTo(String value) {
            addCriterion("BEAN_CLASS <>", value, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassGreaterThan(String value) {
            addCriterion("BEAN_CLASS >", value, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassGreaterThanOrEqualTo(String value) {
            addCriterion("BEAN_CLASS >=", value, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassLessThan(String value) {
            addCriterion("BEAN_CLASS <", value, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassLessThanOrEqualTo(String value) {
            addCriterion("BEAN_CLASS <=", value, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassLike(String value) {
            addCriterion("BEAN_CLASS like", value, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassNotLike(String value) {
            addCriterion("BEAN_CLASS not like", value, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassIn(List<String> values) {
            addCriterion("BEAN_CLASS in", values, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassNotIn(List<String> values) {
            addCriterion("BEAN_CLASS not in", values, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassBetween(String value1, String value2) {
            addCriterion("BEAN_CLASS between", value1, value2, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassNotBetween(String value1, String value2) {
            addCriterion("BEAN_CLASS not between", value1, value2, "beanClass");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentIsNull() {
            addCriterion("IS_CONCURRENT is null");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentIsNotNull() {
            addCriterion("IS_CONCURRENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentEqualTo(String value) {
            addCriterion("IS_CONCURRENT =", value, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentNotEqualTo(String value) {
            addCriterion("IS_CONCURRENT <>", value, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentGreaterThan(String value) {
            addCriterion("IS_CONCURRENT >", value, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CONCURRENT >=", value, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentLessThan(String value) {
            addCriterion("IS_CONCURRENT <", value, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentLessThanOrEqualTo(String value) {
            addCriterion("IS_CONCURRENT <=", value, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentLike(String value) {
            addCriterion("IS_CONCURRENT like", value, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentNotLike(String value) {
            addCriterion("IS_CONCURRENT not like", value, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentIn(List<String> values) {
            addCriterion("IS_CONCURRENT in", values, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentNotIn(List<String> values) {
            addCriterion("IS_CONCURRENT not in", values, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentBetween(String value1, String value2) {
            addCriterion("IS_CONCURRENT between", value1, value2, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentNotBetween(String value1, String value2) {
            addCriterion("IS_CONCURRENT not between", value1, value2, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andSpringIdIsNull() {
            addCriterion("SPRING_ID is null");
            return (Criteria) this;
        }

        public Criteria andSpringIdIsNotNull() {
            addCriterion("SPRING_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSpringIdEqualTo(String value) {
            addCriterion("SPRING_ID =", value, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdNotEqualTo(String value) {
            addCriterion("SPRING_ID <>", value, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdGreaterThan(String value) {
            addCriterion("SPRING_ID >", value, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdGreaterThanOrEqualTo(String value) {
            addCriterion("SPRING_ID >=", value, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdLessThan(String value) {
            addCriterion("SPRING_ID <", value, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdLessThanOrEqualTo(String value) {
            addCriterion("SPRING_ID <=", value, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdLike(String value) {
            addCriterion("SPRING_ID like", value, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdNotLike(String value) {
            addCriterion("SPRING_ID not like", value, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdIn(List<String> values) {
            addCriterion("SPRING_ID in", values, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdNotIn(List<String> values) {
            addCriterion("SPRING_ID not in", values, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdBetween(String value1, String value2) {
            addCriterion("SPRING_ID between", value1, value2, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdNotBetween(String value1, String value2) {
            addCriterion("SPRING_ID not between", value1, value2, "springId");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNull() {
            addCriterion("METHOD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNotNull() {
            addCriterion("METHOD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMethodNameEqualTo(String value) {
            addCriterion("METHOD_NAME =", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotEqualTo(String value) {
            addCriterion("METHOD_NAME <>", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThan(String value) {
            addCriterion("METHOD_NAME >", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("METHOD_NAME >=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThan(String value) {
            addCriterion("METHOD_NAME <", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThanOrEqualTo(String value) {
            addCriterion("METHOD_NAME <=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLike(String value) {
            addCriterion("METHOD_NAME like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotLike(String value) {
            addCriterion("METHOD_NAME not like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameIn(List<String> values) {
            addCriterion("METHOD_NAME in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotIn(List<String> values) {
            addCriterion("METHOD_NAME not in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameBetween(String value1, String value2) {
            addCriterion("METHOD_NAME between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotBetween(String value1, String value2) {
            addCriterion("METHOD_NAME not between", value1, value2, "methodName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}