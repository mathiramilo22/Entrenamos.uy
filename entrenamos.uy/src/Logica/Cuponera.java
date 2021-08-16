package Logica;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Cuponera {
	
	//Atributos
	
	String nombre;
	String descripcion;
	DtFecha fechaInicio;
	DtFecha fechaFin;
	float descuento;
	
	List<ClasesCuponera> clasesCuponeras;
	List<ReciboCuponera> reciboCuponeras;
	
	//Operaciones esenciales
	
	public Cuponera(String nombre, String descripcion, DtFecha fechaInicio, 
			DtFecha fechaFin, float descuento)
	{
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descuento = descuento;
		
		this.clasesCuponeras = new ArrayList<>;
		this.reciboCuponeras = new ArrayList<>;
	}
	
	public Cuponera(DtCuponera dtc)
	{
		Cuponera( dtc.getNombre(), dtc.getDescripcion(), dtc.getFechaInicio,
				dtc.getFechaFin(), dtc.getDescuento() );
	}
	
	public String getNombre() 
	{
		String res = nombre;
		return res;
	}
	
	public String getDescripcion() 
	{
		String res = descripcion;
		return res;
	}
	
	public DtFecha getFechaInicio() 
	{
		DtFecha res = fechaInicio;
		return res;
	}
	
	public DtFecha getFechaFin()
	{
		DtFecha res = fechaFin;
		return res;
	}
	
	public int getDescuento()
	{
		int res = descuento;
		return res;
	}
	
	//Operaciones Casos de Uso
	
	//TERMINAR
	public Set<String> getNombresActDep()
	{
		Set<String> res = new HashSet<>();
		Iterator<ClasesCuponera> it = clasesCuponeras.iterator();
		while(it.hasNext())
		{
			it = it.next();
			ClasesCuponera cc = it.getClass();
			res.add(cc.getNombreActDep());
		}
		return res;
	}
	
	//TERMINAR
	public void addActDep(ActividadDeportiva ad, int cantidadClases)
	{
		ClasesCuponera cp = new ClasesCuponera(ad,cantidadClases);
		clasesCuponeras.add(cp);
	}
	
	//TERMINAR
	public int cantidadClases(String nombreActividadDeportiva)
	{
		int res = 0;
		Iterator<ClasesCuponera> it = clasesCuponeras.iterator();
		while(it.hasNext())
		{
			it = it.next();
			ClasesCuponera cc = it.getClass();
			res += cc.tieneActDep(nombreActividadDeportiva);
		}
		return res;
	}
	
	//TERMINAR
	public DtCuponera getDt()
	{
		//Falta un atributo raro...
		DtCuponera res = new DtCuponera(nombre, descripcion, fechaInicio, 
				fechaFin, descuento);
		return res;
	}
}
