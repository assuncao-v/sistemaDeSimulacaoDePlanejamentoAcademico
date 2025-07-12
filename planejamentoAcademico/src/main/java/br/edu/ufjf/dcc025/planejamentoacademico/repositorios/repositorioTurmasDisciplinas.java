package br.edu.ufjf.dcc025.planejamentoacademico.repositorios;

import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Disciplina;
import br.edu.ufjf.dcc025.planejamentoacademico.modelo.DisciplinaEletiva;
import br.edu.ufjf.dcc025.planejamentoacademico.modelo.DisciplinaObrigatoria;
import br.edu.ufjf.dcc025.planejamentoacademico.validadores.ValidadorLogicoAND;
import br.edu.ufjf.dcc025.planejamentoacademico.validadores.ValidadorSimples;

import java.util.ArrayList;
import java.util.List;

public class repositorioTurmasDisciplinas {
    public static List<Disciplina> carregarDisciplinas(){
        List<Disciplina> disciplinas = new ArrayList<>();
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
        disciplinas.add(calc1);
        disciplinas.add(alg);
        disciplinas.add(algPratica);
        disciplinas.add(quimFundamental);
        disciplinas.add(ga);
        disciplinas.add(labIntFis);
        disciplinas.add(intCiencias);
        //2 Semestre
        disciplinas.add(calc2);
        disciplinas.add(alg2);
        disciplinas.add(alg2Pratica);
        disciplinas.add(fis1);
        disciplinas.add(intEst);
        disciplinas.add(labFis1);
        disciplinas.add(labTrans);
        disciplinas.add(intEng);

        //Validadores para as matérias do segundo semestre

        calc2.adicionarValidadorPreRequisito(new ValidadorSimples(calc1));
        ValidadorLogicoAND vAndAlg = new ValidadorLogicoAND();
        vAndAlg.adicionarValidador(new ValidadorSimples(alg));
        vAndAlg.adicionarValidador(new ValidadorSimples(algPratica));
        alg2.adicionarValidadorPreRequisito(vAndAlg);
        alg2Pratica.adicionarValidadorPreRequisito(vAndAlg);
        ValidadorLogicoAND vAndFis = new ValidadorLogicoAND();
        vAndFis.adicionarValidador(new ValidadorSimples(calc2));
        vAndFis.adicionarValidador(new ValidadorSimples(ga));
        intEst.adicionarValidadorPreRequisito(new ValidadorSimples(calc1));
        labTrans.adicionarValidadorPreRequisito(new ValidadorSimples(labQuim));
        intEng.adicionarValidadorPreRequisito(new ValidadorSimples(intCiencias));







        //eletivas

        Disciplina teoriaDosNumeros = new DisciplinaEletiva("MAT174","Teoria dos numeros",4);
        Disciplina fis4 = new DisciplinaEletiva("FIS076","Fisica 4",4);
        disciplinas.add(teoriaDosNumeros);
        disciplinas.add(fis4);

        //Validadores para eletivas


        return disciplinas;
    }
}
