package com.mycompany.atividade.consulta.domain.questao2;

import com.mycompany.atividade.consulta.domain.questao2.Publicacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-04T10:11:44")
@StaticMetamodel(Escritor.class)
public class Escritor_ extends Pessoa2_ {

    public static volatile CollectionAttribute<Escritor, Publicacao> publicacoes;
    public static volatile SingularAttribute<Escritor, Integer> premios;

}