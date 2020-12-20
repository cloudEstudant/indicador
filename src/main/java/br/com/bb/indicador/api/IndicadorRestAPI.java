package br.com.bb.indicador.api;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.bb.indicador.service.IndicadorOnlineService;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Path("/indicador/country/{country}/indicator/{indicator}")
@Produces(MediaType.APPLICATION_JSON)
public class IndicadorRestAPI {

    @Inject
    private IndicadorOnlineService indicadorOnlineService;

    @GET
    public Response getIndicadores(@PathParam("country") String country, @PathParam("indicator") String indicator, @QueryParam("format") String format)  {
    	
        try {        	
        	return Response.ok(indicadorOnlineService.getIndicador(country, indicator, format)).status(200).build();
        } catch (Exception e) {
        	log.error("Erro consultando EPI externa Country {}, Indicator {}, Format{}, ERRO {}: ", country, indicator,format, e.getMessage());
            e.printStackTrace();
            throw new WebApplicationException(e.getCause(), Response.Status.BAD_REQUEST);
        }
    }
}