package com.curso.db;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.curso.mercado.entidades.Producto;
import com.curso.mercado.servicios.VentasService;
import com.curso.mercado.servicios.excepciones.VentasException;

public class BaseDatosMercadoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void insertarUnNuevoProductoDebeDevolverCount4() {
		int contadorEspero = 4;
		BaseDatosMercado.add("camisa amarilla", 5.9);		
		assertEquals(BaseDatosMercado.getContador(), contadorEspero);		
		assertEquals(BaseDatosMercado.findByI(4).getDescripcion(), "camisa amarilla");
	}
	
	@Test
	public void getAllProductos() {
		Collection<Producto> lista = BaseDatosMercado.getAll();
		assertEquals(lista.size(), 4);
	}
	
	@Test
	public void compro4LapicesQueExisteYHayStock() {
		VentasService ventas = new VentasService();
		
		try {
			ventas.comprarProducto(3, 4);
			assertEquals(BaseDatosMercado.findByI(3).getStock(), 1);
		} catch (VentasException e) {
			fail ("No puede lanzar excepcion. Hay camisas");
		}
	}
	
	@Test(expected = com.curso.mercado.servicios.excepciones.VentasException.class)
	public void comproMasLapicesQueExisteStock() throws VentasException{
		
		VentasService ventas = new VentasService();
		ventas.comprarProducto(3, 777);
		
		try {
			ventas.comprarProducto(3, 777);
			assertEquals(BaseDatosMercado.findByI(3).getStock(), 1);
		} catch (VentasException e) {
			fail ("No puede lanzar excepcion. Hay camisas");
		}
	}

}
