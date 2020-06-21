package q4s.tutorials.mybatis.annot.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import q4s.tutorials.mybatis.RootInterface;
import q4s.tutorials.mybatis.annot.entity.Tasks;
import q4s.tutorials.mybatis.annot.entity.TasksExample;

public interface TasksMapper extends RootInterface {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	long countByExample(TasksExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int deleteByExample(TasksExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int deleteByPrimaryKey(Long taskId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int insert(Tasks record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int insertSelective(Tasks record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	List<Tasks> selectByExampleWithBLOBs(TasksExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	List<Tasks> selectByExample(TasksExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	Tasks selectByPrimaryKey(Long taskId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByExampleSelective(@Param("record") Tasks record, @Param("example") TasksExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByExampleWithBLOBs(@Param("record") Tasks record, @Param("example") TasksExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByExample(@Param("record") Tasks record, @Param("example") TasksExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByPrimaryKeySelective(Tasks record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByPrimaryKeyWithBLOBs(Tasks record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByPrimaryKey(Tasks record);
}