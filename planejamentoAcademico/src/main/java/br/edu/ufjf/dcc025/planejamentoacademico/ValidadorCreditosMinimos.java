package br.edu.ufjf.dcc025.planejamentoacademico;

public class ValidadorCreditosMinimos implements ValidadorPreRequisito{
    private final int creditosMinimos;
    public ValidadorCreditosMinimos(int creditosMinimos){
        this.creditosMinimos = creditosMinimos;
    }

    @Override
    public boolean validar(Aluno aluno, Disciplina disciplina) {
        return true; 
    }
}
