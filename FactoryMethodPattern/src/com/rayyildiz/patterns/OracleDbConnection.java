package com.rayyildiz.patterns;

public class OracleDbConnection implements IDbConnection {
	@Override
	public String getConnection() {
		return "Oracle Data Connection";
	}
}
