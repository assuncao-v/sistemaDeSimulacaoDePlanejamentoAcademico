package br.edu.ufjf.dcc025.planejamentoacademico;

public class ValidadorSimples implements ValidadorPreRequisito{
    private final Disciplina disciplinaPreRequisito;
    public ValidadorSimples(Disciplina disciplina){
        this.disciplinaPreRequisito = disciplina;
    }

    @Override
    public boolean validar(Aluno aluno, Disciplina disciplina) {
        return aluno.foiAprovado(disciplinaPreRequisito);
    }
}
