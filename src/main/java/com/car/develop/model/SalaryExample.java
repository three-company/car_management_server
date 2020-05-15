package com.car.develop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author  zxs
 * @date  2020/5/15 11:10 上午
 */
public class SalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryExample() {
        oredCriteria = new ArrayList<>();
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

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNull() {
            addCriterion("driver_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("driver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(String value) {
            addCriterion("driver_id =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(String value) {
            addCriterion("driver_id <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(String value) {
            addCriterion("driver_id >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(String value) {
            addCriterion("driver_id >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(String value) {
            addCriterion("driver_id <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(String value) {
            addCriterion("driver_id <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLike(String value) {
            addCriterion("driver_id like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotLike(String value) {
            addCriterion("driver_id not like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<String> values) {
            addCriterion("driver_id in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<String> values) {
            addCriterion("driver_id not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(String value1, String value2) {
            addCriterion("driver_id between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(String value1, String value2) {
            addCriterion("driver_id not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andActualPaySalaryIsNull() {
            addCriterion("actual_pay_salary is null");
            return (Criteria) this;
        }

        public Criteria andActualPaySalaryIsNotNull() {
            addCriterion("actual_pay_salary is not null");
            return (Criteria) this;
        }

        public Criteria andActualPaySalaryEqualTo(String value) {
            addCriterion("actual_pay_salary =", value, "actualPaySalary");
            return (Criteria) this;
        }

        public Criteria andActualPaySalaryNotEqualTo(String value) {
            addCriterion("actual_pay_salary <>", value, "actualPaySalary");
            return (Criteria) this;
        }

        public Criteria andActualPaySalaryGreaterThan(String value) {
            addCriterion("actual_pay_salary >", value, "actualPaySalary");
            return (Criteria) this;
        }

        public Criteria andActualPaySalaryGreaterThanOrEqualTo(String value) {
            addCriterion("actual_pay_salary >=", value, "actualPaySalary");
            return (Criteria) this;
        }

        public Criteria andActualPaySalaryLessThan(String value) {
            addCriterion("actual_pay_salary <", value, "actualPaySalary");
            return (Criteria) this;
        }

        public Criteria andActualPaySalaryLessThanOrEqualTo(String value) {
            addCriterion("actual_pay_salary <=", value, "actualPaySalary");
            return (Criteria) this;
        }

        public Criteria andActualPaySalaryLike(String value) {
            addCriterion("actual_pay_salary like", value, "actualPaySalary");
            return (Criteria) this;
        }

        public Criteria andActualPaySalaryNotLike(String value) {
            addCriterion("actual_pay_salary not like", value, "actualPaySalary");
            return (Criteria) this;
        }

        public Criteria andActualPaySalaryIn(List<String> values) {
            addCriterion("actual_pay_salary in", values, "actualPaySalary");
            return (Criteria) this;
        }

        public Criteria andActualPaySalaryNotIn(List<String> values) {
            addCriterion("actual_pay_salary not in", values, "actualPaySalary");
            return (Criteria) this;
        }

        public Criteria andActualPaySalaryBetween(String value1, String value2) {
            addCriterion("actual_pay_salary between", value1, value2, "actualPaySalary");
            return (Criteria) this;
        }

        public Criteria andActualPaySalaryNotBetween(String value1, String value2) {
            addCriterion("actual_pay_salary not between", value1, value2, "actualPaySalary");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andAdvanceIsNull() {
            addCriterion("advance is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceIsNotNull() {
            addCriterion("advance is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceEqualTo(String value) {
            addCriterion("advance =", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceNotEqualTo(String value) {
            addCriterion("advance <>", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceGreaterThan(String value) {
            addCriterion("advance >", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceGreaterThanOrEqualTo(String value) {
            addCriterion("advance >=", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceLessThan(String value) {
            addCriterion("advance <", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceLessThanOrEqualTo(String value) {
            addCriterion("advance <=", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceLike(String value) {
            addCriterion("advance like", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceNotLike(String value) {
            addCriterion("advance not like", value, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceIn(List<String> values) {
            addCriterion("advance in", values, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceNotIn(List<String> values) {
            addCriterion("advance not in", values, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceBetween(String value1, String value2) {
            addCriterion("advance between", value1, value2, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceNotBetween(String value1, String value2) {
            addCriterion("advance not between", value1, value2, "advance");
            return (Criteria) this;
        }

        public Criteria andAdvanceTimeIsNull() {
            addCriterion("advance_time is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceTimeIsNotNull() {
            addCriterion("advance_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceTimeEqualTo(Date value) {
            addCriterion("advance_time =", value, "advanceTime");
            return (Criteria) this;
        }

        public Criteria andAdvanceTimeNotEqualTo(Date value) {
            addCriterion("advance_time <>", value, "advanceTime");
            return (Criteria) this;
        }

        public Criteria andAdvanceTimeGreaterThan(Date value) {
            addCriterion("advance_time >", value, "advanceTime");
            return (Criteria) this;
        }

        public Criteria andAdvanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("advance_time >=", value, "advanceTime");
            return (Criteria) this;
        }

        public Criteria andAdvanceTimeLessThan(Date value) {
            addCriterion("advance_time <", value, "advanceTime");
            return (Criteria) this;
        }

        public Criteria andAdvanceTimeLessThanOrEqualTo(Date value) {
            addCriterion("advance_time <=", value, "advanceTime");
            return (Criteria) this;
        }

        public Criteria andAdvanceTimeIn(List<Date> values) {
            addCriterion("advance_time in", values, "advanceTime");
            return (Criteria) this;
        }

        public Criteria andAdvanceTimeNotIn(List<Date> values) {
            addCriterion("advance_time not in", values, "advanceTime");
            return (Criteria) this;
        }

        public Criteria andAdvanceTimeBetween(Date value1, Date value2) {
            addCriterion("advance_time between", value1, value2, "advanceTime");
            return (Criteria) this;
        }

        public Criteria andAdvanceTimeNotBetween(Date value1, Date value2) {
            addCriterion("advance_time not between", value1, value2, "advanceTime");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
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