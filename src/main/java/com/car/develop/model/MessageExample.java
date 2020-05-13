package com.car.develop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author  zxs
 * @date  2020/5/13 4:35 下午
 */
public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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

        public Criteria andSitemesIdIsNull() {
            addCriterion("siteMes_id is null");
            return (Criteria) this;
        }

        public Criteria andSitemesIdIsNotNull() {
            addCriterion("siteMes_id is not null");
            return (Criteria) this;
        }

        public Criteria andSitemesIdEqualTo(String value) {
            addCriterion("siteMes_id =", value, "sitemesId");
            return (Criteria) this;
        }

        public Criteria andSitemesIdNotEqualTo(String value) {
            addCriterion("siteMes_id <>", value, "sitemesId");
            return (Criteria) this;
        }

        public Criteria andSitemesIdGreaterThan(String value) {
            addCriterion("siteMes_id >", value, "sitemesId");
            return (Criteria) this;
        }

        public Criteria andSitemesIdGreaterThanOrEqualTo(String value) {
            addCriterion("siteMes_id >=", value, "sitemesId");
            return (Criteria) this;
        }

        public Criteria andSitemesIdLessThan(String value) {
            addCriterion("siteMes_id <", value, "sitemesId");
            return (Criteria) this;
        }

        public Criteria andSitemesIdLessThanOrEqualTo(String value) {
            addCriterion("siteMes_id <=", value, "sitemesId");
            return (Criteria) this;
        }

        public Criteria andSitemesIdLike(String value) {
            addCriterion("siteMes_id like", value, "sitemesId");
            return (Criteria) this;
        }

        public Criteria andSitemesIdNotLike(String value) {
            addCriterion("siteMes_id not like", value, "sitemesId");
            return (Criteria) this;
        }

        public Criteria andSitemesIdIn(List<String> values) {
            addCriterion("siteMes_id in", values, "sitemesId");
            return (Criteria) this;
        }

        public Criteria andSitemesIdNotIn(List<String> values) {
            addCriterion("siteMes_id not in", values, "sitemesId");
            return (Criteria) this;
        }

        public Criteria andSitemesIdBetween(String value1, String value2) {
            addCriterion("siteMes_id between", value1, value2, "sitemesId");
            return (Criteria) this;
        }

        public Criteria andSitemesIdNotBetween(String value1, String value2) {
            addCriterion("siteMes_id not between", value1, value2, "sitemesId");
            return (Criteria) this;
        }

        public Criteria andFuelChargeIsNull() {
            addCriterion("fuel_charge is null");
            return (Criteria) this;
        }

        public Criteria andFuelChargeIsNotNull() {
            addCriterion("fuel_charge is not null");
            return (Criteria) this;
        }

        public Criteria andFuelChargeEqualTo(String value) {
            addCriterion("fuel_charge =", value, "fuelCharge");
            return (Criteria) this;
        }

        public Criteria andFuelChargeNotEqualTo(String value) {
            addCriterion("fuel_charge <>", value, "fuelCharge");
            return (Criteria) this;
        }

        public Criteria andFuelChargeGreaterThan(String value) {
            addCriterion("fuel_charge >", value, "fuelCharge");
            return (Criteria) this;
        }

        public Criteria andFuelChargeGreaterThanOrEqualTo(String value) {
            addCriterion("fuel_charge >=", value, "fuelCharge");
            return (Criteria) this;
        }

        public Criteria andFuelChargeLessThan(String value) {
            addCriterion("fuel_charge <", value, "fuelCharge");
            return (Criteria) this;
        }

        public Criteria andFuelChargeLessThanOrEqualTo(String value) {
            addCriterion("fuel_charge <=", value, "fuelCharge");
            return (Criteria) this;
        }

        public Criteria andFuelChargeLike(String value) {
            addCriterion("fuel_charge like", value, "fuelCharge");
            return (Criteria) this;
        }

        public Criteria andFuelChargeNotLike(String value) {
            addCriterion("fuel_charge not like", value, "fuelCharge");
            return (Criteria) this;
        }

        public Criteria andFuelChargeIn(List<String> values) {
            addCriterion("fuel_charge in", values, "fuelCharge");
            return (Criteria) this;
        }

        public Criteria andFuelChargeNotIn(List<String> values) {
            addCriterion("fuel_charge not in", values, "fuelCharge");
            return (Criteria) this;
        }

        public Criteria andFuelChargeBetween(String value1, String value2) {
            addCriterion("fuel_charge between", value1, value2, "fuelCharge");
            return (Criteria) this;
        }

        public Criteria andFuelChargeNotBetween(String value1, String value2) {
            addCriterion("fuel_charge not between", value1, value2, "fuelCharge");
            return (Criteria) this;
        }

        public Criteria andTollIsNull() {
            addCriterion("toll is null");
            return (Criteria) this;
        }

        public Criteria andTollIsNotNull() {
            addCriterion("toll is not null");
            return (Criteria) this;
        }

        public Criteria andTollEqualTo(String value) {
            addCriterion("toll =", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollNotEqualTo(String value) {
            addCriterion("toll <>", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollGreaterThan(String value) {
            addCriterion("toll >", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollGreaterThanOrEqualTo(String value) {
            addCriterion("toll >=", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollLessThan(String value) {
            addCriterion("toll <", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollLessThanOrEqualTo(String value) {
            addCriterion("toll <=", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollLike(String value) {
            addCriterion("toll like", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollNotLike(String value) {
            addCriterion("toll not like", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollIn(List<String> values) {
            addCriterion("toll in", values, "toll");
            return (Criteria) this;
        }

        public Criteria andTollNotIn(List<String> values) {
            addCriterion("toll not in", values, "toll");
            return (Criteria) this;
        }

        public Criteria andTollBetween(String value1, String value2) {
            addCriterion("toll between", value1, value2, "toll");
            return (Criteria) this;
        }

        public Criteria andTollNotBetween(String value1, String value2) {
            addCriterion("toll not between", value1, value2, "toll");
            return (Criteria) this;
        }

        public Criteria andFineIsNull() {
            addCriterion("fine is null");
            return (Criteria) this;
        }

        public Criteria andFineIsNotNull() {
            addCriterion("fine is not null");
            return (Criteria) this;
        }

        public Criteria andFineEqualTo(String value) {
            addCriterion("fine =", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotEqualTo(String value) {
            addCriterion("fine <>", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThan(String value) {
            addCriterion("fine >", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThanOrEqualTo(String value) {
            addCriterion("fine >=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThan(String value) {
            addCriterion("fine <", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThanOrEqualTo(String value) {
            addCriterion("fine <=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLike(String value) {
            addCriterion("fine like", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotLike(String value) {
            addCriterion("fine not like", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineIn(List<String> values) {
            addCriterion("fine in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotIn(List<String> values) {
            addCriterion("fine not in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineBetween(String value1, String value2) {
            addCriterion("fine between", value1, value2, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotBetween(String value1, String value2) {
            addCriterion("fine not between", value1, value2, "fine");
            return (Criteria) this;
        }

        public Criteria andEatMoneyIsNull() {
            addCriterion("eat_money is null");
            return (Criteria) this;
        }

        public Criteria andEatMoneyIsNotNull() {
            addCriterion("eat_money is not null");
            return (Criteria) this;
        }

        public Criteria andEatMoneyEqualTo(String value) {
            addCriterion("eat_money =", value, "eatMoney");
            return (Criteria) this;
        }

        public Criteria andEatMoneyNotEqualTo(String value) {
            addCriterion("eat_money <>", value, "eatMoney");
            return (Criteria) this;
        }

        public Criteria andEatMoneyGreaterThan(String value) {
            addCriterion("eat_money >", value, "eatMoney");
            return (Criteria) this;
        }

        public Criteria andEatMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("eat_money >=", value, "eatMoney");
            return (Criteria) this;
        }

        public Criteria andEatMoneyLessThan(String value) {
            addCriterion("eat_money <", value, "eatMoney");
            return (Criteria) this;
        }

        public Criteria andEatMoneyLessThanOrEqualTo(String value) {
            addCriterion("eat_money <=", value, "eatMoney");
            return (Criteria) this;
        }

        public Criteria andEatMoneyLike(String value) {
            addCriterion("eat_money like", value, "eatMoney");
            return (Criteria) this;
        }

        public Criteria andEatMoneyNotLike(String value) {
            addCriterion("eat_money not like", value, "eatMoney");
            return (Criteria) this;
        }

        public Criteria andEatMoneyIn(List<String> values) {
            addCriterion("eat_money in", values, "eatMoney");
            return (Criteria) this;
        }

        public Criteria andEatMoneyNotIn(List<String> values) {
            addCriterion("eat_money not in", values, "eatMoney");
            return (Criteria) this;
        }

        public Criteria andEatMoneyBetween(String value1, String value2) {
            addCriterion("eat_money between", value1, value2, "eatMoney");
            return (Criteria) this;
        }

        public Criteria andEatMoneyNotBetween(String value1, String value2) {
            addCriterion("eat_money not between", value1, value2, "eatMoney");
            return (Criteria) this;
        }

        public Criteria andHotelMoneyIsNull() {
            addCriterion("hotel_money is null");
            return (Criteria) this;
        }

        public Criteria andHotelMoneyIsNotNull() {
            addCriterion("hotel_money is not null");
            return (Criteria) this;
        }

        public Criteria andHotelMoneyEqualTo(String value) {
            addCriterion("hotel_money =", value, "hotelMoney");
            return (Criteria) this;
        }

        public Criteria andHotelMoneyNotEqualTo(String value) {
            addCriterion("hotel_money <>", value, "hotelMoney");
            return (Criteria) this;
        }

        public Criteria andHotelMoneyGreaterThan(String value) {
            addCriterion("hotel_money >", value, "hotelMoney");
            return (Criteria) this;
        }

        public Criteria andHotelMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_money >=", value, "hotelMoney");
            return (Criteria) this;
        }

        public Criteria andHotelMoneyLessThan(String value) {
            addCriterion("hotel_money <", value, "hotelMoney");
            return (Criteria) this;
        }

        public Criteria andHotelMoneyLessThanOrEqualTo(String value) {
            addCriterion("hotel_money <=", value, "hotelMoney");
            return (Criteria) this;
        }

        public Criteria andHotelMoneyLike(String value) {
            addCriterion("hotel_money like", value, "hotelMoney");
            return (Criteria) this;
        }

        public Criteria andHotelMoneyNotLike(String value) {
            addCriterion("hotel_money not like", value, "hotelMoney");
            return (Criteria) this;
        }

        public Criteria andHotelMoneyIn(List<String> values) {
            addCriterion("hotel_money in", values, "hotelMoney");
            return (Criteria) this;
        }

        public Criteria andHotelMoneyNotIn(List<String> values) {
            addCriterion("hotel_money not in", values, "hotelMoney");
            return (Criteria) this;
        }

        public Criteria andHotelMoneyBetween(String value1, String value2) {
            addCriterion("hotel_money between", value1, value2, "hotelMoney");
            return (Criteria) this;
        }

        public Criteria andHotelMoneyNotBetween(String value1, String value2) {
            addCriterion("hotel_money not between", value1, value2, "hotelMoney");
            return (Criteria) this;
        }

        public Criteria andMessageMoneyIsNull() {
            addCriterion("message_money is null");
            return (Criteria) this;
        }

        public Criteria andMessageMoneyIsNotNull() {
            addCriterion("message_money is not null");
            return (Criteria) this;
        }

        public Criteria andMessageMoneyEqualTo(String value) {
            addCriterion("message_money =", value, "messageMoney");
            return (Criteria) this;
        }

        public Criteria andMessageMoneyNotEqualTo(String value) {
            addCriterion("message_money <>", value, "messageMoney");
            return (Criteria) this;
        }

        public Criteria andMessageMoneyGreaterThan(String value) {
            addCriterion("message_money >", value, "messageMoney");
            return (Criteria) this;
        }

        public Criteria andMessageMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("message_money >=", value, "messageMoney");
            return (Criteria) this;
        }

        public Criteria andMessageMoneyLessThan(String value) {
            addCriterion("message_money <", value, "messageMoney");
            return (Criteria) this;
        }

        public Criteria andMessageMoneyLessThanOrEqualTo(String value) {
            addCriterion("message_money <=", value, "messageMoney");
            return (Criteria) this;
        }

        public Criteria andMessageMoneyLike(String value) {
            addCriterion("message_money like", value, "messageMoney");
            return (Criteria) this;
        }

        public Criteria andMessageMoneyNotLike(String value) {
            addCriterion("message_money not like", value, "messageMoney");
            return (Criteria) this;
        }

        public Criteria andMessageMoneyIn(List<String> values) {
            addCriterion("message_money in", values, "messageMoney");
            return (Criteria) this;
        }

        public Criteria andMessageMoneyNotIn(List<String> values) {
            addCriterion("message_money not in", values, "messageMoney");
            return (Criteria) this;
        }

        public Criteria andMessageMoneyBetween(String value1, String value2) {
            addCriterion("message_money between", value1, value2, "messageMoney");
            return (Criteria) this;
        }

        public Criteria andMessageMoneyNotBetween(String value1, String value2) {
            addCriterion("message_money not between", value1, value2, "messageMoney");
            return (Criteria) this;
        }

        public Criteria andCoalMoneyIsNull() {
            addCriterion("coal_money is null");
            return (Criteria) this;
        }

        public Criteria andCoalMoneyIsNotNull() {
            addCriterion("coal_money is not null");
            return (Criteria) this;
        }

        public Criteria andCoalMoneyEqualTo(String value) {
            addCriterion("coal_money =", value, "coalMoney");
            return (Criteria) this;
        }

        public Criteria andCoalMoneyNotEqualTo(String value) {
            addCriterion("coal_money <>", value, "coalMoney");
            return (Criteria) this;
        }

        public Criteria andCoalMoneyGreaterThan(String value) {
            addCriterion("coal_money >", value, "coalMoney");
            return (Criteria) this;
        }

        public Criteria andCoalMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("coal_money >=", value, "coalMoney");
            return (Criteria) this;
        }

        public Criteria andCoalMoneyLessThan(String value) {
            addCriterion("coal_money <", value, "coalMoney");
            return (Criteria) this;
        }

        public Criteria andCoalMoneyLessThanOrEqualTo(String value) {
            addCriterion("coal_money <=", value, "coalMoney");
            return (Criteria) this;
        }

        public Criteria andCoalMoneyLike(String value) {
            addCriterion("coal_money like", value, "coalMoney");
            return (Criteria) this;
        }

        public Criteria andCoalMoneyNotLike(String value) {
            addCriterion("coal_money not like", value, "coalMoney");
            return (Criteria) this;
        }

        public Criteria andCoalMoneyIn(List<String> values) {
            addCriterion("coal_money in", values, "coalMoney");
            return (Criteria) this;
        }

        public Criteria andCoalMoneyNotIn(List<String> values) {
            addCriterion("coal_money not in", values, "coalMoney");
            return (Criteria) this;
        }

        public Criteria andCoalMoneyBetween(String value1, String value2) {
            addCriterion("coal_money between", value1, value2, "coalMoney");
            return (Criteria) this;
        }

        public Criteria andCoalMoneyNotBetween(String value1, String value2) {
            addCriterion("coal_money not between", value1, value2, "coalMoney");
            return (Criteria) this;
        }

        public Criteria andHandMoneyIsNull() {
            addCriterion("hand_money is null");
            return (Criteria) this;
        }

        public Criteria andHandMoneyIsNotNull() {
            addCriterion("hand_money is not null");
            return (Criteria) this;
        }

        public Criteria andHandMoneyEqualTo(String value) {
            addCriterion("hand_money =", value, "handMoney");
            return (Criteria) this;
        }

        public Criteria andHandMoneyNotEqualTo(String value) {
            addCriterion("hand_money <>", value, "handMoney");
            return (Criteria) this;
        }

        public Criteria andHandMoneyGreaterThan(String value) {
            addCriterion("hand_money >", value, "handMoney");
            return (Criteria) this;
        }

        public Criteria andHandMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("hand_money >=", value, "handMoney");
            return (Criteria) this;
        }

        public Criteria andHandMoneyLessThan(String value) {
            addCriterion("hand_money <", value, "handMoney");
            return (Criteria) this;
        }

        public Criteria andHandMoneyLessThanOrEqualTo(String value) {
            addCriterion("hand_money <=", value, "handMoney");
            return (Criteria) this;
        }

        public Criteria andHandMoneyLike(String value) {
            addCriterion("hand_money like", value, "handMoney");
            return (Criteria) this;
        }

        public Criteria andHandMoneyNotLike(String value) {
            addCriterion("hand_money not like", value, "handMoney");
            return (Criteria) this;
        }

        public Criteria andHandMoneyIn(List<String> values) {
            addCriterion("hand_money in", values, "handMoney");
            return (Criteria) this;
        }

        public Criteria andHandMoneyNotIn(List<String> values) {
            addCriterion("hand_money not in", values, "handMoney");
            return (Criteria) this;
        }

        public Criteria andHandMoneyBetween(String value1, String value2) {
            addCriterion("hand_money between", value1, value2, "handMoney");
            return (Criteria) this;
        }

        public Criteria andHandMoneyNotBetween(String value1, String value2) {
            addCriterion("hand_money not between", value1, value2, "handMoney");
            return (Criteria) this;
        }

        public Criteria andRepairCarMoneyIsNull() {
            addCriterion("repair_car_money is null");
            return (Criteria) this;
        }

        public Criteria andRepairCarMoneyIsNotNull() {
            addCriterion("repair_car_money is not null");
            return (Criteria) this;
        }

        public Criteria andRepairCarMoneyEqualTo(String value) {
            addCriterion("repair_car_money =", value, "repairCarMoney");
            return (Criteria) this;
        }

        public Criteria andRepairCarMoneyNotEqualTo(String value) {
            addCriterion("repair_car_money <>", value, "repairCarMoney");
            return (Criteria) this;
        }

        public Criteria andRepairCarMoneyGreaterThan(String value) {
            addCriterion("repair_car_money >", value, "repairCarMoney");
            return (Criteria) this;
        }

        public Criteria andRepairCarMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("repair_car_money >=", value, "repairCarMoney");
            return (Criteria) this;
        }

        public Criteria andRepairCarMoneyLessThan(String value) {
            addCriterion("repair_car_money <", value, "repairCarMoney");
            return (Criteria) this;
        }

        public Criteria andRepairCarMoneyLessThanOrEqualTo(String value) {
            addCriterion("repair_car_money <=", value, "repairCarMoney");
            return (Criteria) this;
        }

        public Criteria andRepairCarMoneyLike(String value) {
            addCriterion("repair_car_money like", value, "repairCarMoney");
            return (Criteria) this;
        }

        public Criteria andRepairCarMoneyNotLike(String value) {
            addCriterion("repair_car_money not like", value, "repairCarMoney");
            return (Criteria) this;
        }

        public Criteria andRepairCarMoneyIn(List<String> values) {
            addCriterion("repair_car_money in", values, "repairCarMoney");
            return (Criteria) this;
        }

        public Criteria andRepairCarMoneyNotIn(List<String> values) {
            addCriterion("repair_car_money not in", values, "repairCarMoney");
            return (Criteria) this;
        }

        public Criteria andRepairCarMoneyBetween(String value1, String value2) {
            addCriterion("repair_car_money between", value1, value2, "repairCarMoney");
            return (Criteria) this;
        }

        public Criteria andRepairCarMoneyNotBetween(String value1, String value2) {
            addCriterion("repair_car_money not between", value1, value2, "repairCarMoney");
            return (Criteria) this;
        }

        public Criteria andElseCostIsNull() {
            addCriterion("else_cost is null");
            return (Criteria) this;
        }

        public Criteria andElseCostIsNotNull() {
            addCriterion("else_cost is not null");
            return (Criteria) this;
        }

        public Criteria andElseCostEqualTo(String value) {
            addCriterion("else_cost =", value, "elseCost");
            return (Criteria) this;
        }

        public Criteria andElseCostNotEqualTo(String value) {
            addCriterion("else_cost <>", value, "elseCost");
            return (Criteria) this;
        }

        public Criteria andElseCostGreaterThan(String value) {
            addCriterion("else_cost >", value, "elseCost");
            return (Criteria) this;
        }

        public Criteria andElseCostGreaterThanOrEqualTo(String value) {
            addCriterion("else_cost >=", value, "elseCost");
            return (Criteria) this;
        }

        public Criteria andElseCostLessThan(String value) {
            addCriterion("else_cost <", value, "elseCost");
            return (Criteria) this;
        }

        public Criteria andElseCostLessThanOrEqualTo(String value) {
            addCriterion("else_cost <=", value, "elseCost");
            return (Criteria) this;
        }

        public Criteria andElseCostLike(String value) {
            addCriterion("else_cost like", value, "elseCost");
            return (Criteria) this;
        }

        public Criteria andElseCostNotLike(String value) {
            addCriterion("else_cost not like", value, "elseCost");
            return (Criteria) this;
        }

        public Criteria andElseCostIn(List<String> values) {
            addCriterion("else_cost in", values, "elseCost");
            return (Criteria) this;
        }

        public Criteria andElseCostNotIn(List<String> values) {
            addCriterion("else_cost not in", values, "elseCost");
            return (Criteria) this;
        }

        public Criteria andElseCostBetween(String value1, String value2) {
            addCriterion("else_cost between", value1, value2, "elseCost");
            return (Criteria) this;
        }

        public Criteria andElseCostNotBetween(String value1, String value2) {
            addCriterion("else_cost not between", value1, value2, "elseCost");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("`comment` is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("`comment` is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("`comment` =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("`comment` <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("`comment` >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("`comment` >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("`comment` <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("`comment` <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("`comment` like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("`comment` not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("`comment` in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("`comment` not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("`comment` between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("`comment` not between", value1, value2, "comment");
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