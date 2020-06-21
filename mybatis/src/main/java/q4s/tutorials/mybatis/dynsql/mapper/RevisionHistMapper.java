package q4s.tutorials.mybatis.dynsql.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static q4s.tutorials.mybatis.dynsql.mapper.RevisionHistDynamicSqlSupport.*;

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
import q4s.tutorials.mybatis.dynsql.entity.RevisionHist;

@Mapper
public interface RevisionHistMapper extends RootInterface {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.59+03:00", comments = "Source Table: REVISION_HIST")
	BasicColumn[] selectList = BasicColumn.columnList(revId, dat, datto, stateId, managerId, stuff);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.589+03:00", comments = "Source Table: REVISION_HIST")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.589+03:00", comments = "Source Table: REVISION_HIST")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.589+03:00", comments = "Source Table: REVISION_HIST")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<RevisionHist> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.589+03:00", comments = "Source Table: REVISION_HIST")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<RevisionHist> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.589+03:00", comments = "Source Table: REVISION_HIST")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "REV_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "DAT", javaType = Date.class, jdbcType = JdbcType.DATE, id = true),
			@Arg(column = "DATTO", javaType = Date.class, jdbcType = JdbcType.DATE, id = true),
			@Arg(column = "STATE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "MANAGER_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "STUFF", javaType = String.class, jdbcType = JdbcType.CLOB) })
	Optional<RevisionHist> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.589+03:00", comments = "Source Table: REVISION_HIST")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "REV_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "DAT", javaType = Date.class, jdbcType = JdbcType.DATE, id = true),
			@Arg(column = "DATTO", javaType = Date.class, jdbcType = JdbcType.DATE, id = true),
			@Arg(column = "STATE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "MANAGER_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "STUFF", javaType = String.class, jdbcType = JdbcType.CLOB) })
	List<RevisionHist> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.589+03:00", comments = "Source Table: REVISION_HIST")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.59+03:00", comments = "Source Table: REVISION_HIST")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, revisionHist, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.59+03:00", comments = "Source Table: REVISION_HIST")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, revisionHist, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.59+03:00", comments = "Source Table: REVISION_HIST")
	default int deleteByPrimaryKey(Long revId_, Date dat_, Date datto_) {
		return delete(c -> c.where(revId, isEqualTo(revId_)).and(dat, isEqualTo(dat_)).and(datto, isEqualTo(datto_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.59+03:00", comments = "Source Table: REVISION_HIST")
	default int insert(RevisionHist record) {
		return MyBatis3Utils.insert(this::insert, record, revisionHist,
				c -> c.map(revId).toProperty("revId").map(dat).toProperty("dat").map(datto).toProperty("datto")
						.map(stateId).toProperty("stateId").map(managerId).toProperty("managerId").map(stuff)
						.toProperty("stuff"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.59+03:00", comments = "Source Table: REVISION_HIST")
	default int insertMultiple(Collection<RevisionHist> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, revisionHist,
				c -> c.map(revId).toProperty("revId").map(dat).toProperty("dat").map(datto).toProperty("datto")
						.map(stateId).toProperty("stateId").map(managerId).toProperty("managerId").map(stuff)
						.toProperty("stuff"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.59+03:00", comments = "Source Table: REVISION_HIST")
	default int insertSelective(RevisionHist record) {
		return MyBatis3Utils.insert(this::insert, record, revisionHist,
				c -> c.map(revId).toPropertyWhenPresent("revId", record::getRevId).map(dat)
						.toPropertyWhenPresent("dat", record::getDat).map(datto)
						.toPropertyWhenPresent("datto", record::getDatto).map(stateId)
						.toPropertyWhenPresent("stateId", record::getStateId).map(managerId)
						.toPropertyWhenPresent("managerId", record::getManagerId).map(stuff)
						.toPropertyWhenPresent("stuff", record::getStuff));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.59+03:00", comments = "Source Table: REVISION_HIST")
	default Optional<RevisionHist> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, revisionHist, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.59+03:00", comments = "Source Table: REVISION_HIST")
	default List<RevisionHist> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, revisionHist, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.591+03:00", comments = "Source Table: REVISION_HIST")
	default List<RevisionHist> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, revisionHist, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.591+03:00", comments = "Source Table: REVISION_HIST")
	default Optional<RevisionHist> selectByPrimaryKey(Long revId_, Date dat_, Date datto_) {
		return selectOne(
				c -> c.where(revId, isEqualTo(revId_)).and(dat, isEqualTo(dat_)).and(datto, isEqualTo(datto_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.591+03:00", comments = "Source Table: REVISION_HIST")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, revisionHist, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.591+03:00", comments = "Source Table: REVISION_HIST")
	static UpdateDSL<UpdateModel> updateAllColumns(RevisionHist record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(revId).equalTo(record::getRevId).set(dat).equalTo(record::getDat).set(datto)
				.equalTo(record::getDatto).set(stateId).equalTo(record::getStateId).set(managerId)
				.equalTo(record::getManagerId).set(stuff).equalTo(record::getStuff);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.591+03:00", comments = "Source Table: REVISION_HIST")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(RevisionHist record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(revId).equalToWhenPresent(record::getRevId).set(dat).equalToWhenPresent(record::getDat)
				.set(datto).equalToWhenPresent(record::getDatto).set(stateId).equalToWhenPresent(record::getStateId)
				.set(managerId).equalToWhenPresent(record::getManagerId).set(stuff)
				.equalToWhenPresent(record::getStuff);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.591+03:00", comments = "Source Table: REVISION_HIST")
	default int updateByPrimaryKey(RevisionHist record) {
		return update(c -> c.set(stateId).equalTo(record::getStateId).set(managerId).equalTo(record::getManagerId)
				.set(stuff).equalTo(record::getStuff).where(revId, isEqualTo(record::getRevId))
				.and(dat, isEqualTo(record::getDat)).and(datto, isEqualTo(record::getDatto)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.592+03:00", comments = "Source Table: REVISION_HIST")
	default int updateByPrimaryKeySelective(RevisionHist record) {
		return update(c -> c.set(stateId).equalToWhenPresent(record::getStateId).set(managerId)
				.equalToWhenPresent(record::getManagerId).set(stuff).equalToWhenPresent(record::getStuff)
				.where(revId, isEqualTo(record::getRevId)).and(dat, isEqualTo(record::getDat))
				.and(datto, isEqualTo(record::getDatto)));
	}
}