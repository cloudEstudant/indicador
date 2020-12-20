package br.com.bb.indicador.client;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.model.bmundial.IndicadorPobreza;

@Path("/indicador/country/{country}/indicator/{indicator}")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient
public interface BancoMundialService {

	//country/{​​​​​CODIGO_DO_PAIS}​​​​​/indicator/SI.POV.DDAY?format=json
	
    @GET
    @Produces("application/json")
    List<IndicadorPobreza> getIndicador(@PathParam("country") String country, @PathParam("indicator") String indicator, @QueryParam("format") String format ) ;
}
