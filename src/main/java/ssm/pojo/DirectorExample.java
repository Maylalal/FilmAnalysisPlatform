package ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class DirectorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DirectorExample() {
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

        public Criteria andDirectorIdIsNull() {
            addCriterion("director_id is null");
            return (Criteria) this;
        }

        public Criteria andDirectorIdIsNotNull() {
            addCriterion("director_id is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorIdEqualTo(Integer value) {
            addCriterion("director_id =", value, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdNotEqualTo(Integer value) {
            addCriterion("director_id <>", value, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdGreaterThan(Integer value) {
            addCriterion("director_id >", value, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("director_id >=", value, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdLessThan(Integer value) {
            addCriterion("director_id <", value, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdLessThanOrEqualTo(Integer value) {
            addCriterion("director_id <=", value, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdIn(List<Integer> values) {
            addCriterion("director_id in", values, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdNotIn(List<Integer> values) {
            addCriterion("director_id not in", values, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdBetween(Integer value1, Integer value2) {
            addCriterion("director_id between", value1, value2, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("director_id not between", value1, value2, "directorId");
            return (Criteria) this;
        }

        public Criteria andDirectorNameIsNull() {
            addCriterion("director_name is null");
            return (Criteria) this;
        }

        public Criteria andDirectorNameIsNotNull() {
            addCriterion("director_name is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorNameEqualTo(String value) {
            addCriterion("director_name =", value, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameNotEqualTo(String value) {
            addCriterion("director_name <>", value, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameGreaterThan(String value) {
            addCriterion("director_name >", value, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameGreaterThanOrEqualTo(String value) {
            addCriterion("director_name >=", value, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameLessThan(String value) {
            addCriterion("director_name <", value, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameLessThanOrEqualTo(String value) {
            addCriterion("director_name <=", value, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameLike(String value) {
            addCriterion("director_name like", value, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameNotLike(String value) {
            addCriterion("director_name not like", value, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameIn(List<String> values) {
            addCriterion("director_name in", values, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameNotIn(List<String> values) {
            addCriterion("director_name not in", values, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameBetween(String value1, String value2) {
            addCriterion("director_name between", value1, value2, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameNotBetween(String value1, String value2) {
            addCriterion("director_name not between", value1, value2, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorWeightIsNull() {
            addCriterion("director_weight is null");
            return (Criteria) this;
        }

        public Criteria andDirectorWeightIsNotNull() {
            addCriterion("director_weight is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorWeightEqualTo(Double value) {
            addCriterion("director_weight =", value, "directorWeight");
            return (Criteria) this;
        }

        public Criteria andDirectorWeightNotEqualTo(Double value) {
            addCriterion("director_weight <>", value, "directorWeight");
            return (Criteria) this;
        }

        public Criteria andDirectorWeightGreaterThan(Double value) {
            addCriterion("director_weight >", value, "directorWeight");
            return (Criteria) this;
        }

        public Criteria andDirectorWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("director_weight >=", value, "directorWeight");
            return (Criteria) this;
        }

        public Criteria andDirectorWeightLessThan(Double value) {
            addCriterion("director_weight <", value, "directorWeight");
            return (Criteria) this;
        }

        public Criteria andDirectorWeightLessThanOrEqualTo(Double value) {
            addCriterion("director_weight <=", value, "directorWeight");
            return (Criteria) this;
        }

        public Criteria andDirectorWeightIn(List<Double> values) {
            addCriterion("director_weight in", values, "directorWeight");
            return (Criteria) this;
        }

        public Criteria andDirectorWeightNotIn(List<Double> values) {
            addCriterion("director_weight not in", values, "directorWeight");
            return (Criteria) this;
        }

        public Criteria andDirectorWeightBetween(Double value1, Double value2) {
            addCriterion("director_weight between", value1, value2, "directorWeight");
            return (Criteria) this;
        }

        public Criteria andDirectorWeightNotBetween(Double value1, Double value2) {
            addCriterion("director_weight not between", value1, value2, "directorWeight");
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