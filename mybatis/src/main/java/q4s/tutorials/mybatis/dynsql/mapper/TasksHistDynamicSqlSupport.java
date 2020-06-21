package q4s.tutorials.mybatis.dynsql.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TasksHistDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.617+03:00", comments = "Source Table: TASKS_HIST")
	public static final TasksHist tasksHist = new TasksHist();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.617+03:00", comments = "Source field: TASKS_HIST.TASK_ID")
	public static final SqlColumn<Long> taskId = tasksHist.taskId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.618+03:00", comments = "Source field: TASKS_HIST.DAT")
	public static final SqlColumn<Date> dat = tasksHist.dat;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.618+03:00", comments = "Source field: TASKS_HIST.DATTO")
	public static final SqlColumn<Date> datto = tasksHist.datto;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.618+03:00", comments = "Source field: TASKS_HIST.EMP_ID")
	public static final SqlColumn<Long> empId = tasksHist.empId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.618+03:00", comments = "Source field: TASKS_HIST.WORK_TIME")
	public static final SqlColumn<Date> workTime = tasksHist.workTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.618+03:00", comments = "Source field: TASKS_HIST.DESCRIPTION")
	public static final SqlColumn<String> description = tasksHist.description;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.618+03:00", comments = "Source field: TASKS_HIST.STUFF")
	public static final SqlColumn<String> stuff = tasksHist.stuff;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.617+03:00", comments = "Source Table: TASKS_HIST")
	public static final class TasksHist extends SqlTable {
		public final SqlColumn<Long> taskId = column("TASK_ID", JDBCType.BIGINT);
		public final SqlColumn<Date> dat = column("DAT", JDBCType.DATE);
		public final SqlColumn<Date> datto = column("DATTO", JDBCType.DATE);
		public final SqlColumn<Long> empId = column("EMP_ID", JDBCType.BIGINT);
		public final SqlColumn<Date> workTime = column("WORK_TIME", JDBCType.TIME);
		public final SqlColumn<String> description = column("DESCRIPTION", JDBCType.VARCHAR);
		public final SqlColumn<String> stuff = column("STUFF", JDBCType.CLOB);

		public TasksHist() {
			super("TASKS_HIST");
		}
	}
}