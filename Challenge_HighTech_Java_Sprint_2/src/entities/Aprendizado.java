package entities;

import services.PageSalesforce;

public class Aprendizado implements PageSalesforce {
	
	private String name = "Aprendizado";
	
	@Override
	public String conteudo() {
		return  "	"+name 
				+"\n    Aprenda no Trailhead   >" 
				+"\n    Eventos & Experiências >"
				+"\n    Histórias de Clientes  >" 
				+"\n    360 Blog               >"
				+"\n    Por Tópico             >" 
				+"\n    Por Tipo de Conteúdo   >"
				+"\n    Por Função             >" 
				+"\n    Por Indústria          >"
                +"\n    Por Tipo de Conteúdo   >\n";
	}

}
