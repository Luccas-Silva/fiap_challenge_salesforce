package entities;

import services.PageSalesforce;

public class LandingPage implements PageSalesforce {
	
	private String name = "LandingPage";
	

	@Override
	public String conteudo() {
		return  "		"+name 
				+"\n    Esta será a Landing page da SalesForce, "
				+"\n    onde dedicaremos este espaço "
			    +"\n    para proporcionar uma visão resumida e "
			    +"\n    informativa de algumas de nossas outras "
			    +"\n    páginas essenciais, incluindo as de Produto,"
			    +"\n    Indústrias, Aprendizado, Suporte e Empresa."
			    +"\n    E também compartilharemos algumas informações"
			    +"\n    adicionais relevantes sobre a SalesForce.\n";
	}
	
}
