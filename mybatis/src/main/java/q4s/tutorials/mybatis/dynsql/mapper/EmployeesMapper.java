package q4s.tutorials.mybatis.dynsql.mapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static q4s.tutorials.mybatis.dynsql.mapper.EmployeesDynamicSqlSupport.*;

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
import q4s.tutorials.mybatis.dynsql.entity.Employees;

@Mapper
public interface EmployeesMapper extends RootInterface {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.533+03:00", comments = "Source Table: EMPLOYEES")
	BasicColumn[] selectList = BasicColumn.columnList(empId, nickname, lname, fname, mname, skillId, email, stuff);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.509+03:00", comments = "Source Table: EMPLOYEES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.513+03:00", comments = "Source Table: EMPLOYEES")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.514+03:00", comments = "Source Table: EMPLOYEES")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Employees> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.515+03:00", comments = "Source Table: EMPLOYEES")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Employees> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.517+03:00", comments = "Source Table: EMPLOYEES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "EMP_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "NICKNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "LNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "FNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "MNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "SKILL_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "EMAIL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "STUFF", javaType = String.class, jdbcType = JdbcType.CLOB) })
	Optional<Employees> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.52+03:00", comments = "Source Table: EMPLOYEES")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ConstructorArgs({ @Arg(column = "EMP_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "NICKNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "LNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "FNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "MNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "SKILL_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
			@Arg(column = "EMAIL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "STUFF", javaType = String.class, jdbcType = JdbcType.CLOB) })
	List<Employees> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.521+03:00", comments = "Source Table: EMPLOYEES")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.522+03:00", comments = "Source Table: EMPLOYEES")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, employees, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.524+03:00", comments = "Source Table: EMPLOYEES")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, employees, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.525+03:00", comments = "Source Table: EMPLOYEES")
	default int deleteByPrimaryKey(Long empId_) {
		return delete(c -> c.where(empId, isEqualTo(empId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.527+03:00", comments = "Source Table: EMPLOYEES")
	default int insert(Employees record) {
		return MyBatis3Utils.insert(this::insert, record, employees,
				c -> c.map(empId).toProperty("empId").map(nickname).toProperty("nickname").map(lname)
						.toProperty("lname").map(fname).toProperty("fname").map(mname).toProperty("mname").map(skillId)
						.toProperty("skillId").map(email).toProperty("email").map(stuff).toProperty("stuff"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.528+03:00", comments = "Source Table: EMPLOYEES")
	default int insertMultiple(Collection<Employees> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, employees,
				c -> c.map(empId).toProperty("empId").map(nickname).toProperty("nickname").map(lname)
						.toProperty("lname").map(fname).toProperty("fname").map(mname).toProperty("mname").map(skillId)
						.toProperty("skillId").map(email).toProperty("email").map(stuff).toProperty("stuff"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.53+03:00", comments = "Source Table: EMPLOYEES")
	default int insertSelective(Employees record) {
		return MyBatis3Utils.insert(this::insert, record, employees,
				c -> c.map(empId).toPropertyWhenPresent("empId", record::getEmpId).map(nickname)
						.toPropertyWhenPresent("nickname", record::getNickname).map(lname)
						.toPropertyWhenPresent("lname", record::getLname).map(fname)
						.toPropertyWhenPresent("fname", record::getFname).map(mname)
						.toPropertyWhenPresent("mname", record::getMname).map(skillId)
						.toPropertyWhenPresent("skillId", record::getSkillId).map(email)
						.toPropertyWhenPresent("email", record::getEmail).map(stuff)
						.toPropertyWhenPresent("stuff", record::getStuff));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.535+03:00", comments = "Source Table: EMPLOYEES")
	default Optional<Employees> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, employees, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.537+03:00", comments = "Source Table: EMPLOYEES")
	default List<Employees> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, employees, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.538+03:00", comments = "Source Table: EMPLOYEES")
	default List<Employees> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, employees, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.54+03:00", comments = "Source Table: EMPLOYEES")
	default Optional<Employees> selectByPrimaryKey(Long empId_) {
		return selectOne(c -> c.where(empId, isEqualTo(empId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.541+03:00", comments = "Source Table: EMPLOYEES")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, employees, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.542+03:00", comments = "Source Table: EMPLOYEES")
	static UpdateDSL<UpdateModel> updateAllColumns(Employees record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(empId).equalTo(record::getEmpId).set(nickname).equalTo(record::getNickname).set(lname)
				.equalTo(record::getLname).set(fname).equalTo(record::getFname).set(mname).equalTo(record::getMname)
				.set(skillId).equalTo(record::getSkillId).set(email).equalTo(record::getEmail).set(stuff)
				.equalTo(record::getStuff);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.544+03:00", comments = "Source Table: EMPLOYEES")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Employees record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(empId).equalToWhenPresent(record::getEmpId).set(nickname).equalToWhenPresent(record::getNickname)
				.set(lname).equalToWhenPresent(record::getLname).set(fname).equalToWhenPresent(record::getFname)
				.set(mname).equalToWhenPresent(record::getMname).set(skillId).equalToWhenPresent(record::getSkillId)
				.set(email).equalToWhenPresent(record::getEmail).set(stuff).equalToWhenPresent(record::getStuff);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.545+03:00", comments = "Source Table: EMPLOYEES")
	default int updateByPrimaryKey(Employees record) {
		return update(c -> c.set(nickname).equalTo(record::getNickname).set(lname).equalTo(record::getLname).set(fname)
				.equalTo(record::getFname).set(mname).equalTo(record::getMname).set(skillId).equalTo(record::getSkillId)
				.set(email).equalTo(record::getEmail).set(stuff).equalTo(record::getStuff)
				.where(empId, isEqualTo(record::getEmpId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.546+03:00", comments = "Source Table: EMPLOYEES")
	default int updateByPrimaryKeySelective(Employees record) {
		return update(c -> c.set(nickname).equalToWhenPresent(record::getNickname).set(lname)
				.equalToWhenPresent(record::getLname).set(fname).equalToWhenPresent(record::getFname).set(mname)
				.equalToWhenPresent(record::getMname).set(skillId).equalToWhenPresent(record::getSkillId).set(email)
				.equalToWhenPresent(record::getEmail).set(stuff).equalToWhenPresent(record::getStuff)
				.where(empId, isEqualTo(record::getEmpId)));
	}
}