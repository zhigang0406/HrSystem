package scorponok.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hr_AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Hr_AccountExample() {
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

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Long value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Long value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Long value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Long value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Long> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Long> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Long value1, Long value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIsNull() {
            addCriterion("account_number is null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIsNotNull() {
            addCriterion("account_number is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberEqualTo(String value) {
            addCriterion("account_number =", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotEqualTo(String value) {
            addCriterion("account_number <>", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberGreaterThan(String value) {
            addCriterion("account_number >", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("account_number >=", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLessThan(String value) {
            addCriterion("account_number <", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("account_number <=", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLike(String value) {
            addCriterion("account_number like", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotLike(String value) {
            addCriterion("account_number not like", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIn(List<String> values) {
            addCriterion("account_number in", values, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotIn(List<String> values) {
            addCriterion("account_number not in", values, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberBetween(String value1, String value2) {
            addCriterion("account_number between", value1, value2, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotBetween(String value1, String value2) {
            addCriterion("account_number not between", value1, value2, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordIsNull() {
            addCriterion("account_password is null");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordIsNotNull() {
            addCriterion("account_password is not null");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordEqualTo(String value) {
            addCriterion("account_password =", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotEqualTo(String value) {
            addCriterion("account_password <>", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordGreaterThan(String value) {
            addCriterion("account_password >", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("account_password >=", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordLessThan(String value) {
            addCriterion("account_password <", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordLessThanOrEqualTo(String value) {
            addCriterion("account_password <=", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordLike(String value) {
            addCriterion("account_password like", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotLike(String value) {
            addCriterion("account_password not like", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordIn(List<String> values) {
            addCriterion("account_password in", values, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotIn(List<String> values) {
            addCriterion("account_password not in", values, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordBetween(String value1, String value2) {
            addCriterion("account_password between", value1, value2, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotBetween(String value1, String value2) {
            addCriterion("account_password not between", value1, value2, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountLoginTimeIsNull() {
            addCriterion("\"account_login time\" is null");
            return (Criteria) this;
        }

        public Criteria andAccountLoginTimeIsNotNull() {
            addCriterion("\"account_login time\" is not null");
            return (Criteria) this;
        }

        public Criteria andAccountLoginTimeEqualTo(Date value) {
            addCriterion("\"account_login time\" =", value, "accountLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLoginTimeNotEqualTo(Date value) {
            addCriterion("\"account_login time\" <>", value, "accountLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLoginTimeGreaterThan(Date value) {
            addCriterion("\"account_login time\" >", value, "accountLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"account_login time\" >=", value, "accountLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLoginTimeLessThan(Date value) {
            addCriterion("\"account_login time\" <", value, "accountLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("\"account_login time\" <=", value, "accountLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLoginTimeIn(List<Date> values) {
            addCriterion("\"account_login time\" in", values, "accountLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLoginTimeNotIn(List<Date> values) {
            addCriterion("\"account_login time\" not in", values, "accountLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLoginTimeBetween(Date value1, Date value2) {
            addCriterion("\"account_login time\" between", value1, value2, "accountLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("\"account_login time\" not between", value1, value2, "accountLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIsNull() {
            addCriterion("account_status is null");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIsNotNull() {
            addCriterion("account_status is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStatusEqualTo(Long value) {
            addCriterion("account_status =", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotEqualTo(Long value) {
            addCriterion("account_status <>", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusGreaterThan(Long value) {
            addCriterion("account_status >", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("account_status >=", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLessThan(Long value) {
            addCriterion("account_status <", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLessThanOrEqualTo(Long value) {
            addCriterion("account_status <=", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIn(List<Long> values) {
            addCriterion("account_status in", values, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotIn(List<Long> values) {
            addCriterion("account_status not in", values, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusBetween(Long value1, Long value2) {
            addCriterion("account_status between", value1, value2, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotBetween(Long value1, Long value2) {
            addCriterion("account_status not between", value1, value2, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountUseridIsNull() {
            addCriterion("account_userid is null");
            return (Criteria) this;
        }

        public Criteria andAccountUseridIsNotNull() {
            addCriterion("account_userid is not null");
            return (Criteria) this;
        }

        public Criteria andAccountUseridEqualTo(Long value) {
            addCriterion("account_userid =", value, "accountUserid");
            return (Criteria) this;
        }

        public Criteria andAccountUseridNotEqualTo(Long value) {
            addCriterion("account_userid <>", value, "accountUserid");
            return (Criteria) this;
        }

        public Criteria andAccountUseridGreaterThan(Long value) {
            addCriterion("account_userid >", value, "accountUserid");
            return (Criteria) this;
        }

        public Criteria andAccountUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("account_userid >=", value, "accountUserid");
            return (Criteria) this;
        }

        public Criteria andAccountUseridLessThan(Long value) {
            addCriterion("account_userid <", value, "accountUserid");
            return (Criteria) this;
        }

        public Criteria andAccountUseridLessThanOrEqualTo(Long value) {
            addCriterion("account_userid <=", value, "accountUserid");
            return (Criteria) this;
        }

        public Criteria andAccountUseridIn(List<Long> values) {
            addCriterion("account_userid in", values, "accountUserid");
            return (Criteria) this;
        }

        public Criteria andAccountUseridNotIn(List<Long> values) {
            addCriterion("account_userid not in", values, "accountUserid");
            return (Criteria) this;
        }

        public Criteria andAccountUseridBetween(Long value1, Long value2) {
            addCriterion("account_userid between", value1, value2, "accountUserid");
            return (Criteria) this;
        }

        public Criteria andAccountUseridNotBetween(Long value1, Long value2) {
            addCriterion("account_userid not between", value1, value2, "accountUserid");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatatimeIsNull() {
            addCriterion("account_updatatime is null");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatatimeIsNotNull() {
            addCriterion("account_updatatime is not null");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatatimeEqualTo(Date value) {
            addCriterion("account_updatatime =", value, "accountUpdatatime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatatimeNotEqualTo(Date value) {
            addCriterion("account_updatatime <>", value, "accountUpdatatime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatatimeGreaterThan(Date value) {
            addCriterion("account_updatatime >", value, "accountUpdatatime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("account_updatatime >=", value, "accountUpdatatime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatatimeLessThan(Date value) {
            addCriterion("account_updatatime <", value, "accountUpdatatime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatatimeLessThanOrEqualTo(Date value) {
            addCriterion("account_updatatime <=", value, "accountUpdatatime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatatimeIn(List<Date> values) {
            addCriterion("account_updatatime in", values, "accountUpdatatime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatatimeNotIn(List<Date> values) {
            addCriterion("account_updatatime not in", values, "accountUpdatatime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatatimeBetween(Date value1, Date value2) {
            addCriterion("account_updatatime between", value1, value2, "accountUpdatatime");
            return (Criteria) this;
        }

        public Criteria andAccountUpdatatimeNotBetween(Date value1, Date value2) {
            addCriterion("account_updatatime not between", value1, value2, "accountUpdatatime");
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