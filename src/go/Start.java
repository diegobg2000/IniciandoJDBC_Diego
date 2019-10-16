package go;

import modelo.cines.CinesCreate;
import modelo.cines.CinesDelete;
import modelo.cines.CinesRead;
import negocio.beans.CineBean;
import negocio.controlador.Cinesa;
import view.StartView;

public class Start {

	public static void main(String[] args) {
		/*
		CineBean cine = new  CineBean();
			cine.setIdCine(149);
			cine.setNombre("Yelmo Cines");
			cine.setDireccion("Cuenca");
			cine.setResponsable("Diego");
			cine.setTelefono("676545678");
		
			
			CinesCreate cd = new CinesCreate();
			//CinesDelete del = new CinesDelete();
			//del.deleteCine(cine);
			cd.CreateCine(cine);
		}	
}	
	
	*/
	
	
	
	
	
	
	
		//TODO Auto-generated method stub;

		Cinesa cinesa = new Cinesa();//Crea un objeto de la calse cinesa para pasarselo a sTart view porque este necesita de cinessa para la constrccion
		
		try {	
			
			StartView sv = new StartView(cinesa);
			sv.go();
		}
		catch(Exception e) {e.printStackTrace();}
		
	}

}
/*
new Bean CINES
new CinesCreate
new CinesDelete
*/
