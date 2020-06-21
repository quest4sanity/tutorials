package q4s.tutorials.mybatis.annot.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import q4s.tutorials.mybatis.RootInterface;
import q4s.tutorials.mybatis.annot.entity.Projects;
import q4s.tutorials.mybatis.annot.entity.ProjectsExample;

public interface ProjectsMapper extends RootInterface {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROJECTS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	long countByExample(ProjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROJECTS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int deleteByExample(ProjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROJECTS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int deleteByPrimaryKey(Long projectId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROJECTS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int insert(Projects record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROJECTS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int insertSelective(Projects record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROJECTS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	List<Projects> selectByExampleWithBLOBs(ProjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROJECTS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	List<Projects> selectByExample(ProjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROJECTS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	Projects selectByPrimaryKey(Long projectId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROJECTS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByExampleSelective(@Param("record") Projects record, @Param("example") ProjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROJECTS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByExampleWithBLOBs(@Param("record") Projects record, @Param("example") ProjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROJECTS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByExample(@Param("record") Projects record, @Param("example") ProjectsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROJECTS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByPrimaryKeySelective(Projects record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROJECTS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByPrimaryKeyWithBLOBs(Projects record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROJECTS
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByPrimaryKey(Projects record);
}