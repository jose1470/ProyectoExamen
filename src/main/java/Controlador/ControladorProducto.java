package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		TblProductocl2 productocl2=new TblProductocl2();
		ClassProductoImp crud=new ClassProductoImp();
		List<TblProductocl2> listadoproducto=crud.ListadoProducto();
		
		//INCOVAMOS EL LISTADO DE PRODUCTOS PARA LA VISTA
		request.setAttribute("listadoproductos",listadoproducto);
		
		//REDIRECCIONAMOS
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//recuperamos los valores del formulario...
		String Nombre=request.getParameter("nombre");
		double Precioventa=Double.parseDouble(request.getParameter("precioventa"));
		double preciocomp = Double.parseDouble(request.getParameter("preciocompra"));
		String estado=request.getParameter("estado");
		String descrip=request.getParameter("descripcion");
		
		
		//instanciar las respectivas entidades...
		TblProductocl2 producto=new TblProductocl2();
		ClassProductoImp crud=new ClassProductoImp();
		
		//asignamos valores
		producto.setNombrecl2(Nombre);
		producto.setPrecioventacl2(Precioventa);
		producto.setPreciocompcl2(preciocomp);
		producto.setEstadocl2(estado);
		producto.setDescripcl2(descrip);
		//invocamos la metodo registrar...
		crud.RegistrarProducto(producto);
		
		//ACTUALIZAR LISTADO DE CLIENTES			
		List<TblProductocl2> listadoproducto=crud.ListadoProducto();
		
		//INCOVAMOS EL LISTADO DE PRODUCTOS PARA LA VISTA
		request.setAttribute("listadoproductos",listadoproducto);
		//redireccionamos
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
		

		
		
	}  //fin del metodo dopost...

}
