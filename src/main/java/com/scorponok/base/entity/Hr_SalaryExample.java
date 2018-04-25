package com.scorponok.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hr_SalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Hr_SalaryExample() {
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

        public Criteria andSalaryIdIsNull() {
            addCriterion("salary_id is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIdIsNotNull() {
            addCriterion("salary_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryIdEqualTo(Long value) {
            addCriterion("salary_id =", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotEqualTo(Long value) {
            addCriterion("salary_id <>", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdGreaterThan(Long value) {
            addCriterion("salary_id >", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("salary_id >=", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdLessThan(Long value) {
            addCriterion("salary_id <", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdLessThanOrEqualTo(Long value) {
            addCriterion("salary_id <=", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdIn(List<Long> values) {
            addCriterion("salary_id in", values, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotIn(List<Long> values) {
            addCriterion("salary_id not in", values, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdBetween(Long value1, Long value2) {
            addCriterion("salary_id between", value1, value2, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotBetween(Long value1, Long value2) {
            addCriterion("salary_id not between", value1, value2, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryBasicIsNull() {
            addCriterion("salary_basic is null");
            return (Criteria) this;
        }

        public Criteria andSalaryBasicIsNotNull() {
            addCriterion("salary_basic is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryBasicEqualTo(Double value) {
            addCriterion("salary_basic =", value, "salaryBasic");
            return (Criteria) this;
        }

        public Criteria andSalaryBasicNotEqualTo(Double value) {
            addCriterion("salary_basic <>", value, "salaryBasic");
            return (Criteria) this;
        }

        public Criteria andSalaryBasicGreaterThan(Double value) {
            addCriterion("salary_basic >", value, "salaryBasic");
            return (Criteria) this;
        }

        public Criteria andSalaryBasicGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_basic >=", value, "salaryBasic");
            return (Criteria) this;
        }

        public Criteria andSalaryBasicLessThan(Double value) {
            addCriterion("salary_basic <", value, "salaryBasic");
            return (Criteria) this;
        }

        public Criteria andSalaryBasicLessThanOrEqualTo(Double value) {
            addCriterion("salary_basic <=", value, "salaryBasic");
            return (Criteria) this;
        }

        public Criteria andSalaryBasicIn(List<Double> values) {
            addCriterion("salary_basic in", values, "salaryBasic");
            return (Criteria) this;
        }

        public Criteria andSalaryBasicNotIn(List<Double> values) {
            addCriterion("salary_basic not in", values, "salaryBasic");
            return (Criteria) this;
        }

        public Criteria andSalaryBasicBetween(Double value1, Double value2) {
            addCriterion("salary_basic between", value1, value2, "salaryBasic");
            return (Criteria) this;
        }

        public Criteria andSalaryBasicNotBetween(Double value1, Double value2) {
            addCriterion("salary_basic not between", value1, value2, "salaryBasic");
            return (Criteria) this;
        }

        public Criteria andSalaryRankIsNull() {
            addCriterion("salary_rank is null");
            return (Criteria) this;
        }

        public Criteria andSalaryRankIsNotNull() {
            addCriterion("salary_rank is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryRankEqualTo(Double value) {
            addCriterion("salary_rank =", value, "salaryRank");
            return (Criteria) this;
        }

        public Criteria andSalaryRankNotEqualTo(Double value) {
            addCriterion("salary_rank <>", value, "salaryRank");
            return (Criteria) this;
        }

        public Criteria andSalaryRankGreaterThan(Double value) {
            addCriterion("salary_rank >", value, "salaryRank");
            return (Criteria) this;
        }

        public Criteria andSalaryRankGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_rank >=", value, "salaryRank");
            return (Criteria) this;
        }

        public Criteria andSalaryRankLessThan(Double value) {
            addCriterion("salary_rank <", value, "salaryRank");
            return (Criteria) this;
        }

        public Criteria andSalaryRankLessThanOrEqualTo(Double value) {
            addCriterion("salary_rank <=", value, "salaryRank");
            return (Criteria) this;
        }

        public Criteria andSalaryRankIn(List<Double> values) {
            addCriterion("salary_rank in", values, "salaryRank");
            return (Criteria) this;
        }

        public Criteria andSalaryRankNotIn(List<Double> values) {
            addCriterion("salary_rank not in", values, "salaryRank");
            return (Criteria) this;
        }

        public Criteria andSalaryRankBetween(Double value1, Double value2) {
            addCriterion("salary_rank between", value1, value2, "salaryRank");
            return (Criteria) this;
        }

        public Criteria andSalaryRankNotBetween(Double value1, Double value2) {
            addCriterion("salary_rank not between", value1, value2, "salaryRank");
            return (Criteria) this;
        }

        public Criteria andSalaryAreaIsNull() {
            addCriterion("salary_area is null");
            return (Criteria) this;
        }

        public Criteria andSalaryAreaIsNotNull() {
            addCriterion("salary_area is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryAreaEqualTo(Double value) {
            addCriterion("salary_area =", value, "salaryArea");
            return (Criteria) this;
        }

        public Criteria andSalaryAreaNotEqualTo(Double value) {
            addCriterion("salary_area <>", value, "salaryArea");
            return (Criteria) this;
        }

        public Criteria andSalaryAreaGreaterThan(Double value) {
            addCriterion("salary_area >", value, "salaryArea");
            return (Criteria) this;
        }

        public Criteria andSalaryAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_area >=", value, "salaryArea");
            return (Criteria) this;
        }

        public Criteria andSalaryAreaLessThan(Double value) {
            addCriterion("salary_area <", value, "salaryArea");
            return (Criteria) this;
        }

        public Criteria andSalaryAreaLessThanOrEqualTo(Double value) {
            addCriterion("salary_area <=", value, "salaryArea");
            return (Criteria) this;
        }

        public Criteria andSalaryAreaIn(List<Double> values) {
            addCriterion("salary_area in", values, "salaryArea");
            return (Criteria) this;
        }

        public Criteria andSalaryAreaNotIn(List<Double> values) {
            addCriterion("salary_area not in", values, "salaryArea");
            return (Criteria) this;
        }

        public Criteria andSalaryAreaBetween(Double value1, Double value2) {
            addCriterion("salary_area between", value1, value2, "salaryArea");
            return (Criteria) this;
        }

        public Criteria andSalaryAreaNotBetween(Double value1, Double value2) {
            addCriterion("salary_area not between", value1, value2, "salaryArea");
            return (Criteria) this;
        }

        public Criteria andSalaryBonusIsNull() {
            addCriterion("salary_bonus is null");
            return (Criteria) this;
        }

        public Criteria andSalaryBonusIsNotNull() {
            addCriterion("salary_bonus is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryBonusEqualTo(Double value) {
            addCriterion("salary_bonus =", value, "salaryBonus");
            return (Criteria) this;
        }

        public Criteria andSalaryBonusNotEqualTo(Double value) {
            addCriterion("salary_bonus <>", value, "salaryBonus");
            return (Criteria) this;
        }

        public Criteria andSalaryBonusGreaterThan(Double value) {
            addCriterion("salary_bonus >", value, "salaryBonus");
            return (Criteria) this;
        }

        public Criteria andSalaryBonusGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_bonus >=", value, "salaryBonus");
            return (Criteria) this;
        }

        public Criteria andSalaryBonusLessThan(Double value) {
            addCriterion("salary_bonus <", value, "salaryBonus");
            return (Criteria) this;
        }

        public Criteria andSalaryBonusLessThanOrEqualTo(Double value) {
            addCriterion("salary_bonus <=", value, "salaryBonus");
            return (Criteria) this;
        }

        public Criteria andSalaryBonusIn(List<Double> values) {
            addCriterion("salary_bonus in", values, "salaryBonus");
            return (Criteria) this;
        }

        public Criteria andSalaryBonusNotIn(List<Double> values) {
            addCriterion("salary_bonus not in", values, "salaryBonus");
            return (Criteria) this;
        }

        public Criteria andSalaryBonusBetween(Double value1, Double value2) {
            addCriterion("salary_bonus between", value1, value2, "salaryBonus");
            return (Criteria) this;
        }

        public Criteria andSalaryBonusNotBetween(Double value1, Double value2) {
            addCriterion("salary_bonus not between", value1, value2, "salaryBonus");
            return (Criteria) this;
        }

        public Criteria andSalaryTrafficIsNull() {
            addCriterion("salary_traffic is null");
            return (Criteria) this;
        }

        public Criteria andSalaryTrafficIsNotNull() {
            addCriterion("salary_traffic is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryTrafficEqualTo(Double value) {
            addCriterion("salary_traffic =", value, "salaryTraffic");
            return (Criteria) this;
        }

        public Criteria andSalaryTrafficNotEqualTo(Double value) {
            addCriterion("salary_traffic <>", value, "salaryTraffic");
            return (Criteria) this;
        }

        public Criteria andSalaryTrafficGreaterThan(Double value) {
            addCriterion("salary_traffic >", value, "salaryTraffic");
            return (Criteria) this;
        }

        public Criteria andSalaryTrafficGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_traffic >=", value, "salaryTraffic");
            return (Criteria) this;
        }

        public Criteria andSalaryTrafficLessThan(Double value) {
            addCriterion("salary_traffic <", value, "salaryTraffic");
            return (Criteria) this;
        }

        public Criteria andSalaryTrafficLessThanOrEqualTo(Double value) {
            addCriterion("salary_traffic <=", value, "salaryTraffic");
            return (Criteria) this;
        }

        public Criteria andSalaryTrafficIn(List<Double> values) {
            addCriterion("salary_traffic in", values, "salaryTraffic");
            return (Criteria) this;
        }

        public Criteria andSalaryTrafficNotIn(List<Double> values) {
            addCriterion("salary_traffic not in", values, "salaryTraffic");
            return (Criteria) this;
        }

        public Criteria andSalaryTrafficBetween(Double value1, Double value2) {
            addCriterion("salary_traffic between", value1, value2, "salaryTraffic");
            return (Criteria) this;
        }

        public Criteria andSalaryTrafficNotBetween(Double value1, Double value2) {
            addCriterion("salary_traffic not between", value1, value2, "salaryTraffic");
            return (Criteria) this;
        }

        public Criteria andSalaryMealSubsidyIsNull() {
            addCriterion("salary_meal_subsidy is null");
            return (Criteria) this;
        }

        public Criteria andSalaryMealSubsidyIsNotNull() {
            addCriterion("salary_meal_subsidy is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryMealSubsidyEqualTo(Double value) {
            addCriterion("salary_meal_subsidy =", value, "salaryMealSubsidy");
            return (Criteria) this;
        }

        public Criteria andSalaryMealSubsidyNotEqualTo(Double value) {
            addCriterion("salary_meal_subsidy <>", value, "salaryMealSubsidy");
            return (Criteria) this;
        }

        public Criteria andSalaryMealSubsidyGreaterThan(Double value) {
            addCriterion("salary_meal_subsidy >", value, "salaryMealSubsidy");
            return (Criteria) this;
        }

        public Criteria andSalaryMealSubsidyGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_meal_subsidy >=", value, "salaryMealSubsidy");
            return (Criteria) this;
        }

        public Criteria andSalaryMealSubsidyLessThan(Double value) {
            addCriterion("salary_meal_subsidy <", value, "salaryMealSubsidy");
            return (Criteria) this;
        }

        public Criteria andSalaryMealSubsidyLessThanOrEqualTo(Double value) {
            addCriterion("salary_meal_subsidy <=", value, "salaryMealSubsidy");
            return (Criteria) this;
        }

        public Criteria andSalaryMealSubsidyIn(List<Double> values) {
            addCriterion("salary_meal_subsidy in", values, "salaryMealSubsidy");
            return (Criteria) this;
        }

        public Criteria andSalaryMealSubsidyNotIn(List<Double> values) {
            addCriterion("salary_meal_subsidy not in", values, "salaryMealSubsidy");
            return (Criteria) this;
        }

        public Criteria andSalaryMealSubsidyBetween(Double value1, Double value2) {
            addCriterion("salary_meal_subsidy between", value1, value2, "salaryMealSubsidy");
            return (Criteria) this;
        }

        public Criteria andSalaryMealSubsidyNotBetween(Double value1, Double value2) {
            addCriterion("salary_meal_subsidy not between", value1, value2, "salaryMealSubsidy");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkingAgeIsNull() {
            addCriterion("\"salary_ working_age\" is null");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkingAgeIsNotNull() {
            addCriterion("\"salary_ working_age\" is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkingAgeEqualTo(Double value) {
            addCriterion("\"salary_ working_age\" =", value, "salaryWorkingAge");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkingAgeNotEqualTo(Double value) {
            addCriterion("\"salary_ working_age\" <>", value, "salaryWorkingAge");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkingAgeGreaterThan(Double value) {
            addCriterion("\"salary_ working_age\" >", value, "salaryWorkingAge");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkingAgeGreaterThanOrEqualTo(Double value) {
            addCriterion("\"salary_ working_age\" >=", value, "salaryWorkingAge");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkingAgeLessThan(Double value) {
            addCriterion("\"salary_ working_age\" <", value, "salaryWorkingAge");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkingAgeLessThanOrEqualTo(Double value) {
            addCriterion("\"salary_ working_age\" <=", value, "salaryWorkingAge");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkingAgeIn(List<Double> values) {
            addCriterion("\"salary_ working_age\" in", values, "salaryWorkingAge");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkingAgeNotIn(List<Double> values) {
            addCriterion("\"salary_ working_age\" not in", values, "salaryWorkingAge");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkingAgeBetween(Double value1, Double value2) {
            addCriterion("\"salary_ working_age\" between", value1, value2, "salaryWorkingAge");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkingAgeNotBetween(Double value1, Double value2) {
            addCriterion("\"salary_ working_age\" not between", value1, value2, "salaryWorkingAge");
            return (Criteria) this;
        }

        public Criteria andSalarySocialSubsidiesIsNull() {
            addCriterion("salary_social_subsidies is null");
            return (Criteria) this;
        }

        public Criteria andSalarySocialSubsidiesIsNotNull() {
            addCriterion("salary_social_subsidies is not null");
            return (Criteria) this;
        }

        public Criteria andSalarySocialSubsidiesEqualTo(Double value) {
            addCriterion("salary_social_subsidies =", value, "salarySocialSubsidies");
            return (Criteria) this;
        }

        public Criteria andSalarySocialSubsidiesNotEqualTo(Double value) {
            addCriterion("salary_social_subsidies <>", value, "salarySocialSubsidies");
            return (Criteria) this;
        }

        public Criteria andSalarySocialSubsidiesGreaterThan(Double value) {
            addCriterion("salary_social_subsidies >", value, "salarySocialSubsidies");
            return (Criteria) this;
        }

        public Criteria andSalarySocialSubsidiesGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_social_subsidies >=", value, "salarySocialSubsidies");
            return (Criteria) this;
        }

        public Criteria andSalarySocialSubsidiesLessThan(Double value) {
            addCriterion("salary_social_subsidies <", value, "salarySocialSubsidies");
            return (Criteria) this;
        }

        public Criteria andSalarySocialSubsidiesLessThanOrEqualTo(Double value) {
            addCriterion("salary_social_subsidies <=", value, "salarySocialSubsidies");
            return (Criteria) this;
        }

        public Criteria andSalarySocialSubsidiesIn(List<Double> values) {
            addCriterion("salary_social_subsidies in", values, "salarySocialSubsidies");
            return (Criteria) this;
        }

        public Criteria andSalarySocialSubsidiesNotIn(List<Double> values) {
            addCriterion("salary_social_subsidies not in", values, "salarySocialSubsidies");
            return (Criteria) this;
        }

        public Criteria andSalarySocialSubsidiesBetween(Double value1, Double value2) {
            addCriterion("salary_social_subsidies between", value1, value2, "salarySocialSubsidies");
            return (Criteria) this;
        }

        public Criteria andSalarySocialSubsidiesNotBetween(Double value1, Double value2) {
            addCriterion("salary_social_subsidies not between", value1, value2, "salarySocialSubsidies");
            return (Criteria) this;
        }

        public Criteria andSalaryPersionIsNull() {
            addCriterion("salary_persion is null");
            return (Criteria) this;
        }

        public Criteria andSalaryPersionIsNotNull() {
            addCriterion("salary_persion is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryPersionEqualTo(Double value) {
            addCriterion("salary_persion =", value, "salaryPersion");
            return (Criteria) this;
        }

        public Criteria andSalaryPersionNotEqualTo(Double value) {
            addCriterion("salary_persion <>", value, "salaryPersion");
            return (Criteria) this;
        }

        public Criteria andSalaryPersionGreaterThan(Double value) {
            addCriterion("salary_persion >", value, "salaryPersion");
            return (Criteria) this;
        }

        public Criteria andSalaryPersionGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_persion >=", value, "salaryPersion");
            return (Criteria) this;
        }

        public Criteria andSalaryPersionLessThan(Double value) {
            addCriterion("salary_persion <", value, "salaryPersion");
            return (Criteria) this;
        }

        public Criteria andSalaryPersionLessThanOrEqualTo(Double value) {
            addCriterion("salary_persion <=", value, "salaryPersion");
            return (Criteria) this;
        }

        public Criteria andSalaryPersionIn(List<Double> values) {
            addCriterion("salary_persion in", values, "salaryPersion");
            return (Criteria) this;
        }

        public Criteria andSalaryPersionNotIn(List<Double> values) {
            addCriterion("salary_persion not in", values, "salaryPersion");
            return (Criteria) this;
        }

        public Criteria andSalaryPersionBetween(Double value1, Double value2) {
            addCriterion("salary_persion between", value1, value2, "salaryPersion");
            return (Criteria) this;
        }

        public Criteria andSalaryPersionNotBetween(Double value1, Double value2) {
            addCriterion("salary_persion not between", value1, value2, "salaryPersion");
            return (Criteria) this;
        }

        public Criteria andSalaryShopIsNull() {
            addCriterion("salary_shop is null");
            return (Criteria) this;
        }

        public Criteria andSalaryShopIsNotNull() {
            addCriterion("salary_shop is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryShopEqualTo(Double value) {
            addCriterion("salary_shop =", value, "salaryShop");
            return (Criteria) this;
        }

        public Criteria andSalaryShopNotEqualTo(Double value) {
            addCriterion("salary_shop <>", value, "salaryShop");
            return (Criteria) this;
        }

        public Criteria andSalaryShopGreaterThan(Double value) {
            addCriterion("salary_shop >", value, "salaryShop");
            return (Criteria) this;
        }

        public Criteria andSalaryShopGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_shop >=", value, "salaryShop");
            return (Criteria) this;
        }

        public Criteria andSalaryShopLessThan(Double value) {
            addCriterion("salary_shop <", value, "salaryShop");
            return (Criteria) this;
        }

        public Criteria andSalaryShopLessThanOrEqualTo(Double value) {
            addCriterion("salary_shop <=", value, "salaryShop");
            return (Criteria) this;
        }

        public Criteria andSalaryShopIn(List<Double> values) {
            addCriterion("salary_shop in", values, "salaryShop");
            return (Criteria) this;
        }

        public Criteria andSalaryShopNotIn(List<Double> values) {
            addCriterion("salary_shop not in", values, "salaryShop");
            return (Criteria) this;
        }

        public Criteria andSalaryShopBetween(Double value1, Double value2) {
            addCriterion("salary_shop between", value1, value2, "salaryShop");
            return (Criteria) this;
        }

        public Criteria andSalaryShopNotBetween(Double value1, Double value2) {
            addCriterion("salary_shop not between", value1, value2, "salaryShop");
            return (Criteria) this;
        }

        public Criteria andSalaryOvertimeIsNull() {
            addCriterion("salary_overtime is null");
            return (Criteria) this;
        }

        public Criteria andSalaryOvertimeIsNotNull() {
            addCriterion("salary_overtime is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryOvertimeEqualTo(Double value) {
            addCriterion("salary_overtime =", value, "salaryOvertime");
            return (Criteria) this;
        }

        public Criteria andSalaryOvertimeNotEqualTo(Double value) {
            addCriterion("salary_overtime <>", value, "salaryOvertime");
            return (Criteria) this;
        }

        public Criteria andSalaryOvertimeGreaterThan(Double value) {
            addCriterion("salary_overtime >", value, "salaryOvertime");
            return (Criteria) this;
        }

        public Criteria andSalaryOvertimeGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_overtime >=", value, "salaryOvertime");
            return (Criteria) this;
        }

        public Criteria andSalaryOvertimeLessThan(Double value) {
            addCriterion("salary_overtime <", value, "salaryOvertime");
            return (Criteria) this;
        }

        public Criteria andSalaryOvertimeLessThanOrEqualTo(Double value) {
            addCriterion("salary_overtime <=", value, "salaryOvertime");
            return (Criteria) this;
        }

        public Criteria andSalaryOvertimeIn(List<Double> values) {
            addCriterion("salary_overtime in", values, "salaryOvertime");
            return (Criteria) this;
        }

        public Criteria andSalaryOvertimeNotIn(List<Double> values) {
            addCriterion("salary_overtime not in", values, "salaryOvertime");
            return (Criteria) this;
        }

        public Criteria andSalaryOvertimeBetween(Double value1, Double value2) {
            addCriterion("salary_overtime between", value1, value2, "salaryOvertime");
            return (Criteria) this;
        }

        public Criteria andSalaryOvertimeNotBetween(Double value1, Double value2) {
            addCriterion("salary_overtime not between", value1, value2, "salaryOvertime");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkIsNull() {
            addCriterion("salary_work is null");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkIsNotNull() {
            addCriterion("salary_work is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkEqualTo(Double value) {
            addCriterion("salary_work =", value, "salaryWork");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkNotEqualTo(Double value) {
            addCriterion("salary_work <>", value, "salaryWork");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkGreaterThan(Double value) {
            addCriterion("salary_work >", value, "salaryWork");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_work >=", value, "salaryWork");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkLessThan(Double value) {
            addCriterion("salary_work <", value, "salaryWork");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkLessThanOrEqualTo(Double value) {
            addCriterion("salary_work <=", value, "salaryWork");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkIn(List<Double> values) {
            addCriterion("salary_work in", values, "salaryWork");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkNotIn(List<Double> values) {
            addCriterion("salary_work not in", values, "salaryWork");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkBetween(Double value1, Double value2) {
            addCriterion("salary_work between", value1, value2, "salaryWork");
            return (Criteria) this;
        }

        public Criteria andSalaryWorkNotBetween(Double value1, Double value2) {
            addCriterion("salary_work not between", value1, value2, "salaryWork");
            return (Criteria) this;
        }

        public Criteria andDeductInventoryIsNull() {
            addCriterion("deduct_inventory is null");
            return (Criteria) this;
        }

        public Criteria andDeductInventoryIsNotNull() {
            addCriterion("deduct_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andDeductInventoryEqualTo(Double value) {
            addCriterion("deduct_inventory =", value, "deductInventory");
            return (Criteria) this;
        }

        public Criteria andDeductInventoryNotEqualTo(Double value) {
            addCriterion("deduct_inventory <>", value, "deductInventory");
            return (Criteria) this;
        }

        public Criteria andDeductInventoryGreaterThan(Double value) {
            addCriterion("deduct_inventory >", value, "deductInventory");
            return (Criteria) this;
        }

        public Criteria andDeductInventoryGreaterThanOrEqualTo(Double value) {
            addCriterion("deduct_inventory >=", value, "deductInventory");
            return (Criteria) this;
        }

        public Criteria andDeductInventoryLessThan(Double value) {
            addCriterion("deduct_inventory <", value, "deductInventory");
            return (Criteria) this;
        }

        public Criteria andDeductInventoryLessThanOrEqualTo(Double value) {
            addCriterion("deduct_inventory <=", value, "deductInventory");
            return (Criteria) this;
        }

        public Criteria andDeductInventoryIn(List<Double> values) {
            addCriterion("deduct_inventory in", values, "deductInventory");
            return (Criteria) this;
        }

        public Criteria andDeductInventoryNotIn(List<Double> values) {
            addCriterion("deduct_inventory not in", values, "deductInventory");
            return (Criteria) this;
        }

        public Criteria andDeductInventoryBetween(Double value1, Double value2) {
            addCriterion("deduct_inventory between", value1, value2, "deductInventory");
            return (Criteria) this;
        }

        public Criteria andDeductInventoryNotBetween(Double value1, Double value2) {
            addCriterion("deduct_inventory not between", value1, value2, "deductInventory");
            return (Criteria) this;
        }

        public Criteria andDeductLateSalesIsNull() {
            addCriterion("\"deduct_Late sales\" is null");
            return (Criteria) this;
        }

        public Criteria andDeductLateSalesIsNotNull() {
            addCriterion("\"deduct_Late sales\" is not null");
            return (Criteria) this;
        }

        public Criteria andDeductLateSalesEqualTo(Double value) {
            addCriterion("\"deduct_Late sales\" =", value, "deductLateSales");
            return (Criteria) this;
        }

        public Criteria andDeductLateSalesNotEqualTo(Double value) {
            addCriterion("\"deduct_Late sales\" <>", value, "deductLateSales");
            return (Criteria) this;
        }

        public Criteria andDeductLateSalesGreaterThan(Double value) {
            addCriterion("\"deduct_Late sales\" >", value, "deductLateSales");
            return (Criteria) this;
        }

        public Criteria andDeductLateSalesGreaterThanOrEqualTo(Double value) {
            addCriterion("\"deduct_Late sales\" >=", value, "deductLateSales");
            return (Criteria) this;
        }

        public Criteria andDeductLateSalesLessThan(Double value) {
            addCriterion("\"deduct_Late sales\" <", value, "deductLateSales");
            return (Criteria) this;
        }

        public Criteria andDeductLateSalesLessThanOrEqualTo(Double value) {
            addCriterion("\"deduct_Late sales\" <=", value, "deductLateSales");
            return (Criteria) this;
        }

        public Criteria andDeductLateSalesIn(List<Double> values) {
            addCriterion("\"deduct_Late sales\" in", values, "deductLateSales");
            return (Criteria) this;
        }

        public Criteria andDeductLateSalesNotIn(List<Double> values) {
            addCriterion("\"deduct_Late sales\" not in", values, "deductLateSales");
            return (Criteria) this;
        }

        public Criteria andDeductLateSalesBetween(Double value1, Double value2) {
            addCriterion("\"deduct_Late sales\" between", value1, value2, "deductLateSales");
            return (Criteria) this;
        }

        public Criteria andDeductLateSalesNotBetween(Double value1, Double value2) {
            addCriterion("\"deduct_Late sales\" not between", value1, value2, "deductLateSales");
            return (Criteria) this;
        }

        public Criteria andDeductSocialIsNull() {
            addCriterion("deduct_social is null");
            return (Criteria) this;
        }

        public Criteria andDeductSocialIsNotNull() {
            addCriterion("deduct_social is not null");
            return (Criteria) this;
        }

        public Criteria andDeductSocialEqualTo(Double value) {
            addCriterion("deduct_social =", value, "deductSocial");
            return (Criteria) this;
        }

        public Criteria andDeductSocialNotEqualTo(Double value) {
            addCriterion("deduct_social <>", value, "deductSocial");
            return (Criteria) this;
        }

        public Criteria andDeductSocialGreaterThan(Double value) {
            addCriterion("deduct_social >", value, "deductSocial");
            return (Criteria) this;
        }

        public Criteria andDeductSocialGreaterThanOrEqualTo(Double value) {
            addCriterion("deduct_social >=", value, "deductSocial");
            return (Criteria) this;
        }

        public Criteria andDeductSocialLessThan(Double value) {
            addCriterion("deduct_social <", value, "deductSocial");
            return (Criteria) this;
        }

        public Criteria andDeductSocialLessThanOrEqualTo(Double value) {
            addCriterion("deduct_social <=", value, "deductSocial");
            return (Criteria) this;
        }

        public Criteria andDeductSocialIn(List<Double> values) {
            addCriterion("deduct_social in", values, "deductSocial");
            return (Criteria) this;
        }

        public Criteria andDeductSocialNotIn(List<Double> values) {
            addCriterion("deduct_social not in", values, "deductSocial");
            return (Criteria) this;
        }

        public Criteria andDeductSocialBetween(Double value1, Double value2) {
            addCriterion("deduct_social between", value1, value2, "deductSocial");
            return (Criteria) this;
        }

        public Criteria andDeductSocialNotBetween(Double value1, Double value2) {
            addCriterion("deduct_social not between", value1, value2, "deductSocial");
            return (Criteria) this;
        }

        public Criteria andDeductUniformIsNull() {
            addCriterion("deduct_uniform is null");
            return (Criteria) this;
        }

        public Criteria andDeductUniformIsNotNull() {
            addCriterion("deduct_uniform is not null");
            return (Criteria) this;
        }

        public Criteria andDeductUniformEqualTo(Double value) {
            addCriterion("deduct_uniform =", value, "deductUniform");
            return (Criteria) this;
        }

        public Criteria andDeductUniformNotEqualTo(Double value) {
            addCriterion("deduct_uniform <>", value, "deductUniform");
            return (Criteria) this;
        }

        public Criteria andDeductUniformGreaterThan(Double value) {
            addCriterion("deduct_uniform >", value, "deductUniform");
            return (Criteria) this;
        }

        public Criteria andDeductUniformGreaterThanOrEqualTo(Double value) {
            addCriterion("deduct_uniform >=", value, "deductUniform");
            return (Criteria) this;
        }

        public Criteria andDeductUniformLessThan(Double value) {
            addCriterion("deduct_uniform <", value, "deductUniform");
            return (Criteria) this;
        }

        public Criteria andDeductUniformLessThanOrEqualTo(Double value) {
            addCriterion("deduct_uniform <=", value, "deductUniform");
            return (Criteria) this;
        }

        public Criteria andDeductUniformIn(List<Double> values) {
            addCriterion("deduct_uniform in", values, "deductUniform");
            return (Criteria) this;
        }

        public Criteria andDeductUniformNotIn(List<Double> values) {
            addCriterion("deduct_uniform not in", values, "deductUniform");
            return (Criteria) this;
        }

        public Criteria andDeductUniformBetween(Double value1, Double value2) {
            addCriterion("deduct_uniform between", value1, value2, "deductUniform");
            return (Criteria) this;
        }

        public Criteria andDeductUniformNotBetween(Double value1, Double value2) {
            addCriterion("deduct_uniform not between", value1, value2, "deductUniform");
            return (Criteria) this;
        }

        public Criteria andDeductOtherIsNull() {
            addCriterion("deduct_other is null");
            return (Criteria) this;
        }

        public Criteria andDeductOtherIsNotNull() {
            addCriterion("deduct_other is not null");
            return (Criteria) this;
        }

        public Criteria andDeductOtherEqualTo(Double value) {
            addCriterion("deduct_other =", value, "deductOther");
            return (Criteria) this;
        }

        public Criteria andDeductOtherNotEqualTo(Double value) {
            addCriterion("deduct_other <>", value, "deductOther");
            return (Criteria) this;
        }

        public Criteria andDeductOtherGreaterThan(Double value) {
            addCriterion("deduct_other >", value, "deductOther");
            return (Criteria) this;
        }

        public Criteria andDeductOtherGreaterThanOrEqualTo(Double value) {
            addCriterion("deduct_other >=", value, "deductOther");
            return (Criteria) this;
        }

        public Criteria andDeductOtherLessThan(Double value) {
            addCriterion("deduct_other <", value, "deductOther");
            return (Criteria) this;
        }

        public Criteria andDeductOtherLessThanOrEqualTo(Double value) {
            addCriterion("deduct_other <=", value, "deductOther");
            return (Criteria) this;
        }

        public Criteria andDeductOtherIn(List<Double> values) {
            addCriterion("deduct_other in", values, "deductOther");
            return (Criteria) this;
        }

        public Criteria andDeductOtherNotIn(List<Double> values) {
            addCriterion("deduct_other not in", values, "deductOther");
            return (Criteria) this;
        }

        public Criteria andDeductOtherBetween(Double value1, Double value2) {
            addCriterion("deduct_other between", value1, value2, "deductOther");
            return (Criteria) this;
        }

        public Criteria andDeductOtherNotBetween(Double value1, Double value2) {
            addCriterion("deduct_other not between", value1, value2, "deductOther");
            return (Criteria) this;
        }

        public Criteria andSalaryOtherIsNull() {
            addCriterion("salary_other is null");
            return (Criteria) this;
        }

        public Criteria andSalaryOtherIsNotNull() {
            addCriterion("salary_other is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryOtherEqualTo(Double value) {
            addCriterion("salary_other =", value, "salaryOther");
            return (Criteria) this;
        }

        public Criteria andSalaryOtherNotEqualTo(Double value) {
            addCriterion("salary_other <>", value, "salaryOther");
            return (Criteria) this;
        }

        public Criteria andSalaryOtherGreaterThan(Double value) {
            addCriterion("salary_other >", value, "salaryOther");
            return (Criteria) this;
        }

        public Criteria andSalaryOtherGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_other >=", value, "salaryOther");
            return (Criteria) this;
        }

        public Criteria andSalaryOtherLessThan(Double value) {
            addCriterion("salary_other <", value, "salaryOther");
            return (Criteria) this;
        }

        public Criteria andSalaryOtherLessThanOrEqualTo(Double value) {
            addCriterion("salary_other <=", value, "salaryOther");
            return (Criteria) this;
        }

        public Criteria andSalaryOtherIn(List<Double> values) {
            addCriterion("salary_other in", values, "salaryOther");
            return (Criteria) this;
        }

        public Criteria andSalaryOtherNotIn(List<Double> values) {
            addCriterion("salary_other not in", values, "salaryOther");
            return (Criteria) this;
        }

        public Criteria andSalaryOtherBetween(Double value1, Double value2) {
            addCriterion("salary_other between", value1, value2, "salaryOther");
            return (Criteria) this;
        }

        public Criteria andSalaryOtherNotBetween(Double value1, Double value2) {
            addCriterion("salary_other not between", value1, value2, "salaryOther");
            return (Criteria) this;
        }

        public Criteria andSalaryThreeGoldIsNull() {
            addCriterion("salary_Three_gold is null");
            return (Criteria) this;
        }

        public Criteria andSalaryThreeGoldIsNotNull() {
            addCriterion("salary_Three_gold is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryThreeGoldEqualTo(Double value) {
            addCriterion("salary_Three_gold =", value, "salaryThreeGold");
            return (Criteria) this;
        }

        public Criteria andSalaryThreeGoldNotEqualTo(Double value) {
            addCriterion("salary_Three_gold <>", value, "salaryThreeGold");
            return (Criteria) this;
        }

        public Criteria andSalaryThreeGoldGreaterThan(Double value) {
            addCriterion("salary_Three_gold >", value, "salaryThreeGold");
            return (Criteria) this;
        }

        public Criteria andSalaryThreeGoldGreaterThanOrEqualTo(Double value) {
            addCriterion("salary_Three_gold >=", value, "salaryThreeGold");
            return (Criteria) this;
        }

        public Criteria andSalaryThreeGoldLessThan(Double value) {
            addCriterion("salary_Three_gold <", value, "salaryThreeGold");
            return (Criteria) this;
        }

        public Criteria andSalaryThreeGoldLessThanOrEqualTo(Double value) {
            addCriterion("salary_Three_gold <=", value, "salaryThreeGold");
            return (Criteria) this;
        }

        public Criteria andSalaryThreeGoldIn(List<Double> values) {
            addCriterion("salary_Three_gold in", values, "salaryThreeGold");
            return (Criteria) this;
        }

        public Criteria andSalaryThreeGoldNotIn(List<Double> values) {
            addCriterion("salary_Three_gold not in", values, "salaryThreeGold");
            return (Criteria) this;
        }

        public Criteria andSalaryThreeGoldBetween(Double value1, Double value2) {
            addCriterion("salary_Three_gold between", value1, value2, "salaryThreeGold");
            return (Criteria) this;
        }

        public Criteria andSalaryThreeGoldNotBetween(Double value1, Double value2) {
            addCriterion("salary_Three_gold not between", value1, value2, "salaryThreeGold");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andSalaryTagIsNull() {
            addCriterion("salary_tag is null");
            return (Criteria) this;
        }

        public Criteria andSalaryTagIsNotNull() {
            addCriterion("salary_tag is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryTagEqualTo(Long value) {
            addCriterion("salary_tag =", value, "salaryTag");
            return (Criteria) this;
        }

        public Criteria andSalaryTagNotEqualTo(Long value) {
            addCriterion("salary_tag <>", value, "salaryTag");
            return (Criteria) this;
        }

        public Criteria andSalaryTagGreaterThan(Long value) {
            addCriterion("salary_tag >", value, "salaryTag");
            return (Criteria) this;
        }

        public Criteria andSalaryTagGreaterThanOrEqualTo(Long value) {
            addCriterion("salary_tag >=", value, "salaryTag");
            return (Criteria) this;
        }

        public Criteria andSalaryTagLessThan(Long value) {
            addCriterion("salary_tag <", value, "salaryTag");
            return (Criteria) this;
        }

        public Criteria andSalaryTagLessThanOrEqualTo(Long value) {
            addCriterion("salary_tag <=", value, "salaryTag");
            return (Criteria) this;
        }

        public Criteria andSalaryTagIn(List<Long> values) {
            addCriterion("salary_tag in", values, "salaryTag");
            return (Criteria) this;
        }

        public Criteria andSalaryTagNotIn(List<Long> values) {
            addCriterion("salary_tag not in", values, "salaryTag");
            return (Criteria) this;
        }

        public Criteria andSalaryTagBetween(Long value1, Long value2) {
            addCriterion("salary_tag between", value1, value2, "salaryTag");
            return (Criteria) this;
        }

        public Criteria andSalaryTagNotBetween(Long value1, Long value2) {
            addCriterion("salary_tag not between", value1, value2, "salaryTag");
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