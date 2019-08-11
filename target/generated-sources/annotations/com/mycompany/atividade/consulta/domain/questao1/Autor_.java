package com.mycompany.atividade.consulta.domain.questao1;

import com.mycompany.atividade.consulta.domain.questao1.Livro;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-11T15:33:25")
@StaticMetamodel(Autor.class)
public class Autor_ extends PessoaUm_ {

    public static volatile ListAttribute<Autor, Livro> livros;
    public static volatile SingularAttribute<Autor, String> instituicaoVinculada;

}