package q4s.tutorials.mybatis.dynsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RevisionStatesDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.594+03:00", comments = "Source Table: REVISION_STATES")
	public static final RevisionStates revisionStates = new RevisionStates();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.594+03:00", comments = "Source field: REVISION_STATES.STATE_ID")
	public static final SqlColumn<Long> stateId = revisionStates.stateId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.594+03:00", comments = "Source field: REVISION_STATES.CODE")
	public static final SqlColumn<String> code = revisionStates.code;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.594+03:00", comments = "Source field: REVISION_STATES.TITLE")
	public static final SqlColumn<String> title = revisionStates.title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.594+03:00", comments = "Source field: REVISION_STATES.DESCRIPTION")
	public static final SqlColumn<String> description = revisionStates.description;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.594+03:00", comments = "Source Table: REVISION_STATES")
	public static final class RevisionStates extends SqlTable {
		public final SqlColumn<Long> stateId = column("STATE_ID", JDBCType.BIGINT);
		public final SqlColumn<String> code = column("CODE", JDBCType.VARCHAR);
		public final SqlColumn<String> title = column("TITLE", JDBCType.VARCHAR);
		public final SqlColumn<String> description = column("DESCRIPTION", JDBCType.VARCHAR);

		public RevisionStates() {
			super("REVISION_STATES");
		}
	}
}