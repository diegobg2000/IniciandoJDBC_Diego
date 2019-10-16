package modelo.cines;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.util.BDConect;
import negocio.beans.CineBean;

public class CinesRead {

	
	
	public ArrayList<CineBean> getCines() {/*Operacion get cines que devuleve un array que se llama araryCines...*/
		  
		// creo un array list vacio que va a tener la lista de cines
		ArrayList<CineBean> devolver = new ArrayList<CineBean>();
		
		// preparo la conexion
		Connection conexion = BDConect.getConexion(); //Se pide la conexion a la base de datos
       	PreparedStatement stmt;//Creo un objeto de tipo PreparedStatement que es una sentencia de Sql
       	
       	// ejecuto la sentencia
		try {//Por di lo que se escibe en la sentencia esta mal
			stmt = conexion.prepareStatement("SELECT * FROM cines");//Se recoje lo que se escribe en al sentencai sql
	       	ResultSet rs = stmt.executeQuery();/*Devuelve el resutado de una Query y lo guarda en rs*/
	       	while (rs.next()) {
	       		
	       		CineBean cine = new CineBean();//Creo objeto cines
	       		cine.setIdCine/*Le establezco cade uno de sus atributos*/(rs.getInt("idcines"))/*Le pide cosas especificas a la tabla*/;
	       		cine.setNombre(rs.getString("nombre"));
	       		cine.setResponsable(rs.getString("responsable"));
	       		cine.setTelefono(rs.getString("telefono"));
	       		cine.setDireccion(rs.getString("direccion"));
	       		
	       		devolver.add(cine);/*Cuando hallas recogido los datos metelso en el Array List*/
	       	} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return devolver;
	}
	
	
}
