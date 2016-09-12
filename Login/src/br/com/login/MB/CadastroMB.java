package br.com.login.MB;


import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import br.com.login.dao.CadastroDAO;
import br.com.login.domain.Cadastro;
import br.com.login.util.FacesUtil;

@ManagedBean
@ViewScoped
public class CadastroMB {
	
	private Cadastro cadastro;
	
	public Cadastro getCadastro() {
		if (cadastro == null){
			cadastro = new Cadastro();
			
		}
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public void entrar(){
		try{
			CadastroDAO dao = new CadastroDAO();
			cadastro = dao.autenticar(cadastro.getUsuario(), cadastro.getSenha());
			
				if(cadastro == null){
					FacesUtil.adicionarMsgErro("Usuário ou senha incorreto");
				}else{
				FacesUtil.adicionarMsgInfo("Autenticado com sucesso");
			}

		}catch(RuntimeException e){
			FacesUtil.adicionarMsgErro("Erro oo entrar no sistema" + e.getMessage());
			
		}
	}

}
