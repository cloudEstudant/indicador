package br.com.bb.indicador.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.model.bmundial.IndicadorPobreza;

import br.com.bb.indicador.api.model.ItemRelatorio;
import br.com.bb.indicador.client.BancoMundialService;
import br.com.bb.indicador.maper.IndicadorMapper;

@ApplicationScoped
public class IndicadorOnlineService {

	@Inject
    @RestClient
    BancoMundialService bancoMundialService;
	
	//@Inject 
	//IndicadorMapper INSTANCE_MAPPER;

    public List<ItemRelatorio>  getIndicador (String country, String indicator,  String format) throws Exception {
      
    	List<IndicadorPobreza> listIn = bancoMundialService.getIndicador(country, indicator, format);       
    	List<ItemRelatorio> listOut = new ArrayList<ItemRelatorio>();    	
    	listIn.forEach(indicador -> {            
    		//listOut.add(INSTANCE_MAPPER.buildIndicadorEntidade(indicador));    		
    		listOut.add(buildItem(indicador));
        });
           	
        return listOut; 
    }

    private ItemRelatorio buildItem(IndicadorPobreza indicePrz) {
    	ItemRelatorio item = ItemRelatorio.builder()
                .descricaoPercentual(indicePrz.getIndicator().getValue())
                .pais(indicePrz.getCountry().getValue())
	    .ano(indicePrz.getDate()).build();
    	return item;    	
    }
    
}
