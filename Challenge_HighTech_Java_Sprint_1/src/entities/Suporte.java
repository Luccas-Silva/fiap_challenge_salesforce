package entities;

import services.PageSalesforce;

public class Suporte implements PageSalesforce {
	
	private String name = "Suporte";
	
	@Override
	public String conteudo() {
		return  "	"+name 
				+"\n    Ajuda e Documentação   >" 
				+"\n    Comunidades            >"
                +"\n    Serviços e Planos      >\n";
	}

}
