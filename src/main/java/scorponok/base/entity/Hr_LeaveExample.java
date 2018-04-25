package scorponok.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hr_LeaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Hr_LeaveExample() {
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

        public Criteria andLeaveIdIsNull() {
            addCriterion("leave_id is null");
            return (Criteria) this;
        }

        public Criteria andLeaveIdIsNotNull() {
            addCriterion("leave_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveIdEqualTo(Long value) {
            addCriterion("leave_id =", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotEqualTo(Long value) {
            addCriterion("leave_id <>", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdGreaterThan(Long value) {
            addCriterion("leave_id >", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdGreaterThanOrEqualTo(Long value) {
            addCriterion("leave_id >=", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdLessThan(Long value) {
            addCriterion("leave_id <", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdLessThanOrEqualTo(Long value) {
            addCriterion("leave_id <=", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdIn(List<Long> values) {
            addCriterion("leave_id in", values, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotIn(List<Long> values) {
            addCriterion("leave_id not in", values, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdBetween(Long value1, Long value2) {
            addCriterion("leave_id between", value1, value2, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotBetween(Long value1, Long value2) {
            addCriterion("leave_id not between", value1, value2, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveNameIsNull() {
            addCriterion("leave_name is null");
            return (Criteria) this;
        }

        public Criteria andLeaveNameIsNotNull() {
            addCriterion("leave_name is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveNameEqualTo(String value) {
            addCriterion("leave_name =", value, "leaveName");
            return (Criteria) this;
        }

        public Criteria andLeaveNameNotEqualTo(String value) {
            addCriterion("leave_name <>", value, "leaveName");
            return (Criteria) this;
        }

        public Criteria andLeaveNameGreaterThan(String value) {
            addCriterion("leave_name >", value, "leaveName");
            return (Criteria) this;
        }

        public Criteria andLeaveNameGreaterThanOrEqualTo(String value) {
            addCriterion("leave_name >=", value, "leaveName");
            return (Criteria) this;
        }

        public Criteria andLeaveNameLessThan(String value) {
            addCriterion("leave_name <", value, "leaveName");
            return (Criteria) this;
        }

        public Criteria andLeaveNameLessThanOrEqualTo(String value) {
            addCriterion("leave_name <=", value, "leaveName");
            return (Criteria) this;
        }

        public Criteria andLeaveNameLike(String value) {
            addCriterion("leave_name like", value, "leaveName");
            return (Criteria) this;
        }

        public Criteria andLeaveNameNotLike(String value) {
            addCriterion("leave_name not like", value, "leaveName");
            return (Criteria) this;
        }

        public Criteria andLeaveNameIn(List<String> values) {
            addCriterion("leave_name in", values, "leaveName");
            return (Criteria) this;
        }

        public Criteria andLeaveNameNotIn(List<String> values) {
            addCriterion("leave_name not in", values, "leaveName");
            return (Criteria) this;
        }

        public Criteria andLeaveNameBetween(String value1, String value2) {
            addCriterion("leave_name between", value1, value2, "leaveName");
            return (Criteria) this;
        }

        public Criteria andLeaveNameNotBetween(String value1, String value2) {
            addCriterion("leave_name not between", value1, value2, "leaveName");
            return (Criteria) this;
        }

        public Criteria andLeaveDayIsNull() {
            addCriterion("leave_day is null");
            return (Criteria) this;
        }

        public Criteria andLeaveDayIsNotNull() {
            addCriterion("leave_day is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveDayEqualTo(Long value) {
            addCriterion("leave_day =", value, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayNotEqualTo(Long value) {
            addCriterion("leave_day <>", value, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayGreaterThan(Long value) {
            addCriterion("leave_day >", value, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayGreaterThanOrEqualTo(Long value) {
            addCriterion("leave_day >=", value, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayLessThan(Long value) {
            addCriterion("leave_day <", value, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayLessThanOrEqualTo(Long value) {
            addCriterion("leave_day <=", value, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayIn(List<Long> values) {
            addCriterion("leave_day in", values, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayNotIn(List<Long> values) {
            addCriterion("leave_day not in", values, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayBetween(Long value1, Long value2) {
            addCriterion("leave_day between", value1, value2, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDayNotBetween(Long value1, Long value2) {
            addCriterion("leave_day not between", value1, value2, "leaveDay");
            return (Criteria) this;
        }

        public Criteria andLeaveDepartmentIsNull() {
            addCriterion("leave_department is null");
            return (Criteria) this;
        }

        public Criteria andLeaveDepartmentIsNotNull() {
            addCriterion("leave_department is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveDepartmentEqualTo(Long value) {
            addCriterion("leave_department =", value, "leaveDepartment");
            return (Criteria) this;
        }

        public Criteria andLeaveDepartmentNotEqualTo(Long value) {
            addCriterion("leave_department <>", value, "leaveDepartment");
            return (Criteria) this;
        }

        public Criteria andLeaveDepartmentGreaterThan(Long value) {
            addCriterion("leave_department >", value, "leaveDepartment");
            return (Criteria) this;
        }

        public Criteria andLeaveDepartmentGreaterThanOrEqualTo(Long value) {
            addCriterion("leave_department >=", value, "leaveDepartment");
            return (Criteria) this;
        }

        public Criteria andLeaveDepartmentLessThan(Long value) {
            addCriterion("leave_department <", value, "leaveDepartment");
            return (Criteria) this;
        }

        public Criteria andLeaveDepartmentLessThanOrEqualTo(Long value) {
            addCriterion("leave_department <=", value, "leaveDepartment");
            return (Criteria) this;
        }

        public Criteria andLeaveDepartmentIn(List<Long> values) {
            addCriterion("leave_department in", values, "leaveDepartment");
            return (Criteria) this;
        }

        public Criteria andLeaveDepartmentNotIn(List<Long> values) {
            addCriterion("leave_department not in", values, "leaveDepartment");
            return (Criteria) this;
        }

        public Criteria andLeaveDepartmentBetween(Long value1, Long value2) {
            addCriterion("leave_department between", value1, value2, "leaveDepartment");
            return (Criteria) this;
        }

        public Criteria andLeaveDepartmentNotBetween(Long value1, Long value2) {
            addCriterion("leave_department not between", value1, value2, "leaveDepartment");
            return (Criteria) this;
        }

        public Criteria andLeavePostIsNull() {
            addCriterion("leave_post is null");
            return (Criteria) this;
        }

        public Criteria andLeavePostIsNotNull() {
            addCriterion("leave_post is not null");
            return (Criteria) this;
        }

        public Criteria andLeavePostEqualTo(Long value) {
            addCriterion("leave_post =", value, "leavePost");
            return (Criteria) this;
        }

        public Criteria andLeavePostNotEqualTo(Long value) {
            addCriterion("leave_post <>", value, "leavePost");
            return (Criteria) this;
        }

        public Criteria andLeavePostGreaterThan(Long value) {
            addCriterion("leave_post >", value, "leavePost");
            return (Criteria) this;
        }

        public Criteria andLeavePostGreaterThanOrEqualTo(Long value) {
            addCriterion("leave_post >=", value, "leavePost");
            return (Criteria) this;
        }

        public Criteria andLeavePostLessThan(Long value) {
            addCriterion("leave_post <", value, "leavePost");
            return (Criteria) this;
        }

        public Criteria andLeavePostLessThanOrEqualTo(Long value) {
            addCriterion("leave_post <=", value, "leavePost");
            return (Criteria) this;
        }

        public Criteria andLeavePostIn(List<Long> values) {
            addCriterion("leave_post in", values, "leavePost");
            return (Criteria) this;
        }

        public Criteria andLeavePostNotIn(List<Long> values) {
            addCriterion("leave_post not in", values, "leavePost");
            return (Criteria) this;
        }

        public Criteria andLeavePostBetween(Long value1, Long value2) {
            addCriterion("leave_post between", value1, value2, "leavePost");
            return (Criteria) this;
        }

        public Criteria andLeavePostNotBetween(Long value1, Long value2) {
            addCriterion("leave_post not between", value1, value2, "leavePost");
            return (Criteria) this;
        }

        public Criteria andLeaveShopIsNull() {
            addCriterion("leave_shop is null");
            return (Criteria) this;
        }

        public Criteria andLeaveShopIsNotNull() {
            addCriterion("leave_shop is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveShopEqualTo(String value) {
            addCriterion("leave_shop =", value, "leaveShop");
            return (Criteria) this;
        }

        public Criteria andLeaveShopNotEqualTo(String value) {
            addCriterion("leave_shop <>", value, "leaveShop");
            return (Criteria) this;
        }

        public Criteria andLeaveShopGreaterThan(String value) {
            addCriterion("leave_shop >", value, "leaveShop");
            return (Criteria) this;
        }

        public Criteria andLeaveShopGreaterThanOrEqualTo(String value) {
            addCriterion("leave_shop >=", value, "leaveShop");
            return (Criteria) this;
        }

        public Criteria andLeaveShopLessThan(String value) {
            addCriterion("leave_shop <", value, "leaveShop");
            return (Criteria) this;
        }

        public Criteria andLeaveShopLessThanOrEqualTo(String value) {
            addCriterion("leave_shop <=", value, "leaveShop");
            return (Criteria) this;
        }

        public Criteria andLeaveShopLike(String value) {
            addCriterion("leave_shop like", value, "leaveShop");
            return (Criteria) this;
        }

        public Criteria andLeaveShopNotLike(String value) {
            addCriterion("leave_shop not like", value, "leaveShop");
            return (Criteria) this;
        }

        public Criteria andLeaveShopIn(List<String> values) {
            addCriterion("leave_shop in", values, "leaveShop");
            return (Criteria) this;
        }

        public Criteria andLeaveShopNotIn(List<String> values) {
            addCriterion("leave_shop not in", values, "leaveShop");
            return (Criteria) this;
        }

        public Criteria andLeaveShopBetween(String value1, String value2) {
            addCriterion("leave_shop between", value1, value2, "leaveShop");
            return (Criteria) this;
        }

        public Criteria andLeaveShopNotBetween(String value1, String value2) {
            addCriterion("leave_shop not between", value1, value2, "leaveShop");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonIsNull() {
            addCriterion("leave_reason is null");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonIsNotNull() {
            addCriterion("leave_reason is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonEqualTo(String value) {
            addCriterion("leave_reason =", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonNotEqualTo(String value) {
            addCriterion("leave_reason <>", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonGreaterThan(String value) {
            addCriterion("leave_reason >", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonGreaterThanOrEqualTo(String value) {
            addCriterion("leave_reason >=", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonLessThan(String value) {
            addCriterion("leave_reason <", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonLessThanOrEqualTo(String value) {
            addCriterion("leave_reason <=", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonLike(String value) {
            addCriterion("leave_reason like", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonNotLike(String value) {
            addCriterion("leave_reason not like", value, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonIn(List<String> values) {
            addCriterion("leave_reason in", values, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonNotIn(List<String> values) {
            addCriterion("leave_reason not in", values, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonBetween(String value1, String value2) {
            addCriterion("leave_reason between", value1, value2, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonNotBetween(String value1, String value2) {
            addCriterion("leave_reason not between", value1, value2, "leaveReason");
            return (Criteria) this;
        }

        public Criteria andLeaveVerifierIdIsNull() {
            addCriterion("leave__verifier_id is null");
            return (Criteria) this;
        }

        public Criteria andLeaveVerifierIdIsNotNull() {
            addCriterion("leave__verifier_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveVerifierIdEqualTo(Long value) {
            addCriterion("leave__verifier_id =", value, "leaveVerifierId");
            return (Criteria) this;
        }

        public Criteria andLeaveVerifierIdNotEqualTo(Long value) {
            addCriterion("leave__verifier_id <>", value, "leaveVerifierId");
            return (Criteria) this;
        }

        public Criteria andLeaveVerifierIdGreaterThan(Long value) {
            addCriterion("leave__verifier_id >", value, "leaveVerifierId");
            return (Criteria) this;
        }

        public Criteria andLeaveVerifierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("leave__verifier_id >=", value, "leaveVerifierId");
            return (Criteria) this;
        }

        public Criteria andLeaveVerifierIdLessThan(Long value) {
            addCriterion("leave__verifier_id <", value, "leaveVerifierId");
            return (Criteria) this;
        }

        public Criteria andLeaveVerifierIdLessThanOrEqualTo(Long value) {
            addCriterion("leave__verifier_id <=", value, "leaveVerifierId");
            return (Criteria) this;
        }

        public Criteria andLeaveVerifierIdIn(List<Long> values) {
            addCriterion("leave__verifier_id in", values, "leaveVerifierId");
            return (Criteria) this;
        }

        public Criteria andLeaveVerifierIdNotIn(List<Long> values) {
            addCriterion("leave__verifier_id not in", values, "leaveVerifierId");
            return (Criteria) this;
        }

        public Criteria andLeaveVerifierIdBetween(Long value1, Long value2) {
            addCriterion("leave__verifier_id between", value1, value2, "leaveVerifierId");
            return (Criteria) this;
        }

        public Criteria andLeaveVerifierIdNotBetween(Long value1, Long value2) {
            addCriterion("leave__verifier_id not between", value1, value2, "leaveVerifierId");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("leave_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("leave_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Date value) {
            addCriterion("leave_time =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Date value) {
            addCriterion("leave_time <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Date value) {
            addCriterion("leave_time >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("leave_time >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Date value) {
            addCriterion("leave_time <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("leave_time <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Date> values) {
            addCriterion("leave_time in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Date> values) {
            addCriterion("leave_time not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Date value1, Date value2) {
            addCriterion("leave_time between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("leave_time not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTagIsNull() {
            addCriterion("leave_tag is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTagIsNotNull() {
            addCriterion("leave_tag is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTagEqualTo(Long value) {
            addCriterion("leave_tag =", value, "leaveTag");
            return (Criteria) this;
        }

        public Criteria andLeaveTagNotEqualTo(Long value) {
            addCriterion("leave_tag <>", value, "leaveTag");
            return (Criteria) this;
        }

        public Criteria andLeaveTagGreaterThan(Long value) {
            addCriterion("leave_tag >", value, "leaveTag");
            return (Criteria) this;
        }

        public Criteria andLeaveTagGreaterThanOrEqualTo(Long value) {
            addCriterion("leave_tag >=", value, "leaveTag");
            return (Criteria) this;
        }

        public Criteria andLeaveTagLessThan(Long value) {
            addCriterion("leave_tag <", value, "leaveTag");
            return (Criteria) this;
        }

        public Criteria andLeaveTagLessThanOrEqualTo(Long value) {
            addCriterion("leave_tag <=", value, "leaveTag");
            return (Criteria) this;
        }

        public Criteria andLeaveTagIn(List<Long> values) {
            addCriterion("leave_tag in", values, "leaveTag");
            return (Criteria) this;
        }

        public Criteria andLeaveTagNotIn(List<Long> values) {
            addCriterion("leave_tag not in", values, "leaveTag");
            return (Criteria) this;
        }

        public Criteria andLeaveTagBetween(Long value1, Long value2) {
            addCriterion("leave_tag between", value1, value2, "leaveTag");
            return (Criteria) this;
        }

        public Criteria andLeaveTagNotBetween(Long value1, Long value2) {
            addCriterion("leave_tag not between", value1, value2, "leaveTag");
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