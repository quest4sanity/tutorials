package q4s.tutorials.mybatis.dynsql.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RevisionHistDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.588+03:00", comments = "Source Table: REVISION_HIST")
	public static final RevisionHist revisionHist = new RevisionHist();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.588+03:00", comments = "Source field: REVISION_HIST.REV_ID")
	public static final SqlColumn<Long> revId = revisionHist.revId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.588+03:00", comments = "Source field: REVISION_HIST.DAT")
	public static final SqlColumn<Date> dat = revisionHist.dat;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.588+03:00", comments = "Source field: REVISION_HIST.DATTO")
	public static final SqlColumn<Date> datto = revisionHist.datto;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.588+03:00", comments = "Source field: REVISION_HIST.STATE_ID")
	public static final SqlColumn<Long> stateId = revisionHist.stateId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.588+03:00", comments = "Source field: REVISION_HIST.MANAGER_ID")
	public static final SqlColumn<Long> managerId = revisionHist.managerId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.589+03:00", comments = "Source field: REVISION_HIST.STUFF")
	public static final SqlColumn<String> stuff = revisionHist.stuff;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.588+03:00", comments = "Source Table: REVISION_HIST")
	public static final class RevisionHist extends SqlTable {
		public final SqlColumn<Long> revId = column("REV_ID", JDBCType.BIGINT);
		public final SqlColumn<Date> dat = column("DAT", JDBCType.DATE);
		public final SqlColumn<Date> datto = column("DATTO", JDBCType.DATE);
		public final SqlColumn<Long> stateId = column("STATE_ID", JDBCType.BIGINT);
		public final SqlColumn<Long> managerId = column("MANAGER_ID", JDBCType.BIGINT);
		public final SqlColumn<String> stuff = column("STUFF", JDBCType.CLOB);

		public RevisionHist() {
			super("REVISION_HIST");
		}
	}
}