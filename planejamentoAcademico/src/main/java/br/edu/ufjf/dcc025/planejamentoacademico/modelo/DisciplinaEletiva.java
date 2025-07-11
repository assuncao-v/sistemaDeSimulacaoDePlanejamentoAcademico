package br.edu.ufjf.dcc025.planejamentoacademico.modelo;

public class DisciplinaEletiva extends Disciplina {
    public DisciplinaEletiva(String codigo,String nome,int cargaHorariaSemanal){
        super(codigo,nome,cargaHorariaSemanal);
    }

    @Override
    public int getNivelDeImportancia() {
        return 2;
    }
}
