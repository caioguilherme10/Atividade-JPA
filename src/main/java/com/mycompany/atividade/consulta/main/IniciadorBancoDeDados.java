package com.mycompany.atividade.consulta.main;

import com.mycompany.atividade.consulta.domain.questao1.Aluno;
import com.mycompany.atividade.consulta.domain.questao1.Autor;
import com.mycompany.atividade.consulta.domain.questao1.Endereco;
import com.mycompany.atividade.consulta.domain.questao1.Livro;
import com.mycompany.atividade.consulta.domain.questao1.Professor;
import com.mycompany.atividade.consulta.domain.questao1.Telefone;
import com.mycompany.atividade.consulta.domain.questao1.TelefoneType;
import com.mycompany.atividade.consulta.domain.questao2.Area;
import com.mycompany.atividade.consulta.domain.questao2.Escritor;
import com.mycompany.atividade.consulta.domain.questao2.Publicacao;
import com.mycompany.atividade.consulta.domain.questao2.Revisor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;

public class IniciadorBancoDeDados {
    
    private final EntityManager em;

    public IniciadorBancoDeDados(EntityManager em) {
        this.em = em;
    }
    
    public void dadosIniciais() {
        
        Aluno aluno1 = new Aluno("João", "12345", 22, new Endereco("Rua1", "Bairro1", "Cidade1", "12345-121"), LocalDate.of(1997, 1, 10), "199712001012", LocalDate.of(1997, 1, 10), "2019.1");
	Aluno aluno2 = new Aluno("Maria", "12346", 22, new Endereco("Rua2", "Bairro2", "Cidade2", "12345-122"), LocalDate.of(1997, 1, 10), "199712001013", LocalDate.of(1997, 1, 10), "2019.1");
	Aluno aluno3 = new Aluno("Zé", "12347", 22, new Endereco("Rua3", "Bairro3", "Cidade3", "12345-123"), LocalDate.of(1997, 1, 10), "199712001014", LocalDate.of(1997, 1, 10), "ADS");
	Aluno aluno4 = new Aluno("Juzé", "12348", 22, new Endereco("Rua4", "Bairro4", "Cidade4", "12345-124"), LocalDate.of(1997, 1, 10), "199712001015", LocalDate.of(1997, 1, 10), "ADS");
	Aluno aluno5 = new Aluno("Juão", "12349", 22, new Endereco("Rua5", "Bairro5", "Cidade5", "12345-125"), LocalDate.of(1997, 1, 10), "199712001016", LocalDate.of(1997, 1, 10), "ADS");
	
	Livro livro1 = new Livro("Un livru legual", "19741", LocalDate.of(1997, 1, 13));
	Livro livro2 = new Livro("Mangá em portugues", "19742", LocalDate.of(1997, 1, 11));
	Livro livro3 = new Livro("Ágnam em japonês", "19743", LocalDate.of(1997, 1, 1));
	Livro livro4 = new Livro(":)", "19744", LocalDate.of(1997, 1, 1));
	Livro livro5 = new Livro(":(", "19745", LocalDate.of(1997, 1, 6));
	
	List<Livro> livros1 = new ArrayList<>();
	List<Livro> livros2 = new ArrayList<>();
	
	livros1.addAll(Arrays.asList(livro2, livro3));
	livros2.addAll(Arrays.asList(livro4, livro5));
	
	Autor autor1 = new Autor("José das Couves Pinto", "12315", 22, new Endereco("Rua1", "Bairro1", "Cidade1", "12345-121"), LocalDate.of(1997, 1, 10), "SeiLá");
	Autor autor2 = new Autor("Francisco Tripa", "12325", 22, new Endereco("Rua1", "Bairro1", "Cidade1", "12345-121"), LocalDate.of(1997, 1, 10), "ComoAssim?");
	Autor autor3 = new Autor("Jose Esoj", "12335", 22, new Endereco("Rua1", "Bairro1", "Cidade1", "12345-121"), LocalDate.of(1997, 1, 10), "SeiLá");
	Autor autor4 = new Autor("Maria Airam", "12355", 22, new Endereco("Rua1", "Bairro1", "Cidade1", "12345-121"), LocalDate.of(1982, 11, 21), "ComoAssim?");
	Autor autor5 = new Autor("João Oãoj", "12365", 22, new Endereco("Rua1", "Bairro1", "Cidade1", "12345-121"), LocalDate.of(1997, 1, 10), "Sei Lá... 3?");
	
	autor3.setLivros(livros1);
	autor4.setLivros(livros1);
	autor5.setLivros(livros1);	
	autor1.setLivros(livros2);
	autor2.setLivro(livro1);

	List<Autor> autores1 = new ArrayList<>();
	
	autores1.addAll(Arrays.asList(autor3, autor4, autor5));
	
	livro2.setAutores(autores1);
	livro3.setAutores(autores1);
	
	livro4.setAutor(autor1);
	livro5.setAutor(autor1);
	
	livro1.setAutor(autor2);
	
		
	List<Telefone> telefones1 = new ArrayList<>();
        telefones1.add(new Telefone("(83) 99951-5113", TelefoneType.RESIDENCIAL));
        telefones1.add(new Telefone("(83) 99951-5113", TelefoneType.COMERCIAL));
	List<Telefone> telefones2 = new ArrayList<>();
        telefones2.add(new Telefone("(83) 99951-5113", TelefoneType.RESIDENCIAL));
        telefones2.add(new Telefone("(83) 99951-5113", TelefoneType.COMERCIAL));
        List<Telefone> telefones3 = new ArrayList<>();
        telefones3.add(new Telefone("(83) 99951-5113", TelefoneType.RESIDENCIAL));
        telefones3.add(new Telefone("(83) 99951-5113", TelefoneType.COMERCIAL));
	List<Telefone> telefones4 = new ArrayList<>();
        telefones4.add(new Telefone("(83) 99951-5113", TelefoneType.RESIDENCIAL));
        telefones4.add(new Telefone("(83) 99951-5113", TelefoneType.COMERCIAL));
		
        Professor professor1 = new Professor("Semnome", "23456", 22, new Endereco("Que atividade fácil", "Bairro", "Nárnia", "12345-123"), LocalDate.of(1997, 1, 29), 6000f, telefones1);
        Professor professor2 = new Professor("Testerson", "23457", 22, new Endereco("Que atividade fácil", "Bairro", "Nárnia", "12345-123"), LocalDate.of(1997, 1, 29), 3000f, telefones2);
	Professor professor3 = new Professor("Agadoisó", "23458", 22, new Endereco("Que atividade fácil", "Bairro", "Nárnia", "12345-123"), LocalDate.of(1997, 1, 29), 12000f, telefones3);
	Professor professor4 = new Professor("Janeiro de Noventaesete", "23459", 22, new Endereco("Que atividade fácil", "Bairro", "Nárnia", "12345-123"), LocalDate.of(1997, 1, 29), 10000f, telefones4);
	Professor professor5 = new Professor("Comnome", "23450", 22, new Endereco("Que atividade fácil", "Bairro", "Nárnia", "12345-123"), LocalDate.of(1997, 1, 29), 5000f);
		
		
        
        List<Publicacao> publicacoes = new ArrayList<>();
        List<Area> area = new ArrayList<>();
        Publicacao publicacao = new Publicacao();
        
        Escritor escritor1 = new Escritor(5,publicacoes,1,"Jose",LocalDate.of(1997, 1, 1));
        Escritor escritor2 = new Escritor(1,publicacoes,3,"Ana",LocalDate.of(1998, 1, 1));
        Escritor escritor3 = new Escritor(2,publicacoes,5,"Carlos",LocalDate.of(1999, 1, 1));
        Escritor escritor4 = new Escritor(7,publicacoes,7,"Caio",LocalDate.of(1994, 1, 1));
        Escritor escritor5 = new Escritor(2,publicacoes,9,"Maria",LocalDate.of(1995, 5, 1));
        
        Revisor revisor1 = new Revisor("7.7",publicacoes,2,"Joao",LocalDate.of(1996, 5, 6));
        Revisor revisor2 = new Revisor("3.7",publicacoes,4,"Carla",LocalDate.of(1997, 5, 6));
        Revisor revisor3 = new Revisor("5.7",publicacoes,6,"Vitoria",LocalDate.of(1998, 5, 6));
        Revisor revisor4 = new Revisor("6.7",publicacoes,8,"Pedro",LocalDate.of(1999, 5, 6));
        Revisor revisor5 = new Revisor("9.7",publicacoes,10,"Katarina",LocalDate.of(1991, 5, 6));
        
        Area area1 = new Area(1,"indústria",publicacao);
        Area area2 = new Area(2,"TI",publicacao);
        Area area3 = new Area(3,"Agronegocio",publicacao);
        Area area4 = new Area(4,"Financias",publicacao);
        Area area5 = new Area(5,"Ciencias",publicacao);
        
        Publicacao publicacao1 = new Publicacao(1,"Sondagem Industrial",area,revisor1,escritor1);
        Publicacao publicacao2 = new Publicacao(2,"Java beans",area,revisor2,escritor2);
        Publicacao publicacao3 = new Publicacao(3,"O agronegócio da soja nos contextos mundial e brasileiro",area,revisor3,escritor3);
        Publicacao publicacao4 = new Publicacao(4,"A sub-reação a recompras de ações no mercado aberto",area,revisor4,escritor4);
        Publicacao publicacao5 = new Publicacao(5,"Projeto de Ciência para o Brasil",area,revisor5,escritor5);
        
        publicacoes.add(publicacao1);
        escritor1.setPublicacoes(publicacoes);
        publicacoes.remove(publicacao1);
        
        publicacoes.add(publicacao2);
        escritor2.setPublicacoes(publicacoes);
        publicacoes.remove(publicacao2);
        
        publicacoes.add(publicacao3);
        escritor3.setPublicacoes(publicacoes);
        publicacoes.remove(publicacao3);
        
        publicacoes.add(publicacao4);
        escritor4.setPublicacoes(publicacoes);
        publicacoes.remove(publicacao4);
        
        publicacoes.add(publicacao5);
        escritor5.setPublicacoes(publicacoes);
        publicacoes.remove(publicacao5);
        
        
        publicacoes.add(publicacao1);
        revisor1.setPublicacoes(publicacoes);
        publicacoes.remove(publicacao1);
        
        publicacoes.add(publicacao2);
        revisor2.setPublicacoes(publicacoes);
        publicacoes.remove(publicacao2);
        
        publicacoes.add(publicacao3);
        revisor3.setPublicacoes(publicacoes);
        publicacoes.remove(publicacao3);
        
        publicacoes.add(publicacao4);
        revisor4.setPublicacoes(publicacoes);
        publicacoes.remove(publicacao4);
        
        publicacoes.add(publicacao5);
        revisor5.setPublicacoes(publicacoes);
        publicacoes.remove(publicacao5);
        
        area1.setPublicacao(publicacao1);
        area2.setPublicacao(publicacao2);
        area3.setPublicacao(publicacao3);
        area4.setPublicacao(publicacao4);
        area5.setPublicacao(publicacao5);
        
        area.add(area1);
        publicacao1.setAreas(area);
        area.remove(area1);
        
        area.add(area2);
        publicacao2.setAreas(area);
        area.remove(area2);
        
        area.add(area3);
        publicacao3.setAreas(area);
        area.remove(area3);
        
        area.add(area4);
        publicacao4.setAreas(area);
        area.remove(area4);
        
        area.add(area5);
        publicacao5.setAreas(area);
        area.remove(area5);
        
        em.getTransaction().begin();
        
        em.persist(aluno1);
	em.persist(aluno2);
	em.persist(aluno3);
	em.persist(aluno4);
	em.persist(aluno5);
	
	em.persist(livro1);
	em.persist(livro2);
	em.persist(livro3);
	em.persist(livro4);
	em.persist(livro5);
		
	em.persist(autor1);
	em.persist(autor2);
	em.persist(autor3);
	em.persist(autor4);
	em.persist(autor5);
		
	em.persist(professor1);
	em.persist(professor2);
	em.persist(professor3);
	em.persist(professor4);
	em.persist(professor5);
        
        em.persist(revisor1);
        em.persist(revisor2);
        em.persist(revisor3);
        em.persist(revisor4);
        em.persist(revisor5);
        
        em.persist(escritor1);
        em.persist(escritor2);
        em.persist(escritor3);
        em.persist(escritor4);
        em.persist(escritor5);
        
        em.persist(area1);
        em.persist(area2);
        em.persist(area3);
        em.persist(area4);
        em.persist(area5);
        
        em.persist(publicacao1);
        em.persist(publicacao2);
        em.persist(publicacao3);
        em.persist(publicacao4);
        em.persist(publicacao5);
        em.getTransaction().commit();
    }
}
