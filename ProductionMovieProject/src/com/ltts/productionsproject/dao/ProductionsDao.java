package com.ltts.productionsproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.productionsproject.config.MyConfigure;
import com.ltts.productionsproject.model.Productions;

public class ProductionsDao {
	
	public boolean insertProductions(Productions p) throws Exception {
		Connection c=MyConfigure.getConnection();
		Statement st=c.createStatement();
		try {
			st.execute("insert into productions values("+p.getProductionid()+", '"+p.getProductionname()+"','"+p.getAddress()+"',"+p.getStartyear()+",'"+p.getOwnername()+"');");		
			return false;	
		}
		catch(Exception e) {
			return true;
		}
		finally {
			c.close();
		}
		
		
	}
	
	public List<Productions> getAllProductions() throws Exception{
		List<Productions> li=new ArrayList<Productions>();
		Connection c=MyConfigure.getConnection();
		PreparedStatement ps=c.prepareStatement("select * from productions");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			li.add(new Productions(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5)));
		}
		return li;
	}
	
	public boolean updateProductions(String name, String address, int Startyear, String owner, int numproductions) throws Exception {
		Connection c=MyConfigure.getConnection();
		Statement st=c.createStatement();
		try {
			st.execute("update productions set Productionname='"+name+"',Address='"+address+"',Startyear="+Startyear+",Ownername='"+owner+"' where Productionid="+numproductions);		
			return false;	
		}
		catch(Exception e) {
			return true;
		}
		finally {
			c.close();
		}
	}
	
	public boolean deleteProductions(int numproductions) throws Exception {
		Connection c=MyConfigure.getConnection();
		Statement st=c.createStatement();
		try {
			st.execute("delete from productions where Productionid="+numproductions);		
			return false;	
		}
		catch(Exception e) {
			return true;
		}
		finally {
			c.close();
		}
	}


}
