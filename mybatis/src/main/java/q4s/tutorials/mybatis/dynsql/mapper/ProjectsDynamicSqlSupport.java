package q4s.tutorials.mybatis.dynsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ProjectsDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.564+03:00", comments = "Source Table: PROJECTS")
	public static final Projects projects = new Projects();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.564+03:00", comments = "Source field: PROJECTS.PROJECT_ID")
	public static final SqlColumn<Long> projectId = projects.projectId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.565+03:00", comments = "Source field: PROJECTS.CODE")
	public static final SqlColumn<String> code = projects.code;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.565+03:00", comments = "Source field: PROJECTS.MAJOR_VER")
	public static final SqlColumn<Integer> majorVer = projects.majorVer;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.565+03:00", comments = "Source field: PROJECTS.TITLE")
	public static final SqlColumn<String> title = projects.title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.565+03:00", comments = "Source field: PROJECTS.DESCRIPTION")
	public static final SqlColumn<String> description = projects.description;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.565+03:00", comments = "Source field: PROJECTS.STATE_ID")
	public static final SqlColumn<Long> stateId = projects.stateId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.565+03:00", comments = "Source field: PROJECTS.STUFF")
	public static final SqlColumn<String> stuff = projects.stuff;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.564+03:00", comments = "Source Table: PROJECTS")
	public static final class Projects extends SqlTable {
		public final SqlColumn<Long> projectId = column("PROJECT_ID", JDBCType.BIGINT);
		public final SqlColumn<String> code = column("CODE", JDBCType.VARCHAR);
		public final SqlColumn<Integer> majorVer = column("MAJOR_VER", JDBCType.INTEGER);
		public final SqlColumn<String> title = column("TITLE", JDBCType.VARCHAR);
		public final SqlColumn<String> description = column("DESCRIPTION", JDBCType.VARCHAR);
		public final SqlColumn<Long> stateId = column("STATE_ID", JDBCType.BIGINT);
		public final SqlColumn<String> stuff = column("STUFF", JDBCType.CLOB);

		public Projects() {
			super("PROJECTS");
		}
	}
}