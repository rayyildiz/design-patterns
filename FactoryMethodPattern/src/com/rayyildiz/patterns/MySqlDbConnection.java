package com.rayyildiz.patterns;

public class MySqlDbConnection implements IDbConnection {
	@Override
	public String getConnection() {
		return "MySql Data Connection";
	}
}
