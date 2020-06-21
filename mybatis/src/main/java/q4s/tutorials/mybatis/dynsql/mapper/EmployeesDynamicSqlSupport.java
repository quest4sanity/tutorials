package q4s.tutorials.mybatis.dynsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EmployeesDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.505+03:00", comments = "Source Table: EMPLOYEES")
	public static final Employees employees = new Employees();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.506+03:00", comments = "Source field: EMPLOYEES.EMP_ID")
	public static final SqlColumn<Long> empId = employees.empId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.506+03:00", comments = "Source field: EMPLOYEES.NICKNAME")
	public static final SqlColumn<String> nickname = employees.nickname;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.506+03:00", comments = "Source field: EMPLOYEES.LNAME")
	public static final SqlColumn<String> lname = employees.lname;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.506+03:00", comments = "Source field: EMPLOYEES.FNAME")
	public static final SqlColumn<String> fname = employees.fname;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.506+03:00", comments = "Source field: EMPLOYEES.MNAME")
	public static final SqlColumn<String> mname = employees.mname;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.507+03:00", comments = "Source field: EMPLOYEES.SKILL_ID")
	public static final SqlColumn<Long> skillId = employees.skillId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.507+03:00", comments = "Source field: EMPLOYEES.EMAIL")
	public static final SqlColumn<String> email = employees.email;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.507+03:00", comments = "Source field: EMPLOYEES.STUFF")
	public static final SqlColumn<String> stuff = employees.stuff;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.506+03:00", comments = "Source Table: EMPLOYEES")
	public static final class Employees extends SqlTable {
		public final SqlColumn<Long> empId = column("EMP_ID", JDBCType.BIGINT);
		public final SqlColumn<String> nickname = column("NICKNAME", JDBCType.VARCHAR);
		public final SqlColumn<String> lname = column("LNAME", JDBCType.VARCHAR);
		public final SqlColumn<String> fname = column("FNAME", JDBCType.VARCHAR);
		public final SqlColumn<String> mname = column("MNAME", JDBCType.VARCHAR);
		public final SqlColumn<Long> skillId = column("SKILL_ID", JDBCType.BIGINT);
		public final SqlColumn<String> email = column("EMAIL", JDBCType.VARCHAR);
		public final SqlColumn<String> stuff = column("STUFF", JDBCType.CLOB);

		public Employees() {
			super("EMPLOYEES");
		}
	}
}