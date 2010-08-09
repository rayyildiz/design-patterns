package com.rayyildiz.patterns;

public class MssqlDbConnection implements IDbConnection {
	@Override
	public String getConnection() {
		return "Mssql Data Connection";
	}
}
