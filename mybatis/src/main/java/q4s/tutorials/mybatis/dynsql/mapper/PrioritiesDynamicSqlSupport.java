package q4s.tutorials.mybatis.dynsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PrioritiesDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.556+03:00", comments = "Source Table: PRIORITIES")
	public static final Priorities priorities = new Priorities();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.557+03:00", comments = "Source field: PRIORITIES.PRIORITY_ID")
	public static final SqlColumn<Long> priorityId = priorities.priorityId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.557+03:00", comments = "Source field: PRIORITIES.CODE")
	public static final SqlColumn<String> code = priorities.code;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.557+03:00", comments = "Source field: PRIORITIES.TITLE")
	public static final SqlColumn<String> title = priorities.title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.557+03:00", comments = "Source field: PRIORITIES.DESCRIPTION")
	public static final SqlColumn<String> description = priorities.description;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.556+03:00", comments = "Source Table: PRIORITIES")
	public static final class Priorities extends SqlTable {
		public final SqlColumn<Long> priorityId = column("PRIORITY_ID", JDBCType.BIGINT);
		public final SqlColumn<String> code = column("CODE", JDBCType.VARCHAR);
		public final SqlColumn<String> title = column("TITLE", JDBCType.VARCHAR);
		public final SqlColumn<String> description = column("DESCRIPTION", JDBCType.VARCHAR);

		public Priorities() {
			super("PRIORITIES");
		}
	}
}