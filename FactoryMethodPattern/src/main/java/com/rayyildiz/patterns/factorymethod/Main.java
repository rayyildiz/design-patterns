package com.rayyildiz.patterns.factorymethod;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IDbConnection oracleDbConnection = DbConnectionFactory.createDbConnection(DbConnectionType.Oracle);
		IDbConnection mysqlDbConnection = DbConnectionFactory.createDbConnection(DbConnectionType.Mysql);
		IDbConnection mssqlDbConnection = DbConnectionFactory.createDbConnection(DbConnectionType.Mssql);

		System.out.println("Oracle : " + oracleDbConnection.getConnection());
		System.out.println("Mysql : " + mysqlDbConnection.getConnection());
		System.out.println("Mssql : " + mssqlDbConnection.getConnection());
		
		if ( System.console()!=null){
			System.console().readLine(); // wait for enter
		}	
	}
}
