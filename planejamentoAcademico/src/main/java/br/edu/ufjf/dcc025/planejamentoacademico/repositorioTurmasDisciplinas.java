package br.edu.ufjf.dcc025.planejamentoacademico;

import java.util.ArrayList;
import java.util.List;

public class repositorioTurmasDisciplinas {
    public static List<Disciplina> carregarDisciplinas(){
        List<Disciplina> disciplinasObrigatorias = new ArrayList<>();
        Disciplina calc1 = new DisciplinaObrigatoria("MAT154","Calculo 1",4);
        Disciplina alg = new DisciplinaObrigatoria("DCC199","Algoritmos",4);
        Disciplina algPratica = new DisciplinaObrigatoria("DCC5199","Algoritmos pratica",2);
        Disciplina quimFundamental = new DisciplinaObrigatoria("QUI165","Quimica fundamental",4);
        Disciplina ga = new DisciplinaObrigatoria("MAT155","Geometria analitica e sistemas lineres",4);
        Disciplina labIntFis = new DisciplinaObrigatoria("FIS122","Laboratorio de introducao as ciencias fisicas",2);
        Disciplina intCiencias = new DisciplinaObrigatoria("ICE001","Introducao a ciencias exatas",2);
        Disciplina labQuim = new DisciplinaObrigatoria("QUI126","Laboratorio de quimica",2);
        Disciplina calc2 = new DisciplinaObrigatoria("MAT156","Calculo 2",4);
        Disciplina alg2 = new DisciplinaObrigatoria("DCCXX1","Algoritmos 2",4);
        Disciplina alg2Pratica = new DisciplinaObrigatoria("DCC5X1","Algoritmos pratica",2);
        Disciplina fis1 = new DisciplinaObrigatoria("FIS073","Fisica 1",4);
        Disciplina intEst = new DisciplinaObrigatoria("EST028","Introducao a estatistica",4);
        Disciplina labFis1 = new DisciplinaObrigatoria("FIS073","Laboratorio de fisica 1",2);
        Disciplina labTrans = new DisciplinaObrigatoria("QUI168","Laboratorio de transformacoes quimicas",2);
        Disciplina intEng = new DisciplinaObrigatoria("MAC011","Introducao a engenharia computacional",2);

        //1 Semestre
        disciplinasObrigatorias.add(calc1);
        disciplinasObrigatorias.add(alg);
        disciplinasObrigatorias.add(algPratica);
        disciplinasObrigatorias.add(quimFundamental);
        disciplinasObrigatorias.add(ga);
        disciplinasObrigatorias.add(labIntFis);
        disciplinasObrigatorias.add(intCiencias);
        //2 Semestre
        disciplinasObrigatorias.add(calc2);
        disciplinasObrigatorias.add(alg2);
        disciplinasObrigatorias.add(alg2Pratica);
        disciplinasObrigatorias.add(fis1);
        disciplinasObrigatorias.add(intEst);
        disciplinasObrigatorias.add(labFis1);
        disciplinasObrigatorias.add(labTrans);
        disciplinasObrigatorias.add(intEng);
        return disciplinasObrigatorias;
    }
}
