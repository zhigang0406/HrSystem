package scorponok.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Hr_UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Hr_UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserJobNumberIsNull() {
            addCriterion("user_job_number is null");
            return (Criteria) this;
        }

        public Criteria andUserJobNumberIsNotNull() {
            addCriterion("user_job_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserJobNumberEqualTo(String value) {
            addCriterion("user_job_number =", value, "userJobNumber");
            return (Criteria) this;
        }

        public Criteria andUserJobNumberNotEqualTo(String value) {
            addCriterion("user_job_number <>", value, "userJobNumber");
            return (Criteria) this;
        }

        public Criteria andUserJobNumberGreaterThan(String value) {
            addCriterion("user_job_number >", value, "userJobNumber");
            return (Criteria) this;
        }

        public Criteria andUserJobNumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_job_number >=", value, "userJobNumber");
            return (Criteria) this;
        }

        public Criteria andUserJobNumberLessThan(String value) {
            addCriterion("user_job_number <", value, "userJobNumber");
            return (Criteria) this;
        }

        public Criteria andUserJobNumberLessThanOrEqualTo(String value) {
            addCriterion("user_job_number <=", value, "userJobNumber");
            return (Criteria) this;
        }

        public Criteria andUserJobNumberLike(String value) {
            addCriterion("user_job_number like", value, "userJobNumber");
            return (Criteria) this;
        }

        public Criteria andUserJobNumberNotLike(String value) {
            addCriterion("user_job_number not like", value, "userJobNumber");
            return (Criteria) this;
        }

        public Criteria andUserJobNumberIn(List<String> values) {
            addCriterion("user_job_number in", values, "userJobNumber");
            return (Criteria) this;
        }

        public Criteria andUserJobNumberNotIn(List<String> values) {
            addCriterion("user_job_number not in", values, "userJobNumber");
            return (Criteria) this;
        }

        public Criteria andUserJobNumberBetween(String value1, String value2) {
            addCriterion("user_job_number between", value1, value2, "userJobNumber");
            return (Criteria) this;
        }

        public Criteria andUserJobNumberNotBetween(String value1, String value2) {
            addCriterion("user_job_number not between", value1, value2, "userJobNumber");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(Long value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(Long value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(Long value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(Long value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(Long value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(Long value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<Long> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<Long> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(Long value1, Long value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(Long value1, Long value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserShopNumberIsNull() {
            addCriterion("user_shop_number is null");
            return (Criteria) this;
        }

        public Criteria andUserShopNumberIsNotNull() {
            addCriterion("user_shop_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserShopNumberEqualTo(String value) {
            addCriterion("user_shop_number =", value, "userShopNumber");
            return (Criteria) this;
        }

        public Criteria andUserShopNumberNotEqualTo(String value) {
            addCriterion("user_shop_number <>", value, "userShopNumber");
            return (Criteria) this;
        }

        public Criteria andUserShopNumberGreaterThan(String value) {
            addCriterion("user_shop_number >", value, "userShopNumber");
            return (Criteria) this;
        }

        public Criteria andUserShopNumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_shop_number >=", value, "userShopNumber");
            return (Criteria) this;
        }

        public Criteria andUserShopNumberLessThan(String value) {
            addCriterion("user_shop_number <", value, "userShopNumber");
            return (Criteria) this;
        }

        public Criteria andUserShopNumberLessThanOrEqualTo(String value) {
            addCriterion("user_shop_number <=", value, "userShopNumber");
            return (Criteria) this;
        }

        public Criteria andUserShopNumberLike(String value) {
            addCriterion("user_shop_number like", value, "userShopNumber");
            return (Criteria) this;
        }

        public Criteria andUserShopNumberNotLike(String value) {
            addCriterion("user_shop_number not like", value, "userShopNumber");
            return (Criteria) this;
        }

        public Criteria andUserShopNumberIn(List<String> values) {
            addCriterion("user_shop_number in", values, "userShopNumber");
            return (Criteria) this;
        }

        public Criteria andUserShopNumberNotIn(List<String> values) {
            addCriterion("user_shop_number not in", values, "userShopNumber");
            return (Criteria) this;
        }

        public Criteria andUserShopNumberBetween(String value1, String value2) {
            addCriterion("user_shop_number between", value1, value2, "userShopNumber");
            return (Criteria) this;
        }

        public Criteria andUserShopNumberNotBetween(String value1, String value2) {
            addCriterion("user_shop_number not between", value1, value2, "userShopNumber");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentIsNull() {
            addCriterion("user_department is null");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentIsNotNull() {
            addCriterion("user_department is not null");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentEqualTo(Long value) {
            addCriterion("user_department =", value, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentNotEqualTo(Long value) {
            addCriterion("user_department <>", value, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentGreaterThan(Long value) {
            addCriterion("user_department >", value, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentGreaterThanOrEqualTo(Long value) {
            addCriterion("user_department >=", value, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentLessThan(Long value) {
            addCriterion("user_department <", value, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentLessThanOrEqualTo(Long value) {
            addCriterion("user_department <=", value, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentIn(List<Long> values) {
            addCriterion("user_department in", values, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentNotIn(List<Long> values) {
            addCriterion("user_department not in", values, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentBetween(Long value1, Long value2) {
            addCriterion("user_department between", value1, value2, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentNotBetween(Long value1, Long value2) {
            addCriterion("user_department not between", value1, value2, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserPostIsNull() {
            addCriterion("user_post is null");
            return (Criteria) this;
        }

        public Criteria andUserPostIsNotNull() {
            addCriterion("user_post is not null");
            return (Criteria) this;
        }

        public Criteria andUserPostEqualTo(Long value) {
            addCriterion("user_post =", value, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostNotEqualTo(Long value) {
            addCriterion("user_post <>", value, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostGreaterThan(Long value) {
            addCriterion("user_post >", value, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostGreaterThanOrEqualTo(Long value) {
            addCriterion("user_post >=", value, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostLessThan(Long value) {
            addCriterion("user_post <", value, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostLessThanOrEqualTo(Long value) {
            addCriterion("user_post <=", value, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostIn(List<Long> values) {
            addCriterion("user_post in", values, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostNotIn(List<Long> values) {
            addCriterion("user_post not in", values, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostBetween(Long value1, Long value2) {
            addCriterion("user_post between", value1, value2, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostNotBetween(Long value1, Long value2) {
            addCriterion("user_post not between", value1, value2, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostGradeIsNull() {
            addCriterion("user_post_grade is null");
            return (Criteria) this;
        }

        public Criteria andUserPostGradeIsNotNull() {
            addCriterion("user_post_grade is not null");
            return (Criteria) this;
        }

        public Criteria andUserPostGradeEqualTo(String value) {
            addCriterion("user_post_grade =", value, "userPostGrade");
            return (Criteria) this;
        }

        public Criteria andUserPostGradeNotEqualTo(String value) {
            addCriterion("user_post_grade <>", value, "userPostGrade");
            return (Criteria) this;
        }

        public Criteria andUserPostGradeGreaterThan(String value) {
            addCriterion("user_post_grade >", value, "userPostGrade");
            return (Criteria) this;
        }

        public Criteria andUserPostGradeGreaterThanOrEqualTo(String value) {
            addCriterion("user_post_grade >=", value, "userPostGrade");
            return (Criteria) this;
        }

        public Criteria andUserPostGradeLessThan(String value) {
            addCriterion("user_post_grade <", value, "userPostGrade");
            return (Criteria) this;
        }

        public Criteria andUserPostGradeLessThanOrEqualTo(String value) {
            addCriterion("user_post_grade <=", value, "userPostGrade");
            return (Criteria) this;
        }

        public Criteria andUserPostGradeLike(String value) {
            addCriterion("user_post_grade like", value, "userPostGrade");
            return (Criteria) this;
        }

        public Criteria andUserPostGradeNotLike(String value) {
            addCriterion("user_post_grade not like", value, "userPostGrade");
            return (Criteria) this;
        }

        public Criteria andUserPostGradeIn(List<String> values) {
            addCriterion("user_post_grade in", values, "userPostGrade");
            return (Criteria) this;
        }

        public Criteria andUserPostGradeNotIn(List<String> values) {
            addCriterion("user_post_grade not in", values, "userPostGrade");
            return (Criteria) this;
        }

        public Criteria andUserPostGradeBetween(String value1, String value2) {
            addCriterion("user_post_grade between", value1, value2, "userPostGrade");
            return (Criteria) this;
        }

        public Criteria andUserPostGradeNotBetween(String value1, String value2) {
            addCriterion("user_post_grade not between", value1, value2, "userPostGrade");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardIsNull() {
            addCriterion("user_identity_card is null");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardIsNotNull() {
            addCriterion("user_identity_card is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardEqualTo(String value) {
            addCriterion("user_identity_card =", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardNotEqualTo(String value) {
            addCriterion("user_identity_card <>", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardGreaterThan(String value) {
            addCriterion("user_identity_card >", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardGreaterThanOrEqualTo(String value) {
            addCriterion("user_identity_card >=", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardLessThan(String value) {
            addCriterion("user_identity_card <", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardLessThanOrEqualTo(String value) {
            addCriterion("user_identity_card <=", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardLike(String value) {
            addCriterion("user_identity_card like", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardNotLike(String value) {
            addCriterion("user_identity_card not like", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardIn(List<String> values) {
            addCriterion("user_identity_card in", values, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardNotIn(List<String> values) {
            addCriterion("user_identity_card not in", values, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardBetween(String value1, String value2) {
            addCriterion("user_identity_card between", value1, value2, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardNotBetween(String value1, String value2) {
            addCriterion("user_identity_card not between", value1, value2, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserEntryTimeIsNull() {
            addCriterion("user_entry_time is null");
            return (Criteria) this;
        }

        public Criteria andUserEntryTimeIsNotNull() {
            addCriterion("user_entry_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserEntryTimeEqualTo(Date value) {
            addCriterionForJDBCDate("user_entry_time =", value, "userEntryTime");
            return (Criteria) this;
        }

        public Criteria andUserEntryTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_entry_time <>", value, "userEntryTime");
            return (Criteria) this;
        }

        public Criteria andUserEntryTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("user_entry_time >", value, "userEntryTime");
            return (Criteria) this;
        }

        public Criteria andUserEntryTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_entry_time >=", value, "userEntryTime");
            return (Criteria) this;
        }

        public Criteria andUserEntryTimeLessThan(Date value) {
            addCriterionForJDBCDate("user_entry_time <", value, "userEntryTime");
            return (Criteria) this;
        }

        public Criteria andUserEntryTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_entry_time <=", value, "userEntryTime");
            return (Criteria) this;
        }

        public Criteria andUserEntryTimeIn(List<Date> values) {
            addCriterionForJDBCDate("user_entry_time in", values, "userEntryTime");
            return (Criteria) this;
        }

        public Criteria andUserEntryTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_entry_time not in", values, "userEntryTime");
            return (Criteria) this;
        }

        public Criteria andUserEntryTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_entry_time between", value1, value2, "userEntryTime");
            return (Criteria) this;
        }

        public Criteria andUserEntryTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_entry_time not between", value1, value2, "userEntryTime");
            return (Criteria) this;
        }

        public Criteria andUserRegularTimeIsNull() {
            addCriterion("user_regular_time is null");
            return (Criteria) this;
        }

        public Criteria andUserRegularTimeIsNotNull() {
            addCriterion("user_regular_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegularTimeEqualTo(Date value) {
            addCriterionForJDBCDate("user_regular_time =", value, "userRegularTime");
            return (Criteria) this;
        }

        public Criteria andUserRegularTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_regular_time <>", value, "userRegularTime");
            return (Criteria) this;
        }

        public Criteria andUserRegularTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("user_regular_time >", value, "userRegularTime");
            return (Criteria) this;
        }

        public Criteria andUserRegularTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_regular_time >=", value, "userRegularTime");
            return (Criteria) this;
        }

        public Criteria andUserRegularTimeLessThan(Date value) {
            addCriterionForJDBCDate("user_regular_time <", value, "userRegularTime");
            return (Criteria) this;
        }

        public Criteria andUserRegularTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_regular_time <=", value, "userRegularTime");
            return (Criteria) this;
        }

        public Criteria andUserRegularTimeIn(List<Date> values) {
            addCriterionForJDBCDate("user_regular_time in", values, "userRegularTime");
            return (Criteria) this;
        }

        public Criteria andUserRegularTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_regular_time not in", values, "userRegularTime");
            return (Criteria) this;
        }

        public Criteria andUserRegularTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_regular_time between", value1, value2, "userRegularTime");
            return (Criteria) this;
        }

        public Criteria andUserRegularTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_regular_time not between", value1, value2, "userRegularTime");
            return (Criteria) this;
        }

        public Criteria andUserYworkingAgeIsNull() {
            addCriterion("user_Yworking_age is null");
            return (Criteria) this;
        }

        public Criteria andUserYworkingAgeIsNotNull() {
            addCriterion("user_Yworking_age is not null");
            return (Criteria) this;
        }

        public Criteria andUserYworkingAgeEqualTo(Long value) {
            addCriterion("user_Yworking_age =", value, "userYworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserYworkingAgeNotEqualTo(Long value) {
            addCriterion("user_Yworking_age <>", value, "userYworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserYworkingAgeGreaterThan(Long value) {
            addCriterion("user_Yworking_age >", value, "userYworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserYworkingAgeGreaterThanOrEqualTo(Long value) {
            addCriterion("user_Yworking_age >=", value, "userYworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserYworkingAgeLessThan(Long value) {
            addCriterion("user_Yworking_age <", value, "userYworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserYworkingAgeLessThanOrEqualTo(Long value) {
            addCriterion("user_Yworking_age <=", value, "userYworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserYworkingAgeIn(List<Long> values) {
            addCriterion("user_Yworking_age in", values, "userYworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserYworkingAgeNotIn(List<Long> values) {
            addCriterion("user_Yworking_age not in", values, "userYworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserYworkingAgeBetween(Long value1, Long value2) {
            addCriterion("user_Yworking_age between", value1, value2, "userYworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserYworkingAgeNotBetween(Long value1, Long value2) {
            addCriterion("user_Yworking_age not between", value1, value2, "userYworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserMworkingAgeIsNull() {
            addCriterion("user_Mworking_age is null");
            return (Criteria) this;
        }

        public Criteria andUserMworkingAgeIsNotNull() {
            addCriterion("user_Mworking_age is not null");
            return (Criteria) this;
        }

        public Criteria andUserMworkingAgeEqualTo(Long value) {
            addCriterion("user_Mworking_age =", value, "userMworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserMworkingAgeNotEqualTo(Long value) {
            addCriterion("user_Mworking_age <>", value, "userMworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserMworkingAgeGreaterThan(Long value) {
            addCriterion("user_Mworking_age >", value, "userMworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserMworkingAgeGreaterThanOrEqualTo(Long value) {
            addCriterion("user_Mworking_age >=", value, "userMworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserMworkingAgeLessThan(Long value) {
            addCriterion("user_Mworking_age <", value, "userMworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserMworkingAgeLessThanOrEqualTo(Long value) {
            addCriterion("user_Mworking_age <=", value, "userMworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserMworkingAgeIn(List<Long> values) {
            addCriterion("user_Mworking_age in", values, "userMworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserMworkingAgeNotIn(List<Long> values) {
            addCriterion("user_Mworking_age not in", values, "userMworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserMworkingAgeBetween(Long value1, Long value2) {
            addCriterion("user_Mworking_age between", value1, value2, "userMworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserMworkingAgeNotBetween(Long value1, Long value2) {
            addCriterion("user_Mworking_age not between", value1, value2, "userMworkingAge");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIsNull() {
            addCriterion("user_province is null");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIsNotNull() {
            addCriterion("user_province is not null");
            return (Criteria) this;
        }

        public Criteria andUserProvinceEqualTo(String value) {
            addCriterion("user_province =", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotEqualTo(String value) {
            addCriterion("user_province <>", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceGreaterThan(String value) {
            addCriterion("user_province >", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("user_province >=", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLessThan(String value) {
            addCriterion("user_province <", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLessThanOrEqualTo(String value) {
            addCriterion("user_province <=", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLike(String value) {
            addCriterion("user_province like", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotLike(String value) {
            addCriterion("user_province not like", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIn(List<String> values) {
            addCriterion("user_province in", values, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotIn(List<String> values) {
            addCriterion("user_province not in", values, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceBetween(String value1, String value2) {
            addCriterion("user_province between", value1, value2, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotBetween(String value1, String value2) {
            addCriterion("user_province not between", value1, value2, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNull() {
            addCriterion("user_city is null");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNotNull() {
            addCriterion("user_city is not null");
            return (Criteria) this;
        }

        public Criteria andUserCityEqualTo(String value) {
            addCriterion("user_city =", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotEqualTo(String value) {
            addCriterion("user_city <>", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThan(String value) {
            addCriterion("user_city >", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThanOrEqualTo(String value) {
            addCriterion("user_city >=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThan(String value) {
            addCriterion("user_city <", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThanOrEqualTo(String value) {
            addCriterion("user_city <=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLike(String value) {
            addCriterion("user_city like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotLike(String value) {
            addCriterion("user_city not like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityIn(List<String> values) {
            addCriterion("user_city in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotIn(List<String> values) {
            addCriterion("user_city not in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityBetween(String value1, String value2) {
            addCriterion("user_city between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotBetween(String value1, String value2) {
            addCriterion("user_city not between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserAreaIsNull() {
            addCriterion("user_area is null");
            return (Criteria) this;
        }

        public Criteria andUserAreaIsNotNull() {
            addCriterion("user_area is not null");
            return (Criteria) this;
        }

        public Criteria andUserAreaEqualTo(String value) {
            addCriterion("user_area =", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotEqualTo(String value) {
            addCriterion("user_area <>", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaGreaterThan(String value) {
            addCriterion("user_area >", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaGreaterThanOrEqualTo(String value) {
            addCriterion("user_area >=", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaLessThan(String value) {
            addCriterion("user_area <", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaLessThanOrEqualTo(String value) {
            addCriterion("user_area <=", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaLike(String value) {
            addCriterion("user_area like", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotLike(String value) {
            addCriterion("user_area not like", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaIn(List<String> values) {
            addCriterion("user_area in", values, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotIn(List<String> values) {
            addCriterion("user_area not in", values, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaBetween(String value1, String value2) {
            addCriterion("user_area between", value1, value2, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotBetween(String value1, String value2) {
            addCriterion("user_area not between", value1, value2, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserDetailedAddressIsNull() {
            addCriterion("user_detailed_address is null");
            return (Criteria) this;
        }

        public Criteria andUserDetailedAddressIsNotNull() {
            addCriterion("user_detailed_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserDetailedAddressEqualTo(String value) {
            addCriterion("user_detailed_address =", value, "userDetailedAddress");
            return (Criteria) this;
        }

        public Criteria andUserDetailedAddressNotEqualTo(String value) {
            addCriterion("user_detailed_address <>", value, "userDetailedAddress");
            return (Criteria) this;
        }

        public Criteria andUserDetailedAddressGreaterThan(String value) {
            addCriterion("user_detailed_address >", value, "userDetailedAddress");
            return (Criteria) this;
        }

        public Criteria andUserDetailedAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_detailed_address >=", value, "userDetailedAddress");
            return (Criteria) this;
        }

        public Criteria andUserDetailedAddressLessThan(String value) {
            addCriterion("user_detailed_address <", value, "userDetailedAddress");
            return (Criteria) this;
        }

        public Criteria andUserDetailedAddressLessThanOrEqualTo(String value) {
            addCriterion("user_detailed_address <=", value, "userDetailedAddress");
            return (Criteria) this;
        }

        public Criteria andUserDetailedAddressLike(String value) {
            addCriterion("user_detailed_address like", value, "userDetailedAddress");
            return (Criteria) this;
        }

        public Criteria andUserDetailedAddressNotLike(String value) {
            addCriterion("user_detailed_address not like", value, "userDetailedAddress");
            return (Criteria) this;
        }

        public Criteria andUserDetailedAddressIn(List<String> values) {
            addCriterion("user_detailed_address in", values, "userDetailedAddress");
            return (Criteria) this;
        }

        public Criteria andUserDetailedAddressNotIn(List<String> values) {
            addCriterion("user_detailed_address not in", values, "userDetailedAddress");
            return (Criteria) this;
        }

        public Criteria andUserDetailedAddressBetween(String value1, String value2) {
            addCriterion("user_detailed_address between", value1, value2, "userDetailedAddress");
            return (Criteria) this;
        }

        public Criteria andUserDetailedAddressNotBetween(String value1, String value2) {
            addCriterion("user_detailed_address not between", value1, value2, "userDetailedAddress");
            return (Criteria) this;
        }

        public Criteria andUserSchoolIsNull() {
            addCriterion("user_school is null");
            return (Criteria) this;
        }

        public Criteria andUserSchoolIsNotNull() {
            addCriterion("user_school is not null");
            return (Criteria) this;
        }

        public Criteria andUserSchoolEqualTo(String value) {
            addCriterion("user_school =", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolNotEqualTo(String value) {
            addCriterion("user_school <>", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolGreaterThan(String value) {
            addCriterion("user_school >", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("user_school >=", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolLessThan(String value) {
            addCriterion("user_school <", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolLessThanOrEqualTo(String value) {
            addCriterion("user_school <=", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolLike(String value) {
            addCriterion("user_school like", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolNotLike(String value) {
            addCriterion("user_school not like", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolIn(List<String> values) {
            addCriterion("user_school in", values, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolNotIn(List<String> values) {
            addCriterion("user_school not in", values, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolBetween(String value1, String value2) {
            addCriterion("user_school between", value1, value2, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolNotBetween(String value1, String value2) {
            addCriterion("user_school not between", value1, value2, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserDiplomaIsNull() {
            addCriterion("user_diploma is null");
            return (Criteria) this;
        }

        public Criteria andUserDiplomaIsNotNull() {
            addCriterion("user_diploma is not null");
            return (Criteria) this;
        }

        public Criteria andUserDiplomaEqualTo(String value) {
            addCriterion("user_diploma =", value, "userDiploma");
            return (Criteria) this;
        }

        public Criteria andUserDiplomaNotEqualTo(String value) {
            addCriterion("user_diploma <>", value, "userDiploma");
            return (Criteria) this;
        }

        public Criteria andUserDiplomaGreaterThan(String value) {
            addCriterion("user_diploma >", value, "userDiploma");
            return (Criteria) this;
        }

        public Criteria andUserDiplomaGreaterThanOrEqualTo(String value) {
            addCriterion("user_diploma >=", value, "userDiploma");
            return (Criteria) this;
        }

        public Criteria andUserDiplomaLessThan(String value) {
            addCriterion("user_diploma <", value, "userDiploma");
            return (Criteria) this;
        }

        public Criteria andUserDiplomaLessThanOrEqualTo(String value) {
            addCriterion("user_diploma <=", value, "userDiploma");
            return (Criteria) this;
        }

        public Criteria andUserDiplomaLike(String value) {
            addCriterion("user_diploma like", value, "userDiploma");
            return (Criteria) this;
        }

        public Criteria andUserDiplomaNotLike(String value) {
            addCriterion("user_diploma not like", value, "userDiploma");
            return (Criteria) this;
        }

        public Criteria andUserDiplomaIn(List<String> values) {
            addCriterion("user_diploma in", values, "userDiploma");
            return (Criteria) this;
        }

        public Criteria andUserDiplomaNotIn(List<String> values) {
            addCriterion("user_diploma not in", values, "userDiploma");
            return (Criteria) this;
        }

        public Criteria andUserDiplomaBetween(String value1, String value2) {
            addCriterion("user_diploma between", value1, value2, "userDiploma");
            return (Criteria) this;
        }

        public Criteria andUserDiplomaNotBetween(String value1, String value2) {
            addCriterion("user_diploma not between", value1, value2, "userDiploma");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("user_state is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("user_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(Long value) {
            addCriterion("user_state =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(Long value) {
            addCriterion("user_state <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(Long value) {
            addCriterion("user_state >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(Long value) {
            addCriterion("user_state >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(Long value) {
            addCriterion("user_state <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(Long value) {
            addCriterion("user_state <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<Long> values) {
            addCriterion("user_state in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<Long> values) {
            addCriterion("user_state not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(Long value1, Long value2) {
            addCriterion("user_state between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(Long value1, Long value2) {
            addCriterion("user_state not between", value1, value2, "userState");
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