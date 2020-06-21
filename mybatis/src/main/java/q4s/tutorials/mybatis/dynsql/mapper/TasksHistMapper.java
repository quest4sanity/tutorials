package q4s.tutorials.mybatis.dynsql.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static q4s.tutorials.mybatis.dynsql.mapper.TasksHistDynamicSqlSupport.*;

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
import q4s.tutorials.mybatis.dynsql.entity.TasksHist;

@Mapper
public interface TasksHistMapper extends RootInterface {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.62+03:00", comments = "Source Table: TASKS_HIST")
	BasicColumn[] selectList = BasicColumn.columnList(taskId, dat, datto, empId, workTime, description, stuff);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.618+03:00", comments = "Source Table: TASKS_HIST")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.618+03:00", comments = "Source Table: TASKS_HIST")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.618+03:00", comments = "Source Table: TASKS_HIST")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<TasksHist> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.618+03:00", comments = "Source Table: TASKS_HIST")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<TasksHist> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.618+03:00", comments = "Source Table: TASKS_HIST")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "TASK_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "DAT", javaType = Date.class, jdbcType = JdbcType.DATE, id = true),
			@Arg(column = "DATTO", javaType = Date.class, jdbcType = JdbcType.DATE, id = true),
			@Arg(column = "EMP_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "WORK_TIME", javaType = Date.class, jdbcType = JdbcType.TIME),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "STUFF", javaType = String.class, jdbcType = JdbcType.CLOB) })
	Optional<TasksHist> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.619+03:00", comments = "Source Table: TASKS_HIST")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "TASK_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "DAT", javaType = Date.class, jdbcType = JdbcType.DATE, id = true),
			@Arg(column = "DATTO", javaType = Date.class, jdbcType = JdbcType.DATE, id = true),
			@Arg(column = "EMP_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "WORK_TIME", javaType = Date.class, jdbcType = JdbcType.TIME),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "STUFF", javaType = String.class, jdbcType = JdbcType.CLOB) })
	List<TasksHist> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.619+03:00", comments = "Source Table: TASKS_HIST")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.62+03:00", comments = "Source Table: TASKS_HIST")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, tasksHist, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.62+03:00", comments = "Source Table: TASKS_HIST")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, tasksHist, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.62+03:00", comments = "Source Table: TASKS_HIST")
	default int deleteByPrimaryKey(Long taskId_, Date dat_, Date datto_) {
		return delete(c -> c.where(taskId, isEqualTo(taskId_)).and(dat, isEqualTo(dat_)).and(datto, isEqualTo(datto_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.62+03:00", comments = "Source Table: TASKS_HIST")
	default int insert(TasksHist record) {
		return MyBatis3Utils.insert(this::insert, record, tasksHist,
				c -> c.map(taskId).toProperty("taskId").map(dat).toProperty("dat").map(datto).toProperty("datto")
						.map(empId).toProperty("empId").map(workTime).toProperty("workTime").map(description)
						.toProperty("description").map(stuff).toProperty("stuff"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.62+03:00", comments = "Source Table: TASKS_HIST")
	default int insertMultiple(Collection<TasksHist> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, tasksHist,
				c -> c.map(taskId).toProperty("taskId").map(dat).toProperty("dat").map(datto).toProperty("datto")
						.map(empId).toProperty("empId").map(workTime).toProperty("workTime").map(description)
						.toProperty("description").map(stuff).toProperty("stuff"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.62+03:00", comments = "Source Table: TASKS_HIST")
	default int insertSelective(TasksHist record) {
		return MyBatis3Utils.insert(this::insert, record, tasksHist,
				c -> c.map(taskId).toPropertyWhenPresent("taskId", record::getTaskId).map(dat)
						.toPropertyWhenPresent("dat", record::getDat).map(datto)
						.toPropertyWhenPresent("datto", record::getDatto).map(empId)
						.toPropertyWhenPresent("empId", record::getEmpId).map(workTime)
						.toPropertyWhenPresent("workTime", record::getWorkTime).map(description)
						.toPropertyWhenPresent("description", record::getDescription).map(stuff)
						.toPropertyWhenPresent("stuff", record::getStuff));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.62+03:00", comments = "Source Table: TASKS_HIST")
	default Optional<TasksHist> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, tasksHist, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.621+03:00", comments = "Source Table: TASKS_HIST")
	default List<TasksHist> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, tasksHist, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.621+03:00", comments = "Source Table: TASKS_HIST")
	default List<TasksHist> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tasksHist, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.621+03:00", comments = "Source Table: TASKS_HIST")
	default Optional<TasksHist> selectByPrimaryKey(Long taskId_, Date dat_, Date datto_) {
		return selectOne(
				c -> c.where(taskId, isEqualTo(taskId_)).and(dat, isEqualTo(dat_)).and(datto, isEqualTo(datto_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.622+03:00", comments = "Source Table: TASKS_HIST")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, tasksHist, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.627+03:00", comments = "Source Table: TASKS_HIST")
	static UpdateDSL<UpdateModel> updateAllColumns(TasksHist record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(taskId).equalTo(record::getTaskId).set(dat).equalTo(record::getDat).set(datto)
				.equalTo(record::getDatto).set(empId).equalTo(record::getEmpId).set(workTime)
				.equalTo(record::getWorkTime).set(description).equalTo(record::getDescription).set(stuff)
				.equalTo(record::getStuff);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.627+03:00", comments = "Source Table: TASKS_HIST")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(TasksHist record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(taskId).equalToWhenPresent(record::getTaskId).set(dat).equalToWhenPresent(record::getDat)
				.set(datto).equalToWhenPresent(record::getDatto).set(empId).equalToWhenPresent(record::getEmpId)
				.set(workTime).equalToWhenPresent(record::getWorkTime).set(description)
				.equalToWhenPresent(record::getDescription).set(stuff).equalToWhenPresent(record::getStuff);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.627+03:00", comments = "Source Table: TASKS_HIST")
	default int updateByPrimaryKey(TasksHist record) {
		return update(c -> c.set(empId).equalTo(record::getEmpId).set(workTime).equalTo(record::getWorkTime)
				.set(description).equalTo(record::getDescription).set(stuff).equalTo(record::getStuff)
				.where(taskId, isEqualTo(record::getTaskId)).and(dat, isEqualTo(record::getDat))
				.and(datto, isEqualTo(record::getDatto)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.627+03:00", comments = "Source Table: TASKS_HIST")
	default int updateByPrimaryKeySelective(TasksHist record) {
		return update(c -> c.set(empId).equalToWhenPresent(record::getEmpId).set(workTime)
				.equalToWhenPresent(record::getWorkTime).set(description).equalToWhenPresent(record::getDescription)
				.set(stuff).equalToWhenPresent(record::getStuff).where(taskId, isEqualTo(record::getTaskId))
				.and(dat, isEqualTo(record::getDat)).and(datto, isEqualTo(record::getDatto)));
	}
}