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

    public List<Turma> getPlanejamentoFuturo(){
        return planejamentoFuturo;
    }

    public void validarMatricula(Turma turma, Relatorio relatorio) throws MatriculaException {
        //verifica se ta cheio
        if(!turma.possuiVagas()){
            relatorio.rejeitar(turma,"Turma cheia");
            throw new TurmaCheiaException("Turma " + turma.getId() + "Esta cheia");
        }
        //verifica todos os conflitos
        for(Turma turmaAceita : relatorio.getTurmasAceitas()){
            if(turma.conflita(turmaAceita)){
                relatorio.rejeitar(turma,"Conflito de horario com " + turmaAceita.getId());
                throw new ConflitoDeHorarioException("Conflito com turma " + turmaAceita.getId());
            }
        }

        //verifica os pré requisitos
        Disciplina disciplina = turma.getDisciplina();
        for(ValidadorPreRequisito v : disciplina.getValidadoresDePreRequisito()){
            if(!v.validar(this,turma.getDisciplina())){
                relatorio.rejeitar(turma,"Pre requisito nao cumprido!");
                throw new PreRequisitoNaoCumpridoException(turma.getDisciplina());
            }
        }
        //passou por tudo

        relatorio.aceitar(turma);
    }

    public void adicionarDisciplinaCursada(Disciplina d,int nota){
        historico.put(d,nota);
    }
    public void adicionarTurmaNoPlanejamento(Turma turma){
        planejamentoFuturo.add(turma);
    }

}
