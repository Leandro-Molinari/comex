package br.com.comex.ws;

import javax.xml.ws.Endpoint;

public class PublicaWebService {

	public static void main(String[] args) {

		ComexWS1 service = new ComexWS1();
		String url = "http://localhost:8080/comexws";
		
		System.out.println("Executando conexão: " + url);
		
		Endpoint.publish(url, service);
		
	}

}
