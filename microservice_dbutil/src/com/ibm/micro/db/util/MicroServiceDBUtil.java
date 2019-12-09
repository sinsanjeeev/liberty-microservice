package com.ibm.micro.db.util;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
public class MicroServiceDBUtil {
	public static final String MICRO_SERVICE_DATA_DATABASE_JNDI = "jdbc/microsvcdata";

	
//	public static Connection getDatabaseConnection() throws NamingException, SQLException {
//		Context context = new InitialContext();
//		DataSource dataSource = (DataSource) context.lookup(IOC_DATA_DATABASE_JNDI);
//
//		return dataSource.getConnection();
//	}

	public static Connection getDatabaseConnection(String jndiname) throws NamingException, SQLException {
		Context context = new InitialContext();
		DataSource dataSource = (DataSource) context.lookup(jndiname);
		Connection connection=dataSource.getConnection();
		//connection.setAutoCommit(true);
		return connection;
	}
	
//	public static Connection getCNCDatabaseConnection() throws NamingException, SQLException {
//		Context context = new InitialContext();
//		DataSource dataSource = (DataSource) context.lookup(CNC_DATA_DATABASE_JNDI);
//
//		return dataSource.getConnection();
//	}

	public static void closeDatabaseConnection(Connection connection) {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void closeStatement(Statement statement) {
		try {
			if (statement != null) {
				statement.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void closeResultset(ResultSet resultSet) {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
