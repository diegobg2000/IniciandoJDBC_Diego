package modelo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BDConect {
//SINGLETON
	private static Connection conexion = null;//VAriable conexion que es null y un constructor privado
	
	
	
	private BDConect() {/*Constructor privado para que no halla mas objetos purulando por ahi*/
		
		String user ="root";
		String pass = "DiegoSergio2";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//Buscando un driver
			/*Esto es informacion que yo le paso al servidor MySQL*/
			String dbURL = "jdbc:mysql://127.0.0.1:3306/cines" //Sitio al que se esta conectando
				    + "?verifyServerCertificate=true" 
				    + "&useSSL=false"
				    + "&requireSSL=false";
            conexion = DriverManager.getConnection(dbURL, user, pass);/*Creando un objeto a base de pedirle algo a otra clase*/
		} 
		catch (Exception ex) {
            ex.printStackTrace();
        } 			
	}
	
	
	
	
	public static Connection getConexion() {
	
		if(conexion==null) {//Si conexion es igual a null se crea una conexion sino se devuleve la que hay
			
			new BDConect();
		}
		
		return conexion;
	}
	
	
	
	
}
