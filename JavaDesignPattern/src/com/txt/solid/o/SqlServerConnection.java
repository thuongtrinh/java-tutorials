	package com.txt.solid.o;

public class SqlServerConnection extends Connection {

	@Override
	public void doConnect() {
		System.out.println("Connect to SQL Server");
	}

}
