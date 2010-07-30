package com.rayyildiz.patterns.factorymethod;

public class MySqlDbConnection implements IDbConnection {
	@Override
	public String getConnection() {
		return "MySql Data Connection";
	}
}
