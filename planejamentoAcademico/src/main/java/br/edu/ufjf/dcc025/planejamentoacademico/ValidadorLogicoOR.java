package br.edu.ufjf.dcc025.planejamentoacademico;

import java.util.List;

public class ValidadorLogicoOR implements ValidadorPreRequisito{
    private final List<Disciplina> preRequisitos;
    ValidadorLogicoOR(List<Disciplina> cursadas){
        preRequisitos = cursadas;
    }

    @Override
    public boolean validar(Aluno aluno, Disciplina disciplina) {
        for(Disciplina d : preRequisitos){
            if(aluno.foiAprovado(d)){
                return true;
            }
        }
        return false;
    }
}
