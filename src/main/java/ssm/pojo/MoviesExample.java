package ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class MoviesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoviesExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNull() {
            addCriterion("director is null");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNotNull() {
            addCriterion("director is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorEqualTo(String value) {
            addCriterion("director =", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotEqualTo(String value) {
            addCriterion("director <>", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThan(String value) {
            addCriterion("director >", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("director >=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThan(String value) {
            addCriterion("director <", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThanOrEqualTo(String value) {
            addCriterion("director <=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLike(String value) {
            addCriterion("director like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotLike(String value) {
            addCriterion("director not like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorIn(List<String> values) {
            addCriterion("director in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotIn(List<String> values) {
            addCriterion("director not in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorBetween(String value1, String value2) {
            addCriterion("director between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotBetween(String value1, String value2) {
            addCriterion("director not between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andActor1IsNull() {
            addCriterion("actor1 is null");
            return (Criteria) this;
        }

        public Criteria andActor1IsNotNull() {
            addCriterion("actor1 is not null");
            return (Criteria) this;
        }

        public Criteria andActor1EqualTo(String value) {
            addCriterion("actor1 =", value, "actor1");
            return (Criteria) this;
        }

        public Criteria andActor1NotEqualTo(String value) {
            addCriterion("actor1 <>", value, "actor1");
            return (Criteria) this;
        }

        public Criteria andActor1GreaterThan(String value) {
            addCriterion("actor1 >", value, "actor1");
            return (Criteria) this;
        }

        public Criteria andActor1GreaterThanOrEqualTo(String value) {
            addCriterion("actor1 >=", value, "actor1");
            return (Criteria) this;
        }

        public Criteria andActor1LessThan(String value) {
            addCriterion("actor1 <", value, "actor1");
            return (Criteria) this;
        }

        public Criteria andActor1LessThanOrEqualTo(String value) {
            addCriterion("actor1 <=", value, "actor1");
            return (Criteria) this;
        }

        public Criteria andActor1Like(String value) {
            addCriterion("actor1 like", value, "actor1");
            return (Criteria) this;
        }

        public Criteria andActor1NotLike(String value) {
            addCriterion("actor1 not like", value, "actor1");
            return (Criteria) this;
        }

        public Criteria andActor1In(List<String> values) {
            addCriterion("actor1 in", values, "actor1");
            return (Criteria) this;
        }

        public Criteria andActor1NotIn(List<String> values) {
            addCriterion("actor1 not in", values, "actor1");
            return (Criteria) this;
        }

        public Criteria andActor1Between(String value1, String value2) {
            addCriterion("actor1 between", value1, value2, "actor1");
            return (Criteria) this;
        }

        public Criteria andActor1NotBetween(String value1, String value2) {
            addCriterion("actor1 not between", value1, value2, "actor1");
            return (Criteria) this;
        }

        public Criteria andActor2IsNull() {
            addCriterion("actor2 is null");
            return (Criteria) this;
        }

        public Criteria andActor2IsNotNull() {
            addCriterion("actor2 is not null");
            return (Criteria) this;
        }

        public Criteria andActor2EqualTo(String value) {
            addCriterion("actor2 =", value, "actor2");
            return (Criteria) this;
        }

        public Criteria andActor2NotEqualTo(String value) {
            addCriterion("actor2 <>", value, "actor2");
            return (Criteria) this;
        }

        public Criteria andActor2GreaterThan(String value) {
            addCriterion("actor2 >", value, "actor2");
            return (Criteria) this;
        }

        public Criteria andActor2GreaterThanOrEqualTo(String value) {
            addCriterion("actor2 >=", value, "actor2");
            return (Criteria) this;
        }

        public Criteria andActor2LessThan(String value) {
            addCriterion("actor2 <", value, "actor2");
            return (Criteria) this;
        }

        public Criteria andActor2LessThanOrEqualTo(String value) {
            addCriterion("actor2 <=", value, "actor2");
            return (Criteria) this;
        }

        public Criteria andActor2Like(String value) {
            addCriterion("actor2 like", value, "actor2");
            return (Criteria) this;
        }

        public Criteria andActor2NotLike(String value) {
            addCriterion("actor2 not like", value, "actor2");
            return (Criteria) this;
        }

        public Criteria andActor2In(List<String> values) {
            addCriterion("actor2 in", values, "actor2");
            return (Criteria) this;
        }

        public Criteria andActor2NotIn(List<String> values) {
            addCriterion("actor2 not in", values, "actor2");
            return (Criteria) this;
        }

        public Criteria andActor2Between(String value1, String value2) {
            addCriterion("actor2 between", value1, value2, "actor2");
            return (Criteria) this;
        }

        public Criteria andActor2NotBetween(String value1, String value2) {
            addCriterion("actor2 not between", value1, value2, "actor2");
            return (Criteria) this;
        }

        public Criteria andActor3IsNull() {
            addCriterion("actor3 is null");
            return (Criteria) this;
        }

        public Criteria andActor3IsNotNull() {
            addCriterion("actor3 is not null");
            return (Criteria) this;
        }

        public Criteria andActor3EqualTo(String value) {
            addCriterion("actor3 =", value, "actor3");
            return (Criteria) this;
        }

        public Criteria andActor3NotEqualTo(String value) {
            addCriterion("actor3 <>", value, "actor3");
            return (Criteria) this;
        }

        public Criteria andActor3GreaterThan(String value) {
            addCriterion("actor3 >", value, "actor3");
            return (Criteria) this;
        }

        public Criteria andActor3GreaterThanOrEqualTo(String value) {
            addCriterion("actor3 >=", value, "actor3");
            return (Criteria) this;
        }

        public Criteria andActor3LessThan(String value) {
            addCriterion("actor3 <", value, "actor3");
            return (Criteria) this;
        }

        public Criteria andActor3LessThanOrEqualTo(String value) {
            addCriterion("actor3 <=", value, "actor3");
            return (Criteria) this;
        }

        public Criteria andActor3Like(String value) {
            addCriterion("actor3 like", value, "actor3");
            return (Criteria) this;
        }

        public Criteria andActor3NotLike(String value) {
            addCriterion("actor3 not like", value, "actor3");
            return (Criteria) this;
        }

        public Criteria andActor3In(List<String> values) {
            addCriterion("actor3 in", values, "actor3");
            return (Criteria) this;
        }

        public Criteria andActor3NotIn(List<String> values) {
            addCriterion("actor3 not in", values, "actor3");
            return (Criteria) this;
        }

        public Criteria andActor3Between(String value1, String value2) {
            addCriterion("actor3 between", value1, value2, "actor3");
            return (Criteria) this;
        }

        public Criteria andActor3NotBetween(String value1, String value2) {
            addCriterion("actor3 not between", value1, value2, "actor3");
            return (Criteria) this;
        }

        public Criteria andActor4IsNull() {
            addCriterion("actor4 is null");
            return (Criteria) this;
        }

        public Criteria andActor4IsNotNull() {
            addCriterion("actor4 is not null");
            return (Criteria) this;
        }

        public Criteria andActor4EqualTo(String value) {
            addCriterion("actor4 =", value, "actor4");
            return (Criteria) this;
        }

        public Criteria andActor4NotEqualTo(String value) {
            addCriterion("actor4 <>", value, "actor4");
            return (Criteria) this;
        }

        public Criteria andActor4GreaterThan(String value) {
            addCriterion("actor4 >", value, "actor4");
            return (Criteria) this;
        }

        public Criteria andActor4GreaterThanOrEqualTo(String value) {
            addCriterion("actor4 >=", value, "actor4");
            return (Criteria) this;
        }

        public Criteria andActor4LessThan(String value) {
            addCriterion("actor4 <", value, "actor4");
            return (Criteria) this;
        }

        public Criteria andActor4LessThanOrEqualTo(String value) {
            addCriterion("actor4 <=", value, "actor4");
            return (Criteria) this;
        }

        public Criteria andActor4Like(String value) {
            addCriterion("actor4 like", value, "actor4");
            return (Criteria) this;
        }

        public Criteria andActor4NotLike(String value) {
            addCriterion("actor4 not like", value, "actor4");
            return (Criteria) this;
        }

        public Criteria andActor4In(List<String> values) {
            addCriterion("actor4 in", values, "actor4");
            return (Criteria) this;
        }

        public Criteria andActor4NotIn(List<String> values) {
            addCriterion("actor4 not in", values, "actor4");
            return (Criteria) this;
        }

        public Criteria andActor4Between(String value1, String value2) {
            addCriterion("actor4 between", value1, value2, "actor4");
            return (Criteria) this;
        }

        public Criteria andActor4NotBetween(String value1, String value2) {
            addCriterion("actor4 not between", value1, value2, "actor4");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andBoxIsNull() {
            addCriterion("box is null");
            return (Criteria) this;
        }

        public Criteria andBoxIsNotNull() {
            addCriterion("box is not null");
            return (Criteria) this;
        }

        public Criteria andBoxEqualTo(Double value) {
            addCriterion("box =", value, "box");
            return (Criteria) this;
        }

        public Criteria andBoxNotEqualTo(Double value) {
            addCriterion("box <>", value, "box");
            return (Criteria) this;
        }

        public Criteria andBoxGreaterThan(Double value) {
            addCriterion("box >", value, "box");
            return (Criteria) this;
        }

        public Criteria andBoxGreaterThanOrEqualTo(Double value) {
            addCriterion("box >=", value, "box");
            return (Criteria) this;
        }

        public Criteria andBoxLessThan(Double value) {
            addCriterion("box <", value, "box");
            return (Criteria) this;
        }

        public Criteria andBoxLessThanOrEqualTo(Double value) {
            addCriterion("box <=", value, "box");
            return (Criteria) this;
        }

        public Criteria andBoxIn(List<Double> values) {
            addCriterion("box in", values, "box");
            return (Criteria) this;
        }

        public Criteria andBoxNotIn(List<Double> values) {
            addCriterion("box not in", values, "box");
            return (Criteria) this;
        }

        public Criteria andBoxBetween(Double value1, Double value2) {
            addCriterion("box between", value1, value2, "box");
            return (Criteria) this;
        }

        public Criteria andBoxNotBetween(Double value1, Double value2) {
            addCriterion("box not between", value1, value2, "box");
            return (Criteria) this;
        }

        public Criteria andImgAddressIsNull() {
            addCriterion("img_address is null");
            return (Criteria) this;
        }

        public Criteria andImgAddressIsNotNull() {
            addCriterion("img_address is not null");
            return (Criteria) this;
        }

        public Criteria andImgAddressEqualTo(String value) {
            addCriterion("img_address =", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressNotEqualTo(String value) {
            addCriterion("img_address <>", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressGreaterThan(String value) {
            addCriterion("img_address >", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressGreaterThanOrEqualTo(String value) {
            addCriterion("img_address >=", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressLessThan(String value) {
            addCriterion("img_address <", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressLessThanOrEqualTo(String value) {
            addCriterion("img_address <=", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressLike(String value) {
            addCriterion("img_address like", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressNotLike(String value) {
            addCriterion("img_address not like", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressIn(List<String> values) {
            addCriterion("img_address in", values, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressNotIn(List<String> values) {
            addCriterion("img_address not in", values, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressBetween(String value1, String value2) {
            addCriterion("img_address between", value1, value2, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressNotBetween(String value1, String value2) {
            addCriterion("img_address not between", value1, value2, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
            addCriterion("score not between", value1, value2, "score");
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