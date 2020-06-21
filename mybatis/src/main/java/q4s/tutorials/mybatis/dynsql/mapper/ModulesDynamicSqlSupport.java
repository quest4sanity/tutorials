package q4s.tutorials.mybatis.dynsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ModulesDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.55+03:00", comments = "Source Table: MODULES")
	public static final Modules modules = new Modules();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.55+03:00", comments = "Source field: MODULES.MODULE_ID")
	public static final SqlColumn<Long> moduleId = modules.moduleId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.55+03:00", comments = "Source field: MODULES.PROJECT_ID")
	public static final SqlColumn<Long> projectId = modules.projectId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.55+03:00", comments = "Source field: MODULES.CODE")
	public static final SqlColumn<String> code = modules.code;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.55+03:00", comments = "Source field: MODULES.TITLE")
	public static final SqlColumn<String> title = modules.title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.551+03:00", comments = "Source field: MODULES.DESCRIPTION")
	public static final SqlColumn<String> description = modules.description;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.551+03:00", comments = "Source field: MODULES.STUFF")
	public static final SqlColumn<String> stuff = modules.stuff;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.55+03:00", comments = "Source Table: MODULES")
	public static final class Modules extends SqlTable {
		public final SqlColumn<Long> moduleId = column("MODULE_ID", JDBCType.BIGINT);
		public final SqlColumn<Long> projectId = column("PROJECT_ID", JDBCType.BIGINT);
		public final SqlColumn<String> code = column("CODE", JDBCType.VARCHAR);
		public final SqlColumn<String> title = column("TITLE", JDBCType.VARCHAR);
		public final SqlColumn<String> description = column("DESCRIPTION", JDBCType.VARCHAR);
		public final SqlColumn<String> stuff = column("STUFF", JDBCType.CLOB);

		public Modules() {
			super("MODULES");
		}
	}
}