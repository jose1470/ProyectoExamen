package TestEntidades;

import java.util.List;

import Dao.ClassProductoImp;
import model.TblProductocl2;

public class TestEntidadProducto {

	public static void main(String[] args) {
		//realizamos la respectiva instancia de las clases...
		TblProductocl2 producto=new TblProductocl2();
		ClassProductoImp crud=new ClassProductoImp();
		
		//asignamos valores
		
		producto.setNombrecl2("leche");
		producto.setPrecioventacl2(5);
		producto.setPreciocompcl2(7);
		producto.setEstadocl2("vig.");
		producto.setDescripcl2("oferta");
		
		//invocamos al metodo registrar...
		crud.RegistrarProducto(producto);
		
	//*************************************//
		
		//testeamos el metodo listado
		List<TblProductocl2> listado=crud.ListadoProducto();
		
		//APLICAMOS UN BUCLE FOR
		for(TblProductocl2 lis:listado){
				
				//IMPRIMIMOS POR PANTALLA
				System.out.println("IdProducto "+lis.getIdproductocl2()+" nombre "+ lis.getNombrecl2()+" Precioventa "+lis.getPrecioventacl2()+ " Preciocompra "+lis.getPreciocompcl2()
				+ " Estado "+lis.getEstadocl2()+" Descripcion "+lis.getDescripcl2());
		}

	} //FIN DEL METODO MAIN

} //FIN DE LA CLASE
