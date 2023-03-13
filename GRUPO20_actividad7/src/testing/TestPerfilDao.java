package testing;

import daos.PerfilDao;
import daos.PerfilDaoImplMy8;
import javabeans.Perfil;

public class TestPerfilDao {

	public static void main(String[] args) {
		PerfilDao pdao = new PerfilDaoImplMy8();
		
		Perfil per = new Perfil(50,"ASTRONAUTA",10);
		
		for (Perfil ele: pdao.buscarTodos())
			System.out.println(ele);
		
		System.out.println(pdao.altaPerfil(per));
		
		for (Perfil ele: pdao.buscarTodos())
			System.out.println(ele);
		
		System.out.println(pdao.buscarPerfil(50));
		
		System.out.println(pdao.eliminarPerfil(50));
		
		System.out.println(pdao.buscarPerfil(50));
		
		for (Perfil ele: pdao.buscarTodos())
			System.out.println(ele);

	}

}
