package com.car.develop.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  zxs
 * @date  2020/5/13 11:06 上午
 */
public class SiteMessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SiteMessExample() {
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

        public Criteria andStartSiteIsNull() {
            addCriterion("start_site is null");
            return (Criteria) this;
        }

        public Criteria andStartSiteIsNotNull() {
            addCriterion("start_site is not null");
            return (Criteria) this;
        }

        public Criteria andStartSiteEqualTo(String value) {
            addCriterion("start_site =", value, "startSite");
            return (Criteria) this;
        }

        public Criteria andStartSiteNotEqualTo(String value) {
            addCriterion("start_site <>", value, "startSite");
            return (Criteria) this;
        }

        public Criteria andStartSiteGreaterThan(String value) {
            addCriterion("start_site >", value, "startSite");
            return (Criteria) this;
        }

        public Criteria andStartSiteGreaterThanOrEqualTo(String value) {
            addCriterion("start_site >=", value, "startSite");
            return (Criteria) this;
        }

        public Criteria andStartSiteLessThan(String value) {
            addCriterion("start_site <", value, "startSite");
            return (Criteria) this;
        }

        public Criteria andStartSiteLessThanOrEqualTo(String value) {
            addCriterion("start_site <=", value, "startSite");
            return (Criteria) this;
        }

        public Criteria andStartSiteLike(String value) {
            addCriterion("start_site like", value, "startSite");
            return (Criteria) this;
        }

        public Criteria andStartSiteNotLike(String value) {
            addCriterion("start_site not like", value, "startSite");
            return (Criteria) this;
        }

        public Criteria andStartSiteIn(List<String> values) {
            addCriterion("start_site in", values, "startSite");
            return (Criteria) this;
        }

        public Criteria andStartSiteNotIn(List<String> values) {
            addCriterion("start_site not in", values, "startSite");
            return (Criteria) this;
        }

        public Criteria andStartSiteBetween(String value1, String value2) {
            addCriterion("start_site between", value1, value2, "startSite");
            return (Criteria) this;
        }

        public Criteria andStartSiteNotBetween(String value1, String value2) {
            addCriterion("start_site not between", value1, value2, "startSite");
            return (Criteria) this;
        }

        public Criteria andEndSiteIsNull() {
            addCriterion("end_site is null");
            return (Criteria) this;
        }

        public Criteria andEndSiteIsNotNull() {
            addCriterion("end_site is not null");
            return (Criteria) this;
        }

        public Criteria andEndSiteEqualTo(String value) {
            addCriterion("end_site =", value, "endSite");
            return (Criteria) this;
        }

        public Criteria andEndSiteNotEqualTo(String value) {
            addCriterion("end_site <>", value, "endSite");
            return (Criteria) this;
        }

        public Criteria andEndSiteGreaterThan(String value) {
            addCriterion("end_site >", value, "endSite");
            return (Criteria) this;
        }

        public Criteria andEndSiteGreaterThanOrEqualTo(String value) {
            addCriterion("end_site >=", value, "endSite");
            return (Criteria) this;
        }

        public Criteria andEndSiteLessThan(String value) {
            addCriterion("end_site <", value, "endSite");
            return (Criteria) this;
        }

        public Criteria andEndSiteLessThanOrEqualTo(String value) {
            addCriterion("end_site <=", value, "endSite");
            return (Criteria) this;
        }

        public Criteria andEndSiteLike(String value) {
            addCriterion("end_site like", value, "endSite");
            return (Criteria) this;
        }

        public Criteria andEndSiteNotLike(String value) {
            addCriterion("end_site not like", value, "endSite");
            return (Criteria) this;
        }

        public Criteria andEndSiteIn(List<String> values) {
            addCriterion("end_site in", values, "endSite");
            return (Criteria) this;
        }

        public Criteria andEndSiteNotIn(List<String> values) {
            addCriterion("end_site not in", values, "endSite");
            return (Criteria) this;
        }

        public Criteria andEndSiteBetween(String value1, String value2) {
            addCriterion("end_site between", value1, value2, "endSite");
            return (Criteria) this;
        }

        public Criteria andEndSiteNotBetween(String value1, String value2) {
            addCriterion("end_site not between", value1, value2, "endSite");
            return (Criteria) this;
        }

        public Criteria andMatterNameIsNull() {
            addCriterion("matter_name is null");
            return (Criteria) this;
        }

        public Criteria andMatterNameIsNotNull() {
            addCriterion("matter_name is not null");
            return (Criteria) this;
        }

        public Criteria andMatterNameEqualTo(String value) {
            addCriterion("matter_name =", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotEqualTo(String value) {
            addCriterion("matter_name <>", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameGreaterThan(String value) {
            addCriterion("matter_name >", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameGreaterThanOrEqualTo(String value) {
            addCriterion("matter_name >=", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameLessThan(String value) {
            addCriterion("matter_name <", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameLessThanOrEqualTo(String value) {
            addCriterion("matter_name <=", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameLike(String value) {
            addCriterion("matter_name like", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotLike(String value) {
            addCriterion("matter_name not like", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameIn(List<String> values) {
            addCriterion("matter_name in", values, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotIn(List<String> values) {
            addCriterion("matter_name not in", values, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameBetween(String value1, String value2) {
            addCriterion("matter_name between", value1, value2, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotBetween(String value1, String value2) {
            addCriterion("matter_name not between", value1, value2, "matterName");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andFreightTotalIsNull() {
            addCriterion("freight_total is null");
            return (Criteria) this;
        }

        public Criteria andFreightTotalIsNotNull() {
            addCriterion("freight_total is not null");
            return (Criteria) this;
        }

        public Criteria andFreightTotalEqualTo(String value) {
            addCriterion("freight_total =", value, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalNotEqualTo(String value) {
            addCriterion("freight_total <>", value, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalGreaterThan(String value) {
            addCriterion("freight_total >", value, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalGreaterThanOrEqualTo(String value) {
            addCriterion("freight_total >=", value, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalLessThan(String value) {
            addCriterion("freight_total <", value, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalLessThanOrEqualTo(String value) {
            addCriterion("freight_total <=", value, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalLike(String value) {
            addCriterion("freight_total like", value, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalNotLike(String value) {
            addCriterion("freight_total not like", value, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalIn(List<String> values) {
            addCriterion("freight_total in", values, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalNotIn(List<String> values) {
            addCriterion("freight_total not in", values, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalBetween(String value1, String value2) {
            addCriterion("freight_total between", value1, value2, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andFreightTotalNotBetween(String value1, String value2) {
            addCriterion("freight_total not between", value1, value2, "freightTotal");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyIsNull() {
            addCriterion("received_money is null");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyIsNotNull() {
            addCriterion("received_money is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyEqualTo(String value) {
            addCriterion("received_money =", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyNotEqualTo(String value) {
            addCriterion("received_money <>", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyGreaterThan(String value) {
            addCriterion("received_money >", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("received_money >=", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyLessThan(String value) {
            addCriterion("received_money <", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyLessThanOrEqualTo(String value) {
            addCriterion("received_money <=", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyLike(String value) {
            addCriterion("received_money like", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyNotLike(String value) {
            addCriterion("received_money not like", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyIn(List<String> values) {
            addCriterion("received_money in", values, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyNotIn(List<String> values) {
            addCriterion("received_money not in", values, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyBetween(String value1, String value2) {
            addCriterion("received_money between", value1, value2, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyNotBetween(String value1, String value2) {
            addCriterion("received_money not between", value1, value2, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyIsNull() {
            addCriterion("debt_money is null");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyIsNotNull() {
            addCriterion("debt_money is not null");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyEqualTo(String value) {
            addCriterion("debt_money =", value, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyNotEqualTo(String value) {
            addCriterion("debt_money <>", value, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyGreaterThan(String value) {
            addCriterion("debt_money >", value, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("debt_money >=", value, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyLessThan(String value) {
            addCriterion("debt_money <", value, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyLessThanOrEqualTo(String value) {
            addCriterion("debt_money <=", value, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyLike(String value) {
            addCriterion("debt_money like", value, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyNotLike(String value) {
            addCriterion("debt_money not like", value, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyIn(List<String> values) {
            addCriterion("debt_money in", values, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyNotIn(List<String> values) {
            addCriterion("debt_money not in", values, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyBetween(String value1, String value2) {
            addCriterion("debt_money between", value1, value2, "debtMoney");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyNotBetween(String value1, String value2) {
            addCriterion("debt_money not between", value1, value2, "debtMoney");
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