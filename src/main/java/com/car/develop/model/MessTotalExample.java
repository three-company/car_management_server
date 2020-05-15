package com.car.develop.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  zxs
 * @date  2020/5/15 11:10 上午
 */
public class MessTotalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessTotalExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(String value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(String value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(String value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(String value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(String value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(String value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLike(String value) {
            addCriterion("message_id like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotLike(String value) {
            addCriterion("message_id not like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<String> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<String> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(String value1, String value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(String value1, String value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andCarryMoneyIsNull() {
            addCriterion("carry_money is null");
            return (Criteria) this;
        }

        public Criteria andCarryMoneyIsNotNull() {
            addCriterion("carry_money is not null");
            return (Criteria) this;
        }

        public Criteria andCarryMoneyEqualTo(String value) {
            addCriterion("carry_money =", value, "carryMoney");
            return (Criteria) this;
        }

        public Criteria andCarryMoneyNotEqualTo(String value) {
            addCriterion("carry_money <>", value, "carryMoney");
            return (Criteria) this;
        }

        public Criteria andCarryMoneyGreaterThan(String value) {
            addCriterion("carry_money >", value, "carryMoney");
            return (Criteria) this;
        }

        public Criteria andCarryMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("carry_money >=", value, "carryMoney");
            return (Criteria) this;
        }

        public Criteria andCarryMoneyLessThan(String value) {
            addCriterion("carry_money <", value, "carryMoney");
            return (Criteria) this;
        }

        public Criteria andCarryMoneyLessThanOrEqualTo(String value) {
            addCriterion("carry_money <=", value, "carryMoney");
            return (Criteria) this;
        }

        public Criteria andCarryMoneyLike(String value) {
            addCriterion("carry_money like", value, "carryMoney");
            return (Criteria) this;
        }

        public Criteria andCarryMoneyNotLike(String value) {
            addCriterion("carry_money not like", value, "carryMoney");
            return (Criteria) this;
        }

        public Criteria andCarryMoneyIn(List<String> values) {
            addCriterion("carry_money in", values, "carryMoney");
            return (Criteria) this;
        }

        public Criteria andCarryMoneyNotIn(List<String> values) {
            addCriterion("carry_money not in", values, "carryMoney");
            return (Criteria) this;
        }

        public Criteria andCarryMoneyBetween(String value1, String value2) {
            addCriterion("carry_money between", value1, value2, "carryMoney");
            return (Criteria) this;
        }

        public Criteria andCarryMoneyNotBetween(String value1, String value2) {
            addCriterion("carry_money not between", value1, value2, "carryMoney");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(String value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(String value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(String value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(String value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(String value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(String value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLike(String value) {
            addCriterion("freight like", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotLike(String value) {
            addCriterion("freight not like", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<String> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<String> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(String value1, String value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(String value1, String value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andHandInIsNull() {
            addCriterion("hand_in is null");
            return (Criteria) this;
        }

        public Criteria andHandInIsNotNull() {
            addCriterion("hand_in is not null");
            return (Criteria) this;
        }

        public Criteria andHandInEqualTo(String value) {
            addCriterion("hand_in =", value, "handIn");
            return (Criteria) this;
        }

        public Criteria andHandInNotEqualTo(String value) {
            addCriterion("hand_in <>", value, "handIn");
            return (Criteria) this;
        }

        public Criteria andHandInGreaterThan(String value) {
            addCriterion("hand_in >", value, "handIn");
            return (Criteria) this;
        }

        public Criteria andHandInGreaterThanOrEqualTo(String value) {
            addCriterion("hand_in >=", value, "handIn");
            return (Criteria) this;
        }

        public Criteria andHandInLessThan(String value) {
            addCriterion("hand_in <", value, "handIn");
            return (Criteria) this;
        }

        public Criteria andHandInLessThanOrEqualTo(String value) {
            addCriterion("hand_in <=", value, "handIn");
            return (Criteria) this;
        }

        public Criteria andHandInLike(String value) {
            addCriterion("hand_in like", value, "handIn");
            return (Criteria) this;
        }

        public Criteria andHandInNotLike(String value) {
            addCriterion("hand_in not like", value, "handIn");
            return (Criteria) this;
        }

        public Criteria andHandInIn(List<String> values) {
            addCriterion("hand_in in", values, "handIn");
            return (Criteria) this;
        }

        public Criteria andHandInNotIn(List<String> values) {
            addCriterion("hand_in not in", values, "handIn");
            return (Criteria) this;
        }

        public Criteria andHandInBetween(String value1, String value2) {
            addCriterion("hand_in between", value1, value2, "handIn");
            return (Criteria) this;
        }

        public Criteria andHandInNotBetween(String value1, String value2) {
            addCriterion("hand_in not between", value1, value2, "handIn");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeIsNull() {
            addCriterion("total_income is null");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeIsNotNull() {
            addCriterion("total_income is not null");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeEqualTo(String value) {
            addCriterion("total_income =", value, "totalIncome");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeNotEqualTo(String value) {
            addCriterion("total_income <>", value, "totalIncome");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeGreaterThan(String value) {
            addCriterion("total_income >", value, "totalIncome");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("total_income >=", value, "totalIncome");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeLessThan(String value) {
            addCriterion("total_income <", value, "totalIncome");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeLessThanOrEqualTo(String value) {
            addCriterion("total_income <=", value, "totalIncome");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeLike(String value) {
            addCriterion("total_income like", value, "totalIncome");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeNotLike(String value) {
            addCriterion("total_income not like", value, "totalIncome");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeIn(List<String> values) {
            addCriterion("total_income in", values, "totalIncome");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeNotIn(List<String> values) {
            addCriterion("total_income not in", values, "totalIncome");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeBetween(String value1, String value2) {
            addCriterion("total_income between", value1, value2, "totalIncome");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeNotBetween(String value1, String value2) {
            addCriterion("total_income not between", value1, value2, "totalIncome");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andTotalPayIsNull() {
            addCriterion("total_pay is null");
            return (Criteria) this;
        }

        public Criteria andTotalPayIsNotNull() {
            addCriterion("total_pay is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPayEqualTo(String value) {
            addCriterion("total_pay =", value, "totalPay");
            return (Criteria) this;
        }

        public Criteria andTotalPayNotEqualTo(String value) {
            addCriterion("total_pay <>", value, "totalPay");
            return (Criteria) this;
        }

        public Criteria andTotalPayGreaterThan(String value) {
            addCriterion("total_pay >", value, "totalPay");
            return (Criteria) this;
        }

        public Criteria andTotalPayGreaterThanOrEqualTo(String value) {
            addCriterion("total_pay >=", value, "totalPay");
            return (Criteria) this;
        }

        public Criteria andTotalPayLessThan(String value) {
            addCriterion("total_pay <", value, "totalPay");
            return (Criteria) this;
        }

        public Criteria andTotalPayLessThanOrEqualTo(String value) {
            addCriterion("total_pay <=", value, "totalPay");
            return (Criteria) this;
        }

        public Criteria andTotalPayLike(String value) {
            addCriterion("total_pay like", value, "totalPay");
            return (Criteria) this;
        }

        public Criteria andTotalPayNotLike(String value) {
            addCriterion("total_pay not like", value, "totalPay");
            return (Criteria) this;
        }

        public Criteria andTotalPayIn(List<String> values) {
            addCriterion("total_pay in", values, "totalPay");
            return (Criteria) this;
        }

        public Criteria andTotalPayNotIn(List<String> values) {
            addCriterion("total_pay not in", values, "totalPay");
            return (Criteria) this;
        }

        public Criteria andTotalPayBetween(String value1, String value2) {
            addCriterion("total_pay between", value1, value2, "totalPay");
            return (Criteria) this;
        }

        public Criteria andTotalPayNotBetween(String value1, String value2) {
            addCriterion("total_pay not between", value1, value2, "totalPay");
            return (Criteria) this;
        }

        public Criteria andTotalReturnIsNull() {
            addCriterion("total_return is null");
            return (Criteria) this;
        }

        public Criteria andTotalReturnIsNotNull() {
            addCriterion("total_return is not null");
            return (Criteria) this;
        }

        public Criteria andTotalReturnEqualTo(String value) {
            addCriterion("total_return =", value, "totalReturn");
            return (Criteria) this;
        }

        public Criteria andTotalReturnNotEqualTo(String value) {
            addCriterion("total_return <>", value, "totalReturn");
            return (Criteria) this;
        }

        public Criteria andTotalReturnGreaterThan(String value) {
            addCriterion("total_return >", value, "totalReturn");
            return (Criteria) this;
        }

        public Criteria andTotalReturnGreaterThanOrEqualTo(String value) {
            addCriterion("total_return >=", value, "totalReturn");
            return (Criteria) this;
        }

        public Criteria andTotalReturnLessThan(String value) {
            addCriterion("total_return <", value, "totalReturn");
            return (Criteria) this;
        }

        public Criteria andTotalReturnLessThanOrEqualTo(String value) {
            addCriterion("total_return <=", value, "totalReturn");
            return (Criteria) this;
        }

        public Criteria andTotalReturnLike(String value) {
            addCriterion("total_return like", value, "totalReturn");
            return (Criteria) this;
        }

        public Criteria andTotalReturnNotLike(String value) {
            addCriterion("total_return not like", value, "totalReturn");
            return (Criteria) this;
        }

        public Criteria andTotalReturnIn(List<String> values) {
            addCriterion("total_return in", values, "totalReturn");
            return (Criteria) this;
        }

        public Criteria andTotalReturnNotIn(List<String> values) {
            addCriterion("total_return not in", values, "totalReturn");
            return (Criteria) this;
        }

        public Criteria andTotalReturnBetween(String value1, String value2) {
            addCriterion("total_return between", value1, value2, "totalReturn");
            return (Criteria) this;
        }

        public Criteria andTotalReturnNotBetween(String value1, String value2) {
            addCriterion("total_return not between", value1, value2, "totalReturn");
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