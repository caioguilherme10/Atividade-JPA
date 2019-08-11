package com.mycompany.atividade.consulta.domain.questao1;

import com.mycompany.atividade.consulta.domain.questao1.Telefone;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-11T15:33:25")
@StaticMetamodel(Professor.class)
public class Professor_ extends PessoaUm_ {

    public static volatile SingularAttribute<Professor, Float> salario;
    public static volatile ListAttribute<Professor, Telefone> telefones;

}