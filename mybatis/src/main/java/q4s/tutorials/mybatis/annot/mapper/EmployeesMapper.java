package q4s.tutorials.mybatis.annot.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import q4s.tutorials.mybatis.RootInterface;
import q4s.tutorials.mybatis.annot.entity.Employees;
import q4s.tutorials.mybatis.annot.entity.EmployeesExample;

public interface EmployeesMapper extends RootInterface {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table EMPLOYEES
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	long countByExample(EmployeesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table EMPLOYEES
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int deleteByExample(EmployeesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table EMPLOYEES
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int deleteByPrimaryKey(Long empId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table EMPLOYEES
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int insert(Employees record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table EMPLOYEES
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int insertSelective(Employees record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table EMPLOYEES
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	List<Employees> selectByExampleWithBLOBs(EmployeesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table EMPLOYEES
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	List<Employees> selectByExample(EmployeesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table EMPLOYEES
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	Employees selectByPrimaryKey(Long empId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table EMPLOYEES
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByExampleSelective(@Param("record") Employees record, @Param("example") EmployeesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table EMPLOYEES
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByExampleWithBLOBs(@Param("record") Employees record, @Param("example") EmployeesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table EMPLOYEES
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByExample(@Param("record") Employees record, @Param("example") EmployeesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table EMPLOYEES
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByPrimaryKeySelective(Employees record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table EMPLOYEES
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByPrimaryKeyWithBLOBs(Employees record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table EMPLOYEES
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	int updateByPrimaryKey(Employees record);
}