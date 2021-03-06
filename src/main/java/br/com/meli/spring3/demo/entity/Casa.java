package br.com.meli.spring3.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

/**
 * Classe que contem os atributos da entidade
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Casa {

    private String nome;
    private Bairro bairro;
    private List<Comodo> comodos;

}
