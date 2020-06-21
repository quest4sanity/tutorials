package q4s.tutorials.mybatis.dynsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TaskTypesDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.632+03:00", comments = "Source Table: TASK_TYPES")
	public static final TaskTypes taskTypes = new TaskTypes();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.632+03:00", comments = "Source field: TASK_TYPES.TYPE_ID")
	public static final SqlColumn<Long> typeId = taskTypes.typeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.632+03:00", comments = "Source field: TASK_TYPES.CODE")
	public static final SqlColumn<String> code = taskTypes.code;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.632+03:00", comments = "Source field: TASK_TYPES.TITLE")
	public static final SqlColumn<String> title = taskTypes.title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.633+03:00", comments = "Source field: TASK_TYPES.DESCRIPTION")
	public static final SqlColumn<String> description = taskTypes.description;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.632+03:00", comments = "Source Table: TASK_TYPES")
	public static final class TaskTypes extends SqlTable {
		public final SqlColumn<Long> typeId = column("TYPE_ID", JDBCType.BIGINT);
		public final SqlColumn<String> code = column("CODE", JDBCType.VARCHAR);
		public final SqlColumn<String> title = column("TITLE", JDBCType.VARCHAR);
		public final SqlColumn<String> description = column("DESCRIPTION", JDBCType.VARCHAR);

		public TaskTypes() {
			super("TASK_TYPES");
		}
	}
}