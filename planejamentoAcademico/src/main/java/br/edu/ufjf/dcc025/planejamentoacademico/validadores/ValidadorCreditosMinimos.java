package br.edu.ufjf.dcc025.planejamentoacademico.validadores;

import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Aluno;
import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Disciplina;

public class ValidadorCreditosMinimos implements ValidadorPreRequisito {
    private final int creditosMinimos;
    public ValidadorCreditosMinimos(int creditosMinimos){
        this.creditosMinimos = creditosMinimos;
    }

    @Override
    public boolean validar(Aluno aluno, Disciplina disciplina) {
        return true; 
    }
}
