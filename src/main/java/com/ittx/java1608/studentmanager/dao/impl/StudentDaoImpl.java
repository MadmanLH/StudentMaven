package com.ittx.java1608.studentmanager.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ittx.java1608.studentmanager.dao.StudentDao;
import com.ittx.java1608.studentmanager.model.Student;

public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {

	public List<Student> getAllUser() {
		return getJdbcTemplate().query("select * from t_student",new RowMapper<Student>(){
			public Student mapRow(ResultSet rs, int arg1) throws SQLException {
				Student student = new Student();
				student.setId(rs.getString("id"));
				student.setName(rs.getString("name"));
				student.setAge(rs.getInt("age"));
				student.setSex(rs.getString("sex"));
				student.setAddress(rs.getString("address"));
				student.setGrade(rs.getString("grade"));
				student.setHeaderUri(rs.getString("Head_Portraits"));
				return student;
			}
		});
	}

}
