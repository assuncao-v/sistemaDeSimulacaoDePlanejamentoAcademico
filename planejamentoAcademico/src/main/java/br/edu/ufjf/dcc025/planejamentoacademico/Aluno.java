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
    //private Disciplina planejamentoFuturo; Não sei ainda como implementar. 
    
    //Precisa implementar validação dos parâmetros com tratamento de exceção
    public Aluno(String nome, String matricula, Integer quantidadeHorasMaxima){
        if(validarNome(nome)) this.nome = nome;
        else this.nome = "";
        if(validarMatricula(matricula)) this.matricula = matricula;
        else this.matricula = "";
        
        disciplinasCursadas = new ArrayList<>();
        
        if(validarQuantidadeHorasMaxima(quantidadeHorasMaxima)) this.quantidadeHorasMaxima = quantidadeHorasMaxima;
    }
    public boolean aprovado(Disciplina d){
        return this.disciplinasCursadas.contains(d.getCodigo());
    }
    private boolean validarNome(String nome){
        return true;
    }
    private boolean validarMatricula(String matricula){
        return true;
    }
    private boolean validarQuantidadeHorasMaxima(Integer validadorQuantidadeHorasMaxima){
        return true;
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
