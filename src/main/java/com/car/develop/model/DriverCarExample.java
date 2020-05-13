package com.car.develop.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
 */
public class DriverCarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DriverCarExample() {
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(String value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(String value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(String value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(String value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(String value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(String value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLike(String value) {
            addCriterion("car_id like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(String value) {
            addCriterion("car_id not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<String> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<String> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(String value1, String value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(String value1, String value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andDriverIdOneIsNull() {
            addCriterion("driver_id_one is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdOneIsNotNull() {
            addCriterion("driver_id_one is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdOneEqualTo(String value) {
            addCriterion("driver_id_one =", value, "driverIdOne");
            return (Criteria) this;
        }

        public Criteria andDriverIdOneNotEqualTo(String value) {
            addCriterion("driver_id_one <>", value, "driverIdOne");
            return (Criteria) this;
        }

        public Criteria andDriverIdOneGreaterThan(String value) {
            addCriterion("driver_id_one >", value, "driverIdOne");
            return (Criteria) this;
        }

        public Criteria andDriverIdOneGreaterThanOrEqualTo(String value) {
            addCriterion("driver_id_one >=", value, "driverIdOne");
            return (Criteria) this;
        }

        public Criteria andDriverIdOneLessThan(String value) {
            addCriterion("driver_id_one <", value, "driverIdOne");
            return (Criteria) this;
        }

        public Criteria andDriverIdOneLessThanOrEqualTo(String value) {
            addCriterion("driver_id_one <=", value, "driverIdOne");
            return (Criteria) this;
        }

        public Criteria andDriverIdOneLike(String value) {
            addCriterion("driver_id_one like", value, "driverIdOne");
            return (Criteria) this;
        }

        public Criteria andDriverIdOneNotLike(String value) {
            addCriterion("driver_id_one not like", value, "driverIdOne");
            return (Criteria) this;
        }

        public Criteria andDriverIdOneIn(List<String> values) {
            addCriterion("driver_id_one in", values, "driverIdOne");
            return (Criteria) this;
        }

        public Criteria andDriverIdOneNotIn(List<String> values) {
            addCriterion("driver_id_one not in", values, "driverIdOne");
            return (Criteria) this;
        }

        public Criteria andDriverIdOneBetween(String value1, String value2) {
            addCriterion("driver_id_one between", value1, value2, "driverIdOne");
            return (Criteria) this;
        }

        public Criteria andDriverIdOneNotBetween(String value1, String value2) {
            addCriterion("driver_id_one not between", value1, value2, "driverIdOne");
            return (Criteria) this;
        }

        public Criteria andDriverIdTwoIsNull() {
            addCriterion("driver_id_two is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdTwoIsNotNull() {
            addCriterion("driver_id_two is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdTwoEqualTo(String value) {
            addCriterion("driver_id_two =", value, "driverIdTwo");
            return (Criteria) this;
        }

        public Criteria andDriverIdTwoNotEqualTo(String value) {
            addCriterion("driver_id_two <>", value, "driverIdTwo");
            return (Criteria) this;
        }

        public Criteria andDriverIdTwoGreaterThan(String value) {
            addCriterion("driver_id_two >", value, "driverIdTwo");
            return (Criteria) this;
        }

        public Criteria andDriverIdTwoGreaterThanOrEqualTo(String value) {
            addCriterion("driver_id_two >=", value, "driverIdTwo");
            return (Criteria) this;
        }

        public Criteria andDriverIdTwoLessThan(String value) {
            addCriterion("driver_id_two <", value, "driverIdTwo");
            return (Criteria) this;
        }

        public Criteria andDriverIdTwoLessThanOrEqualTo(String value) {
            addCriterion("driver_id_two <=", value, "driverIdTwo");
            return (Criteria) this;
        }

        public Criteria andDriverIdTwoLike(String value) {
            addCriterion("driver_id_two like", value, "driverIdTwo");
            return (Criteria) this;
        }

        public Criteria andDriverIdTwoNotLike(String value) {
            addCriterion("driver_id_two not like", value, "driverIdTwo");
            return (Criteria) this;
        }

        public Criteria andDriverIdTwoIn(List<String> values) {
            addCriterion("driver_id_two in", values, "driverIdTwo");
            return (Criteria) this;
        }

        public Criteria andDriverIdTwoNotIn(List<String> values) {
            addCriterion("driver_id_two not in", values, "driverIdTwo");
            return (Criteria) this;
        }

        public Criteria andDriverIdTwoBetween(String value1, String value2) {
            addCriterion("driver_id_two between", value1, value2, "driverIdTwo");
            return (Criteria) this;
        }

        public Criteria andDriverIdTwoNotBetween(String value1, String value2) {
            addCriterion("driver_id_two not between", value1, value2, "driverIdTwo");
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