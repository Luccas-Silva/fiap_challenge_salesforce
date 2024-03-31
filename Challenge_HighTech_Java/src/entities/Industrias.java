package entities;

import services.PageSalesforce;

public class Industrias implements PageSalesforce {
	
	private String name = "Industrias";
	
	@Override
	public String conteudo() {
		return  "	"+name
				+"\n    Automotivo                 >"
			    +"\n    Comunicações               >"
			    +"\n    Bens de Consumo            >"
			    +"\n    Educação                   >"
			    +"\n    Energia & Utilities        >"
			    +"\n    Serviços Financeiros       >"
			    +"\n    Saúde & Ciencias da Vida   >"
			    +"\n    Manufatura                 >"
			    +"\n    Midia                      >"
			    +"\n    Sem fins Lugrativos        >"
			    +"\n    Setor Publico              >"
			    +"\n    Varejo                     >"
			    +"\n    Tecnologia                 >\n";
	}
	
}
