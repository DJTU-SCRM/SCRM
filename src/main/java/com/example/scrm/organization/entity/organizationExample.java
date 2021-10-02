package com.example.scrm.organization.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class organizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public organizationExample() {
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

        public Criteria andOrganizNameIsNull() {
            addCriterion("organiz_name is null");
            return (Criteria) this;
        }

        public Criteria andOrganizNameIsNotNull() {
            addCriterion("organiz_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizNameEqualTo(String value) {
            addCriterion("organiz_name =", value, "organizName");
            return (Criteria) this;
        }

        public Criteria andOrganizNameNotEqualTo(String value) {
            addCriterion("organiz_name <>", value, "organizName");
            return (Criteria) this;
        }

        public Criteria andOrganizNameGreaterThan(String value) {
            addCriterion("organiz_name >", value, "organizName");
            return (Criteria) this;
        }

        public Criteria andOrganizNameGreaterThanOrEqualTo(String value) {
            addCriterion("organiz_name >=", value, "organizName");
            return (Criteria) this;
        }

        public Criteria andOrganizNameLessThan(String value) {
            addCriterion("organiz_name <", value, "organizName");
            return (Criteria) this;
        }

        public Criteria andOrganizNameLessThanOrEqualTo(String value) {
            addCriterion("organiz_name <=", value, "organizName");
            return (Criteria) this;
        }

        public Criteria andOrganizNameLike(String value) {
            addCriterion("organiz_name like", value, "organizName");
            return (Criteria) this;
        }

        public Criteria andOrganizNameNotLike(String value) {
            addCriterion("organiz_name not like", value, "organizName");
            return (Criteria) this;
        }

        public Criteria andOrganizNameIn(List<String> values) {
            addCriterion("organiz_name in", values, "organizName");
            return (Criteria) this;
        }

        public Criteria andOrganizNameNotIn(List<String> values) {
            addCriterion("organiz_name not in", values, "organizName");
            return (Criteria) this;
        }

        public Criteria andOrganizNameBetween(String value1, String value2) {
            addCriterion("organiz_name between", value1, value2, "organizName");
            return (Criteria) this;
        }

        public Criteria andOrganizNameNotBetween(String value1, String value2) {
            addCriterion("organiz_name not between", value1, value2, "organizName");
            return (Criteria) this;
        }

        public Criteria andOrganizTypeIsNull() {
            addCriterion("organiz_type is null");
            return (Criteria) this;
        }

        public Criteria andOrganizTypeIsNotNull() {
            addCriterion("organiz_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizTypeEqualTo(String value) {
            addCriterion("organiz_type =", value, "organizType");
            return (Criteria) this;
        }

        public Criteria andOrganizTypeNotEqualTo(String value) {
            addCriterion("organiz_type <>", value, "organizType");
            return (Criteria) this;
        }

        public Criteria andOrganizTypeGreaterThan(String value) {
            addCriterion("organiz_type >", value, "organizType");
            return (Criteria) this;
        }

        public Criteria andOrganizTypeGreaterThanOrEqualTo(String value) {
            addCriterion("organiz_type >=", value, "organizType");
            return (Criteria) this;
        }

        public Criteria andOrganizTypeLessThan(String value) {
            addCriterion("organiz_type <", value, "organizType");
            return (Criteria) this;
        }

        public Criteria andOrganizTypeLessThanOrEqualTo(String value) {
            addCriterion("organiz_type <=", value, "organizType");
            return (Criteria) this;
        }

        public Criteria andOrganizTypeLike(String value) {
            addCriterion("organiz_type like", value, "organizType");
            return (Criteria) this;
        }

        public Criteria andOrganizTypeNotLike(String value) {
            addCriterion("organiz_type not like", value, "organizType");
            return (Criteria) this;
        }

        public Criteria andOrganizTypeIn(List<String> values) {
            addCriterion("organiz_type in", values, "organizType");
            return (Criteria) this;
        }

        public Criteria andOrganizTypeNotIn(List<String> values) {
            addCriterion("organiz_type not in", values, "organizType");
            return (Criteria) this;
        }

        public Criteria andOrganizTypeBetween(String value1, String value2) {
            addCriterion("organiz_type between", value1, value2, "organizType");
            return (Criteria) this;
        }

        public Criteria andOrganizTypeNotBetween(String value1, String value2) {
            addCriterion("organiz_type not between", value1, value2, "organizType");
            return (Criteria) this;
        }

        public Criteria andOrganizNoIsNull() {
            addCriterion("organiz_no is null");
            return (Criteria) this;
        }

        public Criteria andOrganizNoIsNotNull() {
            addCriterion("organiz_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizNoEqualTo(Integer value) {
            addCriterion("organiz_no =", value, "organizNo");
            return (Criteria) this;
        }

        public Criteria andOrganizNoNotEqualTo(Integer value) {
            addCriterion("organiz_no <>", value, "organizNo");
            return (Criteria) this;
        }

        public Criteria andOrganizNoGreaterThan(Integer value) {
            addCriterion("organiz_no >", value, "organizNo");
            return (Criteria) this;
        }

        public Criteria andOrganizNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("organiz_no >=", value, "organizNo");
            return (Criteria) this;
        }

        public Criteria andOrganizNoLessThan(Integer value) {
            addCriterion("organiz_no <", value, "organizNo");
            return (Criteria) this;
        }

        public Criteria andOrganizNoLessThanOrEqualTo(Integer value) {
            addCriterion("organiz_no <=", value, "organizNo");
            return (Criteria) this;
        }

        public Criteria andOrganizNoIn(List<Integer> values) {
            addCriterion("organiz_no in", values, "organizNo");
            return (Criteria) this;
        }

        public Criteria andOrganizNoNotIn(List<Integer> values) {
            addCriterion("organiz_no not in", values, "organizNo");
            return (Criteria) this;
        }

        public Criteria andOrganizNoBetween(Integer value1, Integer value2) {
            addCriterion("organiz_no between", value1, value2, "organizNo");
            return (Criteria) this;
        }

        public Criteria andOrganizNoNotBetween(Integer value1, Integer value2) {
            addCriterion("organiz_no not between", value1, value2, "organizNo");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
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