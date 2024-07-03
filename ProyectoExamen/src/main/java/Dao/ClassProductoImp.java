package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl3;

public class ClassProductoImp implements IProducto{

	@Override
	public void RegistrarProducto(TblProductocl3 producto) {
		// ESTABLECER CONEXION CON LA UNIDAD DE PERSISTENCIA..
				EntityManagerFactory Prod=Persistence.createEntityManagerFactory("ProyectoExamen");
				
				//PERMITE GESTIONAR ENTIDADES
				EntityManager em=Prod.createEntityManager();
				
				//INICIAR TRANSACCION
				em.getTransaction().begin();
				
				//REGISTRAMOS
				em.persist(producto);
				
				//EMITIMOS MENSAJE POR CONSOLA
				System.out.println("Producto registrado en la BD correctamente");
				
				//CONFIRMAMOS
				em.getTransaction().commit();
				
				//CERRAMOPS LA TRANSACCION
				em.close();
		
	} //FIN DEL METODO REGISTRAR 

	@Override
	public void ActualizarProducto(TblProductocl3 producto) {
		// ESTABLECER CONEXION CON LA UNIDAD DE PERSISTENCIA..
		EntityManagerFactory Prod=Persistence.createEntityManagerFactory("ProyectoExamen");
		
		//PERMITE GESTIONAR ENTIDADES
		EntityManager em=Prod.createEntityManager();
		
		//INICIAR TRANSACCION
		em.getTransaction().begin();
		
		//ACTUALIZAMOS
	
		em.merge(producto);
		
		
		//CONFIRMAMOS
		em.getTransaction().commit();
		
		//CERRAMOPS LA TRANSACCION
		em.close();

} //FIN DEL METODO ACTUALIZAR CLIENTE

	@Override
	public void EliminarProducto(TblProductocl3 producto) {
		// ESTABLECER CONEXION CON LA UNIDAD DE PERSISTENCIA..
				EntityManagerFactory Prod=Persistence.createEntityManagerFactory("ProyectoExamen");
				
				//PERMITE GESTIONAR ENTIDADES
				EntityManager em=Prod.createEntityManager();
				
				//INICIAR TRANSACCION
				em.getTransaction().begin();
				
				//RECUPERAMOS EL CODIGO A ELIMINAR
				TblProductocl3 elim=em.merge(producto);
				
				//PROCEDEMOS A ELIMINAR EL REGISTRO
				em.remove(elim);
				
				//EMITIMOS MENSAJE POR CONSOLA
				System.out.println("producto eliminado de la BD correctamente");
				
				//CONFIRMAMOS
				em.getTransaction().commit();
				
				//CERRAMOPS LA TRANSACCION
				em.close();
				
			} //FIN DEL METODO ELIMINAR CLIENTE

	@Override
	public TblProductocl3 BuscarProducto(TblProductocl3 producto) {
		// ESTABLECER CONEXION CON LA UNIDAD DE PERSISTENCIA..
				EntityManagerFactory Prod=Persistence.createEntityManagerFactory("ProyectoExamen");
						
				//PERMITE GESTIONAR ENTIDADES
				EntityManager em=Prod.createEntityManager();
						
				//INICIAR TRANSACCION
				em.getTransaction().begin();
						
				//RECUPERAMOS EL CODIGO A BUSCAR
				TblProductocl3 busproducto=em.find(TblProductocl3.class,producto.getIdproductoscl3());
				
				//CONFIRMAMOS
				em.getTransaction().commit();
						
				//CERRAMOPS LA TRANSACCION
				em.close();
				
				return busproducto;
			} //FIN DEL METODO BUSCAR CLIENTE

	@Override
	public List<TblProductocl3> ListadoProducto() {
		// ESTABLECER CONEXION CON LA UNIDAD DE PERSISTENCIA..
				EntityManagerFactory Prod=Persistence.createEntityManagerFactory("ProyectoExamen");
								
				//PERMITE GESTIONAR ENTIDADES
				EntityManager em=Prod.createEntityManager();
								
				//INICIAR TRANSACCION
				em.getTransaction().begin();
						
				//RECUPERAMOS LOS CLIENTES DE LA BASE DE DATOS
				List<TblProductocl3> listadoProducto=em.createQuery("select c from TblProductocl2 c",TblProductocl3.class).getResultList();
				
				//CONFIRMAMOS
				em.getTransaction().commit();
								
				//CERRAMOPS LA TRANSACCION
				em.close();
						
				return listadoProducto;
			} //FIN DEL METODO LISTAR CLIENTE

}
