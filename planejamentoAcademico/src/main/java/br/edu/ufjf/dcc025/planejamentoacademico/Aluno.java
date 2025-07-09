/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufjf.dcc025.planejamentoacademico;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author assuncao-v
 */
public class Aluno{
    public final String nome;
    public final String matricula;
    public final List<Disciplina> disciplinasCursadas;
    private Integer quantidadeHorasMaxima;
    private List<Turma> planejamentoFuturo = new ArrayList<>();
    
    //Precisa implementar validação dos parâmetros com tratamento de exceção
    public Aluno(String nome, String matricula, Integer quantidadeHorasMaxima,List<Turma> planejamento) {
        disciplinasCursadas = new ArrayList<>();
        planejamentoFuturo = planejamento;
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public void adicionarDisciplinaCursada(Disciplina disciplina){
        disciplinasCursadas.add(disciplina);
    }
    
    public Integer getQuantidadeHorasMaxima(){
        return this.quantidadeHorasMaxima;
    }
    
    public void setQuantidadeHorasMaxima(Integer quantidadeHorasMaxima){
        this.quantidadeHorasMaxima = quantidadeHorasMaxima;
    }
}
