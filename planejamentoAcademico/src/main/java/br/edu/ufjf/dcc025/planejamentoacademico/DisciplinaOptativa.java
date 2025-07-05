package br.edu.ufjf.dcc025.planejamentoacademico;

public class DisciplinaOptativa extends Disciplina{
    public DisciplinaOptativa(String codigo, String nome, int cargaHorariaSemanal){
        super(codigo,nome,cargaHorariaSemanal);
    }

    @Override
    public int getNivelDeImportancia() {
        return 1;
    }
}
