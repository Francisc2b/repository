package com.curso.db;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.curso.mercado.entidades.Producto;

public class BaseDatosMercado {
	
	private static Map<Integer, Producto> tablaProducto;
	private static int contador = 3;
	
	static {
		tablaProducto = new TreeMap<Integer, Producto>();
		tablaProducto.put(1, new Producto(1, "calabaza", 2.25));
		tablaProducto.put(2, new Producto(2, "pescado", 3.78));
		tablaProducto.put(3, new Producto(3, "cuaderno", 0.85));
	}
	
	private BaseDatosMercado() {};
	
	
	public static void add(String nombre, double precio) {
		int newId = ++contador;
		Producto newP = new Producto(newId, nombre, precio);
		tablaProducto.put(newId, newP);		
	}
	
	public static Collection<Producto> getAll(){
		return tablaProducto.values();		
	}
	
	public static Producto findByI(int id) {
		return tablaProducto.get(id);
	}

	public static void update(Producto pModf) throws Exception{
		Producto p = findByI(pModf.getIdProducto());
		if (p == null) {
			throw new Exception("Producto no encontrado");
		}
		tablaProducto.put(pModf.getIdProducto(), pModf);
	}
	
	public static void delete(int id) {
		tablaProducto.remove(id);
	}
	
	public static int getContador() {
		return contador;
	}

}
