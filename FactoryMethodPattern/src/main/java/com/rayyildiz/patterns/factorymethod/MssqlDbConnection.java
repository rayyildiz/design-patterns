package com.rayyildiz.patterns.factorymethod;

public class MssqlDbConnection implements IDbConnection {
	@Override
	public String getConnection() {
		return "Mssql Data Connection";
	}
}
