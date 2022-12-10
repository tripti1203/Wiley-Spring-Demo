package test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import connectivity.EMSConnection;

public class TestConnection {
	EMSConnection connection = new EMSConnection();
	@Test
	public void testUserInputForConnectingDb() {
		assertEquals("Correct Username","root",connection.getUser());
		assertEquals("Correct Password","root@123",connection.getPassword());
		assertEquals("Correct Db name","electricity_managementsystem",connection.getDBName());
	}
	
	@Test
	public void testConnection() throws ClassNotFoundException, SQLException {
		assertEquals("Connection Successfull","",connection.getConnection());
	
	}
}
