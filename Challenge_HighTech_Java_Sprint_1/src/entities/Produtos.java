package entities;

import services.PageSalesforce;

public class Produtos implements PageSalesforce {
	
	private String name = "Produtos";
	
	@Override
	public String conteudo() {
		return  "	"+name 
				+"\n    Customer 360           >"
			    +"\n    Vendas                 >"
			    +"\n    Atendimento ao Cliente >"
			    +"\n    Marketing              >"
			    +"\n    Commerce               >"
			    +"\n    Data Cloud             >"
			    +"\n    Tableau                >"
			    +"\n    Mulesoft               >"
			    +"\n    Slack                  >"
			    +"\n    Plataforma             >"
			    +"\n    Sustentabilidade       >"
			    +"\n    Pequenas Empresas      >"
			    +"\n    Especialistas & APPs   >"
			    +"\n    Serviços & Planos      >\n";    
	}

}
