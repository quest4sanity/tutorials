package q4s.tutorials.mybatis.dynsql.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static q4s.tutorials.mybatis.dynsql.mapper.RevisionStatesDynamicSqlSupport.*;

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
import q4s.tutorials.mybatis.dynsql.entity.RevisionStates;

@Mapper
public interface RevisionStatesMapper extends RootInterface {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.596+03:00", comments = "Source Table: REVISION_STATES")
	BasicColumn[] selectList = BasicColumn.columnList(stateId, code, title, description);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.594+03:00", comments = "Source Table: REVISION_STATES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.594+03:00", comments = "Source Table: REVISION_STATES")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.594+03:00", comments = "Source Table: REVISION_STATES")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<RevisionStates> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.594+03:00", comments = "Source Table: REVISION_STATES")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<RevisionStates> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.595+03:00", comments = "Source Table: REVISION_STATES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "STATE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR) })
	Optional<RevisionStates> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.595+03:00", comments = "Source Table: REVISION_STATES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "STATE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "DESCRIPTION", javaType = String.class, jdbcType = JdbcType.VARCHAR) })
	List<RevisionStates> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.595+03:00", comments = "Source Table: REVISION_STATES")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.595+03:00", comments = "Source Table: REVISION_STATES")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, revisionStates, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.595+03:00", comments = "Source Table: REVISION_STATES")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, revisionStates, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.595+03:00", comments = "Source Table: REVISION_STATES")
	default int deleteByPrimaryKey(Long stateId_) {
		return delete(c -> c.where(stateId, isEqualTo(stateId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.595+03:00", comments = "Source Table: REVISION_STATES")
	default int insert(RevisionStates record) {
		return MyBatis3Utils.insert(this::insert, record, revisionStates,
				c -> c.map(stateId).toProperty("stateId").map(code).toProperty("code").map(title).toProperty("title")
						.map(description).toProperty("description"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.595+03:00", comments = "Source Table: REVISION_STATES")
	default int insertMultiple(Collection<RevisionStates> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, revisionStates,
				c -> c.map(stateId).toProperty("stateId").map(code).toProperty("code").map(title).toProperty("title")
						.map(description).toProperty("description"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.595+03:00", comments = "Source Table: REVISION_STATES")
	default int insertSelective(RevisionStates record) {
		return MyBatis3Utils.insert(this::insert, record, revisionStates,
				c -> c.map(stateId).toPropertyWhenPresent("stateId", record::getStateId).map(code)
						.toPropertyWhenPresent("code", record::getCode).map(title)
						.toPropertyWhenPresent("title", record::getTitle).map(description)
						.toPropertyWhenPresent("description", record::getDescription));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.596+03:00", comments = "Source Table: REVISION_STATES")
	default Optional<RevisionStates> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, revisionStates, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.596+03:00", comments = "Source Table: REVISION_STATES")
	default List<RevisionStates> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, revisionStates, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.596+03:00", comments = "Source Table: REVISION_STATES")
	default List<RevisionStates> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, revisionStates, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.596+03:00", comments = "Source Table: REVISION_STATES")
	default Optional<RevisionStates> selectByPrimaryKey(Long stateId_) {
		return selectOne(c -> c.where(stateId, isEqualTo(stateId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.596+03:00", comments = "Source Table: REVISION_STATES")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, revisionStates, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.596+03:00", comments = "Source Table: REVISION_STATES")
	static UpdateDSL<UpdateModel> updateAllColumns(RevisionStates record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(stateId).equalTo(record::getStateId).set(code).equalTo(record::getCode).set(title)
				.equalTo(record::getTitle).set(description).equalTo(record::getDescription);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.596+03:00", comments = "Source Table: REVISION_STATES")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(RevisionStates record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(stateId).equalToWhenPresent(record::getStateId).set(code).equalToWhenPresent(record::getCode)
				.set(title).equalToWhenPresent(record::getTitle).set(description)
				.equalToWhenPresent(record::getDescription);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.596+03:00", comments = "Source Table: REVISION_STATES")
	default int updateByPrimaryKey(RevisionStates record) {
		return update(c -> c.set(code).equalTo(record::getCode).set(title).equalTo(record::getTitle).set(description)
				.equalTo(record::getDescription).where(stateId, isEqualTo(record::getStateId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.597+03:00", comments = "Source Table: REVISION_STATES")
	default int updateByPrimaryKeySelective(RevisionStates record) {
		return update(c -> c.set(code).equalToWhenPresent(record::getCode).set(title)
				.equalToWhenPresent(record::getTitle).set(description).equalToWhenPresent(record::getDescription)
				.where(stateId, isEqualTo(record::getStateId)));
	}
}