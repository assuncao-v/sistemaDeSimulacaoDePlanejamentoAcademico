/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ufjf.dcc025.planejamentoacademico;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author assuncao-v
 */
public class PlanejamentoAcademico {
    private Map<String,Disciplina> disciplinasCodigo = new LinkedHashMap<>();
    private Map<String,Turma> turmasCodigo = new LinkedHashMap<>();
    private List<Aluno> alunos = new ArrayList<>();

    PlanejamentoAcademico(){
        carregarDados();
    }

    public void carregarDados(){
        List<Disciplina> disciplinas = repositorioTurmasDisciplinas.carregarDisciplinas();
        for(Disciplina d : disciplinas){
            disciplinasCodigo.put(d.getCodigo(),d);
        }
    }
    public void adicionAluno(Aluno aluno){
        alunos.add(aluno);
    }

}
