package com.mycompany.atividade.consulta.domain.questao2;

import com.mycompany.atividade.consulta.domain.questao2.Area;
import com.mycompany.atividade.consulta.domain.questao2.Escritor;
import com.mycompany.atividade.consulta.domain.questao2.Revisor;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-04T10:11:44")
@StaticMetamodel(Publicacao.class)
public class Publicacao_ { 

    public static volatile SingularAttribute<Publicacao, Revisor> revisor;
    public static volatile SingularAttribute<Publicacao, Escritor> escritor;
    public static volatile SingularAttribute<Publicacao, Integer> codPublicacao;
    public static volatile SingularAttribute<Publicacao, String> titulo;
    public static volatile CollectionAttribute<Publicacao, Area> areas;

}