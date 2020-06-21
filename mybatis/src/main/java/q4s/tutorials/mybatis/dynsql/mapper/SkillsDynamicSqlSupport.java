package q4s.tutorials.mybatis.dynsql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SkillsDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.599+03:00", comments = "Source Table: SKILLS")
	public static final Skills skills = new Skills();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.599+03:00", comments = "Source field: SKILLS.SKILL_ID")
	public static final SqlColumn<Long> skillId = skills.skillId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.599+03:00", comments = "Source field: SKILLS.CODE")
	public static final SqlColumn<String> code = skills.code;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.599+03:00", comments = "Source field: SKILLS.TITLE")
	public static final SqlColumn<String> title = skills.title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.599+03:00", comments = "Source field: SKILLS.DESCRIPTION")
	public static final SqlColumn<String> description = skills.description;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.599+03:00", comments = "Source Table: SKILLS")
	public static final class Skills extends SqlTable {
		public final SqlColumn<Long> skillId = column("SKILL_ID", JDBCType.BIGINT);
		public final SqlColumn<String> code = column("CODE", JDBCType.VARCHAR);
		public final SqlColumn<String> title = column("TITLE", JDBCType.VARCHAR);
		public final SqlColumn<String> description = column("DESCRIPTION", JDBCType.VARCHAR);

		public Skills() {
			super("SKILLS");
		}
	}
}