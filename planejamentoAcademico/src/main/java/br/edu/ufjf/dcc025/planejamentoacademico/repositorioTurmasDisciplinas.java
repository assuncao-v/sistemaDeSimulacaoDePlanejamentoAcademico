package br.edu.ufjf.dcc025.planejamentoacademico;

import java.util.ArrayList;
import java.util.List;

public class repositorioTurmasDisciplinas {
    public static List<Disciplina> carregarDisciplinas(){
        List<Disciplina> disciplinasObrigatorias = new ArrayList<>();
        Disciplina calc1 = new DisciplinaObrigatoria("MAT154","Calculo 1",4);
        Disciplina alg = new DisciplinaObrigatoria("DCC199","Algoritmos",4);
        Disciplina algPratica = new DisciplinaObrigatoria("DCC199X","Algoritmos pratica",2);
        Disciplina quimFundamental = new DisciplinaObrigatoria("QUI165","Quimica fundamental",4);
        Disciplina ga = new DisciplinaObrigatoria("MAT155","Geometria analitica e sistemas lineres",4);
        Disciplina labIntFis = new DisciplinaObrigatoria("FIS122","Laboratorio de introducao as ciencias fisicas",2);
        Disciplina intCiencias = new DisciplinaObrigatoria("ICE001","Introducao a ciencias exatas",2);
        disciplinasObrigatorias.add(calc1);
        disciplinasObrigatorias.add(alg);
        disciplinasObrigatorias.add(algPratica);
        disciplinasObrigatorias.add(quimFundamental);
        disciplinasObrigatorias.add(ga);
        disciplinasObrigatorias.add(labIntFis);
        disciplinasObrigatorias.add(intCiencias);
        return disciplinasObrigatorias;
    }
}
