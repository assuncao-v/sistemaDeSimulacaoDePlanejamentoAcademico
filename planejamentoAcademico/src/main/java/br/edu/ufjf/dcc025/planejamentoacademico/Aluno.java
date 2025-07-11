/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufjf.dcc025.planejamentoacademico;

import java.util.*;

/**
 *
 * @author assuncao-v
 */
public class Aluno{
    public final String nome;
    public final String matricula;
    private int quantidadeHorasMaxima;


    public final Map<Disciplina,Integer> historico;
    private List<Turma> planejamentoFuturo = new ArrayList<>();
    private List<String> codigoTurmasDesejadas;

    private List<Turma> turmasAceitas;
    private Map<Turma, String> turmasRejeitadas;

    //Precisa implementar validação dos parâmetros com tratamento de exceção
    public Aluno(String nome, String matricula, int quantidadeHorasMaxima) {
        this.nome = nome;
        this.matricula = matricula;
        this.quantidadeHorasMaxima = quantidadeHorasMaxima;
        historico = new HashMap<>();
        codigoTurmasDesejadas = new ArrayList<>();
        turmasAceitas = new ArrayList<>();
        turmasRejeitadas = new LinkedHashMap<>();
    }

    public boolean foiAprovado(Disciplina d){
        int nota = historico.get(d);
        return nota >= 60;
    }

    public void adicionarDisciplinaCursada(Disciplina d,int nota){
        historico.put(d,nota);
    }
    public void adicionarTurmaNoPlanejamento(String turma){
        return;
    }

}
