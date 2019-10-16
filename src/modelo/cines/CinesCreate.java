package modelo.cines;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.util.BDConect;
import negocio.beans.CineBean;


public class CinesCreate {
	
	
	

	public void CreateCine(CineBean cine) {
		Connection conexion = BDConect.getConexion(); 
       	PreparedStatement stmt;
       	
       	String sql = 	"insert into cines values("
       					+ cine.getIdCine()
       					+ ",'" 
       					+ cine.getNombre()
       					+ "','" 
       					+ cine.getDireccion()
       					+ "','" 
       					+ cine.getResponsable()
       					+ "','"
       					+ cine.getTelefono()
       					+ "');";
       	
    	

       	
		try {
			stmt = conexion.prepareStatement(sql);
	       	stmt.executeUpdate();
			//System.out.println(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
	}
}
	
	