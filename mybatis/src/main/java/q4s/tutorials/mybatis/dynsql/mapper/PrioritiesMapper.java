package q4s.tutorials.mybatis.dynsql.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static q4s.tutorials.mybatis.dynsql.mapper.PrioritiesDynamicSqlSupport.*;

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
import q4s.tutorials.mybatis.dynsql.entity.Priorities;

@Mapper
public interface PrioritiesMapper extends RootInterface {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.559+03:00", comments = "Source Table: PRIORITIES")
	BasicColumn[] selectList = BasicColumn.columnList(priorityId, code, title, description);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.557+03:00", comments = "Source Table: PRIORITIES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.557+03:00", comments = "Source Table: PRIORITIES")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.557+03:00", comments = "Source Table: PRIORITIES")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Priorities> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.557+03:00", comments = "Source Table: PRIORITIES")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Priorities> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.557+03:00", comments = "Source Table: PRIORITIES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "PRIORITY_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR) })
	Optional<Priorities> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.558+03:00", comments = "Source Table: PRIORITIES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "PRIORITY_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR) })
	List<Priorities> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.558+03:00", comments = "Source Table: PRIORITIES")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.558+03:00", comments = "Source Table: PRIORITIES")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, priorities, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.558+03:00", comments = "Source Table: PRIORITIES")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, priorities, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.558+03:00", comments = "Source Table: PRIORITIES")
	default int deleteByPrimaryKey(Long priorityId_) {
		return delete(c -> c.where(priorityId, isEqualTo(priorityId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.558+03:00", comments = "Source Table: PRIORITIES")
	default int insert(Priorities record) {
		return MyBatis3Utils.insert(this::insert, record, priorities,
				c -> c.map(priorityId).toProperty("priorityId").map(code).toProperty("code").map(title)
						.toProperty("title").map(description).toProperty("description"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.558+03:00", comments = "Source Table: PRIORITIES")
	default int insertMultiple(Collection<Priorities> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, priorities,
				c -> c.map(priorityId).toProperty("priorityId").map(code).toProperty("code").map(title)
						.toProperty("title").map(description).toProperty("description"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.558+03:00", comments = "Source Table: PRIORITIES")
	default int insertSelective(Priorities record) {
		return MyBatis3Utils.insert(this::insert, record, priorities,
				c -> c.map(priorityId).toPropertyWhenPresent("priorityId", record::getPriorityId).map(code)
						.toPropertyWhenPresent("code", record::getCode).map(title)
						.toPropertyWhenPresent("title", record::getTitle).map(description)
						.toPropertyWhenPresent("description", record::getDescription));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.559+03:00", comments = "Source Table: PRIORITIES")
	default Optional<Priorities> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, priorities, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.559+03:00", comments = "Source Table: PRIORITIES")
	default List<Priorities> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, priorities, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.559+03:00", comments = "Source Table: PRIORITIES")
	default List<Priorities> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, priorities, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.559+03:00", comments = "Source Table: PRIORITIES")
	default Optional<Priorities> selectByPrimaryKey(Long priorityId_) {
		return selectOne(c -> c.where(priorityId, isEqualTo(priorityId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.559+03:00", comments = "Source Table: PRIORITIES")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, priorities, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.56+03:00", comments = "Source Table: PRIORITIES")
	static UpdateDSL<UpdateModel> updateAllColumns(Priorities record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(priorityId).equalTo(record::getPriorityId).set(code).equalTo(record::getCode).set(title)
				.equalTo(record::getTitle).set(description).equalTo(record::getDescription);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.56+03:00", comments = "Source Table: PRIORITIES")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Priorities record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(priorityId).equalToWhenPresent(record::getPriorityId).set(code)
				.equalToWhenPresent(record::getCode).set(title).equalToWhenPresent(record::getTitle).set(description)
				.equalToWhenPresent(record::getDescription);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.561+03:00", comments = "Source Table: PRIORITIES")
	default int updateByPrimaryKey(Priorities record) {
		return update(c -> c.set(code).equalTo(record::getCode).set(title).equalTo(record::getTitle).set(description)
				.equalTo(record::getDescription).where(priorityId, isEqualTo(record::getPriorityId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.561+03:00", comments = "Source Table: PRIORITIES")
	default int updateByPrimaryKeySelective(Priorities record) {
		return update(c -> c.set(code).equalToWhenPresent(record::getCode).set(title)
				.equalToWhenPresent(record::getTitle).set(description).equalToWhenPresent(record::getDescription)
				.where(priorityId, isEqualTo(record::getPriorityId)));
	}
}