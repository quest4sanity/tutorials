package q4s.tutorials.mybatis.annot.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import q4s.tutorials.mybatis.RootInterface;
import q4s.tutorials.mybatis.annot.entity.TaskTagsExample;
import q4s.tutorials.mybatis.annot.entity.TaskTagsKey;

public interface TaskTagsMapper extends RootInterface {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASK_TAGS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	long countByExample(TaskTagsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASK_TAGS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int deleteByExample(TaskTagsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASK_TAGS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int deleteByPrimaryKey(TaskTagsKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASK_TAGS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int insert(TaskTagsKey record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASK_TAGS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int insertSelective(TaskTagsKey record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASK_TAGS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	List<TaskTagsKey> selectByExample(TaskTagsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASK_TAGS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByExampleSelective(@Param("record") TaskTagsKey record, @Param("example") TaskTagsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASK_TAGS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByExample(@Param("record") TaskTagsKey record, @Param("example") TaskTagsExample example);
}