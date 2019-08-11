package com.mycompany.atividade.consulta.main;

import com.mycompany.atividade.consulta.domain.questao1.AlunoVO;
import com.mycompany.atividade.consulta.domain.questao1.Livro;
import com.mycompany.atividade.consulta.domain.questao1.Professor;
import com.mycompany.atividade.consulta.domain.questao2.Pessoa2;
import com.mycompany.atividade.consulta.domain.questao2.Publicacao;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class MainConsultasJPQL {

    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("Atividade-Consulta").createEntityManager();
        //new IniciadorBancoDeDados(em).dadosIniciais();
        
//        questao1A(em);
//        questao1B(em);
//        questao1C(em);
//        questao1D(em);
//        questao1E(em);
//        questao1F(em);
        
//        questao2A(em);
//        questao2B(em);
//        questao2C(em);
//        questao2D(em);
    }

    //Uma consulta que selecione todos os livros dos autores que não nasceram no dia 21/11/1982.
    private static void questao1A(EntityManager em) {
        String jpql = "SELECT DISTINCT(l) FROM Livro l, Autor a WHERE a MEMBER OF l.autores AND a.dataNasc <> :datanasc";
        TypedQuery<Livro> createQuery = em.createQuery(jpql,Livro.class);
        createQuery .setParameter("datanasc",LocalDate.of(1982, 11, 21));
        createQuery.getResultList()
            .forEach(
                l -> System.out.println(l.getTitulo())
            );
    }

    //Uma consulta que selecione todos os professores que possuem Telefone e residemna rua “Que atividade fácil”.
    private static void questao1B(EntityManager em) {
        String jpql = "SELECT p FROM Professor p WHERE p.telefones IS NOT EMPTY AND p.endereco.rua =:rua";
        TypedQuery<Professor> createQuery = em.createQuery(jpql,Professor.class);
        createQuery .setParameter("rua","Que atividade fácil");
        createQuery.getResultList()
            .forEach(
                f -> System.out.println(f.getNome())
            );
    }

    //Uma classe, AlunoVO, que representa o nome, CPF e idade do Aluno. Crie uma consulta, que retorna uma lista de todos os AlunoVO, selecionando todos os alunos que pertencem a turma de 2019.1.
    private static void questao1C(EntityManager em) {
        String jpql = "SELECT new com.mycompany.atividade.consulta.domain.questao1.AlunoVO (a.nome, a.cpf, a.idade) FROM Aluno a WHERE a.turma= :turma";
        TypedQuery<AlunoVO> createQuery = em.createQuery(jpql, AlunoVO.class);
        createQuery .setParameter("turma","2019.1");
        createQuery.getResultList().forEach(System.out::println);
    }

    //Uma consulta que seleciona todas os Professores que possuem algum telefone que termina em 8.
    private static void questao1D(EntityManager em) {
        String jpql = "SELECT p FROM Professor p, Telefone t WHERE t MEMBER OF p.telefones AND t.numero LIKE :numero";
        TypedQuery<Professor> createQuery = em.createQuery(jpql,Professor.class);
        createQuery .setParameter("numero","%8");
        createQuery.getResultList()
            .forEach(
                f -> System.out.println(f.getNome())
            );
    }

    //Uma consulta que seleciona todos os livros dos Autores da cidade de Cajazeiras e tiveram seu lançamento entre os dias 01/01/2019 e 12/12/2019.
    private static void questao1E(EntityManager em) {
        String jpql = "SELECT DISTINCT(l) FROM Livro l, IN (l.autores) a WHERE a.endereco.cidade = :cidade AND l.lancamento BETWEEN :lan1 AND :lan2";
        TypedQuery<Livro> query = em.createQuery(jpql, Livro.class);
        query .setParameter("cidade","Cajazeiras");
        query .setParameter("lan1",LocalDate.of(2019, 01, 01));
        query .setParameter("lan2",LocalDate.of(2019, 12, 12));
        List<Livro> lista = query.getResultList();
        lista.forEach(
            l -> System.out.println(l.getTitulo())
        );
    }

    //Uma consulta que selecione os Livros dos Autores que começam com a letra “J”.
    private static void questao1F(EntityManager em) {
        String jpql = "SELECT DISTINCT(l) FROM Livro l, IN (l.autores) a WHERE LOWER(a.nome) LIKE 'j%' ";
        TypedQuery<Livro> query = em.createQuery(jpql, Livro.class);
        List<Livro> lista = query.getResultList();
        lista.forEach(
            l -> System.out.println(l.getTitulo())
        );
    }
    
    //O nome do revisor, o titulo da publicacao e o nome da area em que a revisor tem o atributo id igual 3.
    private static void questao2A(EntityManager em) {
        String jpql = "SELECT p FROM Publicacao p WHERE p.revisor.id=3";
        TypedQuery<Publicacao> query = em.createQuery(jpql, Publicacao.class);
        Publicacao p = query.getSingleResult();

        System.out.println(p.getTitulo());
        System.out.println(p.getRevisor().getNome());
        System.out.println();  
        
    }

    //O titulo da publicacao e o nome do revisor que tenham alguma publicacao na area de industria
    private static void questao2B(EntityManager em) {
        String jpql = "SELECT p FROM Publicacao p, IN (p.areas) a WHERE a.nome='indústria'";
        TypedQuery<Publicacao> query = em.createQuery(jpql, Publicacao.class);
        Publicacao p = query.getSingleResult();
        System.out.println(p.getTitulo());
        System.out.println(p.getRevisor().getNome());
    }

    //O nome dos revisores que possuem alguma publicacao começando com Java
    private static void questao2C(EntityManager em) {
        String jpql = "SELECT p FROM Publicacao p WHERE LOWER(p.titulo) LIKE 'java%' ";
        TypedQuery<Publicacao> query = em.createQuery(jpql, Publicacao.class);
        List<Publicacao> lista = query.getResultList();
        lista.forEach(
            p -> System.out.println(p.getRevisor().getNome())
        );
    }

    //O nome e a quantidade de Publicacoes escritas por Escritores com mais que tres premios
    private static void questao2D(EntityManager em) {
        String jpql = "SELECT p.titulo , COUNT(p) AS quantidade FROM Publicacao p WHERE p.escritor.premios > 3 GROUP BY p.titulo ";
        List<Object[]> resultList = em.createQuery(jpql, Object[].class).getResultList();
        for (Object[] objects : resultList) {
            System.out.println(objects[0] + " " + objects[1]);
        }
    }
    
}
