package br.com.indicador.api;

import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.model.bmundial.IndicadorPobreza;

import br.com.bb.indicador.client.BancoMundialService;
import br.com.bb.indicador.service.IndicadorOnlineService;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;

@QuarkusTest
public class IndicadorTest {

	 
    @Inject
    IndicadorOnlineService indicadorOnlineService;

    @InjectMock
    BancoMundialService bancoMundialService;

    private List<IndicadorPobreza> listOut ;


    @Test
    public void shouldFindIndicadorSucess_200() {
        Mockito.when(bancoMundialService.getIndicador(Mockito.any(),Mockito.any(), Mockito.any())).thenReturn(listOut);

        listOut = bancoMundialService.getIndicador("BRA", "SI.POV.DDAY", "JSON");
        Assertions.assertNotNull(listOut);
    }

    public void shouldFindIndicadorFail_400() {
        Mockito.when(bancoMundialService.getIndicador(Mockito.any(),Mockito.any(), Mockito.any())).thenReturn(null);

        listOut = bancoMundialService.getIndicador("BRA", "", "JSON");
        Assertions.assertNull(listOut);
    }
   
}