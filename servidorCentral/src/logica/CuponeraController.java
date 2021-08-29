package logica;

import java.util.Set;

import datatypes.DtCuponera;
import datatypes.DtFecha;
import excepciones.ActividadDeportivaException;
import excepciones.InstitucionException;

public class CuponeraController implements ICuponeraController {

	private static CuponeraController instance = null;

	private CuponeraController() {}
	
	public static CuponeraController getInstance(){
		if ( instance == null )
			instance = new CuponeraController();
		return instance;
	}
	
	public int ingresarCuponera(String nombre, String descripcion, DtFecha inicio, DtFecha fin, int descuento, DtFecha alta) {
		return getHC().addCuponera(nombre, descripcion, inicio, fin, descuento, alta);
	}
	
	public Set<String> getNombreCuponeras(){
		return getHC().getNombreCuponeras();
	}
		
	public void agregarActividadCuponera(String nombreCuponera, String institucion, String actividadDeportiva, int cantidadClases) 
			throws InstitucionException, ActividadDeportivaException {
		getHC().getCup(nombreCuponera).addActDep(getHI().findInstitucion(institucion).getActDep(actividadDeportiva),cantidadClases);
	}
		
	public DtCuponera seleccionarCuponera(String n) {
		HandlerCuponera hu = HandlerCuponera.getInstance();
		Cuponera c = hu.getCup(n);
		return c.getDt();
	}
	
	private HandlerInstitucion getHI() {
		return HandlerInstitucion.getInstance();
	}
	private HandlerCuponera getHC() {
		return HandlerCuponera.getInstance();
	}
}
