package com.ibm.micro.rest.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ibm.micro.db.util.*;
import com.ibm.micro.rest.entity.Account;
public class MicroSvcDAO {
	public  List<Account> getAccount(){
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String targetTablName=null;
		List<Account> lst=new ArrayList<Account>();
		try{
			con=MicroServiceDBUtil.getDatabaseConnection(MicroServiceDBUtil.MICRO_SERVICE_DATA_DATABASE_JNDI);
			
			String sql="select * from ACCOUNT";
			ps=con.prepareStatement(sql);
			
			
			rs=ps.executeQuery();
			
			while(rs.next()){
				Account acc=new Account();
				String uid=rs.getString("user_id");
				String uname=rs.getString("username");
				String email=rs.getString("email");
				acc.setUid(uid);
				acc.setUname(uname);
				acc.setEmail(email);
				lst.add(acc);
				System.out.println(uid+" "+uname);
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(con!=null) con.close();
	    		if(ps!=null) ps.close();
	    		if(rs!=null) rs.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		
		}
		return lst;
	}
	
	public static void main(String[] args) {
		MicroSvcDAO dao=new MicroSvcDAO();
				dao.getAccount();
	}
}
