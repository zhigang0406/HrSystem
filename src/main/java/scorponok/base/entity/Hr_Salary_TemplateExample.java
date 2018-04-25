package scorponok.base.entity;

import java.util.ArrayList;
import java.util.List;

public class Hr_Salary_TemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Hr_Salary_TemplateExample() {
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

        public Criteria andTemplateIdIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(Long value) {
            addCriterion("template_id =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(Long value) {
            addCriterion("template_id <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(Long value) {
            addCriterion("template_id >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("template_id >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(Long value) {
            addCriterion("template_id <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("template_id <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<Long> values) {
            addCriterion("template_id in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<Long> values) {
            addCriterion("template_id not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(Long value1, Long value2) {
            addCriterion("template_id between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("template_id not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIsNull() {
            addCriterion("template_name is null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIsNotNull() {
            addCriterion("template_name is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameEqualTo(String value) {
            addCriterion("template_name =", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotEqualTo(String value) {
            addCriterion("template_name <>", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThan(String value) {
            addCriterion("template_name >", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("template_name >=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThan(String value) {
            addCriterion("template_name <", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("template_name <=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLike(String value) {
            addCriterion("template_name like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotLike(String value) {
            addCriterion("template_name not like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIn(List<String> values) {
            addCriterion("template_name in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotIn(List<String> values) {
            addCriterion("template_name not in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameBetween(String value1, String value2) {
            addCriterion("template_name between", value1, value2, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotBetween(String value1, String value2) {
            addCriterion("template_name not between", value1, value2, "templateName");
            return (Criteria) this;
        }

        public Criteria andTcIt85IsNull() {
            addCriterion("tc_it85 is null");
            return (Criteria) this;
        }

        public Criteria andTcIt85IsNotNull() {
            addCriterion("tc_it85 is not null");
            return (Criteria) this;
        }

        public Criteria andTcIt85EqualTo(Double value) {
            addCriterion("tc_it85 =", value, "tcIt85");
            return (Criteria) this;
        }

        public Criteria andTcIt85NotEqualTo(Double value) {
            addCriterion("tc_it85 <>", value, "tcIt85");
            return (Criteria) this;
        }

        public Criteria andTcIt85GreaterThan(Double value) {
            addCriterion("tc_it85 >", value, "tcIt85");
            return (Criteria) this;
        }

        public Criteria andTcIt85GreaterThanOrEqualTo(Double value) {
            addCriterion("tc_it85 >=", value, "tcIt85");
            return (Criteria) this;
        }

        public Criteria andTcIt85LessThan(Double value) {
            addCriterion("tc_it85 <", value, "tcIt85");
            return (Criteria) this;
        }

        public Criteria andTcIt85LessThanOrEqualTo(Double value) {
            addCriterion("tc_it85 <=", value, "tcIt85");
            return (Criteria) this;
        }

        public Criteria andTcIt85In(List<Double> values) {
            addCriterion("tc_it85 in", values, "tcIt85");
            return (Criteria) this;
        }

        public Criteria andTcIt85NotIn(List<Double> values) {
            addCriterion("tc_it85 not in", values, "tcIt85");
            return (Criteria) this;
        }

        public Criteria andTcIt85Between(Double value1, Double value2) {
            addCriterion("tc_it85 between", value1, value2, "tcIt85");
            return (Criteria) this;
        }

        public Criteria andTcIt85NotBetween(Double value1, Double value2) {
            addCriterion("tc_it85 not between", value1, value2, "tcIt85");
            return (Criteria) this;
        }

        public Criteria andTcGteq85it90IsNull() {
            addCriterion("tc_gteq85it90 is null");
            return (Criteria) this;
        }

        public Criteria andTcGteq85it90IsNotNull() {
            addCriterion("tc_gteq85it90 is not null");
            return (Criteria) this;
        }

        public Criteria andTcGteq85it90EqualTo(Double value) {
            addCriterion("tc_gteq85it90 =", value, "tcGteq85it90");
            return (Criteria) this;
        }

        public Criteria andTcGteq85it90NotEqualTo(Double value) {
            addCriterion("tc_gteq85it90 <>", value, "tcGteq85it90");
            return (Criteria) this;
        }

        public Criteria andTcGteq85it90GreaterThan(Double value) {
            addCriterion("tc_gteq85it90 >", value, "tcGteq85it90");
            return (Criteria) this;
        }

        public Criteria andTcGteq85it90GreaterThanOrEqualTo(Double value) {
            addCriterion("tc_gteq85it90 >=", value, "tcGteq85it90");
            return (Criteria) this;
        }

        public Criteria andTcGteq85it90LessThan(Double value) {
            addCriterion("tc_gteq85it90 <", value, "tcGteq85it90");
            return (Criteria) this;
        }

        public Criteria andTcGteq85it90LessThanOrEqualTo(Double value) {
            addCriterion("tc_gteq85it90 <=", value, "tcGteq85it90");
            return (Criteria) this;
        }

        public Criteria andTcGteq85it90In(List<Double> values) {
            addCriterion("tc_gteq85it90 in", values, "tcGteq85it90");
            return (Criteria) this;
        }

        public Criteria andTcGteq85it90NotIn(List<Double> values) {
            addCriterion("tc_gteq85it90 not in", values, "tcGteq85it90");
            return (Criteria) this;
        }

        public Criteria andTcGteq85it90Between(Double value1, Double value2) {
            addCriterion("tc_gteq85it90 between", value1, value2, "tcGteq85it90");
            return (Criteria) this;
        }

        public Criteria andTcGteq85it90NotBetween(Double value1, Double value2) {
            addCriterion("tc_gteq85it90 not between", value1, value2, "tcGteq85it90");
            return (Criteria) this;
        }

        public Criteria andTcGteq90it95IsNull() {
            addCriterion("tc_gteq90it95 is null");
            return (Criteria) this;
        }

        public Criteria andTcGteq90it95IsNotNull() {
            addCriterion("tc_gteq90it95 is not null");
            return (Criteria) this;
        }

        public Criteria andTcGteq90it95EqualTo(Double value) {
            addCriterion("tc_gteq90it95 =", value, "tcGteq90it95");
            return (Criteria) this;
        }

        public Criteria andTcGteq90it95NotEqualTo(Double value) {
            addCriterion("tc_gteq90it95 <>", value, "tcGteq90it95");
            return (Criteria) this;
        }

        public Criteria andTcGteq90it95GreaterThan(Double value) {
            addCriterion("tc_gteq90it95 >", value, "tcGteq90it95");
            return (Criteria) this;
        }

        public Criteria andTcGteq90it95GreaterThanOrEqualTo(Double value) {
            addCriterion("tc_gteq90it95 >=", value, "tcGteq90it95");
            return (Criteria) this;
        }

        public Criteria andTcGteq90it95LessThan(Double value) {
            addCriterion("tc_gteq90it95 <", value, "tcGteq90it95");
            return (Criteria) this;
        }

        public Criteria andTcGteq90it95LessThanOrEqualTo(Double value) {
            addCriterion("tc_gteq90it95 <=", value, "tcGteq90it95");
            return (Criteria) this;
        }

        public Criteria andTcGteq90it95In(List<Double> values) {
            addCriterion("tc_gteq90it95 in", values, "tcGteq90it95");
            return (Criteria) this;
        }

        public Criteria andTcGteq90it95NotIn(List<Double> values) {
            addCriterion("tc_gteq90it95 not in", values, "tcGteq90it95");
            return (Criteria) this;
        }

        public Criteria andTcGteq90it95Between(Double value1, Double value2) {
            addCriterion("tc_gteq90it95 between", value1, value2, "tcGteq90it95");
            return (Criteria) this;
        }

        public Criteria andTcGteq90it95NotBetween(Double value1, Double value2) {
            addCriterion("tc_gteq90it95 not between", value1, value2, "tcGteq90it95");
            return (Criteria) this;
        }

        public Criteria andTcGteq95it100IsNull() {
            addCriterion("tc_gteq95it100 is null");
            return (Criteria) this;
        }

        public Criteria andTcGteq95it100IsNotNull() {
            addCriterion("tc_gteq95it100 is not null");
            return (Criteria) this;
        }

        public Criteria andTcGteq95it100EqualTo(Double value) {
            addCriterion("tc_gteq95it100 =", value, "tcGteq95it100");
            return (Criteria) this;
        }

        public Criteria andTcGteq95it100NotEqualTo(Double value) {
            addCriterion("tc_gteq95it100 <>", value, "tcGteq95it100");
            return (Criteria) this;
        }

        public Criteria andTcGteq95it100GreaterThan(Double value) {
            addCriterion("tc_gteq95it100 >", value, "tcGteq95it100");
            return (Criteria) this;
        }

        public Criteria andTcGteq95it100GreaterThanOrEqualTo(Double value) {
            addCriterion("tc_gteq95it100 >=", value, "tcGteq95it100");
            return (Criteria) this;
        }

        public Criteria andTcGteq95it100LessThan(Double value) {
            addCriterion("tc_gteq95it100 <", value, "tcGteq95it100");
            return (Criteria) this;
        }

        public Criteria andTcGteq95it100LessThanOrEqualTo(Double value) {
            addCriterion("tc_gteq95it100 <=", value, "tcGteq95it100");
            return (Criteria) this;
        }

        public Criteria andTcGteq95it100In(List<Double> values) {
            addCriterion("tc_gteq95it100 in", values, "tcGteq95it100");
            return (Criteria) this;
        }

        public Criteria andTcGteq95it100NotIn(List<Double> values) {
            addCriterion("tc_gteq95it100 not in", values, "tcGteq95it100");
            return (Criteria) this;
        }

        public Criteria andTcGteq95it100Between(Double value1, Double value2) {
            addCriterion("tc_gteq95it100 between", value1, value2, "tcGteq95it100");
            return (Criteria) this;
        }

        public Criteria andTcGteq95it100NotBetween(Double value1, Double value2) {
            addCriterion("tc_gteq95it100 not between", value1, value2, "tcGteq95it100");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110IsNull() {
            addCriterion("tc_gteq100it110 is null");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110IsNotNull() {
            addCriterion("tc_gteq100it110 is not null");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110EqualTo(Double value) {
            addCriterion("tc_gteq100it110 =", value, "tcGteq100it110");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110NotEqualTo(Double value) {
            addCriterion("tc_gteq100it110 <>", value, "tcGteq100it110");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110GreaterThan(Double value) {
            addCriterion("tc_gteq100it110 >", value, "tcGteq100it110");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110GreaterThanOrEqualTo(Double value) {
            addCriterion("tc_gteq100it110 >=", value, "tcGteq100it110");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110LessThan(Double value) {
            addCriterion("tc_gteq100it110 <", value, "tcGteq100it110");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110LessThanOrEqualTo(Double value) {
            addCriterion("tc_gteq100it110 <=", value, "tcGteq100it110");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110In(List<Double> values) {
            addCriterion("tc_gteq100it110 in", values, "tcGteq100it110");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110NotIn(List<Double> values) {
            addCriterion("tc_gteq100it110 not in", values, "tcGteq100it110");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110Between(Double value1, Double value2) {
            addCriterion("tc_gteq100it110 between", value1, value2, "tcGteq100it110");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110NotBetween(Double value1, Double value2) {
            addCriterion("tc_gteq100it110 not between", value1, value2, "tcGteq100it110");
            return (Criteria) this;
        }

        public Criteria andTcGteq110IsNull() {
            addCriterion("tc_gteq110 is null");
            return (Criteria) this;
        }

        public Criteria andTcGteq110IsNotNull() {
            addCriterion("tc_gteq110 is not null");
            return (Criteria) this;
        }

        public Criteria andTcGteq110EqualTo(Double value) {
            addCriterion("tc_gteq110 =", value, "tcGteq110");
            return (Criteria) this;
        }

        public Criteria andTcGteq110NotEqualTo(Double value) {
            addCriterion("tc_gteq110 <>", value, "tcGteq110");
            return (Criteria) this;
        }

        public Criteria andTcGteq110GreaterThan(Double value) {
            addCriterion("tc_gteq110 >", value, "tcGteq110");
            return (Criteria) this;
        }

        public Criteria andTcGteq110GreaterThanOrEqualTo(Double value) {
            addCriterion("tc_gteq110 >=", value, "tcGteq110");
            return (Criteria) this;
        }

        public Criteria andTcGteq110LessThan(Double value) {
            addCriterion("tc_gteq110 <", value, "tcGteq110");
            return (Criteria) this;
        }

        public Criteria andTcGteq110LessThanOrEqualTo(Double value) {
            addCriterion("tc_gteq110 <=", value, "tcGteq110");
            return (Criteria) this;
        }

        public Criteria andTcGteq110In(List<Double> values) {
            addCriterion("tc_gteq110 in", values, "tcGteq110");
            return (Criteria) this;
        }

        public Criteria andTcGteq110NotIn(List<Double> values) {
            addCriterion("tc_gteq110 not in", values, "tcGteq110");
            return (Criteria) this;
        }

        public Criteria andTcGteq110Between(Double value1, Double value2) {
            addCriterion("tc_gteq110 between", value1, value2, "tcGteq110");
            return (Criteria) this;
        }

        public Criteria andTcGteq110NotBetween(Double value1, Double value2) {
            addCriterion("tc_gteq110 not between", value1, value2, "tcGteq110");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110cbIsNull() {
            addCriterion("tc_gteq100it110CB is null");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110cbIsNotNull() {
            addCriterion("tc_gteq100it110CB is not null");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110cbEqualTo(Double value) {
            addCriterion("tc_gteq100it110CB =", value, "tcGteq100it110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110cbNotEqualTo(Double value) {
            addCriterion("tc_gteq100it110CB <>", value, "tcGteq100it110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110cbGreaterThan(Double value) {
            addCriterion("tc_gteq100it110CB >", value, "tcGteq100it110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110cbGreaterThanOrEqualTo(Double value) {
            addCriterion("tc_gteq100it110CB >=", value, "tcGteq100it110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110cbLessThan(Double value) {
            addCriterion("tc_gteq100it110CB <", value, "tcGteq100it110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110cbLessThanOrEqualTo(Double value) {
            addCriterion("tc_gteq100it110CB <=", value, "tcGteq100it110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110cbIn(List<Double> values) {
            addCriterion("tc_gteq100it110CB in", values, "tcGteq100it110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110cbNotIn(List<Double> values) {
            addCriterion("tc_gteq100it110CB not in", values, "tcGteq100it110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110cbBetween(Double value1, Double value2) {
            addCriterion("tc_gteq100it110CB between", value1, value2, "tcGteq100it110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq100it110cbNotBetween(Double value1, Double value2) {
            addCriterion("tc_gteq100it110CB not between", value1, value2, "tcGteq100it110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq110cbIsNull() {
            addCriterion("tc_gteq110CB is null");
            return (Criteria) this;
        }

        public Criteria andTcGteq110cbIsNotNull() {
            addCriterion("tc_gteq110CB is not null");
            return (Criteria) this;
        }

        public Criteria andTcGteq110cbEqualTo(Double value) {
            addCriterion("tc_gteq110CB =", value, "tcGteq110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq110cbNotEqualTo(Double value) {
            addCriterion("tc_gteq110CB <>", value, "tcGteq110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq110cbGreaterThan(Double value) {
            addCriterion("tc_gteq110CB >", value, "tcGteq110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq110cbGreaterThanOrEqualTo(Double value) {
            addCriterion("tc_gteq110CB >=", value, "tcGteq110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq110cbLessThan(Double value) {
            addCriterion("tc_gteq110CB <", value, "tcGteq110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq110cbLessThanOrEqualTo(Double value) {
            addCriterion("tc_gteq110CB <=", value, "tcGteq110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq110cbIn(List<Double> values) {
            addCriterion("tc_gteq110CB in", values, "tcGteq110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq110cbNotIn(List<Double> values) {
            addCriterion("tc_gteq110CB not in", values, "tcGteq110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq110cbBetween(Double value1, Double value2) {
            addCriterion("tc_gteq110CB between", value1, value2, "tcGteq110cb");
            return (Criteria) this;
        }

        public Criteria andTcGteq110cbNotBetween(Double value1, Double value2) {
            addCriterion("tc_gteq110CB not between", value1, value2, "tcGteq110cb");
            return (Criteria) this;
        }

        public Criteria andAwardIt95IsNull() {
            addCriterion("award_it95 is null");
            return (Criteria) this;
        }

        public Criteria andAwardIt95IsNotNull() {
            addCriterion("award_it95 is not null");
            return (Criteria) this;
        }

        public Criteria andAwardIt95EqualTo(Long value) {
            addCriterion("award_it95 =", value, "awardIt95");
            return (Criteria) this;
        }

        public Criteria andAwardIt95NotEqualTo(Long value) {
            addCriterion("award_it95 <>", value, "awardIt95");
            return (Criteria) this;
        }

        public Criteria andAwardIt95GreaterThan(Long value) {
            addCriterion("award_it95 >", value, "awardIt95");
            return (Criteria) this;
        }

        public Criteria andAwardIt95GreaterThanOrEqualTo(Long value) {
            addCriterion("award_it95 >=", value, "awardIt95");
            return (Criteria) this;
        }

        public Criteria andAwardIt95LessThan(Long value) {
            addCriterion("award_it95 <", value, "awardIt95");
            return (Criteria) this;
        }

        public Criteria andAwardIt95LessThanOrEqualTo(Long value) {
            addCriterion("award_it95 <=", value, "awardIt95");
            return (Criteria) this;
        }

        public Criteria andAwardIt95In(List<Long> values) {
            addCriterion("award_it95 in", values, "awardIt95");
            return (Criteria) this;
        }

        public Criteria andAwardIt95NotIn(List<Long> values) {
            addCriterion("award_it95 not in", values, "awardIt95");
            return (Criteria) this;
        }

        public Criteria andAwardIt95Between(Long value1, Long value2) {
            addCriterion("award_it95 between", value1, value2, "awardIt95");
            return (Criteria) this;
        }

        public Criteria andAwardIt95NotBetween(Long value1, Long value2) {
            addCriterion("award_it95 not between", value1, value2, "awardIt95");
            return (Criteria) this;
        }

        public Criteria andAwardGteq95it100IsNull() {
            addCriterion("award_gteq95it100 is null");
            return (Criteria) this;
        }

        public Criteria andAwardGteq95it100IsNotNull() {
            addCriterion("award_gteq95it100 is not null");
            return (Criteria) this;
        }

        public Criteria andAwardGteq95it100EqualTo(Long value) {
            addCriterion("award_gteq95it100 =", value, "awardGteq95it100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq95it100NotEqualTo(Long value) {
            addCriterion("award_gteq95it100 <>", value, "awardGteq95it100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq95it100GreaterThan(Long value) {
            addCriterion("award_gteq95it100 >", value, "awardGteq95it100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq95it100GreaterThanOrEqualTo(Long value) {
            addCriterion("award_gteq95it100 >=", value, "awardGteq95it100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq95it100LessThan(Long value) {
            addCriterion("award_gteq95it100 <", value, "awardGteq95it100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq95it100LessThanOrEqualTo(Long value) {
            addCriterion("award_gteq95it100 <=", value, "awardGteq95it100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq95it100In(List<Long> values) {
            addCriterion("award_gteq95it100 in", values, "awardGteq95it100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq95it100NotIn(List<Long> values) {
            addCriterion("award_gteq95it100 not in", values, "awardGteq95it100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq95it100Between(Long value1, Long value2) {
            addCriterion("award_gteq95it100 between", value1, value2, "awardGteq95it100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq95it100NotBetween(Long value1, Long value2) {
            addCriterion("award_gteq95it100 not between", value1, value2, "awardGteq95it100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it103IsNull() {
            addCriterion("award_gteq100it103 is null");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it103IsNotNull() {
            addCriterion("award_gteq100it103 is not null");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it103EqualTo(Long value) {
            addCriterion("award_gteq100it103 =", value, "awardGteq100it103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it103NotEqualTo(Long value) {
            addCriterion("award_gteq100it103 <>", value, "awardGteq100it103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it103GreaterThan(Long value) {
            addCriterion("award_gteq100it103 >", value, "awardGteq100it103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it103GreaterThanOrEqualTo(Long value) {
            addCriterion("award_gteq100it103 >=", value, "awardGteq100it103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it103LessThan(Long value) {
            addCriterion("award_gteq100it103 <", value, "awardGteq100it103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it103LessThanOrEqualTo(Long value) {
            addCriterion("award_gteq100it103 <=", value, "awardGteq100it103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it103In(List<Long> values) {
            addCriterion("award_gteq100it103 in", values, "awardGteq100it103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it103NotIn(List<Long> values) {
            addCriterion("award_gteq100it103 not in", values, "awardGteq100it103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it103Between(Long value1, Long value2) {
            addCriterion("award_gteq100it103 between", value1, value2, "awardGteq100it103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it103NotBetween(Long value1, Long value2) {
            addCriterion("award_gteq100it103 not between", value1, value2, "awardGteq100it103");
            return (Criteria) this;
        }

        public Criteria andAwardIt100IsNull() {
            addCriterion("award_it100 is null");
            return (Criteria) this;
        }

        public Criteria andAwardIt100IsNotNull() {
            addCriterion("award_it100 is not null");
            return (Criteria) this;
        }

        public Criteria andAwardIt100EqualTo(Long value) {
            addCriterion("award_it100 =", value, "awardIt100");
            return (Criteria) this;
        }

        public Criteria andAwardIt100NotEqualTo(Long value) {
            addCriterion("award_it100 <>", value, "awardIt100");
            return (Criteria) this;
        }

        public Criteria andAwardIt100GreaterThan(Long value) {
            addCriterion("award_it100 >", value, "awardIt100");
            return (Criteria) this;
        }

        public Criteria andAwardIt100GreaterThanOrEqualTo(Long value) {
            addCriterion("award_it100 >=", value, "awardIt100");
            return (Criteria) this;
        }

        public Criteria andAwardIt100LessThan(Long value) {
            addCriterion("award_it100 <", value, "awardIt100");
            return (Criteria) this;
        }

        public Criteria andAwardIt100LessThanOrEqualTo(Long value) {
            addCriterion("award_it100 <=", value, "awardIt100");
            return (Criteria) this;
        }

        public Criteria andAwardIt100In(List<Long> values) {
            addCriterion("award_it100 in", values, "awardIt100");
            return (Criteria) this;
        }

        public Criteria andAwardIt100NotIn(List<Long> values) {
            addCriterion("award_it100 not in", values, "awardIt100");
            return (Criteria) this;
        }

        public Criteria andAwardIt100Between(Long value1, Long value2) {
            addCriterion("award_it100 between", value1, value2, "awardIt100");
            return (Criteria) this;
        }

        public Criteria andAwardIt100NotBetween(Long value1, Long value2) {
            addCriterion("award_it100 not between", value1, value2, "awardIt100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it110IsNull() {
            addCriterion("award_gteq100it110 is null");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it110IsNotNull() {
            addCriterion("award_gteq100it110 is not null");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it110EqualTo(Long value) {
            addCriterion("award_gteq100it110 =", value, "awardGteq100it110");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it110NotEqualTo(Long value) {
            addCriterion("award_gteq100it110 <>", value, "awardGteq100it110");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it110GreaterThan(Long value) {
            addCriterion("award_gteq100it110 >", value, "awardGteq100it110");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it110GreaterThanOrEqualTo(Long value) {
            addCriterion("award_gteq100it110 >=", value, "awardGteq100it110");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it110LessThan(Long value) {
            addCriterion("award_gteq100it110 <", value, "awardGteq100it110");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it110LessThanOrEqualTo(Long value) {
            addCriterion("award_gteq100it110 <=", value, "awardGteq100it110");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it110In(List<Long> values) {
            addCriterion("award_gteq100it110 in", values, "awardGteq100it110");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it110NotIn(List<Long> values) {
            addCriterion("award_gteq100it110 not in", values, "awardGteq100it110");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it110Between(Long value1, Long value2) {
            addCriterion("award_gteq100it110 between", value1, value2, "awardGteq100it110");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100it110NotBetween(Long value1, Long value2) {
            addCriterion("award_gteq100it110 not between", value1, value2, "awardGteq100it110");
            return (Criteria) this;
        }

        public Criteria andAwardGteq110it120IsNull() {
            addCriterion("award_gteq110it120 is null");
            return (Criteria) this;
        }

        public Criteria andAwardGteq110it120IsNotNull() {
            addCriterion("award_gteq110it120 is not null");
            return (Criteria) this;
        }

        public Criteria andAwardGteq110it120EqualTo(Long value) {
            addCriterion("award_gteq110it120 =", value, "awardGteq110it120");
            return (Criteria) this;
        }

        public Criteria andAwardGteq110it120NotEqualTo(Long value) {
            addCriterion("award_gteq110it120 <>", value, "awardGteq110it120");
            return (Criteria) this;
        }

        public Criteria andAwardGteq110it120GreaterThan(Long value) {
            addCriterion("award_gteq110it120 >", value, "awardGteq110it120");
            return (Criteria) this;
        }

        public Criteria andAwardGteq110it120GreaterThanOrEqualTo(Long value) {
            addCriterion("award_gteq110it120 >=", value, "awardGteq110it120");
            return (Criteria) this;
        }

        public Criteria andAwardGteq110it120LessThan(Long value) {
            addCriterion("award_gteq110it120 <", value, "awardGteq110it120");
            return (Criteria) this;
        }

        public Criteria andAwardGteq110it120LessThanOrEqualTo(Long value) {
            addCriterion("award_gteq110it120 <=", value, "awardGteq110it120");
            return (Criteria) this;
        }

        public Criteria andAwardGteq110it120In(List<Long> values) {
            addCriterion("award_gteq110it120 in", values, "awardGteq110it120");
            return (Criteria) this;
        }

        public Criteria andAwardGteq110it120NotIn(List<Long> values) {
            addCriterion("award_gteq110it120 not in", values, "awardGteq110it120");
            return (Criteria) this;
        }

        public Criteria andAwardGteq110it120Between(Long value1, Long value2) {
            addCriterion("award_gteq110it120 between", value1, value2, "awardGteq110it120");
            return (Criteria) this;
        }

        public Criteria andAwardGteq110it120NotBetween(Long value1, Long value2) {
            addCriterion("award_gteq110it120 not between", value1, value2, "awardGteq110it120");
            return (Criteria) this;
        }

        public Criteria andAwrardGteq120IsNull() {
            addCriterion("awrard_gteq120 is null");
            return (Criteria) this;
        }

        public Criteria andAwrardGteq120IsNotNull() {
            addCriterion("awrard_gteq120 is not null");
            return (Criteria) this;
        }

        public Criteria andAwrardGteq120EqualTo(Long value) {
            addCriterion("awrard_gteq120 =", value, "awrardGteq120");
            return (Criteria) this;
        }

        public Criteria andAwrardGteq120NotEqualTo(Long value) {
            addCriterion("awrard_gteq120 <>", value, "awrardGteq120");
            return (Criteria) this;
        }

        public Criteria andAwrardGteq120GreaterThan(Long value) {
            addCriterion("awrard_gteq120 >", value, "awrardGteq120");
            return (Criteria) this;
        }

        public Criteria andAwrardGteq120GreaterThanOrEqualTo(Long value) {
            addCriterion("awrard_gteq120 >=", value, "awrardGteq120");
            return (Criteria) this;
        }

        public Criteria andAwrardGteq120LessThan(Long value) {
            addCriterion("awrard_gteq120 <", value, "awrardGteq120");
            return (Criteria) this;
        }

        public Criteria andAwrardGteq120LessThanOrEqualTo(Long value) {
            addCriterion("awrard_gteq120 <=", value, "awrardGteq120");
            return (Criteria) this;
        }

        public Criteria andAwrardGteq120In(List<Long> values) {
            addCriterion("awrard_gteq120 in", values, "awrardGteq120");
            return (Criteria) this;
        }

        public Criteria andAwrardGteq120NotIn(List<Long> values) {
            addCriterion("awrard_gteq120 not in", values, "awrardGteq120");
            return (Criteria) this;
        }

        public Criteria andAwrardGteq120Between(Long value1, Long value2) {
            addCriterion("awrard_gteq120 between", value1, value2, "awrardGteq120");
            return (Criteria) this;
        }

        public Criteria andAwrardGteq120NotBetween(Long value1, Long value2) {
            addCriterion("awrard_gteq120 not between", value1, value2, "awrardGteq120");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100IsNull() {
            addCriterion("award_gteq100 is null");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100IsNotNull() {
            addCriterion("award_gteq100 is not null");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100EqualTo(Long value) {
            addCriterion("award_gteq100 =", value, "awardGteq100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100NotEqualTo(Long value) {
            addCriterion("award_gteq100 <>", value, "awardGteq100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100GreaterThan(Long value) {
            addCriterion("award_gteq100 >", value, "awardGteq100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100GreaterThanOrEqualTo(Long value) {
            addCriterion("award_gteq100 >=", value, "awardGteq100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100LessThan(Long value) {
            addCriterion("award_gteq100 <", value, "awardGteq100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100LessThanOrEqualTo(Long value) {
            addCriterion("award_gteq100 <=", value, "awardGteq100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100In(List<Long> values) {
            addCriterion("award_gteq100 in", values, "awardGteq100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100NotIn(List<Long> values) {
            addCriterion("award_gteq100 not in", values, "awardGteq100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100Between(Long value1, Long value2) {
            addCriterion("award_gteq100 between", value1, value2, "awardGteq100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq100NotBetween(Long value1, Long value2) {
            addCriterion("award_gteq100 not between", value1, value2, "awardGteq100");
            return (Criteria) this;
        }

        public Criteria andAwardGteq103IsNull() {
            addCriterion("award_gteq103 is null");
            return (Criteria) this;
        }

        public Criteria andAwardGteq103IsNotNull() {
            addCriterion("award_gteq103 is not null");
            return (Criteria) this;
        }

        public Criteria andAwardGteq103EqualTo(Long value) {
            addCriterion("award_gteq103 =", value, "awardGteq103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq103NotEqualTo(Long value) {
            addCriterion("award_gteq103 <>", value, "awardGteq103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq103GreaterThan(Long value) {
            addCriterion("award_gteq103 >", value, "awardGteq103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq103GreaterThanOrEqualTo(Long value) {
            addCriterion("award_gteq103 >=", value, "awardGteq103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq103LessThan(Long value) {
            addCriterion("award_gteq103 <", value, "awardGteq103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq103LessThanOrEqualTo(Long value) {
            addCriterion("award_gteq103 <=", value, "awardGteq103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq103In(List<Long> values) {
            addCriterion("award_gteq103 in", values, "awardGteq103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq103NotIn(List<Long> values) {
            addCriterion("award_gteq103 not in", values, "awardGteq103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq103Between(Long value1, Long value2) {
            addCriterion("award_gteq103 between", value1, value2, "awardGteq103");
            return (Criteria) this;
        }

        public Criteria andAwardGteq103NotBetween(Long value1, Long value2) {
            addCriterion("award_gteq103 not between", value1, value2, "awardGteq103");
            return (Criteria) this;
        }

        public Criteria andRank1MoneyIsNull() {
            addCriterion("rank1_money is null");
            return (Criteria) this;
        }

        public Criteria andRank1MoneyIsNotNull() {
            addCriterion("rank1_money is not null");
            return (Criteria) this;
        }

        public Criteria andRank1MoneyEqualTo(Long value) {
            addCriterion("rank1_money =", value, "rank1Money");
            return (Criteria) this;
        }

        public Criteria andRank1MoneyNotEqualTo(Long value) {
            addCriterion("rank1_money <>", value, "rank1Money");
            return (Criteria) this;
        }

        public Criteria andRank1MoneyGreaterThan(Long value) {
            addCriterion("rank1_money >", value, "rank1Money");
            return (Criteria) this;
        }

        public Criteria andRank1MoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("rank1_money >=", value, "rank1Money");
            return (Criteria) this;
        }

        public Criteria andRank1MoneyLessThan(Long value) {
            addCriterion("rank1_money <", value, "rank1Money");
            return (Criteria) this;
        }

        public Criteria andRank1MoneyLessThanOrEqualTo(Long value) {
            addCriterion("rank1_money <=", value, "rank1Money");
            return (Criteria) this;
        }

        public Criteria andRank1MoneyIn(List<Long> values) {
            addCriterion("rank1_money in", values, "rank1Money");
            return (Criteria) this;
        }

        public Criteria andRank1MoneyNotIn(List<Long> values) {
            addCriterion("rank1_money not in", values, "rank1Money");
            return (Criteria) this;
        }

        public Criteria andRank1MoneyBetween(Long value1, Long value2) {
            addCriterion("rank1_money between", value1, value2, "rank1Money");
            return (Criteria) this;
        }

        public Criteria andRank1MoneyNotBetween(Long value1, Long value2) {
            addCriterion("rank1_money not between", value1, value2, "rank1Money");
            return (Criteria) this;
        }

        public Criteria andRank2MoneyIsNull() {
            addCriterion("rank2_money is null");
            return (Criteria) this;
        }

        public Criteria andRank2MoneyIsNotNull() {
            addCriterion("rank2_money is not null");
            return (Criteria) this;
        }

        public Criteria andRank2MoneyEqualTo(Long value) {
            addCriterion("rank2_money =", value, "rank2Money");
            return (Criteria) this;
        }

        public Criteria andRank2MoneyNotEqualTo(Long value) {
            addCriterion("rank2_money <>", value, "rank2Money");
            return (Criteria) this;
        }

        public Criteria andRank2MoneyGreaterThan(Long value) {
            addCriterion("rank2_money >", value, "rank2Money");
            return (Criteria) this;
        }

        public Criteria andRank2MoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("rank2_money >=", value, "rank2Money");
            return (Criteria) this;
        }

        public Criteria andRank2MoneyLessThan(Long value) {
            addCriterion("rank2_money <", value, "rank2Money");
            return (Criteria) this;
        }

        public Criteria andRank2MoneyLessThanOrEqualTo(Long value) {
            addCriterion("rank2_money <=", value, "rank2Money");
            return (Criteria) this;
        }

        public Criteria andRank2MoneyIn(List<Long> values) {
            addCriterion("rank2_money in", values, "rank2Money");
            return (Criteria) this;
        }

        public Criteria andRank2MoneyNotIn(List<Long> values) {
            addCriterion("rank2_money not in", values, "rank2Money");
            return (Criteria) this;
        }

        public Criteria andRank2MoneyBetween(Long value1, Long value2) {
            addCriterion("rank2_money between", value1, value2, "rank2Money");
            return (Criteria) this;
        }

        public Criteria andRank2MoneyNotBetween(Long value1, Long value2) {
            addCriterion("rank2_money not between", value1, value2, "rank2Money");
            return (Criteria) this;
        }

        public Criteria andRank3MoneyIsNull() {
            addCriterion("rank3_money is null");
            return (Criteria) this;
        }

        public Criteria andRank3MoneyIsNotNull() {
            addCriterion("rank3_money is not null");
            return (Criteria) this;
        }

        public Criteria andRank3MoneyEqualTo(Long value) {
            addCriterion("rank3_money =", value, "rank3Money");
            return (Criteria) this;
        }

        public Criteria andRank3MoneyNotEqualTo(Long value) {
            addCriterion("rank3_money <>", value, "rank3Money");
            return (Criteria) this;
        }

        public Criteria andRank3MoneyGreaterThan(Long value) {
            addCriterion("rank3_money >", value, "rank3Money");
            return (Criteria) this;
        }

        public Criteria andRank3MoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("rank3_money >=", value, "rank3Money");
            return (Criteria) this;
        }

        public Criteria andRank3MoneyLessThan(Long value) {
            addCriterion("rank3_money <", value, "rank3Money");
            return (Criteria) this;
        }

        public Criteria andRank3MoneyLessThanOrEqualTo(Long value) {
            addCriterion("rank3_money <=", value, "rank3Money");
            return (Criteria) this;
        }

        public Criteria andRank3MoneyIn(List<Long> values) {
            addCriterion("rank3_money in", values, "rank3Money");
            return (Criteria) this;
        }

        public Criteria andRank3MoneyNotIn(List<Long> values) {
            addCriterion("rank3_money not in", values, "rank3Money");
            return (Criteria) this;
        }

        public Criteria andRank3MoneyBetween(Long value1, Long value2) {
            addCriterion("rank3_money between", value1, value2, "rank3Money");
            return (Criteria) this;
        }

        public Criteria andRank3MoneyNotBetween(Long value1, Long value2) {
            addCriterion("rank3_money not between", value1, value2, "rank3Money");
            return (Criteria) this;
        }

        public Criteria andRank4MoneyIsNull() {
            addCriterion("rank4_money is null");
            return (Criteria) this;
        }

        public Criteria andRank4MoneyIsNotNull() {
            addCriterion("rank4_money is not null");
            return (Criteria) this;
        }

        public Criteria andRank4MoneyEqualTo(Long value) {
            addCriterion("rank4_money =", value, "rank4Money");
            return (Criteria) this;
        }

        public Criteria andRank4MoneyNotEqualTo(Long value) {
            addCriterion("rank4_money <>", value, "rank4Money");
            return (Criteria) this;
        }

        public Criteria andRank4MoneyGreaterThan(Long value) {
            addCriterion("rank4_money >", value, "rank4Money");
            return (Criteria) this;
        }

        public Criteria andRank4MoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("rank4_money >=", value, "rank4Money");
            return (Criteria) this;
        }

        public Criteria andRank4MoneyLessThan(Long value) {
            addCriterion("rank4_money <", value, "rank4Money");
            return (Criteria) this;
        }

        public Criteria andRank4MoneyLessThanOrEqualTo(Long value) {
            addCriterion("rank4_money <=", value, "rank4Money");
            return (Criteria) this;
        }

        public Criteria andRank4MoneyIn(List<Long> values) {
            addCriterion("rank4_money in", values, "rank4Money");
            return (Criteria) this;
        }

        public Criteria andRank4MoneyNotIn(List<Long> values) {
            addCriterion("rank4_money not in", values, "rank4Money");
            return (Criteria) this;
        }

        public Criteria andRank4MoneyBetween(Long value1, Long value2) {
            addCriterion("rank4_money between", value1, value2, "rank4Money");
            return (Criteria) this;
        }

        public Criteria andRank4MoneyNotBetween(Long value1, Long value2) {
            addCriterion("rank4_money not between", value1, value2, "rank4Money");
            return (Criteria) this;
        }

        public Criteria andRank5MoneyIsNull() {
            addCriterion("rank5_money is null");
            return (Criteria) this;
        }

        public Criteria andRank5MoneyIsNotNull() {
            addCriterion("rank5_money is not null");
            return (Criteria) this;
        }

        public Criteria andRank5MoneyEqualTo(Long value) {
            addCriterion("rank5_money =", value, "rank5Money");
            return (Criteria) this;
        }

        public Criteria andRank5MoneyNotEqualTo(Long value) {
            addCriterion("rank5_money <>", value, "rank5Money");
            return (Criteria) this;
        }

        public Criteria andRank5MoneyGreaterThan(Long value) {
            addCriterion("rank5_money >", value, "rank5Money");
            return (Criteria) this;
        }

        public Criteria andRank5MoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("rank5_money >=", value, "rank5Money");
            return (Criteria) this;
        }

        public Criteria andRank5MoneyLessThan(Long value) {
            addCriterion("rank5_money <", value, "rank5Money");
            return (Criteria) this;
        }

        public Criteria andRank5MoneyLessThanOrEqualTo(Long value) {
            addCriterion("rank5_money <=", value, "rank5Money");
            return (Criteria) this;
        }

        public Criteria andRank5MoneyIn(List<Long> values) {
            addCriterion("rank5_money in", values, "rank5Money");
            return (Criteria) this;
        }

        public Criteria andRank5MoneyNotIn(List<Long> values) {
            addCriterion("rank5_money not in", values, "rank5Money");
            return (Criteria) this;
        }

        public Criteria andRank5MoneyBetween(Long value1, Long value2) {
            addCriterion("rank5_money between", value1, value2, "rank5Money");
            return (Criteria) this;
        }

        public Criteria andRank5MoneyNotBetween(Long value1, Long value2) {
            addCriterion("rank5_money not between", value1, value2, "rank5Money");
            return (Criteria) this;
        }

        public Criteria andPerformanceMoneyIsNull() {
            addCriterion("performance_money is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceMoneyIsNotNull() {
            addCriterion("performance_money is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceMoneyEqualTo(Long value) {
            addCriterion("performance_money =", value, "performanceMoney");
            return (Criteria) this;
        }

        public Criteria andPerformanceMoneyNotEqualTo(Long value) {
            addCriterion("performance_money <>", value, "performanceMoney");
            return (Criteria) this;
        }

        public Criteria andPerformanceMoneyGreaterThan(Long value) {
            addCriterion("performance_money >", value, "performanceMoney");
            return (Criteria) this;
        }

        public Criteria andPerformanceMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("performance_money >=", value, "performanceMoney");
            return (Criteria) this;
        }

        public Criteria andPerformanceMoneyLessThan(Long value) {
            addCriterion("performance_money <", value, "performanceMoney");
            return (Criteria) this;
        }

        public Criteria andPerformanceMoneyLessThanOrEqualTo(Long value) {
            addCriterion("performance_money <=", value, "performanceMoney");
            return (Criteria) this;
        }

        public Criteria andPerformanceMoneyIn(List<Long> values) {
            addCriterion("performance_money in", values, "performanceMoney");
            return (Criteria) this;
        }

        public Criteria andPerformanceMoneyNotIn(List<Long> values) {
            addCriterion("performance_money not in", values, "performanceMoney");
            return (Criteria) this;
        }

        public Criteria andPerformanceMoneyBetween(Long value1, Long value2) {
            addCriterion("performance_money between", value1, value2, "performanceMoney");
            return (Criteria) this;
        }

        public Criteria andPerformanceMoneyNotBetween(Long value1, Long value2) {
            addCriterion("performance_money not between", value1, value2, "performanceMoney");
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