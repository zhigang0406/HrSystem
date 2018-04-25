package scorponok.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Hr_TransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Hr_TransferExample() {
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

        public Criteria andTransferIdIsNull() {
            addCriterion("transfer_id is null");
            return (Criteria) this;
        }

        public Criteria andTransferIdIsNotNull() {
            addCriterion("transfer_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransferIdEqualTo(Long value) {
            addCriterion("transfer_id =", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotEqualTo(Long value) {
            addCriterion("transfer_id <>", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdGreaterThan(Long value) {
            addCriterion("transfer_id >", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdGreaterThanOrEqualTo(Long value) {
            addCriterion("transfer_id >=", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdLessThan(Long value) {
            addCriterion("transfer_id <", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdLessThanOrEqualTo(Long value) {
            addCriterion("transfer_id <=", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdIn(List<Long> values) {
            addCriterion("transfer_id in", values, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotIn(List<Long> values) {
            addCriterion("transfer_id not in", values, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdBetween(Long value1, Long value2) {
            addCriterion("transfer_id between", value1, value2, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotBetween(Long value1, Long value2) {
            addCriterion("transfer_id not between", value1, value2, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferNameIsNull() {
            addCriterion("transfer_name is null");
            return (Criteria) this;
        }

        public Criteria andTransferNameIsNotNull() {
            addCriterion("transfer_name is not null");
            return (Criteria) this;
        }

        public Criteria andTransferNameEqualTo(String value) {
            addCriterion("transfer_name =", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameNotEqualTo(String value) {
            addCriterion("transfer_name <>", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameGreaterThan(String value) {
            addCriterion("transfer_name >", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_name >=", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameLessThan(String value) {
            addCriterion("transfer_name <", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameLessThanOrEqualTo(String value) {
            addCriterion("transfer_name <=", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameLike(String value) {
            addCriterion("transfer_name like", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameNotLike(String value) {
            addCriterion("transfer_name not like", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameIn(List<String> values) {
            addCriterion("transfer_name in", values, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameNotIn(List<String> values) {
            addCriterion("transfer_name not in", values, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameBetween(String value1, String value2) {
            addCriterion("transfer_name between", value1, value2, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameNotBetween(String value1, String value2) {
            addCriterion("transfer_name not between", value1, value2, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferFdepartmentIsNull() {
            addCriterion("transfer_Fdepartment is null");
            return (Criteria) this;
        }

        public Criteria andTransferFdepartmentIsNotNull() {
            addCriterion("transfer_Fdepartment is not null");
            return (Criteria) this;
        }

        public Criteria andTransferFdepartmentEqualTo(Long value) {
            addCriterion("transfer_Fdepartment =", value, "transferFdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferFdepartmentNotEqualTo(Long value) {
            addCriterion("transfer_Fdepartment <>", value, "transferFdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferFdepartmentGreaterThan(Long value) {
            addCriterion("transfer_Fdepartment >", value, "transferFdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferFdepartmentGreaterThanOrEqualTo(Long value) {
            addCriterion("transfer_Fdepartment >=", value, "transferFdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferFdepartmentLessThan(Long value) {
            addCriterion("transfer_Fdepartment <", value, "transferFdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferFdepartmentLessThanOrEqualTo(Long value) {
            addCriterion("transfer_Fdepartment <=", value, "transferFdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferFdepartmentIn(List<Long> values) {
            addCriterion("transfer_Fdepartment in", values, "transferFdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferFdepartmentNotIn(List<Long> values) {
            addCriterion("transfer_Fdepartment not in", values, "transferFdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferFdepartmentBetween(Long value1, Long value2) {
            addCriterion("transfer_Fdepartment between", value1, value2, "transferFdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferFdepartmentNotBetween(Long value1, Long value2) {
            addCriterion("transfer_Fdepartment not between", value1, value2, "transferFdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferFpostIsNull() {
            addCriterion("transfer_Fpost is null");
            return (Criteria) this;
        }

        public Criteria andTransferFpostIsNotNull() {
            addCriterion("transfer_Fpost is not null");
            return (Criteria) this;
        }

        public Criteria andTransferFpostEqualTo(Long value) {
            addCriterion("transfer_Fpost =", value, "transferFpost");
            return (Criteria) this;
        }

        public Criteria andTransferFpostNotEqualTo(Long value) {
            addCriterion("transfer_Fpost <>", value, "transferFpost");
            return (Criteria) this;
        }

        public Criteria andTransferFpostGreaterThan(Long value) {
            addCriterion("transfer_Fpost >", value, "transferFpost");
            return (Criteria) this;
        }

        public Criteria andTransferFpostGreaterThanOrEqualTo(Long value) {
            addCriterion("transfer_Fpost >=", value, "transferFpost");
            return (Criteria) this;
        }

        public Criteria andTransferFpostLessThan(Long value) {
            addCriterion("transfer_Fpost <", value, "transferFpost");
            return (Criteria) this;
        }

        public Criteria andTransferFpostLessThanOrEqualTo(Long value) {
            addCriterion("transfer_Fpost <=", value, "transferFpost");
            return (Criteria) this;
        }

        public Criteria andTransferFpostIn(List<Long> values) {
            addCriterion("transfer_Fpost in", values, "transferFpost");
            return (Criteria) this;
        }

        public Criteria andTransferFpostNotIn(List<Long> values) {
            addCriterion("transfer_Fpost not in", values, "transferFpost");
            return (Criteria) this;
        }

        public Criteria andTransferFpostBetween(Long value1, Long value2) {
            addCriterion("transfer_Fpost between", value1, value2, "transferFpost");
            return (Criteria) this;
        }

        public Criteria andTransferFpostNotBetween(Long value1, Long value2) {
            addCriterion("transfer_Fpost not between", value1, value2, "transferFpost");
            return (Criteria) this;
        }

        public Criteria andTransferFshopIsNull() {
            addCriterion("transfer_Fshop is null");
            return (Criteria) this;
        }

        public Criteria andTransferFshopIsNotNull() {
            addCriterion("transfer_Fshop is not null");
            return (Criteria) this;
        }

        public Criteria andTransferFshopEqualTo(String value) {
            addCriterion("transfer_Fshop =", value, "transferFshop");
            return (Criteria) this;
        }

        public Criteria andTransferFshopNotEqualTo(String value) {
            addCriterion("transfer_Fshop <>", value, "transferFshop");
            return (Criteria) this;
        }

        public Criteria andTransferFshopGreaterThan(String value) {
            addCriterion("transfer_Fshop >", value, "transferFshop");
            return (Criteria) this;
        }

        public Criteria andTransferFshopGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_Fshop >=", value, "transferFshop");
            return (Criteria) this;
        }

        public Criteria andTransferFshopLessThan(String value) {
            addCriterion("transfer_Fshop <", value, "transferFshop");
            return (Criteria) this;
        }

        public Criteria andTransferFshopLessThanOrEqualTo(String value) {
            addCriterion("transfer_Fshop <=", value, "transferFshop");
            return (Criteria) this;
        }

        public Criteria andTransferFshopLike(String value) {
            addCriterion("transfer_Fshop like", value, "transferFshop");
            return (Criteria) this;
        }

        public Criteria andTransferFshopNotLike(String value) {
            addCriterion("transfer_Fshop not like", value, "transferFshop");
            return (Criteria) this;
        }

        public Criteria andTransferFshopIn(List<String> values) {
            addCriterion("transfer_Fshop in", values, "transferFshop");
            return (Criteria) this;
        }

        public Criteria andTransferFshopNotIn(List<String> values) {
            addCriterion("transfer_Fshop not in", values, "transferFshop");
            return (Criteria) this;
        }

        public Criteria andTransferFshopBetween(String value1, String value2) {
            addCriterion("transfer_Fshop between", value1, value2, "transferFshop");
            return (Criteria) this;
        }

        public Criteria andTransferFshopNotBetween(String value1, String value2) {
            addCriterion("transfer_Fshop not between", value1, value2, "transferFshop");
            return (Criteria) this;
        }

        public Criteria andTransferLdepartmentIsNull() {
            addCriterion("transfer_Ldepartment is null");
            return (Criteria) this;
        }

        public Criteria andTransferLdepartmentIsNotNull() {
            addCriterion("transfer_Ldepartment is not null");
            return (Criteria) this;
        }

        public Criteria andTransferLdepartmentEqualTo(Long value) {
            addCriterion("transfer_Ldepartment =", value, "transferLdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferLdepartmentNotEqualTo(Long value) {
            addCriterion("transfer_Ldepartment <>", value, "transferLdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferLdepartmentGreaterThan(Long value) {
            addCriterion("transfer_Ldepartment >", value, "transferLdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferLdepartmentGreaterThanOrEqualTo(Long value) {
            addCriterion("transfer_Ldepartment >=", value, "transferLdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferLdepartmentLessThan(Long value) {
            addCriterion("transfer_Ldepartment <", value, "transferLdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferLdepartmentLessThanOrEqualTo(Long value) {
            addCriterion("transfer_Ldepartment <=", value, "transferLdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferLdepartmentIn(List<Long> values) {
            addCriterion("transfer_Ldepartment in", values, "transferLdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferLdepartmentNotIn(List<Long> values) {
            addCriterion("transfer_Ldepartment not in", values, "transferLdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferLdepartmentBetween(Long value1, Long value2) {
            addCriterion("transfer_Ldepartment between", value1, value2, "transferLdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferLdepartmentNotBetween(Long value1, Long value2) {
            addCriterion("transfer_Ldepartment not between", value1, value2, "transferLdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferLpostIsNull() {
            addCriterion("transfer_Lpost is null");
            return (Criteria) this;
        }

        public Criteria andTransferLpostIsNotNull() {
            addCriterion("transfer_Lpost is not null");
            return (Criteria) this;
        }

        public Criteria andTransferLpostEqualTo(Long value) {
            addCriterion("transfer_Lpost =", value, "transferLpost");
            return (Criteria) this;
        }

        public Criteria andTransferLpostNotEqualTo(Long value) {
            addCriterion("transfer_Lpost <>", value, "transferLpost");
            return (Criteria) this;
        }

        public Criteria andTransferLpostGreaterThan(Long value) {
            addCriterion("transfer_Lpost >", value, "transferLpost");
            return (Criteria) this;
        }

        public Criteria andTransferLpostGreaterThanOrEqualTo(Long value) {
            addCriterion("transfer_Lpost >=", value, "transferLpost");
            return (Criteria) this;
        }

        public Criteria andTransferLpostLessThan(Long value) {
            addCriterion("transfer_Lpost <", value, "transferLpost");
            return (Criteria) this;
        }

        public Criteria andTransferLpostLessThanOrEqualTo(Long value) {
            addCriterion("transfer_Lpost <=", value, "transferLpost");
            return (Criteria) this;
        }

        public Criteria andTransferLpostIn(List<Long> values) {
            addCriterion("transfer_Lpost in", values, "transferLpost");
            return (Criteria) this;
        }

        public Criteria andTransferLpostNotIn(List<Long> values) {
            addCriterion("transfer_Lpost not in", values, "transferLpost");
            return (Criteria) this;
        }

        public Criteria andTransferLpostBetween(Long value1, Long value2) {
            addCriterion("transfer_Lpost between", value1, value2, "transferLpost");
            return (Criteria) this;
        }

        public Criteria andTransferLpostNotBetween(Long value1, Long value2) {
            addCriterion("transfer_Lpost not between", value1, value2, "transferLpost");
            return (Criteria) this;
        }

        public Criteria andTransferLshopIsNull() {
            addCriterion("transfer_Lshop is null");
            return (Criteria) this;
        }

        public Criteria andTransferLshopIsNotNull() {
            addCriterion("transfer_Lshop is not null");
            return (Criteria) this;
        }

        public Criteria andTransferLshopEqualTo(String value) {
            addCriterion("transfer_Lshop =", value, "transferLshop");
            return (Criteria) this;
        }

        public Criteria andTransferLshopNotEqualTo(String value) {
            addCriterion("transfer_Lshop <>", value, "transferLshop");
            return (Criteria) this;
        }

        public Criteria andTransferLshopGreaterThan(String value) {
            addCriterion("transfer_Lshop >", value, "transferLshop");
            return (Criteria) this;
        }

        public Criteria andTransferLshopGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_Lshop >=", value, "transferLshop");
            return (Criteria) this;
        }

        public Criteria andTransferLshopLessThan(String value) {
            addCriterion("transfer_Lshop <", value, "transferLshop");
            return (Criteria) this;
        }

        public Criteria andTransferLshopLessThanOrEqualTo(String value) {
            addCriterion("transfer_Lshop <=", value, "transferLshop");
            return (Criteria) this;
        }

        public Criteria andTransferLshopLike(String value) {
            addCriterion("transfer_Lshop like", value, "transferLshop");
            return (Criteria) this;
        }

        public Criteria andTransferLshopNotLike(String value) {
            addCriterion("transfer_Lshop not like", value, "transferLshop");
            return (Criteria) this;
        }

        public Criteria andTransferLshopIn(List<String> values) {
            addCriterion("transfer_Lshop in", values, "transferLshop");
            return (Criteria) this;
        }

        public Criteria andTransferLshopNotIn(List<String> values) {
            addCriterion("transfer_Lshop not in", values, "transferLshop");
            return (Criteria) this;
        }

        public Criteria andTransferLshopBetween(String value1, String value2) {
            addCriterion("transfer_Lshop between", value1, value2, "transferLshop");
            return (Criteria) this;
        }

        public Criteria andTransferLshopNotBetween(String value1, String value2) {
            addCriterion("transfer_Lshop not between", value1, value2, "transferLshop");
            return (Criteria) this;
        }

        public Criteria andTransferReasonIsNull() {
            addCriterion("transfer_reason is null");
            return (Criteria) this;
        }

        public Criteria andTransferReasonIsNotNull() {
            addCriterion("transfer_reason is not null");
            return (Criteria) this;
        }

        public Criteria andTransferReasonEqualTo(String value) {
            addCriterion("transfer_reason =", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonNotEqualTo(String value) {
            addCriterion("transfer_reason <>", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonGreaterThan(String value) {
            addCriterion("transfer_reason >", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_reason >=", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonLessThan(String value) {
            addCriterion("transfer_reason <", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonLessThanOrEqualTo(String value) {
            addCriterion("transfer_reason <=", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonLike(String value) {
            addCriterion("transfer_reason like", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonNotLike(String value) {
            addCriterion("transfer_reason not like", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonIn(List<String> values) {
            addCriterion("transfer_reason in", values, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonNotIn(List<String> values) {
            addCriterion("transfer_reason not in", values, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonBetween(String value1, String value2) {
            addCriterion("transfer_reason between", value1, value2, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonNotBetween(String value1, String value2) {
            addCriterion("transfer_reason not between", value1, value2, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferOperatorIsNull() {
            addCriterion("transfer_operator is null");
            return (Criteria) this;
        }

        public Criteria andTransferOperatorIsNotNull() {
            addCriterion("transfer_operator is not null");
            return (Criteria) this;
        }

        public Criteria andTransferOperatorEqualTo(String value) {
            addCriterion("transfer_operator =", value, "transferOperator");
            return (Criteria) this;
        }

        public Criteria andTransferOperatorNotEqualTo(String value) {
            addCriterion("transfer_operator <>", value, "transferOperator");
            return (Criteria) this;
        }

        public Criteria andTransferOperatorGreaterThan(String value) {
            addCriterion("transfer_operator >", value, "transferOperator");
            return (Criteria) this;
        }

        public Criteria andTransferOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_operator >=", value, "transferOperator");
            return (Criteria) this;
        }

        public Criteria andTransferOperatorLessThan(String value) {
            addCriterion("transfer_operator <", value, "transferOperator");
            return (Criteria) this;
        }

        public Criteria andTransferOperatorLessThanOrEqualTo(String value) {
            addCriterion("transfer_operator <=", value, "transferOperator");
            return (Criteria) this;
        }

        public Criteria andTransferOperatorLike(String value) {
            addCriterion("transfer_operator like", value, "transferOperator");
            return (Criteria) this;
        }

        public Criteria andTransferOperatorNotLike(String value) {
            addCriterion("transfer_operator not like", value, "transferOperator");
            return (Criteria) this;
        }

        public Criteria andTransferOperatorIn(List<String> values) {
            addCriterion("transfer_operator in", values, "transferOperator");
            return (Criteria) this;
        }

        public Criteria andTransferOperatorNotIn(List<String> values) {
            addCriterion("transfer_operator not in", values, "transferOperator");
            return (Criteria) this;
        }

        public Criteria andTransferOperatorBetween(String value1, String value2) {
            addCriterion("transfer_operator between", value1, value2, "transferOperator");
            return (Criteria) this;
        }

        public Criteria andTransferOperatorNotBetween(String value1, String value2) {
            addCriterion("transfer_operator not between", value1, value2, "transferOperator");
            return (Criteria) this;
        }

        public Criteria andOperatorDepartmentIsNull() {
            addCriterion("operator_department is null");
            return (Criteria) this;
        }

        public Criteria andOperatorDepartmentIsNotNull() {
            addCriterion("operator_department is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorDepartmentEqualTo(Long value) {
            addCriterion("operator_department =", value, "operatorDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatorDepartmentNotEqualTo(Long value) {
            addCriterion("operator_department <>", value, "operatorDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatorDepartmentGreaterThan(Long value) {
            addCriterion("operator_department >", value, "operatorDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatorDepartmentGreaterThanOrEqualTo(Long value) {
            addCriterion("operator_department >=", value, "operatorDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatorDepartmentLessThan(Long value) {
            addCriterion("operator_department <", value, "operatorDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatorDepartmentLessThanOrEqualTo(Long value) {
            addCriterion("operator_department <=", value, "operatorDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatorDepartmentIn(List<Long> values) {
            addCriterion("operator_department in", values, "operatorDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatorDepartmentNotIn(List<Long> values) {
            addCriterion("operator_department not in", values, "operatorDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatorDepartmentBetween(Long value1, Long value2) {
            addCriterion("operator_department between", value1, value2, "operatorDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatorDepartmentNotBetween(Long value1, Long value2) {
            addCriterion("operator_department not between", value1, value2, "operatorDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatorPostIsNull() {
            addCriterion("operator_post is null");
            return (Criteria) this;
        }

        public Criteria andOperatorPostIsNotNull() {
            addCriterion("operator_post is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorPostEqualTo(Long value) {
            addCriterion("operator_post =", value, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostNotEqualTo(Long value) {
            addCriterion("operator_post <>", value, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostGreaterThan(Long value) {
            addCriterion("operator_post >", value, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostGreaterThanOrEqualTo(Long value) {
            addCriterion("operator_post >=", value, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostLessThan(Long value) {
            addCriterion("operator_post <", value, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostLessThanOrEqualTo(Long value) {
            addCriterion("operator_post <=", value, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostIn(List<Long> values) {
            addCriterion("operator_post in", values, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostNotIn(List<Long> values) {
            addCriterion("operator_post not in", values, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostBetween(Long value1, Long value2) {
            addCriterion("operator_post between", value1, value2, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostNotBetween(Long value1, Long value2) {
            addCriterion("operator_post not between", value1, value2, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andTransferTimeIsNull() {
            addCriterion("transfer_time is null");
            return (Criteria) this;
        }

        public Criteria andTransferTimeIsNotNull() {
            addCriterion("transfer_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransferTimeEqualTo(Date value) {
            addCriterionForJDBCDate("transfer_time =", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("transfer_time <>", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("transfer_time >", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("transfer_time >=", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeLessThan(Date value) {
            addCriterionForJDBCDate("transfer_time <", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("transfer_time <=", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeIn(List<Date> values) {
            addCriterionForJDBCDate("transfer_time in", values, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("transfer_time not in", values, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("transfer_time between", value1, value2, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("transfer_time not between", value1, value2, "transferTime");
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