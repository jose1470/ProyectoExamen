package TestEntidades;

import java.util.List;

import Dao.ClassUsuarioImp;
import model.TblProductocl3;
import model.TblUsuariocl3;

public class TestEntidadUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblUsuariocl3 usuario=new TblUsuariocl3();
		ClassUsuarioImp crud=new ClassUsuarioImp();
		/*
		//asignamos valores
		
		usuario.setUsuariocl3("jose");
		usuario.setPasswordcl3("123456");
		
		usuario.setUsuariocl3("profesor");
		usuario.setPasswordcl3("123456");
		
		
		//invocamos al metodo registrar...
		crud.RegistrarUsuario(usuario);*/
		
		
		List<TblUsuariocl3> listado=crud.ListadoUsuario();
		
		//APLICAMOS UN BUCLE FOR
		for(TblUsuariocl3 lis:listado){
				
				//IMPRIMIMOS POR PANTALLA
				System.out.println("idUsuario: "+ lis.getIdusuariocl3()+" usuario: "+lis.getUsuariocl3()+" password: "+lis.getPasswordcl3());

	}

	}
}
