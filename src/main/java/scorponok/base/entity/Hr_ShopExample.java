package scorponok.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hr_ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Hr_ShopExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNumberIsNull() {
            addCriterion("shop_number is null");
            return (Criteria) this;
        }

        public Criteria andShopNumberIsNotNull() {
            addCriterion("shop_number is not null");
            return (Criteria) this;
        }

        public Criteria andShopNumberEqualTo(String value) {
            addCriterion("shop_number =", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberNotEqualTo(String value) {
            addCriterion("shop_number <>", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberGreaterThan(String value) {
            addCriterion("shop_number >", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberGreaterThanOrEqualTo(String value) {
            addCriterion("shop_number >=", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberLessThan(String value) {
            addCriterion("shop_number <", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberLessThanOrEqualTo(String value) {
            addCriterion("shop_number <=", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberLike(String value) {
            addCriterion("shop_number like", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberNotLike(String value) {
            addCriterion("shop_number not like", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberIn(List<String> values) {
            addCriterion("shop_number in", values, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberNotIn(List<String> values) {
            addCriterion("shop_number not in", values, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberBetween(String value1, String value2) {
            addCriterion("shop_number between", value1, value2, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberNotBetween(String value1, String value2) {
            addCriterion("shop_number not between", value1, value2, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopBrandidIsNull() {
            addCriterion("shop_brandid is null");
            return (Criteria) this;
        }

        public Criteria andShopBrandidIsNotNull() {
            addCriterion("shop_brandid is not null");
            return (Criteria) this;
        }

        public Criteria andShopBrandidEqualTo(Long value) {
            addCriterion("shop_brandid =", value, "shopBrandid");
            return (Criteria) this;
        }

        public Criteria andShopBrandidNotEqualTo(Long value) {
            addCriterion("shop_brandid <>", value, "shopBrandid");
            return (Criteria) this;
        }

        public Criteria andShopBrandidGreaterThan(Long value) {
            addCriterion("shop_brandid >", value, "shopBrandid");
            return (Criteria) this;
        }

        public Criteria andShopBrandidGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_brandid >=", value, "shopBrandid");
            return (Criteria) this;
        }

        public Criteria andShopBrandidLessThan(Long value) {
            addCriterion("shop_brandid <", value, "shopBrandid");
            return (Criteria) this;
        }

        public Criteria andShopBrandidLessThanOrEqualTo(Long value) {
            addCriterion("shop_brandid <=", value, "shopBrandid");
            return (Criteria) this;
        }

        public Criteria andShopBrandidIn(List<Long> values) {
            addCriterion("shop_brandid in", values, "shopBrandid");
            return (Criteria) this;
        }

        public Criteria andShopBrandidNotIn(List<Long> values) {
            addCriterion("shop_brandid not in", values, "shopBrandid");
            return (Criteria) this;
        }

        public Criteria andShopBrandidBetween(Long value1, Long value2) {
            addCriterion("shop_brandid between", value1, value2, "shopBrandid");
            return (Criteria) this;
        }

        public Criteria andShopBrandidNotBetween(Long value1, Long value2) {
            addCriterion("shop_brandid not between", value1, value2, "shopBrandid");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopAreaIdIsNull() {
            addCriterion("shop_area_id is null");
            return (Criteria) this;
        }

        public Criteria andShopAreaIdIsNotNull() {
            addCriterion("shop_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopAreaIdEqualTo(Long value) {
            addCriterion("shop_area_id =", value, "shopAreaId");
            return (Criteria) this;
        }

        public Criteria andShopAreaIdNotEqualTo(Long value) {
            addCriterion("shop_area_id <>", value, "shopAreaId");
            return (Criteria) this;
        }

        public Criteria andShopAreaIdGreaterThan(Long value) {
            addCriterion("shop_area_id >", value, "shopAreaId");
            return (Criteria) this;
        }

        public Criteria andShopAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_area_id >=", value, "shopAreaId");
            return (Criteria) this;
        }

        public Criteria andShopAreaIdLessThan(Long value) {
            addCriterion("shop_area_id <", value, "shopAreaId");
            return (Criteria) this;
        }

        public Criteria andShopAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_area_id <=", value, "shopAreaId");
            return (Criteria) this;
        }

        public Criteria andShopAreaIdIn(List<Long> values) {
            addCriterion("shop_area_id in", values, "shopAreaId");
            return (Criteria) this;
        }

        public Criteria andShopAreaIdNotIn(List<Long> values) {
            addCriterion("shop_area_id not in", values, "shopAreaId");
            return (Criteria) this;
        }

        public Criteria andShopAreaIdBetween(Long value1, Long value2) {
            addCriterion("shop_area_id between", value1, value2, "shopAreaId");
            return (Criteria) this;
        }

        public Criteria andShopAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_area_id not between", value1, value2, "shopAreaId");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeIsNull() {
            addCriterion("shop_creation_time is null");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeIsNotNull() {
            addCriterion("shop_creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeEqualTo(Date value) {
            addCriterion("shop_creation_time =", value, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeNotEqualTo(Date value) {
            addCriterion("shop_creation_time <>", value, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeGreaterThan(Date value) {
            addCriterion("shop_creation_time >", value, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shop_creation_time >=", value, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeLessThan(Date value) {
            addCriterion("shop_creation_time <", value, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("shop_creation_time <=", value, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeIn(List<Date> values) {
            addCriterion("shop_creation_time in", values, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeNotIn(List<Date> values) {
            addCriterion("shop_creation_time not in", values, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeBetween(Date value1, Date value2) {
            addCriterion("shop_creation_time between", value1, value2, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("shop_creation_time not between", value1, value2, "shopCreationTime");
            return (Criteria) this;
        }

        public Criteria andShopJobNumberIsNull() {
            addCriterion("shop_job_number is null");
            return (Criteria) this;
        }

        public Criteria andShopJobNumberIsNotNull() {
            addCriterion("shop_job_number is not null");
            return (Criteria) this;
        }

        public Criteria andShopJobNumberEqualTo(String value) {
            addCriterion("shop_job_number =", value, "shopJobNumber");
            return (Criteria) this;
        }

        public Criteria andShopJobNumberNotEqualTo(String value) {
            addCriterion("shop_job_number <>", value, "shopJobNumber");
            return (Criteria) this;
        }

        public Criteria andShopJobNumberGreaterThan(String value) {
            addCriterion("shop_job_number >", value, "shopJobNumber");
            return (Criteria) this;
        }

        public Criteria andShopJobNumberGreaterThanOrEqualTo(String value) {
            addCriterion("shop_job_number >=", value, "shopJobNumber");
            return (Criteria) this;
        }

        public Criteria andShopJobNumberLessThan(String value) {
            addCriterion("shop_job_number <", value, "shopJobNumber");
            return (Criteria) this;
        }

        public Criteria andShopJobNumberLessThanOrEqualTo(String value) {
            addCriterion("shop_job_number <=", value, "shopJobNumber");
            return (Criteria) this;
        }

        public Criteria andShopJobNumberLike(String value) {
            addCriterion("shop_job_number like", value, "shopJobNumber");
            return (Criteria) this;
        }

        public Criteria andShopJobNumberNotLike(String value) {
            addCriterion("shop_job_number not like", value, "shopJobNumber");
            return (Criteria) this;
        }

        public Criteria andShopJobNumberIn(List<String> values) {
            addCriterion("shop_job_number in", values, "shopJobNumber");
            return (Criteria) this;
        }

        public Criteria andShopJobNumberNotIn(List<String> values) {
            addCriterion("shop_job_number not in", values, "shopJobNumber");
            return (Criteria) this;
        }

        public Criteria andShopJobNumberBetween(String value1, String value2) {
            addCriterion("shop_job_number between", value1, value2, "shopJobNumber");
            return (Criteria) this;
        }

        public Criteria andShopJobNumberNotBetween(String value1, String value2) {
            addCriterion("shop_job_number not between", value1, value2, "shopJobNumber");
            return (Criteria) this;
        }

        public Criteria andShopHrIsNull() {
            addCriterion("shop_hr is null");
            return (Criteria) this;
        }

        public Criteria andShopHrIsNotNull() {
            addCriterion("shop_hr is not null");
            return (Criteria) this;
        }

        public Criteria andShopHrEqualTo(String value) {
            addCriterion("shop_hr =", value, "shopHr");
            return (Criteria) this;
        }

        public Criteria andShopHrNotEqualTo(String value) {
            addCriterion("shop_hr <>", value, "shopHr");
            return (Criteria) this;
        }

        public Criteria andShopHrGreaterThan(String value) {
            addCriterion("shop_hr >", value, "shopHr");
            return (Criteria) this;
        }

        public Criteria andShopHrGreaterThanOrEqualTo(String value) {
            addCriterion("shop_hr >=", value, "shopHr");
            return (Criteria) this;
        }

        public Criteria andShopHrLessThan(String value) {
            addCriterion("shop_hr <", value, "shopHr");
            return (Criteria) this;
        }

        public Criteria andShopHrLessThanOrEqualTo(String value) {
            addCriterion("shop_hr <=", value, "shopHr");
            return (Criteria) this;
        }

        public Criteria andShopHrLike(String value) {
            addCriterion("shop_hr like", value, "shopHr");
            return (Criteria) this;
        }

        public Criteria andShopHrNotLike(String value) {
            addCriterion("shop_hr not like", value, "shopHr");
            return (Criteria) this;
        }

        public Criteria andShopHrIn(List<String> values) {
            addCriterion("shop_hr in", values, "shopHr");
            return (Criteria) this;
        }

        public Criteria andShopHrNotIn(List<String> values) {
            addCriterion("shop_hr not in", values, "shopHr");
            return (Criteria) this;
        }

        public Criteria andShopHrBetween(String value1, String value2) {
            addCriterion("shop_hr between", value1, value2, "shopHr");
            return (Criteria) this;
        }

        public Criteria andShopHrNotBetween(String value1, String value2) {
            addCriterion("shop_hr not between", value1, value2, "shopHr");
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