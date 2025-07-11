package br.edu.ufjf.dcc025.planejamentoacademico.validadores;

import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Aluno;
import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Disciplina;

public interface ValidadorPreRequisito {
    boolean validar(Aluno aluno, Disciplina disciplina);
}
