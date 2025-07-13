/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufjf.dcc025.planejamentoacademico.modelo;

import br.edu.ufjf.dcc025.planejamentoacademico.excecoes.ConflitoDeHorarioException;
import br.edu.ufjf.dcc025.planejamentoacademico.excecoes.MatriculaException;
import br.edu.ufjf.dcc025.planejamentoacademico.excecoes.PreRequisitoNaoCumpridoException;
import br.edu.ufjf.dcc025.planejamentoacademico.excecoes.TurmaCheiaException;
import br.edu.ufjf.dcc025.planejamentoacademico.simulacao.Relatorio;
import br.edu.ufjf.dcc025.planejamentoacademico.validadores.ValidadorPreRequisito;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author assuncao-v
 */
public class Turma {
    private final String id;
    private final Disciplina disciplina;
    private final List<Horario> horarios;
    private final int capacidadeMaxima;
    private final Set<Aluno> alunosMatriculados;

    public Turma(String id,Disciplina disciplina,int capacidadeMaxima,List<Horario> horarios){
        this.id = id;
        this.disciplina = disciplina;
        this.capacidadeMaxima = capacidadeMaxima;
        this.horarios = horarios;
        alunosMatriculados = new HashSet<>();
    }
    public String getId(){
        return id;
    }
    public Disciplina getDisciplina(){
        return disciplina;
    }
    public int getCapacidadeMaxima(){
        return capacidadeMaxima;
    }
    public List<Horario> getHorario(){
        return horarios;
    }
    public int getVagasRestantes(){
        return capacidadeMaxima - alunosMatriculados.size();
    }
    public boolean possuiVagas(){
        return alunosMatriculados.size() < capacidadeMaxima;
    }
    public void matricularAluno(Aluno aluno){
        if(!possuiVagas()){
            throw new RuntimeException("Turma cheia!");
        }
        alunosMatriculados.add(aluno);
    }
    public boolean alunoMatriculado(Aluno aluno){
        return alunosMatriculados.contains(aluno);
    }
    public Set getAlunosMatriculados(){
        return new HashSet<>(alunosMatriculados);
    }
    public boolean conflita(Turma turma){
        for(Horario h1 : this.horarios){
            for(Horario h2 : turma.horarios){
                if(h1.existeConflito(h2)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return disciplina.getCodigo() + " - Turma " + id + "(" + horarios + ")";
    }
}
