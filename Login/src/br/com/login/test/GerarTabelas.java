package br.com.login.test;

import org.junit.Test;

import br.com.login.util.HibernateUtil;

public class GerarTabelas {
	
	@Test
	public void gerarTabelas(){
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();
	}

}
