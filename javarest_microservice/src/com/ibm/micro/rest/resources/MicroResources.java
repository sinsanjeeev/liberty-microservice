package com.ibm.micro.rest.resources;
import java.util.ArrayList;
import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ibm.micro.rest.DAO.MicroSvcDAO;
import com.ibm.micro.rest.processor.MicroSvcProcessor;
import com.ibm.micro.rest.util.*;
@Path(value="/resource")
public class MicroResources {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
    @Path(value="accounts")
    public String postMessage(String inputJson)
    {
	   MicroSvcProcessor dao=new MicroSvcProcessor();
	   String accStr=dao.getAccount();
    	String success="false";
        
   
        return accStr;
    }
}
