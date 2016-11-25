package org.myself.demo.springboot.dao.impl.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.myself.demo.springboot.dao.StudentDao;
import org.myself.demo.springboot.entry.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentDaoImpl implements StudentDao {

	private RowMapper<Student> mapper = new StudentRowMapper();
	@Autowired
    private JdbcTemplate jdbc;
	
	@Override
	public int save(Student t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student findById(Integer id) {
		String sql = "select * from stu where id=?";
		
		return jdbc.queryForObject(sql, new Object[]{id}, mapper);
	}

	@Override
	public List<Student> findAll() {
		String sql = "select * from stu";
		return jdbc.query(sql, mapper);
	}

	@Override
	public int udpate(Student t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Student t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	class StudentRowMapper implements RowMapper<Student> {

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student obj = new Student();
			obj.setId(rs.getInt("id"));
			obj.setName(rs.getString("name"));
			return obj;
		}

	
		
	}
}