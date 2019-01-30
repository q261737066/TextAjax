package com.text.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.text.bean.Text;
import com.text.mapper.TextMapper;

public class TextDao {
	private JdbcTemplate jt;

	/**
	 * @param jt
	 *            ƒZƒbƒg‚·‚é jt
	 */
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
 public List<Text> queryAll(){
	 String sql="select * from text_table";

	return jt.query(sql, new TextMapper());

 }
}
