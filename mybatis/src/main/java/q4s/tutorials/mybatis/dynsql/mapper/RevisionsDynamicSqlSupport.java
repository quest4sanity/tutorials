package q4s.tutorials.mybatis.dynsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RevisionsDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.582+03:00", comments = "Source Table: REVISIONS")
	public static final Revisions revisions = new Revisions();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.582+03:00", comments = "Source field: REVISIONS.REV_ID")
	public static final SqlColumn<Long> revId = revisions.revId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.582+03:00", comments = "Source field: REVISIONS.PROJECT_ID")
	public static final SqlColumn<Long> projectId = revisions.projectId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.582+03:00", comments = "Source field: REVISIONS.MINOR_VER")
	public static final SqlColumn<Integer> minorVer = revisions.minorVer;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.582+03:00", comments = "Source field: REVISIONS.CODE")
	public static final SqlColumn<String> code = revisions.code;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.582+03:00", comments = "Source field: REVISIONS.STUFF")
	public static final SqlColumn<String> stuff = revisions.stuff;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.582+03:00", comments = "Source Table: REVISIONS")
	public static final class Revisions extends SqlTable {
		public final SqlColumn<Long> revId = column("REV_ID", JDBCType.BIGINT);
		public final SqlColumn<Long> projectId = column("PROJECT_ID", JDBCType.BIGINT);
		public final SqlColumn<Integer> minorVer = column("MINOR_VER", JDBCType.INTEGER);
		public final SqlColumn<String> code = column("CODE", JDBCType.VARCHAR);
		public final SqlColumn<String> stuff = column("STUFF", JDBCType.CLOB);

		public Revisions() {
			super("REVISIONS");
		}
	}
}