package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl2;

public class ClassProductoImp implements IProducto{

	@Override
	public void RegistrarProducto(TblProductocl2 Producto) {
		// ESTABLECER CONEXION CON LA UNIDAD DE PERSISTENCIA..
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoExamen");
				
				//PERMITE GESTIONAR ENTIDADES
				EntityManager em=fabr.createEntityManager();
				
				//INICIAR TRANSACCION
				em.getTransaction().begin();
				
				//REGISTRAMOS
				em.persist(Producto);
				
				//EMITIMOS MENSAJE POR CONSOLA
				System.out.println("Producto registrado en la BD correctamente");
				
				//CONFIRMAMOS
				em.getTransaction().commit();
				
				//CERRAMOPS LA TRANSACCION
				em.close();
		
	} //FIN DEL METODO REGISTRAR 

	@Override
	public void ActualizarProducto(TblProductocl2 Producto) {
		// ESTABLECER CONEXION CON LA UNIDAD DE PERSISTENCIA..
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoExamen");
		
		//PERMITE GESTIONAR ENTIDADES
		EntityManager em=fabr.createEntityManager();
		
		//INICIAR TRANSACCION
		em.getTransaction().begin();
		
		//ACTUALIZAMOS
	
		em.merge(Producto);
		
		
		//CONFIRMAMOS
		em.getTransaction().commit();
		
		//CERRAMOPS LA TRANSACCION
		em.close();

} //FIN DEL METODO ACTUALIZAR CLIENTE

	@Override
	public void EliminarProducto(TblProductocl2 Producto) {
		// ESTABLECER CONEXION CON LA UNIDAD DE PERSISTENCIA..
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoExamen");
				
				//PERMITE GESTIONAR ENTIDADES
				EntityManager em=fabr.createEntityManager();
				
				//INICIAR TRANSACCION
				em.getTransaction().begin();
				
				//RECUPERAMOS EL CODIGO A ELIMINAR
				TblProductocl2 elim=em.merge(Producto);
				
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
	public TblProductocl2 BuscarProducto(TblProductocl2 Producto) {
		// ESTABLECER CONEXION CON LA UNIDAD DE PERSISTENCIA..
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoExamen");
						
				//PERMITE GESTIONAR ENTIDADES
				EntityManager em=fabr.createEntityManager();
						
				//INICIAR TRANSACCION
				em.getTransaction().begin();
						
				//RECUPERAMOS EL CODIGO A BUSCAR
				TblProductocl2 busproducto=em.find(TblProductocl2.class,Producto.getIdproductocl2());
				
				//CONFIRMAMOS
				em.getTransaction().commit();
						
				//CERRAMOPS LA TRANSACCION
				em.close();
				
				return busproducto;
			} //FIN DEL METODO BUSCAR CLIENTE

	@Override
	public List<TblProductocl2> ListadoProducto() {
		// ESTABLECER CONEXION CON LA UNIDAD DE PERSISTENCIA..
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoExamen");
								
				//PERMITE GESTIONAR ENTIDADES
				EntityManager em=fabr.createEntityManager();
								
				//INICIAR TRANSACCION
				em.getTransaction().begin();
						
				//RECUPERAMOS LOS CLIENTES DE LA BASE DE DATOS
				List<TblProductocl2> listadoProducto=em.createQuery("select c from TblProductocl2 c",TblProductocl2.class).getResultList();
				
				//CONFIRMAMOS
				em.getTransaction().commit();
								
				//CERRAMOPS LA TRANSACCION
				em.close();
						
				return listadoProducto;
			} //FIN DEL METODO LISTAR CLIENTE

}
