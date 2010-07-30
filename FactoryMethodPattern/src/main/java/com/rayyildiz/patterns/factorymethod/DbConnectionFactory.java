package com.rayyildiz.patterns.factorymethod;

public class DbConnectionFactory {
	public static IDbConnection createDbConnection(DbConnectionType dbConnType){
		
		switch(dbConnType){
			case Oracle:
				return new OracleDbConnection();
			case Mysql:
				return new MySqlDbConnection();
			case Mssql:
				return new MssqlDbConnection();
		}
		
		return  null;
	}
}
