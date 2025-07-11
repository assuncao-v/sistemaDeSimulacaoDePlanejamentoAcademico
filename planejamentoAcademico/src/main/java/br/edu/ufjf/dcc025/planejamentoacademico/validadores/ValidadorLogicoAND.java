package br.edu.ufjf.dcc025.planejamentoacademico.validadores;

import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Aluno;
import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Disciplina;

import java.util.List;

public class ValidadorLogicoAND implements ValidadorPreRequisito {
    private final List<Disciplina> preRequisitos;
    public ValidadorLogicoAND(List<Disciplina> requisitos){
        this.preRequisitos = requisitos;
    }

    @Override
    public boolean validar(Aluno aluno, Disciplina disciplina) {
        for(Disciplina d : preRequisitos){
            if(!aluno.foiAprovado(d)) {
                return false;
            }
        }
        return true;
    }
}
