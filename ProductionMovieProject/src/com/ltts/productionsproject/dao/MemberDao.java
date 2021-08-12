package com.ltts.productionsproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.productionsproject.config.MyConfigure;
import com.ltts.productionsproject.model.Member;
import com.ltts.productionsproject.model.Productions;

public class MemberDao {
	
	public boolean insertMember(Member m) throws Exception {
		
		Connection c=MyConfigure.getConnection();
		Statement st=c.createStatement();
		try {
			st.execute("insert into member values('"+m.getName()+"', '"+m.getEmail()+"','"+m.getMobile()+"');");		
			return false;	
		}
		catch(Exception e) {
			return true;
		}
		finally {
			c.close();
		}
		
	}
	
	public List<Member> getAllMembers() throws Exception{
		List<Member> li=new ArrayList<Member>();
		Connection c=MyConfigure.getConnection();
		PreparedStatement ps=c.prepareStatement("select * from member");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			li.add(new Member(rs.getString(1),rs.getString(2),rs.getString(3)));
		}
		return li;
	}
	
	public boolean checkMemberByEmail(String email,String pass) throws Exception {
		boolean b=false;
		List<Member> li=getAllMembers();
		for(Member m:li) {
			if(email.equals(m.getEmail()) && pass.equals(m.getMobile())) {
				b=true;
			}
		}
		
		return b;
	}

}
