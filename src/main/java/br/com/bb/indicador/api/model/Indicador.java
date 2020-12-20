package br.com.bb.indicador.api.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Indicador {
 List<ItemRelatorio> relatorio;
}
