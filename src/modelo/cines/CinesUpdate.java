package modelo.cines;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.util.BDConect;
import negocio.beans.CineBean;

public class CinesUpdate {

	
	
	
	public void updateCine(CineBean cine) {
		Connection conexion = BDConect/*No asegura tener un unico sitio en el que estan los ajutes de conexion
		De forma que si hay algun error sabemos que estar� en esa clse en concreto*/.getConexion(); 
       	PreparedStatement stmt;
       	/*Hace el update que hacemos con el Sql pero en codigo java*/
       	/*Concatenacion de Strings*/
       	String sql = 	"UPDATE cines "
       					+ "SET nombre='"+cine.getNombre()+"', "
       					+ "direccion='"+cine.getDireccion()+"', "
       					+ "telefono='"+cine.getTelefono()+"', "
       					+ "responsable='"+cine.getResponsable()+"' "
       					+ "WHERE idcines="+cine.getIdCine();
       	
       //	System.out.println(sql);/*Se coge el resultado que salga y se prueba sobre la base de datos*/
		try {/*Otro try cat por si la consulta esta mal hecha*/
			stmt = conexion.prepareStatement(sql);
	       	//stmt.executeUpdate();
	       	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}	
	
	
}
