package br.com.login.dao;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.login.domain.Cadastro;
import br.com.login.util.FacesUtil;
import br.com.login.util.HibernateUtil;


public class CadastroDAO {
	
	
	public Cadastro autenticar(String usuario, String senha){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Cadastro cadastro = null;
		try{
			Query consulta = sessao.getNamedQuery("Cadastro.autenticar");
			consulta.setString("usuario", usuario);
			consulta.setString("senha", senha);
			
			cadastro = (Cadastro)consulta.uniqueResult();
			
		}catch(RuntimeException e){
			
		}finally{
			sessao.close();
		}
		return cadastro;
		
	}
	
}
