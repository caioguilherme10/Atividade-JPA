package com.mycompany.atividade.consulta.domain.questao1;

import com.mycompany.atividade.consulta.conversor.ConversorLocalDate;
import javax.persistence.Convert;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Aluno extends PessoaUm {

    private String matricula;
    @Convert(converter = ConversorLocalDate.class)
    private LocalDate dataIngresso;
    private String turma;
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, String cpf, Integer idade, Endereco endereco, LocalDate dataNasc, String matricula,
			LocalDate dataIngresso, String turma) {
		super(nome, cpf, idade, endereco, dataNasc);
		this.matricula = matricula;
		this.dataIngresso = dataIngresso;
		this.turma = turma;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public LocalDate getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(LocalDate dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", dataIngresso=" + dataIngresso + ", turma=" + turma + '}';
    }
	
    
}
