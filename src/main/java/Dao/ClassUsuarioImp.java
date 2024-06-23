package Dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import Interfaces.IUsuario;
import model.TblUsuariocl2;

public class ClassUsuarioImp implements IUsuario {

	 
	    private EntityManager entityManager;

	    public TblUsuariocl2 validarUsuario(String usuario, String password) {
	        TypedQuery<TblUsuariocl2> query = entityManager.createNamedQuery("TblUsuariocl2.findByUsernameAndPassword", TblUsuariocl2.class);
	        query.setParameter("username", usuario);
	        query.setParameter("password", password);
	        try {
	            return query.getSingleResult();
	        } catch (Exception e) {
	            return null;
	        }
	    }
	


}
