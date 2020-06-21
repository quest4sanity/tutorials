package q4s.tutorials.mybatis.dynsql.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static q4s.tutorials.mybatis.dynsql.mapper.ProjectsDynamicSqlSupport.*;

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
import q4s.tutorials.mybatis.dynsql.entity.Projects;

@Mapper
public interface ProjectsMapper extends RootInterface {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.567+03:00", comments = "Source Table: PROJECTS")
	BasicColumn[] selectList = BasicColumn.columnList(projectId, code, majorVer, title, description, stateId, stuff);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.565+03:00", comments = "Source Table: PROJECTS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.565+03:00", comments = "Source Table: PROJECTS")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.565+03:00", comments = "Source Table: PROJECTS")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Projects> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.566+03:00", comments = "Source Table: PROJECTS")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Projects> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.566+03:00", comments = "Source Table: PROJECTS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "PROJECT_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "MAJOR_VER", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
			@Arg(column = "TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "STATE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "STUFF", javaType = String.class, jdbcType = JdbcType.CLOB) })
	Optional<Projects> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.566+03:00", comments = "Source Table: PROJECTS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "PROJECT_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "MAJOR_VER", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
			@Arg(column = "TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "STATE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "STUFF", javaType = String.class, jdbcType = JdbcType.CLOB) })
	List<Projects> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.566+03:00", comments = "Source Table: PROJECTS")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.566+03:00", comments = "Source Table: PROJECTS")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, projects, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.566+03:00", comments = "Source Table: PROJECTS")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, projects, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.566+03:00", comments = "Source Table: PROJECTS")
	default int deleteByPrimaryKey(Long projectId_) {
		return delete(c -> c.where(projectId, isEqualTo(projectId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.566+03:00", comments = "Source Table: PROJECTS")
	default int insert(Projects record) {
		return MyBatis3Utils.insert(this::insert, record, projects,
				c -> c.map(projectId).toProperty("projectId").map(code).toProperty("code").map(majorVer)
						.toProperty("majorVer").map(title).toProperty("title").map(description)
						.toProperty("description").map(stateId).toProperty("stateId").map(stuff).toProperty("stuff"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.567+03:00", comments = "Source Table: PROJECTS")
	default int insertMultiple(Collection<Projects> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, projects,
				c -> c.map(projectId).toProperty("projectId").map(code).toProperty("code").map(majorVer)
						.toProperty("majorVer").map(title).toProperty("title").map(description)
						.toProperty("description").map(stateId).toProperty("stateId").map(stuff).toProperty("stuff"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.567+03:00", comments = "Source Table: PROJECTS")
	default int insertSelective(Projects record) {
		return MyBatis3Utils.insert(this::insert, record, projects,
				c -> c.map(projectId).toPropertyWhenPresent("projectId", record::getProjectId).map(code)
						.toPropertyWhenPresent("code", record::getCode).map(majorVer)
						.toPropertyWhenPresent("majorVer", record::getMajorVer).map(title)
						.toPropertyWhenPresent("title", record::getTitle).map(description)
						.toPropertyWhenPresent("description", record::getDescription).map(stateId)
						.toPropertyWhenPresent("stateId", record::getStateId).map(stuff)
						.toPropertyWhenPresent("stuff", record::getStuff));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.567+03:00", comments = "Source Table: PROJECTS")
	default Optional<Projects> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, projects, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.567+03:00", comments = "Source Table: PROJECTS")
	default List<Projects> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, projects, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.567+03:00", comments = "Source Table: PROJECTS")
	default List<Projects> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, projects, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.567+03:00", comments = "Source Table: PROJECTS")
	default Optional<Projects> selectByPrimaryKey(Long projectId_) {
		return selectOne(c -> c.where(projectId, isEqualTo(projectId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.568+03:00", comments = "Source Table: PROJECTS")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, projects, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.568+03:00", comments = "Source Table: PROJECTS")
	static UpdateDSL<UpdateModel> updateAllColumns(Projects record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(projectId).equalTo(record::getProjectId).set(code).equalTo(record::getCode).set(majorVer)
				.equalTo(record::getMajorVer).set(title).equalTo(record::getTitle).set(description)
				.equalTo(record::getDescription).set(stateId).equalTo(record::getStateId).set(stuff)
				.equalTo(record::getStuff);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.568+03:00", comments = "Source Table: PROJECTS")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Projects record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(projectId).equalToWhenPresent(record::getProjectId).set(code).equalToWhenPresent(record::getCode)
				.set(majorVer).equalToWhenPresent(record::getMajorVer).set(title).equalToWhenPresent(record::getTitle)
				.set(description).equalToWhenPresent(record::getDescription).set(stateId)
				.equalToWhenPresent(record::getStateId).set(stuff).equalToWhenPresent(record::getStuff);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.568+03:00", comments = "Source Table: PROJECTS")
	default int updateByPrimaryKey(Projects record) {
		return update(c -> c.set(code).equalTo(record::getCode).set(majorVer).equalTo(record::getMajorVer).set(title)
				.equalTo(record::getTitle).set(description).equalTo(record::getDescription).set(stateId)
				.equalTo(record::getStateId).set(stuff).equalTo(record::getStuff)
				.where(projectId, isEqualTo(record::getProjectId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.568+03:00", comments = "Source Table: PROJECTS")
	default int updateByPrimaryKeySelective(Projects record) {
		return update(c -> c.set(code).equalToWhenPresent(record::getCode).set(majorVer)
				.equalToWhenPresent(record::getMajorVer).set(title).equalToWhenPresent(record::getTitle)
				.set(description).equalToWhenPresent(record::getDescription).set(stateId)
				.equalToWhenPresent(record::getStateId).set(stuff).equalToWhenPresent(record::getStuff)
				.where(projectId, isEqualTo(record::getProjectId)));
	}
}