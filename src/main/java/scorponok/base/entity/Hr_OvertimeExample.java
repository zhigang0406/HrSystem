package scorponok.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Hr_OvertimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Hr_OvertimeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOvertimeIdIsNull() {
            addCriterion("overtime_id is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdIsNotNull() {
            addCriterion("overtime_id is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdEqualTo(Long value) {
            addCriterion("overtime_id =", value, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdNotEqualTo(Long value) {
            addCriterion("overtime_id <>", value, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdGreaterThan(Long value) {
            addCriterion("overtime_id >", value, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("overtime_id >=", value, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdLessThan(Long value) {
            addCriterion("overtime_id <", value, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdLessThanOrEqualTo(Long value) {
            addCriterion("overtime_id <=", value, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdIn(List<Long> values) {
            addCriterion("overtime_id in", values, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdNotIn(List<Long> values) {
            addCriterion("overtime_id not in", values, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdBetween(Long value1, Long value2) {
            addCriterion("overtime_id between", value1, value2, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdNotBetween(Long value1, Long value2) {
            addCriterion("overtime_id not between", value1, value2, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeNameIsNull() {
            addCriterion("overtime_name is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeNameIsNotNull() {
            addCriterion("overtime_name is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeNameEqualTo(String value) {
            addCriterion("overtime_name =", value, "overtimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimeNameNotEqualTo(String value) {
            addCriterion("overtime_name <>", value, "overtimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimeNameGreaterThan(String value) {
            addCriterion("overtime_name >", value, "overtimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimeNameGreaterThanOrEqualTo(String value) {
            addCriterion("overtime_name >=", value, "overtimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimeNameLessThan(String value) {
            addCriterion("overtime_name <", value, "overtimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimeNameLessThanOrEqualTo(String value) {
            addCriterion("overtime_name <=", value, "overtimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimeNameLike(String value) {
            addCriterion("overtime_name like", value, "overtimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimeNameNotLike(String value) {
            addCriterion("overtime_name not like", value, "overtimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimeNameIn(List<String> values) {
            addCriterion("overtime_name in", values, "overtimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimeNameNotIn(List<String> values) {
            addCriterion("overtime_name not in", values, "overtimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimeNameBetween(String value1, String value2) {
            addCriterion("overtime_name between", value1, value2, "overtimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimeNameNotBetween(String value1, String value2) {
            addCriterion("overtime_name not between", value1, value2, "overtimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimeDurationIsNull() {
            addCriterion("overtime_duration is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeDurationIsNotNull() {
            addCriterion("overtime_duration is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeDurationEqualTo(Long value) {
            addCriterion("overtime_duration =", value, "overtimeDuration");
            return (Criteria) this;
        }

        public Criteria andOvertimeDurationNotEqualTo(Long value) {
            addCriterion("overtime_duration <>", value, "overtimeDuration");
            return (Criteria) this;
        }

        public Criteria andOvertimeDurationGreaterThan(Long value) {
            addCriterion("overtime_duration >", value, "overtimeDuration");
            return (Criteria) this;
        }

        public Criteria andOvertimeDurationGreaterThanOrEqualTo(Long value) {
            addCriterion("overtime_duration >=", value, "overtimeDuration");
            return (Criteria) this;
        }

        public Criteria andOvertimeDurationLessThan(Long value) {
            addCriterion("overtime_duration <", value, "overtimeDuration");
            return (Criteria) this;
        }

        public Criteria andOvertimeDurationLessThanOrEqualTo(Long value) {
            addCriterion("overtime_duration <=", value, "overtimeDuration");
            return (Criteria) this;
        }

        public Criteria andOvertimeDurationIn(List<Long> values) {
            addCriterion("overtime_duration in", values, "overtimeDuration");
            return (Criteria) this;
        }

        public Criteria andOvertimeDurationNotIn(List<Long> values) {
            addCriterion("overtime_duration not in", values, "overtimeDuration");
            return (Criteria) this;
        }

        public Criteria andOvertimeDurationBetween(Long value1, Long value2) {
            addCriterion("overtime_duration between", value1, value2, "overtimeDuration");
            return (Criteria) this;
        }

        public Criteria andOvertimeDurationNotBetween(Long value1, Long value2) {
            addCriterion("overtime_duration not between", value1, value2, "overtimeDuration");
            return (Criteria) this;
        }

        public Criteria andOvertimeDepartmentIsNull() {
            addCriterion("overtime_department is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeDepartmentIsNotNull() {
            addCriterion("overtime_department is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeDepartmentEqualTo(Long value) {
            addCriterion("overtime_department =", value, "overtimeDepartment");
            return (Criteria) this;
        }

        public Criteria andOvertimeDepartmentNotEqualTo(Long value) {
            addCriterion("overtime_department <>", value, "overtimeDepartment");
            return (Criteria) this;
        }

        public Criteria andOvertimeDepartmentGreaterThan(Long value) {
            addCriterion("overtime_department >", value, "overtimeDepartment");
            return (Criteria) this;
        }

        public Criteria andOvertimeDepartmentGreaterThanOrEqualTo(Long value) {
            addCriterion("overtime_department >=", value, "overtimeDepartment");
            return (Criteria) this;
        }

        public Criteria andOvertimeDepartmentLessThan(Long value) {
            addCriterion("overtime_department <", value, "overtimeDepartment");
            return (Criteria) this;
        }

        public Criteria andOvertimeDepartmentLessThanOrEqualTo(Long value) {
            addCriterion("overtime_department <=", value, "overtimeDepartment");
            return (Criteria) this;
        }

        public Criteria andOvertimeDepartmentIn(List<Long> values) {
            addCriterion("overtime_department in", values, "overtimeDepartment");
            return (Criteria) this;
        }

        public Criteria andOvertimeDepartmentNotIn(List<Long> values) {
            addCriterion("overtime_department not in", values, "overtimeDepartment");
            return (Criteria) this;
        }

        public Criteria andOvertimeDepartmentBetween(Long value1, Long value2) {
            addCriterion("overtime_department between", value1, value2, "overtimeDepartment");
            return (Criteria) this;
        }

        public Criteria andOvertimeDepartmentNotBetween(Long value1, Long value2) {
            addCriterion("overtime_department not between", value1, value2, "overtimeDepartment");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopIsNull() {
            addCriterion("overtime_shop is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopIsNotNull() {
            addCriterion("overtime_shop is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopEqualTo(String value) {
            addCriterion("overtime_shop =", value, "overtimeShop");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopNotEqualTo(String value) {
            addCriterion("overtime_shop <>", value, "overtimeShop");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopGreaterThan(String value) {
            addCriterion("overtime_shop >", value, "overtimeShop");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopGreaterThanOrEqualTo(String value) {
            addCriterion("overtime_shop >=", value, "overtimeShop");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopLessThan(String value) {
            addCriterion("overtime_shop <", value, "overtimeShop");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopLessThanOrEqualTo(String value) {
            addCriterion("overtime_shop <=", value, "overtimeShop");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopLike(String value) {
            addCriterion("overtime_shop like", value, "overtimeShop");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopNotLike(String value) {
            addCriterion("overtime_shop not like", value, "overtimeShop");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopIn(List<String> values) {
            addCriterion("overtime_shop in", values, "overtimeShop");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopNotIn(List<String> values) {
            addCriterion("overtime_shop not in", values, "overtimeShop");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopBetween(String value1, String value2) {
            addCriterion("overtime_shop between", value1, value2, "overtimeShop");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopNotBetween(String value1, String value2) {
            addCriterion("overtime_shop not between", value1, value2, "overtimeShop");
            return (Criteria) this;
        }

        public Criteria andOvertimePostIsNull() {
            addCriterion("overtime_post is null");
            return (Criteria) this;
        }

        public Criteria andOvertimePostIsNotNull() {
            addCriterion("overtime_post is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimePostEqualTo(Long value) {
            addCriterion("overtime_post =", value, "overtimePost");
            return (Criteria) this;
        }

        public Criteria andOvertimePostNotEqualTo(Long value) {
            addCriterion("overtime_post <>", value, "overtimePost");
            return (Criteria) this;
        }

        public Criteria andOvertimePostGreaterThan(Long value) {
            addCriterion("overtime_post >", value, "overtimePost");
            return (Criteria) this;
        }

        public Criteria andOvertimePostGreaterThanOrEqualTo(Long value) {
            addCriterion("overtime_post >=", value, "overtimePost");
            return (Criteria) this;
        }

        public Criteria andOvertimePostLessThan(Long value) {
            addCriterion("overtime_post <", value, "overtimePost");
            return (Criteria) this;
        }

        public Criteria andOvertimePostLessThanOrEqualTo(Long value) {
            addCriterion("overtime_post <=", value, "overtimePost");
            return (Criteria) this;
        }

        public Criteria andOvertimePostIn(List<Long> values) {
            addCriterion("overtime_post in", values, "overtimePost");
            return (Criteria) this;
        }

        public Criteria andOvertimePostNotIn(List<Long> values) {
            addCriterion("overtime_post not in", values, "overtimePost");
            return (Criteria) this;
        }

        public Criteria andOvertimePostBetween(Long value1, Long value2) {
            addCriterion("overtime_post between", value1, value2, "overtimePost");
            return (Criteria) this;
        }

        public Criteria andOvertimePostNotBetween(Long value1, Long value2) {
            addCriterion("overtime_post not between", value1, value2, "overtimePost");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonIsNull() {
            addCriterion("overtime_reason is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonIsNotNull() {
            addCriterion("overtime_reason is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonEqualTo(String value) {
            addCriterion("overtime_reason =", value, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonNotEqualTo(String value) {
            addCriterion("overtime_reason <>", value, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonGreaterThan(String value) {
            addCriterion("overtime_reason >", value, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("overtime_reason >=", value, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonLessThan(String value) {
            addCriterion("overtime_reason <", value, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonLessThanOrEqualTo(String value) {
            addCriterion("overtime_reason <=", value, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonLike(String value) {
            addCriterion("overtime_reason like", value, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonNotLike(String value) {
            addCriterion("overtime_reason not like", value, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonIn(List<String> values) {
            addCriterion("overtime_reason in", values, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonNotIn(List<String> values) {
            addCriterion("overtime_reason not in", values, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonBetween(String value1, String value2) {
            addCriterion("overtime_reason between", value1, value2, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonNotBetween(String value1, String value2) {
            addCriterion("overtime_reason not between", value1, value2, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeVerifierIdIsNull() {
            addCriterion("overtime_verifier_id is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeVerifierIdIsNotNull() {
            addCriterion("overtime_verifier_id is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeVerifierIdEqualTo(Long value) {
            addCriterion("overtime_verifier_id =", value, "overtimeVerifierId");
            return (Criteria) this;
        }

        public Criteria andOvertimeVerifierIdNotEqualTo(Long value) {
            addCriterion("overtime_verifier_id <>", value, "overtimeVerifierId");
            return (Criteria) this;
        }

        public Criteria andOvertimeVerifierIdGreaterThan(Long value) {
            addCriterion("overtime_verifier_id >", value, "overtimeVerifierId");
            return (Criteria) this;
        }

        public Criteria andOvertimeVerifierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("overtime_verifier_id >=", value, "overtimeVerifierId");
            return (Criteria) this;
        }

        public Criteria andOvertimeVerifierIdLessThan(Long value) {
            addCriterion("overtime_verifier_id <", value, "overtimeVerifierId");
            return (Criteria) this;
        }

        public Criteria andOvertimeVerifierIdLessThanOrEqualTo(Long value) {
            addCriterion("overtime_verifier_id <=", value, "overtimeVerifierId");
            return (Criteria) this;
        }

        public Criteria andOvertimeVerifierIdIn(List<Long> values) {
            addCriterion("overtime_verifier_id in", values, "overtimeVerifierId");
            return (Criteria) this;
        }

        public Criteria andOvertimeVerifierIdNotIn(List<Long> values) {
            addCriterion("overtime_verifier_id not in", values, "overtimeVerifierId");
            return (Criteria) this;
        }

        public Criteria andOvertimeVerifierIdBetween(Long value1, Long value2) {
            addCriterion("overtime_verifier_id between", value1, value2, "overtimeVerifierId");
            return (Criteria) this;
        }

        public Criteria andOvertimeVerifierIdNotBetween(Long value1, Long value2) {
            addCriterion("overtime_verifier_id not between", value1, value2, "overtimeVerifierId");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeIsNull() {
            addCriterion("overtime_time is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeIsNotNull() {
            addCriterion("overtime_time is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeEqualTo(Date value) {
            addCriterionForJDBCDate("overtime_time =", value, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("overtime_time <>", value, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("overtime_time >", value, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("overtime_time >=", value, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeLessThan(Date value) {
            addCriterionForJDBCDate("overtime_time <", value, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("overtime_time <=", value, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeIn(List<Date> values) {
            addCriterionForJDBCDate("overtime_time in", values, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("overtime_time not in", values, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("overtime_time between", value1, value2, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("overtime_time not between", value1, value2, "overtimeTime");
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