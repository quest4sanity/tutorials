package q4s.tutorials.mybatis.dynsql.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static q4s.tutorials.mybatis.dynsql.mapper.SkillsDynamicSqlSupport.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;
import q4s.tutorials.mybatis.RootInterface;
import q4s.tutorials.mybatis.dynsql.entity.Skills;

@Mapper
public interface SkillsMapper extends RootInterface {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.601+03:00", comments = "Source Table: SKILLS")
	BasicColumn[] selectList = BasicColumn.columnList(skillId, code, title, description);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.599+03:00", comments = "Source Table: SKILLS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.599+03:00", comments = "Source Table: SKILLS")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.6+03:00", comments = "Source Table: SKILLS")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Skills> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.6+03:00", comments = "Source Table: SKILLS")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Skills> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.6+03:00", comments = "Source Table: SKILLS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "SKILL_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR) })
	Optional<Skills> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.6+03:00", comments = "Source Table: SKILLS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "SKILL_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR) })
	List<Skills> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.6+03:00", comments = "Source Table: SKILLS")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.6+03:00", comments = "Source Table: SKILLS")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, skills, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.6+03:00", comments = "Source Table: SKILLS")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, skills, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.6+03:00", comments = "Source Table: SKILLS")
	default int deleteByPrimaryKey(Long skillId_) {
		return delete(c -> c.where(skillId, isEqualTo(skillId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.6+03:00", comments = "Source Table: SKILLS")
	default int insert(Skills record) {
		return MyBatis3Utils.insert(this::insert, record, skills, c -> c.map(skillId).toProperty("skillId").map(code)
				.toProperty("code").map(title).toProperty("title").map(description).toProperty("description"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.601+03:00", comments = "Source Table: SKILLS")
	default int insertMultiple(Collection<Skills> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, skills,
				c -> c.map(skillId).toProperty("skillId").map(code).toProperty("code").map(title).toProperty("title")
						.map(description).toProperty("description"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.601+03:00", comments = "Source Table: SKILLS")
	default int insertSelective(Skills record) {
		return MyBatis3Utils.insert(this::insert, record, skills,
				c -> c.map(skillId).toPropertyWhenPresent("skillId", record::getSkillId).map(code)
						.toPropertyWhenPresent("code", record::getCode).map(title)
						.toPropertyWhenPresent("title", record::getTitle).map(description)
						.toPropertyWhenPresent("description", record::getDescription));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.601+03:00", comments = "Source Table: SKILLS")
	default Optional<Skills> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, skills, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.601+03:00", comments = "Source Table: SKILLS")
	default List<Skills> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, skills, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.602+03:00", comments = "Source Table: SKILLS")
	default List<Skills> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, skills, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.602+03:00", comments = "Source Table: SKILLS")
	default Optional<Skills> selectByPrimaryKey(Long skillId_) {
		return selectOne(c -> c.where(skillId, isEqualTo(skillId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.602+03:00", comments = "Source Table: SKILLS")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, skills, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.602+03:00", comments = "Source Table: SKILLS")
	static UpdateDSL<UpdateModel> updateAllColumns(Skills record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(skillId).equalTo(record::getSkillId).set(code).equalTo(record::getCode).set(title)
				.equalTo(record::getTitle).set(description).equalTo(record::getDescription);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.602+03:00", comments = "Source Table: SKILLS")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Skills record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(skillId).equalToWhenPresent(record::getSkillId).set(code).equalToWhenPresent(record::getCode)
				.set(title).equalToWhenPresent(record::getTitle).set(description)
				.equalToWhenPresent(record::getDescription);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.602+03:00", comments = "Source Table: SKILLS")
	default int updateByPrimaryKey(Skills record) {
		return update(c -> c.set(code).equalTo(record::getCode).set(title).equalTo(record::getTitle).set(description)
				.equalTo(record::getDescription).where(skillId, isEqualTo(record::getSkillId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.602+03:00", comments = "Source Table: SKILLS")
	default int updateByPrimaryKeySelective(Skills record) {
		return update(c -> c.set(code).equalToWhenPresent(record::getCode).set(title)
				.equalToWhenPresent(record::getTitle).set(description).equalToWhenPresent(record::getDescription)
				.where(skillId, isEqualTo(record::getSkillId)));
	}
}