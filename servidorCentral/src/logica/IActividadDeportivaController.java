package logica;

import java.util.Set;

import excepciones.ActividadDeportivaException;
import excepciones.ClaseException;
import excepciones.InstitucionException;

import datatypes.DtActividadDeportiva;
import datatypes.DtClaseExt;
import datatypes.DtActividadDeportivaExt;
import datatypes.DtInstitucion;
import datatypes.TEstado;

public interface IActividadDeportivaController {
	
	public Set<String> obtenerInstituciones(); 
	
	public Boolean ingresarDatosActividadDep(String nombreInsti, DtActividadDeportiva datosAD) throws InstitucionException,
			ActividadDeportivaException;
	
	public Set<String> obtenerActividades(String ins) throws InstitucionException ;
	
	public Set<String> obtenerDeltaInstituciones(String nombreCup, String ins) throws InstitucionException ;
	
	// Migue: Esta funcion va a cambiar de controller, me lo llevo a DictadoClaseController, si no la usan en otro lado favor borrar
	public DtClaseExt seleccionarClase(String  ins, String actDep, String clase) throws InstitucionException,
			ActividadDeportivaException, ClaseException;
	
	public Set<String> obtenerSocios();
	
	public DtActividadDeportivaExt getActDepExt(String ins, String actDep) throws InstitucionException, 
			ActividadDeportivaException;	
	
	public int altaInstitucion(String nombre, String descripcion, String URL);
	
	public DtInstitucion obtenerDatosInstitucion(String inst) throws InstitucionException;
	
	public void aprobarActividad(String ad, TEstado ok);
	
	public Set<String> obtenerActDepIngresadas();
}