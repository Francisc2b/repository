package com.curso.mercado.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.mercado.entidades.Producto;
import com.curso.mercado.servicios.ProductosService;

@WebServlet(urlPatterns = "eliminarProducto",loadOnStartup = 2)
public class EliminarProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	//ATRIBUTOS
    ProductosService productoService = new ProductosService();
	
    //CONSTRUCTORES
    public EliminarProductoServlet() {
        super();
    	
    }
    
    //METODOS
	protected void doPost(HttpServletRequest request, 
			              HttpServletResponse response) throws ServletException, IOException {
		
		//Integer id = Integer.parseInt(request.getParameter(idProducto));
		//productoService.quitarProducto(id);
			List<Producto> listaProductos = productoService.dameTodosLosProductos();
			
			request.setAttribute("lista", listaProductos);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/vistas/lista-productos.jsp");
			rd.forward(request, response);
			
		}

}
