package q4s.tutorials.mybatis.dynsql.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static q4s.tutorials.mybatis.dynsql.mapper.TaskTypesDynamicSqlSupport.*;

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
import q4s.tutorials.mybatis.dynsql.entity.TaskTypes;

@Mapper
public interface TaskTypesMapper extends RootInterface {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.634+03:00", comments = "Source Table: TASK_TYPES")
	BasicColumn[] selectList = BasicColumn.columnList(typeId, code, title, description);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.633+03:00", comments = "Source Table: TASK_TYPES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.633+03:00", comments = "Source Table: TASK_TYPES")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.633+03:00", comments = "Source Table: TASK_TYPES")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<TaskTypes> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.633+03:00", comments = "Source Table: TASK_TYPES")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<TaskTypes> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.633+03:00", comments = "Source Table: TASK_TYPES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "TYPE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR) })
	Optional<TaskTypes> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.633+03:00", comments = "Source Table: TASK_TYPES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "TYPE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR) })
	List<TaskTypes> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.633+03:00", comments = "Source Table: TASK_TYPES")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.633+03:00", comments = "Source Table: TASK_TYPES")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, taskTypes, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.633+03:00", comments = "Source Table: TASK_TYPES")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, taskTypes, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.634+03:00", comments = "Source Table: TASK_TYPES")
	default int deleteByPrimaryKey(Long typeId_) {
		return delete(c -> c.where(typeId, isEqualTo(typeId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.634+03:00", comments = "Source Table: TASK_TYPES")
	default int insert(TaskTypes record) {
		return MyBatis3Utils.insert(this::insert, record, taskTypes, c -> c.map(typeId).toProperty("typeId").map(code)
				.toProperty("code").map(title).toProperty("title").map(description).toProperty("description"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.634+03:00", comments = "Source Table: TASK_TYPES")
	default int insertMultiple(Collection<TaskTypes> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, taskTypes,
				c -> c.map(typeId).toProperty("typeId").map(code).toProperty("code").map(title).toProperty("title")
						.map(description).toProperty("description"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.634+03:00", comments = "Source Table: TASK_TYPES")
	default int insertSelective(TaskTypes record) {
		return MyBatis3Utils.insert(this::insert, record, taskTypes,
				c -> c.map(typeId).toPropertyWhenPresent("typeId", record::getTypeId).map(code)
						.toPropertyWhenPresent("code", record::getCode).map(title)
						.toPropertyWhenPresent("title", record::getTitle).map(description)
						.toPropertyWhenPresent("description", record::getDescription));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.634+03:00", comments = "Source Table: TASK_TYPES")
	default Optional<TaskTypes> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, taskTypes, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.634+03:00", comments = "Source Table: TASK_TYPES")
	default List<TaskTypes> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, taskTypes, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.634+03:00", comments = "Source Table: TASK_TYPES")
	default List<TaskTypes> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, taskTypes, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.634+03:00", comments = "Source Table: TASK_TYPES")
	default Optional<TaskTypes> selectByPrimaryKey(Long typeId_) {
		return selectOne(c -> c.where(typeId, isEqualTo(typeId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.635+03:00", comments = "Source Table: TASK_TYPES")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, taskTypes, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.635+03:00", comments = "Source Table: TASK_TYPES")
	static UpdateDSL<UpdateModel> updateAllColumns(TaskTypes record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(typeId).equalTo(record::getTypeId).set(code).equalTo(record::getCode).set(title)
				.equalTo(record::getTitle).set(description).equalTo(record::getDescription);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.635+03:00", comments = "Source Table: TASK_TYPES")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(TaskTypes record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(typeId).equalToWhenPresent(record::getTypeId).set(code).equalToWhenPresent(record::getCode)
				.set(title).equalToWhenPresent(record::getTitle).set(description)
				.equalToWhenPresent(record::getDescription);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.635+03:00", comments = "Source Table: TASK_TYPES")
	default int updateByPrimaryKey(TaskTypes record) {
		return update(c -> c.set(code).equalTo(record::getCode).set(title).equalTo(record::getTitle).set(description)
				.equalTo(record::getDescription).where(typeId, isEqualTo(record::getTypeId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.635+03:00", comments = "Source Table: TASK_TYPES")
	default int updateByPrimaryKeySelective(TaskTypes record) {
		return update(c -> c.set(code).equalToWhenPresent(record::getCode).set(title)
				.equalToWhenPresent(record::getTitle).set(description).equalToWhenPresent(record::getDescription)
				.where(typeId, isEqualTo(record::getTypeId)));
	}
}