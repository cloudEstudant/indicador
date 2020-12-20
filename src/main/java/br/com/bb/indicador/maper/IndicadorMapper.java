package br.com.bb.indicador.maper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.model.bmundial.IndicadorPobreza;

import br.com.bb.indicador.api.model.ItemRelatorio;

@Mapper
public interface IndicadorMapper {
	
	IndicadorMapper INSTANCE = Mappers.getMapper(IndicadorMapper.class);
	
	@Mapping(target="descricaoPercentual", source="ind.indicator.value")
    @Mapping(target="pais", source="ind.country.value") 
	@Mapping(target="ano", source="ind.date")
	 
    public ItemRelatorio buildIndicadorEntidade(IndicadorPobreza ind);
	
}
