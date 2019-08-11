package com.mycompany.atividade.consulta.domain.questao1;

import com.mycompany.atividade.consulta.domain.questao1.Endereco;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-11T15:33:25")
@StaticMetamodel(PessoaUm.class)
public class PessoaUm_ { 

    public static volatile SingularAttribute<PessoaUm, Integer> idade;
    public static volatile SingularAttribute<PessoaUm, LocalDate> dataNasc;
    public static volatile SingularAttribute<PessoaUm, Endereco> endereco;
    public static volatile SingularAttribute<PessoaUm, String> cpf;
    public static volatile SingularAttribute<PessoaUm, String> nome;

}