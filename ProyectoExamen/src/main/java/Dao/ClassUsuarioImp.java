package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.TblUsuariocl3;

public class ClassUsuarioImp {
	
	
	public void RegistrarUsuario(TblUsuariocl3 usuario) {
		// ESTABLECER CONEXION CON LA UNIDAD DE PERSISTENCIA..
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoExamen");
				
				//PERMITE GESTIONAR ENTIDADES
				EntityManager em=fabr.createEntityManager();
				
				//INICIAR TRANSACCION
				em.getTransaction().begin();
				
				//REGISTRAMOS
				em.persist(usuario);
				
				//EMITIMOS MENSAJE POR CONSOLA
				System.out.println("Producto registrado en la BD correctamente");
				
				//CONFIRMAMOS
				em.getTransaction().commit();
				
				//CERRAMOPS LA TRANSACCION
				em.close();
		
	}
	
	
	public static  TblUsuariocl3 BuscarUsuario(TblUsuariocl3 usuario) {
		
	
		
		// ESTABLECER CONEXION CON LA UNIDAD DE PERSISTENCIA..
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoExamen");
						
				//PERMITE GESTIONAR ENTIDADES
				EntityManager em=fabr.createEntityManager();
						
				//INICIAR TRANSACCION
				em.getTransaction().begin();
						
				String jpql = "SELECT u FROM TblUsuariocl3 u WHERE u.usuariocl3 = :username";
				TypedQuery<TblUsuariocl3> query =em.createQuery(jpql, TblUsuariocl3.class);
				query.setParameter("username", usuario.getUsuariocl3());
				
				TblUsuariocl3 usuarioencontrado = null;
				try{
					usuarioencontrado = query.getSingleResult();
				} catch (Exception e){
					e.printStackTrace();
				}
					
				//CONFIRMAMOS
				em.getTransaction().commit();
						
				em.close();
				
				return usuarioencontrado;
			} //FIN DEL METODO BUSCAR CLIENTE


	public List<TblUsuariocl3> ListadoUsuario() {
		// ESTABLECER CONEXION CON LA UNIDAD DE PERSISTENCIA..
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoExamen");
								
				//PERMITE GESTIONAR ENTIDADES
				EntityManager em=fabr.createEntityManager();
								
				//INICIAR TRANSACCION
				em.getTransaction().begin();
						
				//RECUPERAMOS LOS USUARIOs DE LA BASE DE DATOS
				List<TblUsuariocl3> listadoUsuario=em.createQuery("select c from TblUsuariocl3 c",TblUsuariocl3.class).getResultList();
				
				//CONFIRMAMOS
				em.getTransaction().commit();
								
				//CERRAMOPS LA TRANSACCION
				em.close();
						
				return listadoUsuario;
			} //FIN DEL METODO LISTAR CLIENTE

}
