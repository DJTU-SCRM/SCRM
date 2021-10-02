package com.example.scrm.sector.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class sectorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public sectorExample() {
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

        public Criteria andSectorNameIsNull() {
            addCriterion("sector_name is null");
            return (Criteria) this;
        }

        public Criteria andSectorNameIsNotNull() {
            addCriterion("sector_name is not null");
            return (Criteria) this;
        }

        public Criteria andSectorNameEqualTo(String value) {
            addCriterion("sector_name =", value, "sectorName");
            return (Criteria) this;
        }

        public Criteria andSectorNameNotEqualTo(String value) {
            addCriterion("sector_name <>", value, "sectorName");
            return (Criteria) this;
        }

        public Criteria andSectorNameGreaterThan(String value) {
            addCriterion("sector_name >", value, "sectorName");
            return (Criteria) this;
        }

        public Criteria andSectorNameGreaterThanOrEqualTo(String value) {
            addCriterion("sector_name >=", value, "sectorName");
            return (Criteria) this;
        }

        public Criteria andSectorNameLessThan(String value) {
            addCriterion("sector_name <", value, "sectorName");
            return (Criteria) this;
        }

        public Criteria andSectorNameLessThanOrEqualTo(String value) {
            addCriterion("sector_name <=", value, "sectorName");
            return (Criteria) this;
        }

        public Criteria andSectorNameLike(String value) {
            addCriterion("sector_name like", value, "sectorName");
            return (Criteria) this;
        }

        public Criteria andSectorNameNotLike(String value) {
            addCriterion("sector_name not like", value, "sectorName");
            return (Criteria) this;
        }

        public Criteria andSectorNameIn(List<String> values) {
            addCriterion("sector_name in", values, "sectorName");
            return (Criteria) this;
        }

        public Criteria andSectorNameNotIn(List<String> values) {
            addCriterion("sector_name not in", values, "sectorName");
            return (Criteria) this;
        }

        public Criteria andSectorNameBetween(String value1, String value2) {
            addCriterion("sector_name between", value1, value2, "sectorName");
            return (Criteria) this;
        }

        public Criteria andSectorNameNotBetween(String value1, String value2) {
            addCriterion("sector_name not between", value1, value2, "sectorName");
            return (Criteria) this;
        }

        public Criteria andSectorNoIsNull() {
            addCriterion("sector_no is null");
            return (Criteria) this;
        }

        public Criteria andSectorNoIsNotNull() {
            addCriterion("sector_no is not null");
            return (Criteria) this;
        }

        public Criteria andSectorNoEqualTo(String value) {
            addCriterion("sector_no =", value, "sectorNo");
            return (Criteria) this;
        }

        public Criteria andSectorNoNotEqualTo(String value) {
            addCriterion("sector_no <>", value, "sectorNo");
            return (Criteria) this;
        }

        public Criteria andSectorNoGreaterThan(String value) {
            addCriterion("sector_no >", value, "sectorNo");
            return (Criteria) this;
        }

        public Criteria andSectorNoGreaterThanOrEqualTo(String value) {
            addCriterion("sector_no >=", value, "sectorNo");
            return (Criteria) this;
        }

        public Criteria andSectorNoLessThan(String value) {
            addCriterion("sector_no <", value, "sectorNo");
            return (Criteria) this;
        }

        public Criteria andSectorNoLessThanOrEqualTo(String value) {
            addCriterion("sector_no <=", value, "sectorNo");
            return (Criteria) this;
        }

        public Criteria andSectorNoLike(String value) {
            addCriterion("sector_no like", value, "sectorNo");
            return (Criteria) this;
        }

        public Criteria andSectorNoNotLike(String value) {
            addCriterion("sector_no not like", value, "sectorNo");
            return (Criteria) this;
        }

        public Criteria andSectorNoIn(List<String> values) {
            addCriterion("sector_no in", values, "sectorNo");
            return (Criteria) this;
        }

        public Criteria andSectorNoNotIn(List<String> values) {
            addCriterion("sector_no not in", values, "sectorNo");
            return (Criteria) this;
        }

        public Criteria andSectorNoBetween(String value1, String value2) {
            addCriterion("sector_no between", value1, value2, "sectorNo");
            return (Criteria) this;
        }

        public Criteria andSectorNoNotBetween(String value1, String value2) {
            addCriterion("sector_no not between", value1, value2, "sectorNo");
            return (Criteria) this;
        }

        public Criteria andSectorTypeIsNull() {
            addCriterion("sector_type is null");
            return (Criteria) this;
        }

        public Criteria andSectorTypeIsNotNull() {
            addCriterion("sector_type is not null");
            return (Criteria) this;
        }

        public Criteria andSectorTypeEqualTo(String value) {
            addCriterion("sector_type =", value, "sectorType");
            return (Criteria) this;
        }

        public Criteria andSectorTypeNotEqualTo(String value) {
            addCriterion("sector_type <>", value, "sectorType");
            return (Criteria) this;
        }

        public Criteria andSectorTypeGreaterThan(String value) {
            addCriterion("sector_type >", value, "sectorType");
            return (Criteria) this;
        }

        public Criteria andSectorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sector_type >=", value, "sectorType");
            return (Criteria) this;
        }

        public Criteria andSectorTypeLessThan(String value) {
            addCriterion("sector_type <", value, "sectorType");
            return (Criteria) this;
        }

        public Criteria andSectorTypeLessThanOrEqualTo(String value) {
            addCriterion("sector_type <=", value, "sectorType");
            return (Criteria) this;
        }

        public Criteria andSectorTypeLike(String value) {
            addCriterion("sector_type like", value, "sectorType");
            return (Criteria) this;
        }

        public Criteria andSectorTypeNotLike(String value) {
            addCriterion("sector_type not like", value, "sectorType");
            return (Criteria) this;
        }

        public Criteria andSectorTypeIn(List<String> values) {
            addCriterion("sector_type in", values, "sectorType");
            return (Criteria) this;
        }

        public Criteria andSectorTypeNotIn(List<String> values) {
            addCriterion("sector_type not in", values, "sectorType");
            return (Criteria) this;
        }

        public Criteria andSectorTypeBetween(String value1, String value2) {
            addCriterion("sector_type between", value1, value2, "sectorType");
            return (Criteria) this;
        }

        public Criteria andSectorTypeNotBetween(String value1, String value2) {
            addCriterion("sector_type not between", value1, value2, "sectorType");
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