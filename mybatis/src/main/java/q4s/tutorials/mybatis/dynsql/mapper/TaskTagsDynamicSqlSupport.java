package q4s.tutorials.mybatis.dynsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TaskTagsDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.629+03:00", comments = "Source Table: TASK_TAGS")
	public static final TaskTags taskTags = new TaskTags();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.629+03:00", comments = "Source field: TASK_TAGS.TASK_ID")
	public static final SqlColumn<Long> taskId = taskTags.taskId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.629+03:00", comments = "Source field: TASK_TAGS.TAG_ID")
	public static final SqlColumn<String> tagId = taskTags.tagId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.629+03:00", comments = "Source Table: TASK_TAGS")
	public static final class TaskTags extends SqlTable {
		public final SqlColumn<Long> taskId = column("TASK_ID", JDBCType.BIGINT);
		public final SqlColumn<String> tagId = column("TAG_ID", JDBCType.VARCHAR);

		public TaskTags() {
			super("TASK_TAGS");
		}
	}
}