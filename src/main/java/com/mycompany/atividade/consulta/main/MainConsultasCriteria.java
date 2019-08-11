package com.mycompany.atividade.consulta.main;

import com.mycompany.atividade.consulta.domain.questao1.Aluno;
import com.mycompany.atividade.consulta.domain.questao1.AlunoVO;
import com.mycompany.atividade.consulta.domain.questao1.Professor;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class MainConsultasCriteria {
    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("Atividade-Consulta").createEntityManager();
        //new IniciadorBancoDeDados(em).dadosIniciais();
        
//        questao1A(em);
//        questao1B(em);
//        questao1C(em);
//        questao1D(em);
//        questao1E(em);
//        questao1F(em);
//        
//        questao2A(em);
//        questao2B(em);
//        questao2C(em);
//        questao2D(em);
    }

    //Uma consulta que selecione todos os livros dos autores que não nasceram no dia 21/11/1982.
    private static void questao1A(EntityManager em) {
        
    }

    //Uma consulta que selecione todos os professores que possuem Telefone e residemna rua “Que atividade fácil”.
    private static void questao1B(EntityManager em) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Professor> criteria = builder.createQuery(Professor.class);
        Root<Professor> root = criteria.from(Professor.class);
        
        Predicate notEmpty = builder.isNotEmpty(
            root.get("telefones")
        );
        
        Predicate rua = builder.equal(
                root.get("endereco").get("rua"), 
                builder.parameter(String.class,"rua")
        );

        Predicate and = builder.and(
            notEmpty,rua
        );
        
        criteria.where(and);
        TypedQuery<Professor> createQuery = em.createQuery(criteria);
        createQuery.setParameter("rua","Que atividade fácil");
        createQuery.getResultList()
            .forEach(
                f -> System.out.println(f.getNome())
            );
    }

    //Uma classe, AlunoVO, que representa o nome, CPF e idade do Aluno. Crie uma consulta, que retorna uma lista de todos os AlunoVO, selecionando todos os alunos que pertencem a turma de 2019.1.
    private static void questao1C(EntityManager em) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<AlunoVO> criteria = builder.createQuery(AlunoVO.class);
        Root<Aluno> root = criteria.from(Aluno.class);
        
        Predicate turma = builder.equal(
                root.get("turma"), 
                builder.parameter(String.class,"turma")
        );
           
        
        criteria.select(
            builder.construct(
                AlunoVO.class,
                root.get("nome"),
                root.get("cpf"),
                root.get("idade")
            )
        ).where(turma);
        
        TypedQuery<AlunoVO> query = em.createQuery(criteria);
        query.setParameter("turma","2019.1");
        query.getResultList().forEach(System.out::println);
    }
    
    //Uma consulta que seleciona todas os Professores que possuem algum telefone que termina em 8.
    private static void questao1D(EntityManager em) {
        
    }

    //Uma consulta que seleciona todos os livros dos Autores da cidade de Cajazeiras e tiveram seu lançamento entre os dias 01/01/2019 e 12/12/2019.
    private static void questao1E(EntityManager em) {
        
    }

    //Uma consulta que selecione os Livros dos Autores que começam com a letra “J”.
    private static void questao1F(EntityManager em) {
       
    }

    //O nome do revisor, o titulo da publicacao e o nome da area em que a revisor tem o atributo id igual 3.
    private static void questao2A(EntityManager em) {
        
    }

    //O titulo da publicacao e o nome do revisor que tenham alguma publicacao na area de industria
    private static void questao2B(EntityManager em) {
       
    }

    //O nome dos revisores que possuem alguma publicacao começando com Java
    private static void questao2C(EntityManager em) {
        
    }

    //O nome e a quantidade de Publicacoes escritas por Escritores com mais que tres premios
    private static void questao2D(EntityManager em) {
       
    }
}
