package q4s.tutorials.mybatis.dynsql.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static q4s.tutorials.mybatis.dynsql.mapper.TagsDynamicSqlSupport.*;

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
import q4s.tutorials.mybatis.dynsql.entity.Tags;

@Mapper
public interface TagsMapper extends RootInterface {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.606+03:00", comments = "Source Table: TAGS")
	BasicColumn[] selectList = BasicColumn.columnList(tagId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.604+03:00", comments = "Source Table: TAGS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.604+03:00", comments = "Source Table: TAGS")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.604+03:00", comments = "Source Table: TAGS")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Tags> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.604+03:00", comments = "Source Table: TAGS")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Tags> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.604+03:00", comments = "Source Table: TAGS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "TAG_ID", javaType = String.class, jdbcType = JdbcType.VARCHAR, id = true) })
	Optional<Tags> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.604+03:00", comments = "Source Table: TAGS")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "TAG_ID", javaType = String.class, jdbcType = JdbcType.VARCHAR, id = true) })
	List<Tags> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.604+03:00", comments = "Source Table: TAGS")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.604+03:00", comments = "Source Table: TAGS")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, tags, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.605+03:00", comments = "Source Table: TAGS")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, tags, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.605+03:00", comments = "Source Table: TAGS")
	default int deleteByPrimaryKey(String tagId_) {
		return delete(c -> c.where(tagId, isEqualTo(tagId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.605+03:00", comments = "Source Table: TAGS")
	default int insert(Tags record) {
		return MyBatis3Utils.insert(this::insert, record, tags, c -> c.map(tagId).toProperty("tagId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.605+03:00", comments = "Source Table: TAGS")
	default int insertMultiple(Collection<Tags> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, tags, c -> c.map(tagId).toProperty("tagId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.605+03:00", comments = "Source Table: TAGS")
	default int insertSelective(Tags record) {
		return MyBatis3Utils.insert(this::insert, record, tags,
				c -> c.map(tagId).toPropertyWhenPresent("tagId", record::getTagId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.606+03:00", comments = "Source Table: TAGS")
	default Optional<Tags> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, tags, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.606+03:00", comments = "Source Table: TAGS")
	default List<Tags> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, tags, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.606+03:00", comments = "Source Table: TAGS")
	default List<Tags> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tags, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.606+03:00", comments = "Source Table: TAGS")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, tags, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.606+03:00", comments = "Source Table: TAGS")
	static UpdateDSL<UpdateModel> updateAllColumns(Tags record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(tagId).equalTo(record::getTagId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.606+03:00", comments = "Source Table: TAGS")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Tags record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(tagId).equalToWhenPresent(record::getTagId);
	}
}