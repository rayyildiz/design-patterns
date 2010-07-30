package com.rayyildiz.patterns.factorymethod;

public class OracleDbConnection implements IDbConnection {
	@Override
	public String getConnection() {
		return "Oracle Data Connection";
	}
}
