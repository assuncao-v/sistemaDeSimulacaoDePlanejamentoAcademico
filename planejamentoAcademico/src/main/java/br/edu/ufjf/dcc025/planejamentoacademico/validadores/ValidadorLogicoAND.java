package br.edu.ufjf.dcc025.planejamentoacademico.validadores;

import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Aluno;
import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class ValidadorLogicoAND implements ValidadorPreRequisito {
    private List<ValidadorPreRequisito> validadores = new ArrayList<>();
    public void adicionarValidador(ValidadorPreRequisito validador){
        validadores.add(validador);
    }
    @Override
    public boolean validar(Aluno aluno, Disciplina disciplina) {
        for(ValidadorPreRequisito v : validadores){
            if(!v.validar(aluno,disciplina)) {
                return false;
            }
        }
        return true;
    }
}
