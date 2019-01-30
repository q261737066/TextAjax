package com.text.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.text.bean.Text;

public class TextMapper implements RowMapper<Text>{

	@Override
	public Text mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Text text=new Text();
		text.setId(rs.getInt("id"));
		text.setName(rs.getString("name"));
		text.setSex(rs.getString("sex"));
		text.setAge(rs.getInt("age"));
		return text;
	}

}