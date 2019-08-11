package com.mycompany.atividade.consulta.domain.questao1;

import com.mycompany.atividade.consulta.domain.questao1.Autor;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-11T15:33:25")
@StaticMetamodel(Livro.class)
public class Livro_ { 

    public static volatile SingularAttribute<Livro, LocalDate> lancamento;
    public static volatile SingularAttribute<Livro, String> ISBN;
    public static volatile SingularAttribute<Livro, String> titulo;
    public static volatile ListAttribute<Livro, Autor> autores;

}