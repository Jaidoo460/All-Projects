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

	private final String getAllSql = "select * from department";
	private final String getOneSql = "select * from department where department_id = ?";
	private final String updateOneSql = "update department set department_id=?, name=? where department_id=?";
	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartment(Long id) {
		try {
			return jdbcTemplate.queryForObject(getOneSql, new DepartmentRowMapper(), new Object[]{id});
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
		return jdbcTemplate.query(getAllSql, new DepartmentRowMapper(), new Object[]{});
	}

	@Override
	public void updateDepartment(Department updatedDepartment) {
		jdbcTemplate.update(updateOneSql, new Object[]{updatedDepartment.getId(), updatedDepartment.getName(), updatedDepartment.getId()});
	}

	class DepartmentRowMapper implements RowMapper<Department> {
		@Override
		public Department mapRow(ResultSet resultSet, int i) {
			Department d = new Department();
			try {
				d.setName(resultSet.getString("name"));
				d.setId(resultSet.getInt("department_id"));
				return d;
			} catch (SQLException e) {
				return null;
			}
		}
	}

}
