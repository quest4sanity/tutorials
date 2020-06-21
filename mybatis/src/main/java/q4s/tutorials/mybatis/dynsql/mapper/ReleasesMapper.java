package q4s.tutorials.mybatis.dynsql.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static q4s.tutorials.mybatis.dynsql.mapper.ReleasesDynamicSqlSupport.*;

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
import q4s.tutorials.mybatis.dynsql.entity.Releases;

@Mapper
public interface ReleasesMapper extends RootInterface {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.579+03:00", comments = "Source Table: RELEASES")
	BasicColumn[] selectList = BasicColumn.columnList(releaseId, revId, releaseVer, releaseDate, stuff);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.577+03:00", comments = "Source Table: RELEASES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.577+03:00", comments = "Source Table: RELEASES")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.577+03:00", comments = "Source Table: RELEASES")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Releases> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.577+03:00", comments = "Source Table: RELEASES")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Releases> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.577+03:00", comments = "Source Table: RELEASES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "RELEASE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "REV_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "RELEASE_VER", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
			@Arg(column = "RELEASE_DATE", javaType = Date.class, jdbcType = JdbcType.DATE),
			@Arg(column = "STUFF", javaType = String.class, jdbcType = JdbcType.CLOB) })
	Optional<Releases> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.578+03:00", comments = "Source Table: RELEASES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "RELEASE_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "REV_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "RELEASE_VER", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
			@Arg(column = "RELEASE_DATE", javaType = Date.class, jdbcType = JdbcType.DATE),
			@Arg(column = "STUFF", javaType = String.class, jdbcType = JdbcType.CLOB) })
	List<Releases> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.578+03:00", comments = "Source Table: RELEASES")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.578+03:00", comments = "Source Table: RELEASES")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, releases, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.578+03:00", comments = "Source Table: RELEASES")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, releases, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.578+03:00", comments = "Source Table: RELEASES")
	default int deleteByPrimaryKey(Long releaseId_) {
		return delete(c -> c.where(releaseId, isEqualTo(releaseId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.578+03:00", comments = "Source Table: RELEASES")
	default int insert(Releases record) {
		return MyBatis3Utils.insert(this::insert, record, releases,
				c -> c.map(releaseId).toProperty("releaseId").map(revId).toProperty("revId").map(releaseVer)
						.toProperty("releaseVer").map(releaseDate).toProperty("releaseDate").map(stuff)
						.toProperty("stuff"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.578+03:00", comments = "Source Table: RELEASES")
	default int insertMultiple(Collection<Releases> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, releases,
				c -> c.map(releaseId).toProperty("releaseId").map(revId).toProperty("revId").map(releaseVer)
						.toProperty("releaseVer").map(releaseDate).toProperty("releaseDate").map(stuff)
						.toProperty("stuff"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.578+03:00", comments = "Source Table: RELEASES")
	default int insertSelective(Releases record) {
		return MyBatis3Utils.insert(this::insert, record, releases,
				c -> c.map(releaseId).toPropertyWhenPresent("releaseId", record::getReleaseId).map(revId)
						.toPropertyWhenPresent("revId", record::getRevId).map(releaseVer)
						.toPropertyWhenPresent("releaseVer", record::getReleaseVer).map(releaseDate)
						.toPropertyWhenPresent("releaseDate", record::getReleaseDate).map(stuff)
						.toPropertyWhenPresent("stuff", record::getStuff));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.579+03:00", comments = "Source Table: RELEASES")
	default Optional<Releases> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, releases, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.579+03:00", comments = "Source Table: RELEASES")
	default List<Releases> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, releases, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.579+03:00", comments = "Source Table: RELEASES")
	default List<Releases> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, releases, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.579+03:00", comments = "Source Table: RELEASES")
	default Optional<Releases> selectByPrimaryKey(Long releaseId_) {
		return selectOne(c -> c.where(releaseId, isEqualTo(releaseId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.579+03:00", comments = "Source Table: RELEASES")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, releases, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.579+03:00", comments = "Source Table: RELEASES")
	static UpdateDSL<UpdateModel> updateAllColumns(Releases record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(releaseId).equalTo(record::getReleaseId).set(revId).equalTo(record::getRevId).set(releaseVer)
				.equalTo(record::getReleaseVer).set(releaseDate).equalTo(record::getReleaseDate).set(stuff)
				.equalTo(record::getStuff);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.579+03:00", comments = "Source Table: RELEASES")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Releases record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(releaseId).equalToWhenPresent(record::getReleaseId).set(revId)
				.equalToWhenPresent(record::getRevId).set(releaseVer).equalToWhenPresent(record::getReleaseVer)
				.set(releaseDate).equalToWhenPresent(record::getReleaseDate).set(stuff)
				.equalToWhenPresent(record::getStuff);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.58+03:00", comments = "Source Table: RELEASES")
	default int updateByPrimaryKey(Releases record) {
		return update(c -> c.set(revId).equalTo(record::getRevId).set(releaseVer).equalTo(record::getReleaseVer)
				.set(releaseDate).equalTo(record::getReleaseDate).set(stuff).equalTo(record::getStuff)
				.where(releaseId, isEqualTo(record::getReleaseId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.58+03:00", comments = "Source Table: RELEASES")
	default int updateByPrimaryKeySelective(Releases record) {
		return update(c -> c.set(revId).equalToWhenPresent(record::getRevId).set(releaseVer)
				.equalToWhenPresent(record::getReleaseVer).set(releaseDate).equalToWhenPresent(record::getReleaseDate)
				.set(stuff).equalToWhenPresent(record::getStuff).where(releaseId, isEqualTo(record::getReleaseId)));
	}
}