package q4s.tutorials.mybatis.annot.entity;

import java.util.ArrayList;
import java.util.List;

public class SkillsExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table SKILLS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table SKILLS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table SKILLS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SKILLS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public SkillsExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SKILLS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SKILLS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SKILLS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SKILLS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SKILLS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SKILLS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SKILLS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SKILLS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SKILLS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SKILLS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table SKILLS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
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

		public Criteria andSkillIdIsNull() {
			addCriterion("SKILL_ID is null");
			return (Criteria) this;
		}

		public Criteria andSkillIdIsNotNull() {
			addCriterion("SKILL_ID is not null");
			return (Criteria) this;
		}

		public Criteria andSkillIdEqualTo(Long value) {
			addCriterion("SKILL_ID =", value, "skillId");
			return (Criteria) this;
		}

		public Criteria andSkillIdNotEqualTo(Long value) {
			addCriterion("SKILL_ID <>", value, "skillId");
			return (Criteria) this;
		}

		public Criteria andSkillIdGreaterThan(Long value) {
			addCriterion("SKILL_ID >", value, "skillId");
			return (Criteria) this;
		}

		public Criteria andSkillIdGreaterThanOrEqualTo(Long value) {
			addCriterion("SKILL_ID >=", value, "skillId");
			return (Criteria) this;
		}

		public Criteria andSkillIdLessThan(Long value) {
			addCriterion("SKILL_ID <", value, "skillId");
			return (Criteria) this;
		}

		public Criteria andSkillIdLessThanOrEqualTo(Long value) {
			addCriterion("SKILL_ID <=", value, "skillId");
			return (Criteria) this;
		}

		public Criteria andSkillIdIn(List<Long> values) {
			addCriterion("SKILL_ID in", values, "skillId");
			return (Criteria) this;
		}

		public Criteria andSkillIdNotIn(List<Long> values) {
			addCriterion("SKILL_ID not in", values, "skillId");
			return (Criteria) this;
		}

		public Criteria andSkillIdBetween(Long value1, Long value2) {
			addCriterion("SKILL_ID between", value1, value2, "skillId");
			return (Criteria) this;
		}

		public Criteria andSkillIdNotBetween(Long value1, Long value2) {
			addCriterion("SKILL_ID not between", value1, value2, "skillId");
			return (Criteria) this;
		}

		public Criteria andCodeIsNull() {
			addCriterion("CODE is null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull() {
			addCriterion("CODE is not null");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(String value) {
			addCriterion("CODE =", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(String value) {
			addCriterion("CODE <>", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThan(String value) {
			addCriterion("CODE >", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(String value) {
			addCriterion("CODE >=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThan(String value) {
			addCriterion("CODE <", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThanOrEqualTo(String value) {
			addCriterion("CODE <=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLike(String value) {
			addCriterion("CODE like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotLike(String value) {
			addCriterion("CODE not like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<String> values) {
			addCriterion("CODE in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<String> values) {
			addCriterion("CODE not in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeBetween(String value1, String value2) {
			addCriterion("CODE between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotBetween(String value1, String value2) {
			addCriterion("CODE not between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("TITLE is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("TITLE is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("TITLE =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("TITLE <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("TITLE >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("TITLE >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("TITLE <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("TITLE <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("TITLE like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("TITLE not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("TITLE in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("TITLE not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("TITLE between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("TITLE not between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("DESCRIPTION is null");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("DESCRIPTION is not null");
			return (Criteria) this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("DESCRIPTION =", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("DESCRIPTION <>", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("DESCRIPTION >", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("DESCRIPTION >=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("DESCRIPTION <", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("DESCRIPTION <=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("DESCRIPTION like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("DESCRIPTION not like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("DESCRIPTION in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("DESCRIPTION not in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("DESCRIPTION between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("DESCRIPTION not between", value1, value2, "description");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table SKILLS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SKILLS
     *
     * @mbg.generated do_not_delete_during_merge Fri Jun 19 17:36:56 MSK 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}