package TestEntidades;
import java.util.List;

import Dao.ClassProductoImp;
import model.TblProductocl3;

public class TestEntidadProducto {

		
		public static void main(String[] args) {
			//realizamos la respectiva instancia de las clases...
			TblProductocl3 producto=new TblProductocl3();
			ClassProductoImp crud=new ClassProductoImp();
			/*
			//asignamos valores
			
			producto.setNombrecl3("leche");
			producto.setPrecioventacl3(5);
			producto.setPreciocompcl3(7);
			producto.setEstadocl3("vig.");
			producto.setDescripcl3("oferta");
			
			//invocamos al metodo registrar...
			crud.RegistrarProducto(producto);*/
			
			List<TblProductocl3> listado=crud.ListadoProducto();
			
			//APLICAMOS UN BUCLE FOR
			for(TblProductocl3 lis:listado){
					
					//IMPRIMIMOS POR PANTALLA
					System.out.println("IdProducto "+lis.getIdproductocl3()+" nombre "+ lis.getNombrecl3()+" Precioventa "+lis.getPrecioventacl3()+ " Preciocompra "+lis.getPreciocompcl3()
					+ " Estado "+lis.getEstadocl3()+" Descripcion "+lis.getDescripcl3());
			}
			
	}

}