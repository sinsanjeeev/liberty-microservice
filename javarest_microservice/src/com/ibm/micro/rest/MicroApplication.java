package com.ibm.micro.rest;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

import com.ibm.micro.rest.resources.MicroResources;
public class MicroApplication extends Application {
	 public static final String COPYRIGHT = "\n\nLicensed Materials - Property of IBM\n\n5725-D69\n\n(C) Copyright IBM Corp. 2011, 2016  All Rights Reserved\n\nUS Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.\n\n";
	  
	  public Set<Class<?>> getClasses()
	  {
	    Set<Class<?>> classes = new HashSet();
	    classes.add(MicroResources.class);
	    return classes;
	  }
}
