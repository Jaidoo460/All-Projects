package com.techelevator.projects.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.techelevator.projects.model.Employee;

public class JdbcEmployeeDao implements EmployeeDao {

	private final String addEmToProjSql = "insert into project_employee (project_id, employee_id) values (?,?)";
	private final String getAllSql = "Select * From Employee";
	private final String getEmByNameSql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee " +
											"WHERE first_name ILIKE ? AND last_name ILIKE ?";
	private final String getEmByProjectId = "Select * From Employee\n" +
											"join project_employee pe on employee.employee_id = pe.employee_id\n" +
											"where project_id = ?";
	private final String getEmsWithoutProjSql = "select * from project_employee pe\n" +
											"right join employee on employee.employee_id = pe.employee_id\n " +
											"where project_id is null";
	private final String removeEmpFromProjSql = "DELETE\n" +
											"FROM public.project_employee\n" +
											"WHERE project_id = ?\n" +
											"  AND employee_id = ?;";

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {

		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {

		return jdbcTemplate.query(getAllSql, new EmployeeRowMapper()) ;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		Object[] parameters = new Object[]{"%" + firstNameSearch + "%", "%" + lastNameSearch + "%"};
		return jdbcTemplate.query(getEmByNameSql, new EmployeeRowMapper(), parameters );
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) {
//		Employee employee = null;
//		String sql = "SELECT employee_id, employee_name"
		return jdbcTemplate.query(getEmByProjectId, new EmployeeRowMapper(), new Object[]{projectId});
	}

	@Override
	public void addEmployeeToProject(int projectId, int employeeId) {
		jdbcTemplate.update(addEmToProjSql, new Object[]{projectId, employeeId});
	}

	@Override
	public void removeEmployeeFromProject(int projectId, int employeeId) {
		jdbcTemplate.update(removeEmpFromProjSql, new Object[]{projectId, employeeId});
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		return jdbcTemplate.query(getEmsWithoutProjSql, new EmployeeRowMapper(), new Object[]{});
	}

	private class EmployeeRowMapper implements RowMapper {
		@Override
		public Employee mapRow(ResultSet resultSet, int i) {
			try {
				Employee e = new Employee();
				e.setId(resultSet.getInt("employee_id"));
				Date bd = resultSet.getDate("birth_date");
				e.setBirthDate(LocalDate.parse(bd.toString()));
				e.setDepartmentId(resultSet.getInt("department_id"));
				Date hd = resultSet.getDate("hire_date");
				e.setHireDate(LocalDate.parse(hd.toString()));
				e.setFirstName(resultSet.getString("first_name"));
				e.setLastName(resultSet.getString("last_name"));
				return e;
			} catch (SQLException e) {
				return null;
			}
		}
	}


}
