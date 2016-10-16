package org.concision4j.demo.test;

import java.sql.SQLException;

import org.concision4j.dao.jdbc.DataSourceUtils;
import org.concision4j.dao.jdbc.test;
import org.junit.Test;


public class ConfigTest {
	public static void main(String[] args) throws SQLException {
//		System.out.println(ConfigManager.getJDBCDriver());
//		ConfigManager.loadConfig("testconcision4j");
//		System.out.println(ConfigManager.getJDBCDriver());
//		System.out.println(DataSourceUtils.getConnection());
		System.out.println(test.getConnection());
	}
	
	@Test
	public void getConnection(){
		System.out.println(DataSourceUtils.getConnection());
	}
}
