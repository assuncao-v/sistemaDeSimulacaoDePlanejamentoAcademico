package br.edu.ufjf.dcc025.planejamentoacademico.validadores;

import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Aluno;
import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Disciplina;

public class ValidadorSimples implements ValidadorPreRequisito {
    private final Disciplina disciplinaPreRequisito;
    public ValidadorSimples(Disciplina disciplina){
        this.disciplinaPreRequisito = disciplina;
    }

    @Override
    public boolean validar(Aluno aluno, Disciplina disciplina) {
        return aluno.foiAprovado(disciplinaPreRequisito);
    }
}
