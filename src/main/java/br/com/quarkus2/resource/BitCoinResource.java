package br.com.quarkus2.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.quarkus2.model.BitCoin;
import br.com.quarkus2.service.BitCoinService;

@Path("/bitcoins")
public class BitCoinResource {
	
	@Inject
	@RestClient
	BitCoinService bitcoinService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<BitCoin>listar(){
		
		return bitcoinService.listar();
		
	}

}
