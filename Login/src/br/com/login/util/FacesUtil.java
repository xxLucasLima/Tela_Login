package br.com.login.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


public class FacesUtil {
	public static void adicionarMsgInfo (String msg){
		FacesMessage f = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null, f);
		
	}
	public static void adicionarMsgErro (String msg){
		FacesMessage f = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null, f);
		
	}
	

}
