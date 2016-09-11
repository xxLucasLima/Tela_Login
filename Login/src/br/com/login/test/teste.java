package br.com.login.test;

import org.junit.Test;

import br.com.login.dao.CadastroDAO;
import br.com.login.domain.Cadastro;

public class teste {
		@Test
		public void autenticar(){
			CadastroDAO dao = new CadastroDAO();
			Cadastro cadastro = new Cadastro();
			
			cadastro = dao.autenticar("lucas","123");
			
			System.out.println("Usuario:" + cadastro.getUsuario());

			System.out.println("Senha:" + cadastro.getSenha());
		}
}
