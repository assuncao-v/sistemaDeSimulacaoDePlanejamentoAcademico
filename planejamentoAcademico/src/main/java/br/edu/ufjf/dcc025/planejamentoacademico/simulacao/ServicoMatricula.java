/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufjf.dcc025.planejamentoacademico.simulacao;

import br.edu.ufjf.dcc025.planejamentoacademico.excecoes.MatriculaException;
import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Aluno;
import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Turma;

/**
 *
 * @author assuncao-v
 */
public class ServicoMatricula {
    public static Relatorio simulacaoMatricula(Aluno aluno){
        Relatorio relatorio = new Relatorio();
        for(Turma turma : aluno.getPlanejamentoFuturo()){
            try{
                aluno.validarMatricula(turma,relatorio);
            }catch (MatriculaException e){
                System.err.println("Erro ao tentar se matricular em " + turma.getId() + ": " + e.getMessage());
            }
        }
        return relatorio;
    }
}
