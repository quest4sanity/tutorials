package q4s.tutorials.mybatis.dynsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TagsDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.603+03:00", comments = "Source Table: TAGS")
	public static final Tags tags = new Tags();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.604+03:00", comments = "Source field: TAGS.TAG_ID")
	public static final SqlColumn<String> tagId = tags.tagId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.604+03:00", comments = "Source Table: TAGS")
	public static final class Tags extends SqlTable {
		public final SqlColumn<String> tagId = column("TAG_ID", JDBCType.VARCHAR);

		public Tags() {
			super("TAGS");
		}
	}
}