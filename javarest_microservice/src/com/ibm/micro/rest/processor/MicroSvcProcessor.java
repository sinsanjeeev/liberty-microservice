package com.ibm.micro.rest.processor;
import com.ibm.micro.rest.processor.*;

import java.util.Iterator;
import java.util.List;

import com.ibm.micro.rest.DAO.MicroSvcDAO;
import com.ibm.micro.rest.entity.*;

import com.ibm.micro.rest.util.*;

public class MicroSvcProcessor {
	public String getAccount(){
		String success ="true";
		String jsonInString=null;
		
		try {
			MicroSvcDAO penangRestDAO=new MicroSvcDAO();
			
			
			List  acclst =penangRestDAO.getAccount();
			
			jsonInString=JsonUtil.convertJavaToJson(acclst);
			
			
			
			System.out.println(jsonInString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			success="Json Parser Failed \n"+e.toString();
			
		}
		
		
		return jsonInString;
	}
}
