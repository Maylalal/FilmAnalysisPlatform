package ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class MovieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieExample() {
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

        public Criteria andMovieIdIsNull() {
            addCriterion("movie_id is null");
            return (Criteria) this;
        }

        public Criteria andMovieIdIsNotNull() {
            addCriterion("movie_id is not null");
            return (Criteria) this;
        }

        public Criteria andMovieIdEqualTo(Integer value) {
            addCriterion("movie_id =", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotEqualTo(Integer value) {
            addCriterion("movie_id <>", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThan(Integer value) {
            addCriterion("movie_id >", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("movie_id >=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThan(Integer value) {
            addCriterion("movie_id <", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThanOrEqualTo(Integer value) {
            addCriterion("movie_id <=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdIn(List<Integer> values) {
            addCriterion("movie_id in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotIn(List<Integer> values) {
            addCriterion("movie_id not in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdBetween(Integer value1, Integer value2) {
            addCriterion("movie_id between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotBetween(Integer value1, Integer value2) {
            addCriterion("movie_id not between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNull() {
            addCriterion("movie_name is null");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNotNull() {
            addCriterion("movie_name is not null");
            return (Criteria) this;
        }

        public Criteria andMovieNameEqualTo(String value) {
            addCriterion("movie_name =", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotEqualTo(String value) {
            addCriterion("movie_name <>", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThan(String value) {
            addCriterion("movie_name >", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThanOrEqualTo(String value) {
            addCriterion("movie_name >=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThan(String value) {
            addCriterion("movie_name <", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThanOrEqualTo(String value) {
            addCriterion("movie_name <=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLike(String value) {
            addCriterion("movie_name like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotLike(String value) {
            addCriterion("movie_name not like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameIn(List<String> values) {
            addCriterion("movie_name in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotIn(List<String> values) {
            addCriterion("movie_name not in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameBetween(String value1, String value2) {
            addCriterion("movie_name between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotBetween(String value1, String value2) {
            addCriterion("movie_name not between", value1, value2, "movieName");
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

        public Criteria andMovieScoreIsNull() {
            addCriterion("movie_score is null");
            return (Criteria) this;
        }

        public Criteria andMovieScoreIsNotNull() {
            addCriterion("movie_score is not null");
            return (Criteria) this;
        }

        public Criteria andMovieScoreEqualTo(Double value) {
            addCriterion("movie_score =", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotEqualTo(Double value) {
            addCriterion("movie_score <>", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreGreaterThan(Double value) {
            addCriterion("movie_score >", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("movie_score >=", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreLessThan(Double value) {
            addCriterion("movie_score <", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreLessThanOrEqualTo(Double value) {
            addCriterion("movie_score <=", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreIn(List<Double> values) {
            addCriterion("movie_score in", values, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotIn(List<Double> values) {
            addCriterion("movie_score not in", values, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreBetween(Double value1, Double value2) {
            addCriterion("movie_score between", value1, value2, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotBetween(Double value1, Double value2) {
            addCriterion("movie_score not between", value1, value2, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorIsNull() {
            addCriterion("movie_director is null");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorIsNotNull() {
            addCriterion("movie_director is not null");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorEqualTo(String value) {
            addCriterion("movie_director =", value, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorNotEqualTo(String value) {
            addCriterion("movie_director <>", value, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorGreaterThan(String value) {
            addCriterion("movie_director >", value, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("movie_director >=", value, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorLessThan(String value) {
            addCriterion("movie_director <", value, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorLessThanOrEqualTo(String value) {
            addCriterion("movie_director <=", value, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorLike(String value) {
            addCriterion("movie_director like", value, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorNotLike(String value) {
            addCriterion("movie_director not like", value, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorIn(List<String> values) {
            addCriterion("movie_director in", values, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorNotIn(List<String> values) {
            addCriterion("movie_director not in", values, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorBetween(String value1, String value2) {
            addCriterion("movie_director between", value1, value2, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieDirectorNotBetween(String value1, String value2) {
            addCriterion("movie_director not between", value1, value2, "movieDirector");
            return (Criteria) this;
        }

        public Criteria andMovieActorIsNull() {
            addCriterion("movie_actor is null");
            return (Criteria) this;
        }

        public Criteria andMovieActorIsNotNull() {
            addCriterion("movie_actor is not null");
            return (Criteria) this;
        }

        public Criteria andMovieActorEqualTo(String value) {
            addCriterion("movie_actor =", value, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorNotEqualTo(String value) {
            addCriterion("movie_actor <>", value, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorGreaterThan(String value) {
            addCriterion("movie_actor >", value, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorGreaterThanOrEqualTo(String value) {
            addCriterion("movie_actor >=", value, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorLessThan(String value) {
            addCriterion("movie_actor <", value, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorLessThanOrEqualTo(String value) {
            addCriterion("movie_actor <=", value, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorLike(String value) {
            addCriterion("movie_actor like", value, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorNotLike(String value) {
            addCriterion("movie_actor not like", value, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorIn(List<String> values) {
            addCriterion("movie_actor in", values, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorNotIn(List<String> values) {
            addCriterion("movie_actor not in", values, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorBetween(String value1, String value2) {
            addCriterion("movie_actor between", value1, value2, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieActorNotBetween(String value1, String value2) {
            addCriterion("movie_actor not between", value1, value2, "movieActor");
            return (Criteria) this;
        }

        public Criteria andMovieAreaIsNull() {
            addCriterion("movie_area is null");
            return (Criteria) this;
        }

        public Criteria andMovieAreaIsNotNull() {
            addCriterion("movie_area is not null");
            return (Criteria) this;
        }

        public Criteria andMovieAreaEqualTo(String value) {
            addCriterion("movie_area =", value, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaNotEqualTo(String value) {
            addCriterion("movie_area <>", value, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaGreaterThan(String value) {
            addCriterion("movie_area >", value, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaGreaterThanOrEqualTo(String value) {
            addCriterion("movie_area >=", value, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaLessThan(String value) {
            addCriterion("movie_area <", value, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaLessThanOrEqualTo(String value) {
            addCriterion("movie_area <=", value, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaLike(String value) {
            addCriterion("movie_area like", value, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaNotLike(String value) {
            addCriterion("movie_area not like", value, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaIn(List<String> values) {
            addCriterion("movie_area in", values, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaNotIn(List<String> values) {
            addCriterion("movie_area not in", values, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaBetween(String value1, String value2) {
            addCriterion("movie_area between", value1, value2, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaNotBetween(String value1, String value2) {
            addCriterion("movie_area not between", value1, value2, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieTimeIsNull() {
            addCriterion("movie_time is null");
            return (Criteria) this;
        }

        public Criteria andMovieTimeIsNotNull() {
            addCriterion("movie_time is not null");
            return (Criteria) this;
        }

        public Criteria andMovieTimeEqualTo(String value) {
            addCriterion("movie_time =", value, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeNotEqualTo(String value) {
            addCriterion("movie_time <>", value, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeGreaterThan(String value) {
            addCriterion("movie_time >", value, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeGreaterThanOrEqualTo(String value) {
            addCriterion("movie_time >=", value, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeLessThan(String value) {
            addCriterion("movie_time <", value, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeLessThanOrEqualTo(String value) {
            addCriterion("movie_time <=", value, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeLike(String value) {
            addCriterion("movie_time like", value, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeNotLike(String value) {
            addCriterion("movie_time not like", value, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeIn(List<String> values) {
            addCriterion("movie_time in", values, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeNotIn(List<String> values) {
            addCriterion("movie_time not in", values, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeBetween(String value1, String value2) {
            addCriterion("movie_time between", value1, value2, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeNotBetween(String value1, String value2) {
            addCriterion("movie_time not between", value1, value2, "movieTime");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
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