package br.edu.ufjf.dcc025.planejamentoacademico.excecoes;

import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Disciplina;

public class PreRequisitoNaoCumpridoException extends MatriculaException{
    public PreRequisitoNaoCumpridoException(Disciplina d){
        super("Pre requisito nao cumprido da disciplina: " + d.getCodigo());
    }
}
