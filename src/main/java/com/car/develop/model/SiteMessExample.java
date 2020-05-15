package com.car.develop.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  zxs
 * @date  2020/5/15 11:10 上午
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

        public Criteria andStartSiteOneIsNull() {
            addCriterion("start_site_one is null");
            return (Criteria) this;
        }

        public Criteria andStartSiteOneIsNotNull() {
            addCriterion("start_site_one is not null");
            return (Criteria) this;
        }

        public Criteria andStartSiteOneEqualTo(String value) {
            addCriterion("start_site_one =", value, "startSiteOne");
            return (Criteria) this;
        }

        public Criteria andStartSiteOneNotEqualTo(String value) {
            addCriterion("start_site_one <>", value, "startSiteOne");
            return (Criteria) this;
        }

        public Criteria andStartSiteOneGreaterThan(String value) {
            addCriterion("start_site_one >", value, "startSiteOne");
            return (Criteria) this;
        }

        public Criteria andStartSiteOneGreaterThanOrEqualTo(String value) {
            addCriterion("start_site_one >=", value, "startSiteOne");
            return (Criteria) this;
        }

        public Criteria andStartSiteOneLessThan(String value) {
            addCriterion("start_site_one <", value, "startSiteOne");
            return (Criteria) this;
        }

        public Criteria andStartSiteOneLessThanOrEqualTo(String value) {
            addCriterion("start_site_one <=", value, "startSiteOne");
            return (Criteria) this;
        }

        public Criteria andStartSiteOneLike(String value) {
            addCriterion("start_site_one like", value, "startSiteOne");
            return (Criteria) this;
        }

        public Criteria andStartSiteOneNotLike(String value) {
            addCriterion("start_site_one not like", value, "startSiteOne");
            return (Criteria) this;
        }

        public Criteria andStartSiteOneIn(List<String> values) {
            addCriterion("start_site_one in", values, "startSiteOne");
            return (Criteria) this;
        }

        public Criteria andStartSiteOneNotIn(List<String> values) {
            addCriterion("start_site_one not in", values, "startSiteOne");
            return (Criteria) this;
        }

        public Criteria andStartSiteOneBetween(String value1, String value2) {
            addCriterion("start_site_one between", value1, value2, "startSiteOne");
            return (Criteria) this;
        }

        public Criteria andStartSiteOneNotBetween(String value1, String value2) {
            addCriterion("start_site_one not between", value1, value2, "startSiteOne");
            return (Criteria) this;
        }

        public Criteria andEndSiteOneIsNull() {
            addCriterion("end_site_one is null");
            return (Criteria) this;
        }

        public Criteria andEndSiteOneIsNotNull() {
            addCriterion("end_site_one is not null");
            return (Criteria) this;
        }

        public Criteria andEndSiteOneEqualTo(String value) {
            addCriterion("end_site_one =", value, "endSiteOne");
            return (Criteria) this;
        }

        public Criteria andEndSiteOneNotEqualTo(String value) {
            addCriterion("end_site_one <>", value, "endSiteOne");
            return (Criteria) this;
        }

        public Criteria andEndSiteOneGreaterThan(String value) {
            addCriterion("end_site_one >", value, "endSiteOne");
            return (Criteria) this;
        }

        public Criteria andEndSiteOneGreaterThanOrEqualTo(String value) {
            addCriterion("end_site_one >=", value, "endSiteOne");
            return (Criteria) this;
        }

        public Criteria andEndSiteOneLessThan(String value) {
            addCriterion("end_site_one <", value, "endSiteOne");
            return (Criteria) this;
        }

        public Criteria andEndSiteOneLessThanOrEqualTo(String value) {
            addCriterion("end_site_one <=", value, "endSiteOne");
            return (Criteria) this;
        }

        public Criteria andEndSiteOneLike(String value) {
            addCriterion("end_site_one like", value, "endSiteOne");
            return (Criteria) this;
        }

        public Criteria andEndSiteOneNotLike(String value) {
            addCriterion("end_site_one not like", value, "endSiteOne");
            return (Criteria) this;
        }

        public Criteria andEndSiteOneIn(List<String> values) {
            addCriterion("end_site_one in", values, "endSiteOne");
            return (Criteria) this;
        }

        public Criteria andEndSiteOneNotIn(List<String> values) {
            addCriterion("end_site_one not in", values, "endSiteOne");
            return (Criteria) this;
        }

        public Criteria andEndSiteOneBetween(String value1, String value2) {
            addCriterion("end_site_one between", value1, value2, "endSiteOne");
            return (Criteria) this;
        }

        public Criteria andEndSiteOneNotBetween(String value1, String value2) {
            addCriterion("end_site_one not between", value1, value2, "endSiteOne");
            return (Criteria) this;
        }

        public Criteria andMatterNameOneIsNull() {
            addCriterion("matter_name_one is null");
            return (Criteria) this;
        }

        public Criteria andMatterNameOneIsNotNull() {
            addCriterion("matter_name_one is not null");
            return (Criteria) this;
        }

        public Criteria andMatterNameOneEqualTo(String value) {
            addCriterion("matter_name_one =", value, "matterNameOne");
            return (Criteria) this;
        }

        public Criteria andMatterNameOneNotEqualTo(String value) {
            addCriterion("matter_name_one <>", value, "matterNameOne");
            return (Criteria) this;
        }

        public Criteria andMatterNameOneGreaterThan(String value) {
            addCriterion("matter_name_one >", value, "matterNameOne");
            return (Criteria) this;
        }

        public Criteria andMatterNameOneGreaterThanOrEqualTo(String value) {
            addCriterion("matter_name_one >=", value, "matterNameOne");
            return (Criteria) this;
        }

        public Criteria andMatterNameOneLessThan(String value) {
            addCriterion("matter_name_one <", value, "matterNameOne");
            return (Criteria) this;
        }

        public Criteria andMatterNameOneLessThanOrEqualTo(String value) {
            addCriterion("matter_name_one <=", value, "matterNameOne");
            return (Criteria) this;
        }

        public Criteria andMatterNameOneLike(String value) {
            addCriterion("matter_name_one like", value, "matterNameOne");
            return (Criteria) this;
        }

        public Criteria andMatterNameOneNotLike(String value) {
            addCriterion("matter_name_one not like", value, "matterNameOne");
            return (Criteria) this;
        }

        public Criteria andMatterNameOneIn(List<String> values) {
            addCriterion("matter_name_one in", values, "matterNameOne");
            return (Criteria) this;
        }

        public Criteria andMatterNameOneNotIn(List<String> values) {
            addCriterion("matter_name_one not in", values, "matterNameOne");
            return (Criteria) this;
        }

        public Criteria andMatterNameOneBetween(String value1, String value2) {
            addCriterion("matter_name_one between", value1, value2, "matterNameOne");
            return (Criteria) this;
        }

        public Criteria andMatterNameOneNotBetween(String value1, String value2) {
            addCriterion("matter_name_one not between", value1, value2, "matterNameOne");
            return (Criteria) this;
        }

        public Criteria andWeightOneIsNull() {
            addCriterion("weight_one is null");
            return (Criteria) this;
        }

        public Criteria andWeightOneIsNotNull() {
            addCriterion("weight_one is not null");
            return (Criteria) this;
        }

        public Criteria andWeightOneEqualTo(String value) {
            addCriterion("weight_one =", value, "weightOne");
            return (Criteria) this;
        }

        public Criteria andWeightOneNotEqualTo(String value) {
            addCriterion("weight_one <>", value, "weightOne");
            return (Criteria) this;
        }

        public Criteria andWeightOneGreaterThan(String value) {
            addCriterion("weight_one >", value, "weightOne");
            return (Criteria) this;
        }

        public Criteria andWeightOneGreaterThanOrEqualTo(String value) {
            addCriterion("weight_one >=", value, "weightOne");
            return (Criteria) this;
        }

        public Criteria andWeightOneLessThan(String value) {
            addCriterion("weight_one <", value, "weightOne");
            return (Criteria) this;
        }

        public Criteria andWeightOneLessThanOrEqualTo(String value) {
            addCriterion("weight_one <=", value, "weightOne");
            return (Criteria) this;
        }

        public Criteria andWeightOneLike(String value) {
            addCriterion("weight_one like", value, "weightOne");
            return (Criteria) this;
        }

        public Criteria andWeightOneNotLike(String value) {
            addCriterion("weight_one not like", value, "weightOne");
            return (Criteria) this;
        }

        public Criteria andWeightOneIn(List<String> values) {
            addCriterion("weight_one in", values, "weightOne");
            return (Criteria) this;
        }

        public Criteria andWeightOneNotIn(List<String> values) {
            addCriterion("weight_one not in", values, "weightOne");
            return (Criteria) this;
        }

        public Criteria andWeightOneBetween(String value1, String value2) {
            addCriterion("weight_one between", value1, value2, "weightOne");
            return (Criteria) this;
        }

        public Criteria andWeightOneNotBetween(String value1, String value2) {
            addCriterion("weight_one not between", value1, value2, "weightOne");
            return (Criteria) this;
        }

        public Criteria andFreightTotalOneIsNull() {
            addCriterion("freight_total_one is null");
            return (Criteria) this;
        }

        public Criteria andFreightTotalOneIsNotNull() {
            addCriterion("freight_total_one is not null");
            return (Criteria) this;
        }

        public Criteria andFreightTotalOneEqualTo(String value) {
            addCriterion("freight_total_one =", value, "freightTotalOne");
            return (Criteria) this;
        }

        public Criteria andFreightTotalOneNotEqualTo(String value) {
            addCriterion("freight_total_one <>", value, "freightTotalOne");
            return (Criteria) this;
        }

        public Criteria andFreightTotalOneGreaterThan(String value) {
            addCriterion("freight_total_one >", value, "freightTotalOne");
            return (Criteria) this;
        }

        public Criteria andFreightTotalOneGreaterThanOrEqualTo(String value) {
            addCriterion("freight_total_one >=", value, "freightTotalOne");
            return (Criteria) this;
        }

        public Criteria andFreightTotalOneLessThan(String value) {
            addCriterion("freight_total_one <", value, "freightTotalOne");
            return (Criteria) this;
        }

        public Criteria andFreightTotalOneLessThanOrEqualTo(String value) {
            addCriterion("freight_total_one <=", value, "freightTotalOne");
            return (Criteria) this;
        }

        public Criteria andFreightTotalOneLike(String value) {
            addCriterion("freight_total_one like", value, "freightTotalOne");
            return (Criteria) this;
        }

        public Criteria andFreightTotalOneNotLike(String value) {
            addCriterion("freight_total_one not like", value, "freightTotalOne");
            return (Criteria) this;
        }

        public Criteria andFreightTotalOneIn(List<String> values) {
            addCriterion("freight_total_one in", values, "freightTotalOne");
            return (Criteria) this;
        }

        public Criteria andFreightTotalOneNotIn(List<String> values) {
            addCriterion("freight_total_one not in", values, "freightTotalOne");
            return (Criteria) this;
        }

        public Criteria andFreightTotalOneBetween(String value1, String value2) {
            addCriterion("freight_total_one between", value1, value2, "freightTotalOne");
            return (Criteria) this;
        }

        public Criteria andFreightTotalOneNotBetween(String value1, String value2) {
            addCriterion("freight_total_one not between", value1, value2, "freightTotalOne");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyOneIsNull() {
            addCriterion("received_money_one is null");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyOneIsNotNull() {
            addCriterion("received_money_one is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyOneEqualTo(String value) {
            addCriterion("received_money_one =", value, "receivedMoneyOne");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyOneNotEqualTo(String value) {
            addCriterion("received_money_one <>", value, "receivedMoneyOne");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyOneGreaterThan(String value) {
            addCriterion("received_money_one >", value, "receivedMoneyOne");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyOneGreaterThanOrEqualTo(String value) {
            addCriterion("received_money_one >=", value, "receivedMoneyOne");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyOneLessThan(String value) {
            addCriterion("received_money_one <", value, "receivedMoneyOne");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyOneLessThanOrEqualTo(String value) {
            addCriterion("received_money_one <=", value, "receivedMoneyOne");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyOneLike(String value) {
            addCriterion("received_money_one like", value, "receivedMoneyOne");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyOneNotLike(String value) {
            addCriterion("received_money_one not like", value, "receivedMoneyOne");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyOneIn(List<String> values) {
            addCriterion("received_money_one in", values, "receivedMoneyOne");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyOneNotIn(List<String> values) {
            addCriterion("received_money_one not in", values, "receivedMoneyOne");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyOneBetween(String value1, String value2) {
            addCriterion("received_money_one between", value1, value2, "receivedMoneyOne");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyOneNotBetween(String value1, String value2) {
            addCriterion("received_money_one not between", value1, value2, "receivedMoneyOne");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyOneIsNull() {
            addCriterion("debt_money_one is null");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyOneIsNotNull() {
            addCriterion("debt_money_one is not null");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyOneEqualTo(String value) {
            addCriterion("debt_money_one =", value, "debtMoneyOne");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyOneNotEqualTo(String value) {
            addCriterion("debt_money_one <>", value, "debtMoneyOne");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyOneGreaterThan(String value) {
            addCriterion("debt_money_one >", value, "debtMoneyOne");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyOneGreaterThanOrEqualTo(String value) {
            addCriterion("debt_money_one >=", value, "debtMoneyOne");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyOneLessThan(String value) {
            addCriterion("debt_money_one <", value, "debtMoneyOne");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyOneLessThanOrEqualTo(String value) {
            addCriterion("debt_money_one <=", value, "debtMoneyOne");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyOneLike(String value) {
            addCriterion("debt_money_one like", value, "debtMoneyOne");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyOneNotLike(String value) {
            addCriterion("debt_money_one not like", value, "debtMoneyOne");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyOneIn(List<String> values) {
            addCriterion("debt_money_one in", values, "debtMoneyOne");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyOneNotIn(List<String> values) {
            addCriterion("debt_money_one not in", values, "debtMoneyOne");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyOneBetween(String value1, String value2) {
            addCriterion("debt_money_one between", value1, value2, "debtMoneyOne");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyOneNotBetween(String value1, String value2) {
            addCriterion("debt_money_one not between", value1, value2, "debtMoneyOne");
            return (Criteria) this;
        }

        public Criteria andFreightOneIsNull() {
            addCriterion("freight_one is null");
            return (Criteria) this;
        }

        public Criteria andFreightOneIsNotNull() {
            addCriterion("freight_one is not null");
            return (Criteria) this;
        }

        public Criteria andFreightOneEqualTo(String value) {
            addCriterion("freight_one =", value, "freightOne");
            return (Criteria) this;
        }

        public Criteria andFreightOneNotEqualTo(String value) {
            addCriterion("freight_one <>", value, "freightOne");
            return (Criteria) this;
        }

        public Criteria andFreightOneGreaterThan(String value) {
            addCriterion("freight_one >", value, "freightOne");
            return (Criteria) this;
        }

        public Criteria andFreightOneGreaterThanOrEqualTo(String value) {
            addCriterion("freight_one >=", value, "freightOne");
            return (Criteria) this;
        }

        public Criteria andFreightOneLessThan(String value) {
            addCriterion("freight_one <", value, "freightOne");
            return (Criteria) this;
        }

        public Criteria andFreightOneLessThanOrEqualTo(String value) {
            addCriterion("freight_one <=", value, "freightOne");
            return (Criteria) this;
        }

        public Criteria andFreightOneLike(String value) {
            addCriterion("freight_one like", value, "freightOne");
            return (Criteria) this;
        }

        public Criteria andFreightOneNotLike(String value) {
            addCriterion("freight_one not like", value, "freightOne");
            return (Criteria) this;
        }

        public Criteria andFreightOneIn(List<String> values) {
            addCriterion("freight_one in", values, "freightOne");
            return (Criteria) this;
        }

        public Criteria andFreightOneNotIn(List<String> values) {
            addCriterion("freight_one not in", values, "freightOne");
            return (Criteria) this;
        }

        public Criteria andFreightOneBetween(String value1, String value2) {
            addCriterion("freight_one between", value1, value2, "freightOne");
            return (Criteria) this;
        }

        public Criteria andFreightOneNotBetween(String value1, String value2) {
            addCriterion("freight_one not between", value1, value2, "freightOne");
            return (Criteria) this;
        }

        public Criteria andStartSiteTwoIsNull() {
            addCriterion("start_site_two is null");
            return (Criteria) this;
        }

        public Criteria andStartSiteTwoIsNotNull() {
            addCriterion("start_site_two is not null");
            return (Criteria) this;
        }

        public Criteria andStartSiteTwoEqualTo(String value) {
            addCriterion("start_site_two =", value, "startSiteTwo");
            return (Criteria) this;
        }

        public Criteria andStartSiteTwoNotEqualTo(String value) {
            addCriterion("start_site_two <>", value, "startSiteTwo");
            return (Criteria) this;
        }

        public Criteria andStartSiteTwoGreaterThan(String value) {
            addCriterion("start_site_two >", value, "startSiteTwo");
            return (Criteria) this;
        }

        public Criteria andStartSiteTwoGreaterThanOrEqualTo(String value) {
            addCriterion("start_site_two >=", value, "startSiteTwo");
            return (Criteria) this;
        }

        public Criteria andStartSiteTwoLessThan(String value) {
            addCriterion("start_site_two <", value, "startSiteTwo");
            return (Criteria) this;
        }

        public Criteria andStartSiteTwoLessThanOrEqualTo(String value) {
            addCriterion("start_site_two <=", value, "startSiteTwo");
            return (Criteria) this;
        }

        public Criteria andStartSiteTwoLike(String value) {
            addCriterion("start_site_two like", value, "startSiteTwo");
            return (Criteria) this;
        }

        public Criteria andStartSiteTwoNotLike(String value) {
            addCriterion("start_site_two not like", value, "startSiteTwo");
            return (Criteria) this;
        }

        public Criteria andStartSiteTwoIn(List<String> values) {
            addCriterion("start_site_two in", values, "startSiteTwo");
            return (Criteria) this;
        }

        public Criteria andStartSiteTwoNotIn(List<String> values) {
            addCriterion("start_site_two not in", values, "startSiteTwo");
            return (Criteria) this;
        }

        public Criteria andStartSiteTwoBetween(String value1, String value2) {
            addCriterion("start_site_two between", value1, value2, "startSiteTwo");
            return (Criteria) this;
        }

        public Criteria andStartSiteTwoNotBetween(String value1, String value2) {
            addCriterion("start_site_two not between", value1, value2, "startSiteTwo");
            return (Criteria) this;
        }

        public Criteria andEndSiteTwoIsNull() {
            addCriterion("end_site_two is null");
            return (Criteria) this;
        }

        public Criteria andEndSiteTwoIsNotNull() {
            addCriterion("end_site_two is not null");
            return (Criteria) this;
        }

        public Criteria andEndSiteTwoEqualTo(String value) {
            addCriterion("end_site_two =", value, "endSiteTwo");
            return (Criteria) this;
        }

        public Criteria andEndSiteTwoNotEqualTo(String value) {
            addCriterion("end_site_two <>", value, "endSiteTwo");
            return (Criteria) this;
        }

        public Criteria andEndSiteTwoGreaterThan(String value) {
            addCriterion("end_site_two >", value, "endSiteTwo");
            return (Criteria) this;
        }

        public Criteria andEndSiteTwoGreaterThanOrEqualTo(String value) {
            addCriterion("end_site_two >=", value, "endSiteTwo");
            return (Criteria) this;
        }

        public Criteria andEndSiteTwoLessThan(String value) {
            addCriterion("end_site_two <", value, "endSiteTwo");
            return (Criteria) this;
        }

        public Criteria andEndSiteTwoLessThanOrEqualTo(String value) {
            addCriterion("end_site_two <=", value, "endSiteTwo");
            return (Criteria) this;
        }

        public Criteria andEndSiteTwoLike(String value) {
            addCriterion("end_site_two like", value, "endSiteTwo");
            return (Criteria) this;
        }

        public Criteria andEndSiteTwoNotLike(String value) {
            addCriterion("end_site_two not like", value, "endSiteTwo");
            return (Criteria) this;
        }

        public Criteria andEndSiteTwoIn(List<String> values) {
            addCriterion("end_site_two in", values, "endSiteTwo");
            return (Criteria) this;
        }

        public Criteria andEndSiteTwoNotIn(List<String> values) {
            addCriterion("end_site_two not in", values, "endSiteTwo");
            return (Criteria) this;
        }

        public Criteria andEndSiteTwoBetween(String value1, String value2) {
            addCriterion("end_site_two between", value1, value2, "endSiteTwo");
            return (Criteria) this;
        }

        public Criteria andEndSiteTwoNotBetween(String value1, String value2) {
            addCriterion("end_site_two not between", value1, value2, "endSiteTwo");
            return (Criteria) this;
        }

        public Criteria andMatterNameTwoIsNull() {
            addCriterion("matter_name_two is null");
            return (Criteria) this;
        }

        public Criteria andMatterNameTwoIsNotNull() {
            addCriterion("matter_name_two is not null");
            return (Criteria) this;
        }

        public Criteria andMatterNameTwoEqualTo(String value) {
            addCriterion("matter_name_two =", value, "matterNameTwo");
            return (Criteria) this;
        }

        public Criteria andMatterNameTwoNotEqualTo(String value) {
            addCriterion("matter_name_two <>", value, "matterNameTwo");
            return (Criteria) this;
        }

        public Criteria andMatterNameTwoGreaterThan(String value) {
            addCriterion("matter_name_two >", value, "matterNameTwo");
            return (Criteria) this;
        }

        public Criteria andMatterNameTwoGreaterThanOrEqualTo(String value) {
            addCriterion("matter_name_two >=", value, "matterNameTwo");
            return (Criteria) this;
        }

        public Criteria andMatterNameTwoLessThan(String value) {
            addCriterion("matter_name_two <", value, "matterNameTwo");
            return (Criteria) this;
        }

        public Criteria andMatterNameTwoLessThanOrEqualTo(String value) {
            addCriterion("matter_name_two <=", value, "matterNameTwo");
            return (Criteria) this;
        }

        public Criteria andMatterNameTwoLike(String value) {
            addCriterion("matter_name_two like", value, "matterNameTwo");
            return (Criteria) this;
        }

        public Criteria andMatterNameTwoNotLike(String value) {
            addCriterion("matter_name_two not like", value, "matterNameTwo");
            return (Criteria) this;
        }

        public Criteria andMatterNameTwoIn(List<String> values) {
            addCriterion("matter_name_two in", values, "matterNameTwo");
            return (Criteria) this;
        }

        public Criteria andMatterNameTwoNotIn(List<String> values) {
            addCriterion("matter_name_two not in", values, "matterNameTwo");
            return (Criteria) this;
        }

        public Criteria andMatterNameTwoBetween(String value1, String value2) {
            addCriterion("matter_name_two between", value1, value2, "matterNameTwo");
            return (Criteria) this;
        }

        public Criteria andMatterNameTwoNotBetween(String value1, String value2) {
            addCriterion("matter_name_two not between", value1, value2, "matterNameTwo");
            return (Criteria) this;
        }

        public Criteria andWeightTwoIsNull() {
            addCriterion("weight_two is null");
            return (Criteria) this;
        }

        public Criteria andWeightTwoIsNotNull() {
            addCriterion("weight_two is not null");
            return (Criteria) this;
        }

        public Criteria andWeightTwoEqualTo(String value) {
            addCriterion("weight_two =", value, "weightTwo");
            return (Criteria) this;
        }

        public Criteria andWeightTwoNotEqualTo(String value) {
            addCriterion("weight_two <>", value, "weightTwo");
            return (Criteria) this;
        }

        public Criteria andWeightTwoGreaterThan(String value) {
            addCriterion("weight_two >", value, "weightTwo");
            return (Criteria) this;
        }

        public Criteria andWeightTwoGreaterThanOrEqualTo(String value) {
            addCriterion("weight_two >=", value, "weightTwo");
            return (Criteria) this;
        }

        public Criteria andWeightTwoLessThan(String value) {
            addCriterion("weight_two <", value, "weightTwo");
            return (Criteria) this;
        }

        public Criteria andWeightTwoLessThanOrEqualTo(String value) {
            addCriterion("weight_two <=", value, "weightTwo");
            return (Criteria) this;
        }

        public Criteria andWeightTwoLike(String value) {
            addCriterion("weight_two like", value, "weightTwo");
            return (Criteria) this;
        }

        public Criteria andWeightTwoNotLike(String value) {
            addCriterion("weight_two not like", value, "weightTwo");
            return (Criteria) this;
        }

        public Criteria andWeightTwoIn(List<String> values) {
            addCriterion("weight_two in", values, "weightTwo");
            return (Criteria) this;
        }

        public Criteria andWeightTwoNotIn(List<String> values) {
            addCriterion("weight_two not in", values, "weightTwo");
            return (Criteria) this;
        }

        public Criteria andWeightTwoBetween(String value1, String value2) {
            addCriterion("weight_two between", value1, value2, "weightTwo");
            return (Criteria) this;
        }

        public Criteria andWeightTwoNotBetween(String value1, String value2) {
            addCriterion("weight_two not between", value1, value2, "weightTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTotalTwoIsNull() {
            addCriterion("freight_total_two is null");
            return (Criteria) this;
        }

        public Criteria andFreightTotalTwoIsNotNull() {
            addCriterion("freight_total_two is not null");
            return (Criteria) this;
        }

        public Criteria andFreightTotalTwoEqualTo(String value) {
            addCriterion("freight_total_two =", value, "freightTotalTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTotalTwoNotEqualTo(String value) {
            addCriterion("freight_total_two <>", value, "freightTotalTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTotalTwoGreaterThan(String value) {
            addCriterion("freight_total_two >", value, "freightTotalTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTotalTwoGreaterThanOrEqualTo(String value) {
            addCriterion("freight_total_two >=", value, "freightTotalTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTotalTwoLessThan(String value) {
            addCriterion("freight_total_two <", value, "freightTotalTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTotalTwoLessThanOrEqualTo(String value) {
            addCriterion("freight_total_two <=", value, "freightTotalTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTotalTwoLike(String value) {
            addCriterion("freight_total_two like", value, "freightTotalTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTotalTwoNotLike(String value) {
            addCriterion("freight_total_two not like", value, "freightTotalTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTotalTwoIn(List<String> values) {
            addCriterion("freight_total_two in", values, "freightTotalTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTotalTwoNotIn(List<String> values) {
            addCriterion("freight_total_two not in", values, "freightTotalTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTotalTwoBetween(String value1, String value2) {
            addCriterion("freight_total_two between", value1, value2, "freightTotalTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTotalTwoNotBetween(String value1, String value2) {
            addCriterion("freight_total_two not between", value1, value2, "freightTotalTwo");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyTwoIsNull() {
            addCriterion("received_money_two is null");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyTwoIsNotNull() {
            addCriterion("received_money_two is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyTwoEqualTo(String value) {
            addCriterion("received_money_two =", value, "receivedMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyTwoNotEqualTo(String value) {
            addCriterion("received_money_two <>", value, "receivedMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyTwoGreaterThan(String value) {
            addCriterion("received_money_two >", value, "receivedMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyTwoGreaterThanOrEqualTo(String value) {
            addCriterion("received_money_two >=", value, "receivedMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyTwoLessThan(String value) {
            addCriterion("received_money_two <", value, "receivedMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyTwoLessThanOrEqualTo(String value) {
            addCriterion("received_money_two <=", value, "receivedMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyTwoLike(String value) {
            addCriterion("received_money_two like", value, "receivedMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyTwoNotLike(String value) {
            addCriterion("received_money_two not like", value, "receivedMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyTwoIn(List<String> values) {
            addCriterion("received_money_two in", values, "receivedMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyTwoNotIn(List<String> values) {
            addCriterion("received_money_two not in", values, "receivedMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyTwoBetween(String value1, String value2) {
            addCriterion("received_money_two between", value1, value2, "receivedMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyTwoNotBetween(String value1, String value2) {
            addCriterion("received_money_two not between", value1, value2, "receivedMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyTwoIsNull() {
            addCriterion("debt_money_two is null");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyTwoIsNotNull() {
            addCriterion("debt_money_two is not null");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyTwoEqualTo(String value) {
            addCriterion("debt_money_two =", value, "debtMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyTwoNotEqualTo(String value) {
            addCriterion("debt_money_two <>", value, "debtMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyTwoGreaterThan(String value) {
            addCriterion("debt_money_two >", value, "debtMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyTwoGreaterThanOrEqualTo(String value) {
            addCriterion("debt_money_two >=", value, "debtMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyTwoLessThan(String value) {
            addCriterion("debt_money_two <", value, "debtMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyTwoLessThanOrEqualTo(String value) {
            addCriterion("debt_money_two <=", value, "debtMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyTwoLike(String value) {
            addCriterion("debt_money_two like", value, "debtMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyTwoNotLike(String value) {
            addCriterion("debt_money_two not like", value, "debtMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyTwoIn(List<String> values) {
            addCriterion("debt_money_two in", values, "debtMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyTwoNotIn(List<String> values) {
            addCriterion("debt_money_two not in", values, "debtMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyTwoBetween(String value1, String value2) {
            addCriterion("debt_money_two between", value1, value2, "debtMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andDebtMoneyTwoNotBetween(String value1, String value2) {
            addCriterion("debt_money_two not between", value1, value2, "debtMoneyTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTwoIsNull() {
            addCriterion("freight_two is null");
            return (Criteria) this;
        }

        public Criteria andFreightTwoIsNotNull() {
            addCriterion("freight_two is not null");
            return (Criteria) this;
        }

        public Criteria andFreightTwoEqualTo(String value) {
            addCriterion("freight_two =", value, "freightTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTwoNotEqualTo(String value) {
            addCriterion("freight_two <>", value, "freightTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTwoGreaterThan(String value) {
            addCriterion("freight_two >", value, "freightTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTwoGreaterThanOrEqualTo(String value) {
            addCriterion("freight_two >=", value, "freightTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTwoLessThan(String value) {
            addCriterion("freight_two <", value, "freightTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTwoLessThanOrEqualTo(String value) {
            addCriterion("freight_two <=", value, "freightTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTwoLike(String value) {
            addCriterion("freight_two like", value, "freightTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTwoNotLike(String value) {
            addCriterion("freight_two not like", value, "freightTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTwoIn(List<String> values) {
            addCriterion("freight_two in", values, "freightTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTwoNotIn(List<String> values) {
            addCriterion("freight_two not in", values, "freightTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTwoBetween(String value1, String value2) {
            addCriterion("freight_two between", value1, value2, "freightTwo");
            return (Criteria) this;
        }

        public Criteria andFreightTwoNotBetween(String value1, String value2) {
            addCriterion("freight_two not between", value1, value2, "freightTwo");
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