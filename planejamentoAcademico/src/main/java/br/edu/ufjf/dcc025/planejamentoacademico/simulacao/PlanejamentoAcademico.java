/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ufjf.dcc025.planejamentoacademico.simulacao;

import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Aluno;
import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Disciplina;
import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Turma;
import br.edu.ufjf.dcc025.planejamentoacademico.repositorios.RepositorioTurmasDisciplinas;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PlanejamentoAcademico {
    private static Map<String, Disciplina> disciplinasCodigo = new LinkedHashMap<>();
    private Map<String, Turma> turmasCodigo = new LinkedHashMap<>();
    private List<Aluno> alunos = new ArrayList<>();

    public static void main(String [] args){
        RepositorioTurmasDisciplinas.carregarDados();
        List<Disciplina> disciplinas = RepositorioTurmasDisciplinas.getDisciplinas();
        Aluno aluno = new Aluno("João da Silva", "202501001", 20);
        aluno.adicionarDisciplinaCursada(disciplinas.get(0), 70);
        Turma turma1 = disciplinas.get(1).getTurmas().get(0);
        Turma turma2 = disciplinas.get(2).getTurmas().get(0);
        aluno.adicionarTurmaNoPlanejamento(turma1);
        aluno.adicionarTurmaNoPlanejamento(turma2);
        Relatorio relatorio = ServicoMatricula.simulacaoMatricula(aluno);
        relatorio.imprimir();
    }

    public void carregarDados(){
        List<Disciplina> disciplinas = RepositorioTurmasDisciplinas.getDisciplinas();
        for(Disciplina d : disciplinas){
            disciplinasCodigo.put(d.getCodigo(),d);
        }
    }
    public void adicionAluno(Aluno aluno){
        alunos.add(aluno);
    }

}
