package q4s.tutorials.mybatis.annot.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import q4s.tutorials.mybatis.RootInterface;
import q4s.tutorials.mybatis.annot.entity.TasksHist;
import q4s.tutorials.mybatis.annot.entity.TasksHistExample;
import q4s.tutorials.mybatis.annot.entity.TasksHistKey;

public interface TasksHistMapper extends RootInterface {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	long countByExample(TasksHistExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int deleteByExample(TasksHistExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int deleteByPrimaryKey(TasksHistKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int insert(TasksHist record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int insertSelective(TasksHist record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	List<TasksHist> selectByExampleWithBLOBs(TasksHistExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	List<TasksHist> selectByExample(TasksHistExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	TasksHist selectByPrimaryKey(TasksHistKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByExampleSelective(@Param("record") TasksHist record, @Param("example") TasksHistExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByExampleWithBLOBs(@Param("record") TasksHist record, @Param("example") TasksHistExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByExample(@Param("record") TasksHist record, @Param("example") TasksHistExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByPrimaryKeySelective(TasksHist record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByPrimaryKeyWithBLOBs(TasksHist record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByPrimaryKey(TasksHist record);
}