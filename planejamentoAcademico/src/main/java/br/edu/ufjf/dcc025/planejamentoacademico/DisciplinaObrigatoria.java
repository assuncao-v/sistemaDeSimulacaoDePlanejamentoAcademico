package br.edu.ufjf.dcc025.planejamentoacademico;

public class DisciplinaObrigatoria extends Disciplina{
    DisciplinaObrigatoria(String codigo,String nome,int cargaHorariaSemanal){
        super(codigo,nome,cargaHorariaSemanal);
    }

    @Override
    public int getNivelDeImportancia() {
        return 3;
    }
}
