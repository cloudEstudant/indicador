package br.com.bb.indicador.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemRelatorio {

	String descricaoPercentual;
	String pais;
	String ano;
	
}
