package q4s.tutorials.mybatis.dynsql.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static q4s.tutorials.mybatis.dynsql.mapper.RevisionsDynamicSqlSupport.*;

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
import q4s.tutorials.mybatis.dynsql.entity.Revisions;

@Mapper
public interface RevisionsMapper extends RootInterface {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.584+03:00", comments = "Source Table: REVISIONS")
	BasicColumn[] selectList = BasicColumn.columnList(revId, projectId, minorVer, code, stuff);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.582+03:00", comments = "Source Table: REVISIONS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.582+03:00", comments = "Source Table: REVISIONS")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.583+03:00", comments = "Source Table: REVISIONS")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Revisions> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.583+03:00", comments = "Source Table: REVISIONS")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Revisions> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.583+03:00", comments = "Source Table: REVISIONS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "REV_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "PROJECT_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "MINOR_VER", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
			@Arg(column = "CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "STUFF", javaType = String.class, jdbcType = JdbcType.CLOB) })
	Optional<Revisions> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.583+03:00", comments = "Source Table: REVISIONS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "REV_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "PROJECT_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "MINOR_VER", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
			@Arg(column = "CODE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "STUFF", javaType = String.class, jdbcType = JdbcType.CLOB) })
	List<Revisions> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.583+03:00", comments = "Source Table: REVISIONS")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.583+03:00", comments = "Source Table: REVISIONS")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, revisions, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.583+03:00", comments = "Source Table: REVISIONS")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, revisions, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.583+03:00", comments = "Source Table: REVISIONS")
	default int deleteByPrimaryKey(Long revId_) {
		return delete(c -> c.where(revId, isEqualTo(revId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.583+03:00", comments = "Source Table: REVISIONS")
	default int insert(Revisions record) {
		return MyBatis3Utils.insert(this::insert, record, revisions,
				c -> c.map(revId).toProperty("revId").map(projectId).toProperty("projectId").map(minorVer)
						.toProperty("minorVer").map(code).toProperty("code").map(stuff).toProperty("stuff"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.584+03:00", comments = "Source Table: REVISIONS")
	default int insertMultiple(Collection<Revisions> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, revisions,
				c -> c.map(revId).toProperty("revId").map(projectId).toProperty("projectId").map(minorVer)
						.toProperty("minorVer").map(code).toProperty("code").map(stuff).toProperty("stuff"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.584+03:00", comments = "Source Table: REVISIONS")
	default int insertSelective(Revisions record) {
		return MyBatis3Utils.insert(this::insert, record, revisions,
				c -> c.map(revId).toPropertyWhenPresent("revId", record::getRevId).map(projectId)
						.toPropertyWhenPresent("projectId", record::getProjectId).map(minorVer)
						.toPropertyWhenPresent("minorVer", record::getMinorVer).map(code)
						.toPropertyWhenPresent("code", record::getCode).map(stuff)
						.toPropertyWhenPresent("stuff", record::getStuff));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.584+03:00", comments = "Source Table: REVISIONS")
	default Optional<Revisions> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, revisions, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.584+03:00", comments = "Source Table: REVISIONS")
	default List<Revisions> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, revisions, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.584+03:00", comments = "Source Table: REVISIONS")
	default List<Revisions> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, revisions, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.584+03:00", comments = "Source Table: REVISIONS")
	default Optional<Revisions> selectByPrimaryKey(Long revId_) {
		return selectOne(c -> c.where(revId, isEqualTo(revId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.585+03:00", comments = "Source Table: REVISIONS")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, revisions, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.585+03:00", comments = "Source Table: REVISIONS")
	static UpdateDSL<UpdateModel> updateAllColumns(Revisions record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(revId).equalTo(record::getRevId).set(projectId).equalTo(record::getProjectId).set(minorVer)
				.equalTo(record::getMinorVer).set(code).equalTo(record::getCode).set(stuff).equalTo(record::getStuff);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.585+03:00", comments = "Source Table: REVISIONS")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Revisions record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(revId).equalToWhenPresent(record::getRevId).set(projectId)
				.equalToWhenPresent(record::getProjectId).set(minorVer).equalToWhenPresent(record::getMinorVer)
				.set(code).equalToWhenPresent(record::getCode).set(stuff).equalToWhenPresent(record::getStuff);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.585+03:00", comments = "Source Table: REVISIONS")
	default int updateByPrimaryKey(Revisions record) {
		return update(c -> c.set(projectId).equalTo(record::getProjectId).set(minorVer).equalTo(record::getMinorVer)
				.set(code).equalTo(record::getCode).set(stuff).equalTo(record::getStuff)
				.where(revId, isEqualTo(record::getRevId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.585+03:00", comments = "Source Table: REVISIONS")
	default int updateByPrimaryKeySelective(Revisions record) {
		return update(c -> c.set(projectId).equalToWhenPresent(record::getProjectId).set(minorVer)
				.equalToWhenPresent(record::getMinorVer).set(code).equalToWhenPresent(record::getCode).set(stuff)
				.equalToWhenPresent(record::getStuff).where(revId, isEqualTo(record::getRevId)));
	}
}