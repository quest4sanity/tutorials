package q4s.tutorials.mybatis.dynsql.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReleasesDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.576+03:00", comments = "Source Table: RELEASES")
	public static final Releases releases = new Releases();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.576+03:00", comments = "Source field: RELEASES.RELEASE_ID")
	public static final SqlColumn<Long> releaseId = releases.releaseId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.577+03:00", comments = "Source field: RELEASES.REV_ID")
	public static final SqlColumn<Long> revId = releases.revId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.577+03:00", comments = "Source field: RELEASES.RELEASE_VER")
	public static final SqlColumn<Integer> releaseVer = releases.releaseVer;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.577+03:00", comments = "Source field: RELEASES.RELEASE_DATE")
	public static final SqlColumn<Date> releaseDate = releases.releaseDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.577+03:00", comments = "Source field: RELEASES.STUFF")
	public static final SqlColumn<String> stuff = releases.stuff;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.576+03:00", comments = "Source Table: RELEASES")
	public static final class Releases extends SqlTable {
		public final SqlColumn<Long> releaseId = column("RELEASE_ID", JDBCType.BIGINT);
		public final SqlColumn<Long> revId = column("REV_ID", JDBCType.BIGINT);
		public final SqlColumn<Integer> releaseVer = column("RELEASE_VER", JDBCType.INTEGER);
		public final SqlColumn<Date> releaseDate = column("RELEASE_DATE", JDBCType.DATE);
		public final SqlColumn<String> stuff = column("STUFF", JDBCType.CLOB);

		public Releases() {
			super("RELEASES");
		}
	}
}