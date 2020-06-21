package q4s.tutorials.mybatis.dynsql.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static q4s.tutorials.mybatis.dynsql.mapper.TasksDynamicSqlSupport.*;

import java.util.Collection;
import java.util.Date;
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
import q4s.tutorials.mybatis.dynsql.entity.Tasks;

@Mapper
public interface TasksMapper extends RootInterface {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.614+03:00", comments = "Source Table: TASKS")
	BasicColumn[] selectList = BasicColumn.columnList(taskId, revId, moduleId, dat, title, description, authorId,
			parentId, typeId, priorityId, datPlan, datFact, releaseId, stuff);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.612+03:00", comments = "Source Table: TASKS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.612+03:00", comments = "Source Table: TASKS")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.613+03:00", comments = "Source Table: TASKS")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Tasks> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.613+03:00", comments = "Source Table: TASKS")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Tasks> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.613+03:00", comments = "Source Table: TASKS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "TASK_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "REV_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "MODULE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "DAT", javaType = Date.class, jdbcType = JdbcType.DATE),
			@Arg(column = "TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "AUTHOR_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "PARENT_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "TYPE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "PRIORITY_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "DAT_PLAN", javaType = Date.class, jdbcType = JdbcType.DATE),
			@Arg(column = "DAT_FACT", javaType = Date.class, jdbcType = JdbcType.DATE),
			@Arg(column = "RELEASE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "STUFF", javaType = String.class, jdbcType = JdbcType.CLOB) })
	Optional<Tasks> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.613+03:00", comments = "Source Table: TASKS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "TASK_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "REV_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "MODULE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "DAT", javaType = Date.class, jdbcType = JdbcType.DATE),
			@Arg(column = "TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "AUTHOR_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "PARENT_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "TYPE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "PRIORITY_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "DAT_PLAN", javaType = Date.class, jdbcType = JdbcType.DATE),
			@Arg(column = "DAT_FACT", javaType = Date.class, jdbcType = JdbcType.DATE),
			@Arg(column = "RELEASE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "STUFF", javaType = String.class, jdbcType = JdbcType.CLOB) })
	List<Tasks> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.613+03:00", comments = "Source Table: TASKS")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.613+03:00", comments = "Source Table: TASKS")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, tasks, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.613+03:00", comments = "Source Table: TASKS")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, tasks, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.613+03:00", comments = "Source Table: TASKS")
	default int deleteByPrimaryKey(Long taskId_) {
		return delete(c -> c.where(taskId, isEqualTo(taskId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.613+03:00", comments = "Source Table: TASKS")
	default int insert(Tasks record) {
		return MyBatis3Utils.insert(this::insert, record, tasks,
				c -> c.map(taskId).toProperty("taskId").map(revId).toProperty("revId").map(moduleId)
						.toProperty("moduleId").map(dat).toProperty("dat").map(title).toProperty("title")
						.map(description).toProperty("description").map(authorId).toProperty("authorId").map(parentId)
						.toProperty("parentId").map(typeId).toProperty("typeId").map(priorityId)
						.toProperty("priorityId").map(datPlan).toProperty("datPlan").map(datFact).toProperty("datFact")
						.map(releaseId).toProperty("releaseId").map(stuff).toProperty("stuff"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.613+03:00", comments = "Source Table: TASKS")
	default int insertMultiple(Collection<Tasks> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, tasks,
				c -> c.map(taskId).toProperty("taskId").map(revId).toProperty("revId").map(moduleId)
						.toProperty("moduleId").map(dat).toProperty("dat").map(title).toProperty("title")
						.map(description).toProperty("description").map(authorId).toProperty("authorId").map(parentId)
						.toProperty("parentId").map(typeId).toProperty("typeId").map(priorityId)
						.toProperty("priorityId").map(datPlan).toProperty("datPlan").map(datFact).toProperty("datFact")
						.map(releaseId).toProperty("releaseId").map(stuff).toProperty("stuff"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.614+03:00", comments = "Source Table: TASKS")
	default int insertSelective(Tasks record) {
		return MyBatis3Utils.insert(this::insert, record, tasks,
				c -> c.map(taskId).toPropertyWhenPresent("taskId", record::getTaskId).map(revId)
						.toPropertyWhenPresent("revId", record::getRevId).map(moduleId)
						.toPropertyWhenPresent("moduleId", record::getModuleId).map(dat)
						.toPropertyWhenPresent("dat", record::getDat).map(title)
						.toPropertyWhenPresent("title", record::getTitle).map(description)
						.toPropertyWhenPresent("description", record::getDescription).map(authorId)
						.toPropertyWhenPresent("authorId", record::getAuthorId).map(parentId)
						.toPropertyWhenPresent("parentId", record::getParentId).map(typeId)
						.toPropertyWhenPresent("typeId", record::getTypeId).map(priorityId)
						.toPropertyWhenPresent("priorityId", record::getPriorityId).map(datPlan)
						.toPropertyWhenPresent("datPlan", record::getDatPlan).map(datFact)
						.toPropertyWhenPresent("datFact", record::getDatFact).map(releaseId)
						.toPropertyWhenPresent("releaseId", record::getReleaseId).map(stuff)
						.toPropertyWhenPresent("stuff", record::getStuff));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.614+03:00", comments = "Source Table: TASKS")
	default Optional<Tasks> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, tasks, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.614+03:00", comments = "Source Table: TASKS")
	default List<Tasks> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, tasks, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.614+03:00", comments = "Source Table: TASKS")
	default List<Tasks> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tasks, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.614+03:00", comments = "Source Table: TASKS")
	default Optional<Tasks> selectByPrimaryKey(Long taskId_) {
		return selectOne(c -> c.where(taskId, isEqualTo(taskId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.614+03:00", comments = "Source Table: TASKS")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, tasks, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.614+03:00", comments = "Source Table: TASKS")
	static UpdateDSL<UpdateModel> updateAllColumns(Tasks record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(taskId).equalTo(record::getTaskId).set(revId).equalTo(record::getRevId).set(moduleId)
				.equalTo(record::getModuleId).set(dat).equalTo(record::getDat).set(title).equalTo(record::getTitle)
				.set(description).equalTo(record::getDescription).set(authorId).equalTo(record::getAuthorId)
				.set(parentId).equalTo(record::getParentId).set(typeId).equalTo(record::getTypeId).set(priorityId)
				.equalTo(record::getPriorityId).set(datPlan).equalTo(record::getDatPlan).set(datFact)
				.equalTo(record::getDatFact).set(releaseId).equalTo(record::getReleaseId).set(stuff)
				.equalTo(record::getStuff);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.615+03:00", comments = "Source Table: TASKS")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Tasks record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(taskId).equalToWhenPresent(record::getTaskId).set(revId).equalToWhenPresent(record::getRevId)
				.set(moduleId).equalToWhenPresent(record::getModuleId).set(dat).equalToWhenPresent(record::getDat)
				.set(title).equalToWhenPresent(record::getTitle).set(description)
				.equalToWhenPresent(record::getDescription).set(authorId).equalToWhenPresent(record::getAuthorId)
				.set(parentId).equalToWhenPresent(record::getParentId).set(typeId).equalToWhenPresent(record::getTypeId)
				.set(priorityId).equalToWhenPresent(record::getPriorityId).set(datPlan)
				.equalToWhenPresent(record::getDatPlan).set(datFact).equalToWhenPresent(record::getDatFact)
				.set(releaseId).equalToWhenPresent(record::getReleaseId).set(stuff)
				.equalToWhenPresent(record::getStuff);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.615+03:00", comments = "Source Table: TASKS")
	default int updateByPrimaryKey(Tasks record) {
		return update(c -> c.set(revId).equalTo(record::getRevId).set(moduleId).equalTo(record::getModuleId).set(dat)
				.equalTo(record::getDat).set(title).equalTo(record::getTitle).set(description)
				.equalTo(record::getDescription).set(authorId).equalTo(record::getAuthorId).set(parentId)
				.equalTo(record::getParentId).set(typeId).equalTo(record::getTypeId).set(priorityId)
				.equalTo(record::getPriorityId).set(datPlan).equalTo(record::getDatPlan).set(datFact)
				.equalTo(record::getDatFact).set(releaseId).equalTo(record::getReleaseId).set(stuff)
				.equalTo(record::getStuff).where(taskId, isEqualTo(record::getTaskId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.615+03:00", comments = "Source Table: TASKS")
	default int updateByPrimaryKeySelective(Tasks record) {
		return update(c -> c.set(revId).equalToWhenPresent(record::getRevId).set(moduleId)
				.equalToWhenPresent(record::getModuleId).set(dat).equalToWhenPresent(record::getDat).set(title)
				.equalToWhenPresent(record::getTitle).set(description).equalToWhenPresent(record::getDescription)
				.set(authorId).equalToWhenPresent(record::getAuthorId).set(parentId)
				.equalToWhenPresent(record::getParentId).set(typeId).equalToWhenPresent(record::getTypeId)
				.set(priorityId).equalToWhenPresent(record::getPriorityId).set(datPlan)
				.equalToWhenPresent(record::getDatPlan).set(datFact).equalToWhenPresent(record::getDatFact)
				.set(releaseId).equalToWhenPresent(record::getReleaseId).set(stuff).equalToWhenPresent(record::getStuff)
				.where(taskId, isEqualTo(record::getTaskId)));
	}
}