package ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class ActorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActorExample() {
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

        public Criteria andActorIdIsNull() {
            addCriterion("actor_id is null");
            return (Criteria) this;
        }

        public Criteria andActorIdIsNotNull() {
            addCriterion("actor_id is not null");
            return (Criteria) this;
        }

        public Criteria andActorIdEqualTo(Integer value) {
            addCriterion("actor_id =", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotEqualTo(Integer value) {
            addCriterion("actor_id <>", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdGreaterThan(Integer value) {
            addCriterion("actor_id >", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("actor_id >=", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdLessThan(Integer value) {
            addCriterion("actor_id <", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdLessThanOrEqualTo(Integer value) {
            addCriterion("actor_id <=", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdIn(List<Integer> values) {
            addCriterion("actor_id in", values, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotIn(List<Integer> values) {
            addCriterion("actor_id not in", values, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdBetween(Integer value1, Integer value2) {
            addCriterion("actor_id between", value1, value2, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("actor_id not between", value1, value2, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorNameIsNull() {
            addCriterion("actor_name is null");
            return (Criteria) this;
        }

        public Criteria andActorNameIsNotNull() {
            addCriterion("actor_name is not null");
            return (Criteria) this;
        }

        public Criteria andActorNameEqualTo(String value) {
            addCriterion("actor_name =", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameNotEqualTo(String value) {
            addCriterion("actor_name <>", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameGreaterThan(String value) {
            addCriterion("actor_name >", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameGreaterThanOrEqualTo(String value) {
            addCriterion("actor_name >=", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameLessThan(String value) {
            addCriterion("actor_name <", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameLessThanOrEqualTo(String value) {
            addCriterion("actor_name <=", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameLike(String value) {
            addCriterion("actor_name like", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameNotLike(String value) {
            addCriterion("actor_name not like", value, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameIn(List<String> values) {
            addCriterion("actor_name in", values, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameNotIn(List<String> values) {
            addCriterion("actor_name not in", values, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameBetween(String value1, String value2) {
            addCriterion("actor_name between", value1, value2, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorNameNotBetween(String value1, String value2) {
            addCriterion("actor_name not between", value1, value2, "actorName");
            return (Criteria) this;
        }

        public Criteria andActorWeightIsNull() {
            addCriterion("actor_weight is null");
            return (Criteria) this;
        }

        public Criteria andActorWeightIsNotNull() {
            addCriterion("actor_weight is not null");
            return (Criteria) this;
        }

        public Criteria andActorWeightEqualTo(Double value) {
            addCriterion("actor_weight =", value, "actorWeight");
            return (Criteria) this;
        }

        public Criteria andActorWeightNotEqualTo(Double value) {
            addCriterion("actor_weight <>", value, "actorWeight");
            return (Criteria) this;
        }

        public Criteria andActorWeightGreaterThan(Double value) {
            addCriterion("actor_weight >", value, "actorWeight");
            return (Criteria) this;
        }

        public Criteria andActorWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("actor_weight >=", value, "actorWeight");
            return (Criteria) this;
        }

        public Criteria andActorWeightLessThan(Double value) {
            addCriterion("actor_weight <", value, "actorWeight");
            return (Criteria) this;
        }

        public Criteria andActorWeightLessThanOrEqualTo(Double value) {
            addCriterion("actor_weight <=", value, "actorWeight");
            return (Criteria) this;
        }

        public Criteria andActorWeightIn(List<Double> values) {
            addCriterion("actor_weight in", values, "actorWeight");
            return (Criteria) this;
        }

        public Criteria andActorWeightNotIn(List<Double> values) {
            addCriterion("actor_weight not in", values, "actorWeight");
            return (Criteria) this;
        }

        public Criteria andActorWeightBetween(Double value1, Double value2) {
            addCriterion("actor_weight between", value1, value2, "actorWeight");
            return (Criteria) this;
        }

        public Criteria andActorWeightNotBetween(Double value1, Double value2) {
            addCriterion("actor_weight not between", value1, value2, "actorWeight");
            return (Criteria) this;
        }

        public Criteria andMovieCountIsNull() {
            addCriterion("movie_count is null");
            return (Criteria) this;
        }

        public Criteria andMovieCountIsNotNull() {
            addCriterion("movie_count is not null");
            return (Criteria) this;
        }

        public Criteria andMovieCountEqualTo(Integer value) {
            addCriterion("movie_count =", value, "movieCount");
            return (Criteria) this;
        }

        public Criteria andMovieCountNotEqualTo(Integer value) {
            addCriterion("movie_count <>", value, "movieCount");
            return (Criteria) this;
        }

        public Criteria andMovieCountGreaterThan(Integer value) {
            addCriterion("movie_count >", value, "movieCount");
            return (Criteria) this;
        }

        public Criteria andMovieCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("movie_count >=", value, "movieCount");
            return (Criteria) this;
        }

        public Criteria andMovieCountLessThan(Integer value) {
            addCriterion("movie_count <", value, "movieCount");
            return (Criteria) this;
        }

        public Criteria andMovieCountLessThanOrEqualTo(Integer value) {
            addCriterion("movie_count <=", value, "movieCount");
            return (Criteria) this;
        }

        public Criteria andMovieCountIn(List<Integer> values) {
            addCriterion("movie_count in", values, "movieCount");
            return (Criteria) this;
        }

        public Criteria andMovieCountNotIn(List<Integer> values) {
            addCriterion("movie_count not in", values, "movieCount");
            return (Criteria) this;
        }

        public Criteria andMovieCountBetween(Integer value1, Integer value2) {
            addCriterion("movie_count between", value1, value2, "movieCount");
            return (Criteria) this;
        }

        public Criteria andMovieCountNotBetween(Integer value1, Integer value2) {
            addCriterion("movie_count not between", value1, value2, "movieCount");
            return (Criteria) this;
        }

        public Criteria andActorMovieRankIsNull() {
            addCriterion("actor_movie_rank is null");
            return (Criteria) this;
        }

        public Criteria andActorMovieRankIsNotNull() {
            addCriterion("actor_movie_rank is not null");
            return (Criteria) this;
        }

        public Criteria andActorMovieRankEqualTo(String value) {
            addCriterion("actor_movie_rank =", value, "actorMovieRank");
            return (Criteria) this;
        }

        public Criteria andActorMovieRankNotEqualTo(String value) {
            addCriterion("actor_movie_rank <>", value, "actorMovieRank");
            return (Criteria) this;
        }

        public Criteria andActorMovieRankGreaterThan(String value) {
            addCriterion("actor_movie_rank >", value, "actorMovieRank");
            return (Criteria) this;
        }

        public Criteria andActorMovieRankGreaterThanOrEqualTo(String value) {
            addCriterion("actor_movie_rank >=", value, "actorMovieRank");
            return (Criteria) this;
        }

        public Criteria andActorMovieRankLessThan(String value) {
            addCriterion("actor_movie_rank <", value, "actorMovieRank");
            return (Criteria) this;
        }

        public Criteria andActorMovieRankLessThanOrEqualTo(String value) {
            addCriterion("actor_movie_rank <=", value, "actorMovieRank");
            return (Criteria) this;
        }

        public Criteria andActorMovieRankLike(String value) {
            addCriterion("actor_movie_rank like", value, "actorMovieRank");
            return (Criteria) this;
        }

        public Criteria andActorMovieRankNotLike(String value) {
            addCriterion("actor_movie_rank not like", value, "actorMovieRank");
            return (Criteria) this;
        }

        public Criteria andActorMovieRankIn(List<String> values) {
            addCriterion("actor_movie_rank in", values, "actorMovieRank");
            return (Criteria) this;
        }

        public Criteria andActorMovieRankNotIn(List<String> values) {
            addCriterion("actor_movie_rank not in", values, "actorMovieRank");
            return (Criteria) this;
        }

        public Criteria andActorMovieRankBetween(String value1, String value2) {
            addCriterion("actor_movie_rank between", value1, value2, "actorMovieRank");
            return (Criteria) this;
        }

        public Criteria andActorMovieRankNotBetween(String value1, String value2) {
            addCriterion("actor_movie_rank not between", value1, value2, "actorMovieRank");
            return (Criteria) this;
        }

        public Criteria andAllBoxIsNull() {
            addCriterion("all_box is null");
            return (Criteria) this;
        }

        public Criteria andAllBoxIsNotNull() {
            addCriterion("all_box is not null");
            return (Criteria) this;
        }

        public Criteria andAllBoxEqualTo(Double value) {
            addCriterion("all_box =", value, "allBox");
            return (Criteria) this;
        }

        public Criteria andAllBoxNotEqualTo(Double value) {
            addCriterion("all_box <>", value, "allBox");
            return (Criteria) this;
        }

        public Criteria andAllBoxGreaterThan(Double value) {
            addCriterion("all_box >", value, "allBox");
            return (Criteria) this;
        }

        public Criteria andAllBoxGreaterThanOrEqualTo(Double value) {
            addCriterion("all_box >=", value, "allBox");
            return (Criteria) this;
        }

        public Criteria andAllBoxLessThan(Double value) {
            addCriterion("all_box <", value, "allBox");
            return (Criteria) this;
        }

        public Criteria andAllBoxLessThanOrEqualTo(Double value) {
            addCriterion("all_box <=", value, "allBox");
            return (Criteria) this;
        }

        public Criteria andAllBoxIn(List<Double> values) {
            addCriterion("all_box in", values, "allBox");
            return (Criteria) this;
        }

        public Criteria andAllBoxNotIn(List<Double> values) {
            addCriterion("all_box not in", values, "allBox");
            return (Criteria) this;
        }

        public Criteria andAllBoxBetween(Double value1, Double value2) {
            addCriterion("all_box between", value1, value2, "allBox");
            return (Criteria) this;
        }

        public Criteria andAllBoxNotBetween(Double value1, Double value2) {
            addCriterion("all_box not between", value1, value2, "allBox");
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