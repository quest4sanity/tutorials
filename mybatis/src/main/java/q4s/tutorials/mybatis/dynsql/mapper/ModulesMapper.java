package q4s.tutorials.mybatis.dynsql.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static q4s.tutorials.mybatis.dynsql.mapper.ModulesDynamicSqlSupport.*;

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
import q4s.tutorials.mybatis.dynsql.entity.Modules;

@Mapper
public interface ModulesMapper extends RootInterface {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.553+03:00", comments = "Source Table: MODULES")
	BasicColumn[] selectList = BasicColumn.columnList(moduleId, projectId, code, title, description, stuff);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.551+03:00", comments = "Source Table: MODULES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.551+03:00", comments = "Source Table: MODULES")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.551+03:00", comments = "Source Table: MODULES")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Modules> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.551+03:00", comments = "Source Table: MODULES")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Modules> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.551+03:00", comments = "Source Table: MODULES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "MODULE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "PROJECT_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "STUFF", javaType = String.class, jdbcType = JdbcType.CLOB) })
	Optional<Modules> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.552+03:00", comments = "Source Table: MODULES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "MODULE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "PROJECT_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "STUFF", javaType = String.class, jdbcType = JdbcType.CLOB) })
	List<Modules> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.552+03:00", comments = "Source Table: MODULES")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.552+03:00", comments = "Source Table: MODULES")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, modules, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.552+03:00", comments = "Source Table: MODULES")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, modules, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.552+03:00", comments = "Source Table: MODULES")
	default int deleteByPrimaryKey(Long moduleId_) {
		return delete(c -> c.where(moduleId, isEqualTo(moduleId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.552+03:00", comments = "Source Table: MODULES")
	default int insert(Modules record) {
		return MyBatis3Utils.insert(this::insert, record, modules,
				c -> c.map(moduleId).toProperty("moduleId").map(projectId).toProperty("projectId").map(code)
						.toProperty("code").map(title).toProperty("title").map(description).toProperty("description")
						.map(stuff).toProperty("stuff"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.552+03:00", comments = "Source Table: MODULES")
	default int insertMultiple(Collection<Modules> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, modules,
				c -> c.map(moduleId).toProperty("moduleId").map(projectId).toProperty("projectId").map(code)
						.toProperty("code").map(title).toProperty("title").map(description).toProperty("description")
						.map(stuff).toProperty("stuff"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.552+03:00", comments = "Source Table: MODULES")
	default int insertSelective(Modules record) {
		return MyBatis3Utils.insert(this::insert, record, modules,
				c -> c.map(moduleId).toPropertyWhenPresent("moduleId", record::getModuleId).map(projectId)
						.toPropertyWhenPresent("projectId", record::getProjectId).map(code)
						.toPropertyWhenPresent("code", record::getCode).map(title)
						.toPropertyWhenPresent("title", record::getTitle).map(description)
						.toPropertyWhenPresent("description", record::getDescription).map(stuff)
						.toPropertyWhenPresent("stuff", record::getStuff));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.553+03:00", comments = "Source Table: MODULES")
	default Optional<Modules> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, modules, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.553+03:00", comments = "Source Table: MODULES")
	default List<Modules> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, modules, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.553+03:00", comments = "Source Table: MODULES")
	default List<Modules> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, modules, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.553+03:00", comments = "Source Table: MODULES")
	default Optional<Modules> selectByPrimaryKey(Long moduleId_) {
		return selectOne(c -> c.where(moduleId, isEqualTo(moduleId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.553+03:00", comments = "Source Table: MODULES")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, modules, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.553+03:00", comments = "Source Table: MODULES")
	static UpdateDSL<UpdateModel> updateAllColumns(Modules record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(moduleId).equalTo(record::getModuleId).set(projectId).equalTo(record::getProjectId).set(code)
				.equalTo(record::getCode).set(title).equalTo(record::getTitle).set(description)
				.equalTo(record::getDescription).set(stuff).equalTo(record::getStuff);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.554+03:00", comments = "Source Table: MODULES")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Modules record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(moduleId).equalToWhenPresent(record::getModuleId).set(projectId)
				.equalToWhenPresent(record::getProjectId).set(code).equalToWhenPresent(record::getCode).set(title)
				.equalToWhenPresent(record::getTitle).set(description).equalToWhenPresent(record::getDescription)
				.set(stuff).equalToWhenPresent(record::getStuff);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.554+03:00", comments = "Source Table: MODULES")
	default int updateByPrimaryKey(Modules record) {
		return update(c -> c.set(projectId).equalTo(record::getProjectId).set(code).equalTo(record::getCode).set(title)
				.equalTo(record::getTitle).set(description).equalTo(record::getDescription).set(stuff)
				.equalTo(record::getStuff).where(moduleId, isEqualTo(record::getModuleId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.554+03:00", comments = "Source Table: MODULES")
	default int updateByPrimaryKeySelective(Modules record) {
		return update(c -> c.set(projectId).equalToWhenPresent(record::getProjectId).set(code)
				.equalToWhenPresent(record::getCode).set(title).equalToWhenPresent(record::getTitle).set(description)
				.equalToWhenPresent(record::getDescription).set(stuff).equalToWhenPresent(record::getStuff)
				.where(moduleId, isEqualTo(record::getModuleId)));
	}
}