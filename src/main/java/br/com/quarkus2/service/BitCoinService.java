package br.com.quarkus2.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.quarkus2.model.BitCoin;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/bitcoins")
@RegisterRestClient
public interface BitCoinService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<BitCoin> listar();

}
