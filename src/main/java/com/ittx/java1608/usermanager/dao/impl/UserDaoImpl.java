package com.ittx.java1608.usermanager.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ittx.java1608.usermanager.dao.UserDao;
import com.ittx.java1608.usermanager.model.User;

public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

	public List<User> getAllUser() {
		return getJdbcTemplate().query("select * from user",new RowMapper<User>(){
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setAge(rs.getInt("age"));
				user.setHeaderUri(rs.getString("headuri"));
				return user;
			}
		});
	}

}
