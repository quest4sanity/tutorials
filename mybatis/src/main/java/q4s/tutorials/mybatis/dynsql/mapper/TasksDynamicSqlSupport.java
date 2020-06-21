package q4s.tutorials.mybatis.dynsql.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TasksDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.61+03:00", comments = "Source Table: TASKS")
	public static final Tasks tasks = new Tasks();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.611+03:00", comments = "Source field: TASKS.TASK_ID")
	public static final SqlColumn<Long> taskId = tasks.taskId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.611+03:00", comments = "Source field: TASKS.REV_ID")
	public static final SqlColumn<Long> revId = tasks.revId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.611+03:00", comments = "Source field: TASKS.MODULE_ID")
	public static final SqlColumn<Long> moduleId = tasks.moduleId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.611+03:00", comments = "Source field: TASKS.DAT")
	public static final SqlColumn<Date> dat = tasks.dat;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.611+03:00", comments = "Source field: TASKS.TITLE")
	public static final SqlColumn<String> title = tasks.title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.611+03:00", comments = "Source field: TASKS.DESCRIPTION")
	public static final SqlColumn<String> description = tasks.description;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.611+03:00", comments = "Source field: TASKS.AUTHOR_ID")
	public static final SqlColumn<Long> authorId = tasks.authorId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.611+03:00", comments = "Source field: TASKS.PARENT_ID")
	public static final SqlColumn<Long> parentId = tasks.parentId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.611+03:00", comments = "Source field: TASKS.TYPE_ID")
	public static final SqlColumn<Long> typeId = tasks.typeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.612+03:00", comments = "Source field: TASKS.PRIORITY_ID")
	public static final SqlColumn<Long> priorityId = tasks.priorityId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.612+03:00", comments = "Source field: TASKS.DAT_PLAN")
	public static final SqlColumn<Date> datPlan = tasks.datPlan;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.612+03:00", comments = "Source field: TASKS.DAT_FACT")
	public static final SqlColumn<Date> datFact = tasks.datFact;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.612+03:00", comments = "Source field: TASKS.RELEASE_ID")
	public static final SqlColumn<Long> releaseId = tasks.releaseId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.612+03:00", comments = "Source field: TASKS.STUFF")
	public static final SqlColumn<String> stuff = tasks.stuff;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.61+03:00", comments = "Source Table: TASKS")
	public static final class Tasks extends SqlTable {
		public final SqlColumn<Long> taskId = column("TASK_ID", JDBCType.BIGINT);
		public final SqlColumn<Long> revId = column("REV_ID", JDBCType.BIGINT);
		public final SqlColumn<Long> moduleId = column("MODULE_ID", JDBCType.BIGINT);
		public final SqlColumn<Date> dat = column("DAT", JDBCType.DATE);
		public final SqlColumn<String> title = column("TITLE", JDBCType.VARCHAR);
		public final SqlColumn<String> description = column("DESCRIPTION", JDBCType.VARCHAR);
		public final SqlColumn<Long> authorId = column("AUTHOR_ID", JDBCType.BIGINT);
		public final SqlColumn<Long> parentId = column("PARENT_ID", JDBCType.BIGINT);
		public final SqlColumn<Long> typeId = column("TYPE_ID", JDBCType.BIGINT);
		public final SqlColumn<Long> priorityId = column("PRIORITY_ID", JDBCType.BIGINT);
		public final SqlColumn<Date> datPlan = column("DAT_PLAN", JDBCType.DATE);
		public final SqlColumn<Date> datFact = column("DAT_FACT", JDBCType.DATE);
		public final SqlColumn<Long> releaseId = column("RELEASE_ID", JDBCType.BIGINT);
		public final SqlColumn<String> stuff = column("STUFF", JDBCType.CLOB);

		public Tasks() {
			super("TASKS");
		}
	}
}