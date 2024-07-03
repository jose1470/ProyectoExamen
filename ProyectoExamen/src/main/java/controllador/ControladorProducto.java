package controllador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassProductoImp;
import model.TblProductocl3;

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
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TblProductocl3 producto = new TblProductocl3();
		ClassProductoImp crud = new ClassProductoImp();
		
		// recuperamos la accion y codigo
		String accion = request.getParameter("accion");
		
		if (accion != null) {
			switch (accion) {
			case "Modificar":
				int codigo = Integer.parseInt(request.getParameter("cod"));
				producto.setIdproductocl3(codigo);
				TblProductocl3 buscarCod = crud.BuscarProducto(producto);
				request.setAttribute("codigo", buscarCod.getIdproductocl3());
				request.setAttribute("nombre", buscarCod.getNombrecl3());
				request.setAttribute("precioventa", buscarCod.getPrecioventacl3());
				request.setAttribute("preciocompra", buscarCod.getPreciocompcl3());
				request.setAttribute("estado", buscarCod.getEstadocl3());
				request.setAttribute("descripcion", buscarCod.getDescripcl3());
				request.getRequestDispatcher("/FormActualizarProductos.jsp").forward(request, response);
				break;
			case "Eliminar":
				int codEliminar = Integer.parseInt(request.getParameter("cod"));
				producto.setIdproductocl3(codEliminar);
				crud.EliminarProducto(producto);
				// Redireccionar después de eliminar
				List<TblProductocl3> listadoProductos = crud.ListadoProducto();
				request.setAttribute("listadodeproductos", listadoProductos);
				request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
				break;
			case "Listar":
				List<TblProductocl3> listadoproducto = crud.ListadoProducto();
				request.setAttribute("listadodeproductos", listadoproducto);
				request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
				break;
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codigo = request.getParameter("codigo");
		String nombre = request.getParameter("nombre");
		double precioventa = Double.parseDouble(request.getParameter("precioventa"));
		double preciocompra = Double.parseDouble(request.getParameter("preciocompra"));
		String estado = request.getParameter("estado");
		String descripcion = request.getParameter("descripcion");
		
		List<TblProductocl3> listadoProducto = null;
		
		TblProductocl3 producto = new TblProductocl3();
		ClassProductoImp crud = new ClassProductoImp();
		
		producto.setNombrecl3(nombre);
		producto.setPrecioventacl3(precioventa);
		producto.setPreciocompcl3(preciocompra);
		producto.setEstadocl3(estado);
		producto.setDescripcl3(descripcion);
		
		if (codigo != null && !codigo.isEmpty()) {
			int cod = Integer.parseInt(codigo);
			producto.setIdproductocl3(cod);
			crud.ActualizarProducto(producto);
		} else {
			crud.RegistrarProducto(producto);
		}
		
		listadoProducto = crud.ListadoProducto();
		request.setAttribute("listadodeproductos", listadoProducto);
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
	}
}