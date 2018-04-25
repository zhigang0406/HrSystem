package scorponok.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hr_Operating_recordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Hr_Operating_recordExample() {
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

        public Criteria andOperatingRecordIdIsNull() {
            addCriterion("operating_record_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordIdIsNotNull() {
            addCriterion("operating_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordIdEqualTo(Long value) {
            addCriterion("operating_record_id =", value, "operatingRecordId");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordIdNotEqualTo(Long value) {
            addCriterion("operating_record_id <>", value, "operatingRecordId");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordIdGreaterThan(Long value) {
            addCriterion("operating_record_id >", value, "operatingRecordId");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("operating_record_id >=", value, "operatingRecordId");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordIdLessThan(Long value) {
            addCriterion("operating_record_id <", value, "operatingRecordId");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("operating_record_id <=", value, "operatingRecordId");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordIdIn(List<Long> values) {
            addCriterion("operating_record_id in", values, "operatingRecordId");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordIdNotIn(List<Long> values) {
            addCriterion("operating_record_id not in", values, "operatingRecordId");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordIdBetween(Long value1, Long value2) {
            addCriterion("operating_record_id between", value1, value2, "operatingRecordId");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("operating_record_id not between", value1, value2, "operatingRecordId");
            return (Criteria) this;
        }

        public Criteria andOperatingRecorNameIsNull() {
            addCriterion("operating_recor_name is null");
            return (Criteria) this;
        }

        public Criteria andOperatingRecorNameIsNotNull() {
            addCriterion("operating_recor_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingRecorNameEqualTo(String value) {
            addCriterion("operating_recor_name =", value, "operatingRecorName");
            return (Criteria) this;
        }

        public Criteria andOperatingRecorNameNotEqualTo(String value) {
            addCriterion("operating_recor_name <>", value, "operatingRecorName");
            return (Criteria) this;
        }

        public Criteria andOperatingRecorNameGreaterThan(String value) {
            addCriterion("operating_recor_name >", value, "operatingRecorName");
            return (Criteria) this;
        }

        public Criteria andOperatingRecorNameGreaterThanOrEqualTo(String value) {
            addCriterion("operating_recor_name >=", value, "operatingRecorName");
            return (Criteria) this;
        }

        public Criteria andOperatingRecorNameLessThan(String value) {
            addCriterion("operating_recor_name <", value, "operatingRecorName");
            return (Criteria) this;
        }

        public Criteria andOperatingRecorNameLessThanOrEqualTo(String value) {
            addCriterion("operating_recor_name <=", value, "operatingRecorName");
            return (Criteria) this;
        }

        public Criteria andOperatingRecorNameLike(String value) {
            addCriterion("operating_recor_name like", value, "operatingRecorName");
            return (Criteria) this;
        }

        public Criteria andOperatingRecorNameNotLike(String value) {
            addCriterion("operating_recor_name not like", value, "operatingRecorName");
            return (Criteria) this;
        }

        public Criteria andOperatingRecorNameIn(List<String> values) {
            addCriterion("operating_recor_name in", values, "operatingRecorName");
            return (Criteria) this;
        }

        public Criteria andOperatingRecorNameNotIn(List<String> values) {
            addCriterion("operating_recor_name not in", values, "operatingRecorName");
            return (Criteria) this;
        }

        public Criteria andOperatingRecorNameBetween(String value1, String value2) {
            addCriterion("operating_recor_name between", value1, value2, "operatingRecorName");
            return (Criteria) this;
        }

        public Criteria andOperatingRecorNameNotBetween(String value1, String value2) {
            addCriterion("operating_recor_name not between", value1, value2, "operatingRecorName");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordDepartmentIsNull() {
            addCriterion("operating_record_department is null");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordDepartmentIsNotNull() {
            addCriterion("operating_record_department is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordDepartmentEqualTo(String value) {
            addCriterion("operating_record_department =", value, "operatingRecordDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordDepartmentNotEqualTo(String value) {
            addCriterion("operating_record_department <>", value, "operatingRecordDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordDepartmentGreaterThan(String value) {
            addCriterion("operating_record_department >", value, "operatingRecordDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("operating_record_department >=", value, "operatingRecordDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordDepartmentLessThan(String value) {
            addCriterion("operating_record_department <", value, "operatingRecordDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordDepartmentLessThanOrEqualTo(String value) {
            addCriterion("operating_record_department <=", value, "operatingRecordDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordDepartmentLike(String value) {
            addCriterion("operating_record_department like", value, "operatingRecordDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordDepartmentNotLike(String value) {
            addCriterion("operating_record_department not like", value, "operatingRecordDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordDepartmentIn(List<String> values) {
            addCriterion("operating_record_department in", values, "operatingRecordDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordDepartmentNotIn(List<String> values) {
            addCriterion("operating_record_department not in", values, "operatingRecordDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordDepartmentBetween(String value1, String value2) {
            addCriterion("operating_record_department between", value1, value2, "operatingRecordDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordDepartmentNotBetween(String value1, String value2) {
            addCriterion("operating_record_department not between", value1, value2, "operatingRecordDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBdepartmentIsNull() {
            addCriterion("operating_record_bdepartment is null");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBdepartmentIsNotNull() {
            addCriterion("operating_record_bdepartment is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBdepartmentEqualTo(String value) {
            addCriterion("operating_record_bdepartment =", value, "operatingRecordBdepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBdepartmentNotEqualTo(String value) {
            addCriterion("operating_record_bdepartment <>", value, "operatingRecordBdepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBdepartmentGreaterThan(String value) {
            addCriterion("operating_record_bdepartment >", value, "operatingRecordBdepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("operating_record_bdepartment >=", value, "operatingRecordBdepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBdepartmentLessThan(String value) {
            addCriterion("operating_record_bdepartment <", value, "operatingRecordBdepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBdepartmentLessThanOrEqualTo(String value) {
            addCriterion("operating_record_bdepartment <=", value, "operatingRecordBdepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBdepartmentLike(String value) {
            addCriterion("operating_record_bdepartment like", value, "operatingRecordBdepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBdepartmentNotLike(String value) {
            addCriterion("operating_record_bdepartment not like", value, "operatingRecordBdepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBdepartmentIn(List<String> values) {
            addCriterion("operating_record_bdepartment in", values, "operatingRecordBdepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBdepartmentNotIn(List<String> values) {
            addCriterion("operating_record_bdepartment not in", values, "operatingRecordBdepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBdepartmentBetween(String value1, String value2) {
            addCriterion("operating_record_bdepartment between", value1, value2, "operatingRecordBdepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBdepartmentNotBetween(String value1, String value2) {
            addCriterion("operating_record_bdepartment not between", value1, value2, "operatingRecordBdepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBnameIsNull() {
            addCriterion("operating_record_bname is null");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBnameIsNotNull() {
            addCriterion("operating_record_bname is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBnameEqualTo(String value) {
            addCriterion("operating_record_bname =", value, "operatingRecordBname");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBnameNotEqualTo(String value) {
            addCriterion("operating_record_bname <>", value, "operatingRecordBname");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBnameGreaterThan(String value) {
            addCriterion("operating_record_bname >", value, "operatingRecordBname");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBnameGreaterThanOrEqualTo(String value) {
            addCriterion("operating_record_bname >=", value, "operatingRecordBname");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBnameLessThan(String value) {
            addCriterion("operating_record_bname <", value, "operatingRecordBname");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBnameLessThanOrEqualTo(String value) {
            addCriterion("operating_record_bname <=", value, "operatingRecordBname");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBnameLike(String value) {
            addCriterion("operating_record_bname like", value, "operatingRecordBname");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBnameNotLike(String value) {
            addCriterion("operating_record_bname not like", value, "operatingRecordBname");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBnameIn(List<String> values) {
            addCriterion("operating_record_bname in", values, "operatingRecordBname");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBnameNotIn(List<String> values) {
            addCriterion("operating_record_bname not in", values, "operatingRecordBname");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBnameBetween(String value1, String value2) {
            addCriterion("operating_record_bname between", value1, value2, "operatingRecordBname");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordBnameNotBetween(String value1, String value2) {
            addCriterion("operating_record_bname not between", value1, value2, "operatingRecordBname");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordThingIsNull() {
            addCriterion("operating_record_thing is null");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordThingIsNotNull() {
            addCriterion("operating_record_thing is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordThingEqualTo(String value) {
            addCriterion("operating_record_thing =", value, "operatingRecordThing");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordThingNotEqualTo(String value) {
            addCriterion("operating_record_thing <>", value, "operatingRecordThing");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordThingGreaterThan(String value) {
            addCriterion("operating_record_thing >", value, "operatingRecordThing");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordThingGreaterThanOrEqualTo(String value) {
            addCriterion("operating_record_thing >=", value, "operatingRecordThing");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordThingLessThan(String value) {
            addCriterion("operating_record_thing <", value, "operatingRecordThing");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordThingLessThanOrEqualTo(String value) {
            addCriterion("operating_record_thing <=", value, "operatingRecordThing");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordThingLike(String value) {
            addCriterion("operating_record_thing like", value, "operatingRecordThing");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordThingNotLike(String value) {
            addCriterion("operating_record_thing not like", value, "operatingRecordThing");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordThingIn(List<String> values) {
            addCriterion("operating_record_thing in", values, "operatingRecordThing");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordThingNotIn(List<String> values) {
            addCriterion("operating_record_thing not in", values, "operatingRecordThing");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordThingBetween(String value1, String value2) {
            addCriterion("operating_record_thing between", value1, value2, "operatingRecordThing");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordThingNotBetween(String value1, String value2) {
            addCriterion("operating_record_thing not between", value1, value2, "operatingRecordThing");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordTimeIsNull() {
            addCriterion("operating_record_time is null");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordTimeIsNotNull() {
            addCriterion("operating_record_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordTimeEqualTo(Date value) {
            addCriterion("operating_record_time =", value, "operatingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordTimeNotEqualTo(Date value) {
            addCriterion("operating_record_time <>", value, "operatingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordTimeGreaterThan(Date value) {
            addCriterion("operating_record_time >", value, "operatingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operating_record_time >=", value, "operatingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordTimeLessThan(Date value) {
            addCriterion("operating_record_time <", value, "operatingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("operating_record_time <=", value, "operatingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordTimeIn(List<Date> values) {
            addCriterion("operating_record_time in", values, "operatingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordTimeNotIn(List<Date> values) {
            addCriterion("operating_record_time not in", values, "operatingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordTimeBetween(Date value1, Date value2) {
            addCriterion("operating_record_time between", value1, value2, "operatingRecordTime");
            return (Criteria) this;
        }

        public Criteria andOperatingRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("operating_record_time not between", value1, value2, "operatingRecordTime");
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