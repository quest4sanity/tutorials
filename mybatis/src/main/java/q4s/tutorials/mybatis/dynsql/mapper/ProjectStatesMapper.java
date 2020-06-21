package q4s.tutorials.mybatis.dynsql.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static q4s.tutorials.mybatis.dynsql.mapper.ProjectStatesDynamicSqlSupport.*;

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
import q4s.tutorials.mybatis.dynsql.entity.ProjectStates;

@Mapper
public interface ProjectStatesMapper extends RootInterface {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.573+03:00", comments = "Source Table: PROJECT_STATES")
	BasicColumn[] selectList = BasicColumn.columnList(stateId, code, title, description);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.571+03:00", comments = "Source Table: PROJECT_STATES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.571+03:00", comments = "Source Table: PROJECT_STATES")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.571+03:00", comments = "Source Table: PROJECT_STATES")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<ProjectStates> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.571+03:00", comments = "Source Table: PROJECT_STATES")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<ProjectStates> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.571+03:00", comments = "Source Table: PROJECT_STATES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "STATE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR) })
	Optional<ProjectStates> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.571+03:00", comments = "Source Table: PROJECT_STATES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "STATE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR) })
	List<ProjectStates> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.572+03:00", comments = "Source Table: PROJECT_STATES")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.572+03:00", comments = "Source Table: PROJECT_STATES")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, projectStates, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.572+03:00", comments = "Source Table: PROJECT_STATES")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, projectStates, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.572+03:00", comments = "Source Table: PROJECT_STATES")
	default int deleteByPrimaryKey(Long stateId_) {
		return delete(c -> c.where(stateId, isEqualTo(stateId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.572+03:00", comments = "Source Table: PROJECT_STATES")
	default int insert(ProjectStates record) {
		return MyBatis3Utils.insert(this::insert, record, projectStates,
				c -> c.map(stateId).toProperty("stateId").map(code).toProperty("code").map(title).toProperty("title")
						.map(description).toProperty("description"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.573+03:00", comments = "Source Table: PROJECT_STATES")
	default int insertMultiple(Collection<ProjectStates> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, projectStates,
				c -> c.map(stateId).toProperty("stateId").map(code).toProperty("code").map(title).toProperty("title")
						.map(description).toProperty("description"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.573+03:00", comments = "Source Table: PROJECT_STATES")
	default int insertSelective(ProjectStates record) {
		return MyBatis3Utils.insert(this::insert, record, projectStates,
				c -> c.map(stateId).toPropertyWhenPresent("stateId", record::getStateId).map(code)
						.toPropertyWhenPresent("code", record::getCode).map(title)
						.toPropertyWhenPresent("title", record::getTitle).map(description)
						.toPropertyWhenPresent("description", record::getDescription));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.573+03:00", comments = "Source Table: PROJECT_STATES")
	default Optional<ProjectStates> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, projectStates, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.573+03:00", comments = "Source Table: PROJECT_STATES")
	default List<ProjectStates> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, projectStates, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.573+03:00", comments = "Source Table: PROJECT_STATES")
	default List<ProjectStates> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, projectStates, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.573+03:00", comments = "Source Table: PROJECT_STATES")
	default Optional<ProjectStates> selectByPrimaryKey(Long stateId_) {
		return selectOne(c -> c.where(stateId, isEqualTo(stateId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.573+03:00", comments = "Source Table: PROJECT_STATES")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, projectStates, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.574+03:00", comments = "Source Table: PROJECT_STATES")
	static UpdateDSL<UpdateModel> updateAllColumns(ProjectStates record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(stateId).equalTo(record::getStateId).set(code).equalTo(record::getCode).set(title)
				.equalTo(record::getTitle).set(description).equalTo(record::getDescription);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.574+03:00", comments = "Source Table: PROJECT_STATES")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(ProjectStates record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(stateId).equalToWhenPresent(record::getStateId).set(code).equalToWhenPresent(record::getCode)
				.set(title).equalToWhenPresent(record::getTitle).set(description)
				.equalToWhenPresent(record::getDescription);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.574+03:00", comments = "Source Table: PROJECT_STATES")
	default int updateByPrimaryKey(ProjectStates record) {
		return update(c -> c.set(code).equalTo(record::getCode).set(title).equalTo(record::getTitle).set(description)
				.equalTo(record::getDescription).where(stateId, isEqualTo(record::getStateId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.574+03:00", comments = "Source Table: PROJECT_STATES")
	default int updateByPrimaryKeySelective(ProjectStates record) {
		return update(c -> c.set(code).equalToWhenPresent(record::getCode).set(title)
				.equalToWhenPresent(record::getTitle).set(description).equalToWhenPresent(record::getDescription)
				.where(stateId, isEqualTo(record::getStateId)));
	}
}