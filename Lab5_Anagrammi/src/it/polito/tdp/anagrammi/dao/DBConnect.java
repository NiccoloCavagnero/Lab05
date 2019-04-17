package it.polito.tdp.anagrammi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() {
		
		//Stringa per accedere alla connesione (Stringa corretta per TimeZone)
		String url="jdbc:mysql://localhost/dizionario?user=root";	
		Connection conn;	
		
		try {
			//Creo la connesione
			conn = DriverManager.getConnection(url);
			//Restituisco l'oggetto connesione
			return conn;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}