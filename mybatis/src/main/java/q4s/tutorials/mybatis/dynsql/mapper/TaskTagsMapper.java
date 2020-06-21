package q4s.tutorials.mybatis.dynsql.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static q4s.tutorials.mybatis.dynsql.mapper.TaskTagsDynamicSqlSupport.*;

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
import q4s.tutorials.mybatis.dynsql.entity.TaskTags;

@Mapper
public interface TaskTagsMapper extends RootInterface {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.63+03:00", comments = "Source Table: TASK_TAGS")
	BasicColumn[] selectList = BasicColumn.columnList(taskId, tagId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.629+03:00", comments = "Source Table: TASK_TAGS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.629+03:00", comments = "Source Table: TASK_TAGS")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.629+03:00", comments = "Source Table: TASK_TAGS")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<TaskTags> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.629+03:00", comments = "Source Table: TASK_TAGS")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<TaskTags> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.629+03:00", comments = "Source Table: TASK_TAGS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "TASK_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "TAG_ID", javaType = String.class, jdbcType = JdbcType.VARCHAR, id = true) })
	Optional<TaskTags> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.629+03:00", comments = "Source Table: TASK_TAGS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "TASK_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "TAG_ID", javaType = String.class, jdbcType = JdbcType.VARCHAR, id = true) })
	List<TaskTags> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.63+03:00", comments = "Source Table: TASK_TAGS")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.63+03:00", comments = "Source Table: TASK_TAGS")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, taskTags, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.63+03:00", comments = "Source Table: TASK_TAGS")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, taskTags, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.63+03:00", comments = "Source Table: TASK_TAGS")
	default int deleteByPrimaryKey(Long taskId_, String tagId_) {
		return delete(c -> c.where(taskId, isEqualTo(taskId_)).and(tagId, isEqualTo(tagId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.63+03:00", comments = "Source Table: TASK_TAGS")
	default int insert(TaskTags record) {
		return MyBatis3Utils.insert(this::insert, record, taskTags,
				c -> c.map(taskId).toProperty("taskId").map(tagId).toProperty("tagId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.63+03:00", comments = "Source Table: TASK_TAGS")
	default int insertMultiple(Collection<TaskTags> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, taskTags,
				c -> c.map(taskId).toProperty("taskId").map(tagId).toProperty("tagId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.63+03:00", comments = "Source Table: TASK_TAGS")
	default int insertSelective(TaskTags record) {
		return MyBatis3Utils.insert(this::insert, record, taskTags,
				c -> c.map(taskId).toPropertyWhenPresent("taskId", record::getTaskId).map(tagId)
						.toPropertyWhenPresent("tagId", record::getTagId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.63+03:00", comments = "Source Table: TASK_TAGS")
	default Optional<TaskTags> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, taskTags, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.63+03:00", comments = "Source Table: TASK_TAGS")
	default List<TaskTags> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, taskTags, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.63+03:00", comments = "Source Table: TASK_TAGS")
	default List<TaskTags> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, taskTags, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.631+03:00", comments = "Source Table: TASK_TAGS")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, taskTags, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.631+03:00", comments = "Source Table: TASK_TAGS")
	static UpdateDSL<UpdateModel> updateAllColumns(TaskTags record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(taskId).equalTo(record::getTaskId).set(tagId).equalTo(record::getTagId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.631+03:00", comments = "Source Table: TASK_TAGS")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(TaskTags record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(taskId).equalToWhenPresent(record::getTaskId).set(tagId).equalToWhenPresent(record::getTagId);
	}
}