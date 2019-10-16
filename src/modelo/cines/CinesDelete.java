package modelo.cines;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.util.BDConect;
import negocio.beans.CineBean;

public class CinesDelete {

	
	public void deleteCine(CineBean cine) { /*void: nos indica que el metodo no va a devolver ningun valor*/
		Connection conexion = BDConect.getConexion();
		PreparedStatement stmt;
		
		
		String sql = "delete from cines where id=" + cine.getIdCine(); //NS si es el metodo para obtenerlo o dolo poner "id"
		
		System.out.println(sql);
		try {
			stmt = conexion.prepareStatement(sql);
			//stmt.executeUpdate();
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
}
