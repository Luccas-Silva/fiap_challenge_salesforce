package entities;

import services.PageSalesforce;

public class Empresa implements PageSalesforce {

	private String name = "Empresa";
		
	@Override
	public String conteudo() {
		return  "	"+name
				+"\n    Sobre a Salesforce     >" 
				+"\n    Nossos Valores         >"
				+"\n    Nosso Impacto          >" 
				+"\n    Carreiras              >"
                +"\n    Marcas da SalesForce   >\n";
	}

}
