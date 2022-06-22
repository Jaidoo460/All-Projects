package com.techelevator.projects.dao;

import com.techelevator.projects.model.Department;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcDepartmentDao implements DepartmentDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartment(Long id) {
		String sql = "SELECT * FROM department WHERE department_id = ?;";
		try {
			Department dept = (Department) jdbcTemplate.queryForObject(sql, new departmentRowMapper(), id);
			return dept;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public Department getDepartment(int departmentId) {
		return null;
	}

	@Override
	public List<Department> getAllDepartments() {
		String sql = "SELECT * FROM department;";
		List<Department> depts = jdbcTemplate.query(sql, new departmentRowMapper());
		return depts;
	}

	@Override
	public void updateDepartment(Department updatedDepartment) {
		String deptName = updatedDepartment.getName();
		Long deptID = Long.valueOf(updatedDepartment.getId());
		String sql = "UPDATE department SET name = ? WHERE department_id = ?;";
		jdbcTemplate.update(sql, deptName, deptID);
	}
}

class departmentRowMapper implements RowMapper {
	@Override
	public Department mapRow(ResultSet resultSet, int i) throws SQLException {
		Department dept = new Department();
		dept.setName(resultSet.getString("name"));
		dept.setId((int) resultSet.getLong("department_id"));
		return dept;
	}
}