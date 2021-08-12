package com.ltts.productionsproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ltts.productionsproject.config.MyConfigure;
import com.ltts.productionsproject.model.Movie;

public class MovieDao {
	
	public List<Movie> getAllMovie() throws Exception{
		List<Movie> li=new ArrayList<Movie>();
		Connection c=MyConfigure.getConnection();
		PreparedStatement ps=c.prepareStatement("select * from movie");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			li.add(new Movie(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getInt(9)));
		}
		return li;
	}
	
	public List<Movie> getAllMovie(String Language) throws Exception{
		List<Movie> li=new ArrayList<Movie>();
		Connection c=MyConfigure.getConnection();
		PreparedStatement ps=c.prepareStatement("select * from movie where Language='"+Language+"';");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			li.add(new Movie(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getInt(9)));
		}
		return li;
	}


}
