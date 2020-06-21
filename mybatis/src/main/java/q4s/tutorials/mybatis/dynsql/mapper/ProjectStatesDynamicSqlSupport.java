package q4s.tutorials.mybatis.dynsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ProjectStatesDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.57+03:00", comments = "Source Table: PROJECT_STATES")
	public static final ProjectStates projectStates = new ProjectStates();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.57+03:00", comments = "Source field: PROJECT_STATES.STATE_ID")
	public static final SqlColumn<Long> stateId = projectStates.stateId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.57+03:00", comments = "Source field: PROJECT_STATES.CODE")
	public static final SqlColumn<String> code = projectStates.code;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.571+03:00", comments = "Source field: PROJECT_STATES.TITLE")
	public static final SqlColumn<String> title = projectStates.title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.571+03:00", comments = "Source field: PROJECT_STATES.DESCRIPTION")
	public static final SqlColumn<String> description = projectStates.description;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.57+03:00", comments = "Source Table: PROJECT_STATES")
	public static final class ProjectStates extends SqlTable {
		public final SqlColumn<Long> stateId = column("STATE_ID", JDBCType.BIGINT);
		public final SqlColumn<String> code = column("CODE", JDBCType.VARCHAR);
		public final SqlColumn<String> title = column("TITLE", JDBCType.VARCHAR);
		public final SqlColumn<String> description = column("DESCRIPTION", JDBCType.VARCHAR);

		public ProjectStates() {
			super("PROJECT_STATES");
		}
	}
}