package com.mycompany.atividade.consulta.main;

import com.mycompany.atividade.consulta.domain.questao2.Pessoa2;
import com.mycompany.atividade.consulta.domain.questao2.Publicacao;
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

    private static void questao1A(EntityManager em) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void questao1B(EntityManager em) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void questao1C(EntityManager em) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void questao1D(EntityManager em) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void questao1E(EntityManager em) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void questao1F(EntityManager em) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        String jpql = "SELECT p.titulo , COUNT(p) AS quantidade FROM Publicacao p WHERE p.escritor.premios > 3 GROUP BY p.titulo , quantidade ";
        List<Object[]> resultList = em.createQuery(jpql, Object[].class).getResultList();
        for (Object[] objects : resultList) {
            System.out.println(objects[0] + " " + objects[1]);
        }
    }
    
}
