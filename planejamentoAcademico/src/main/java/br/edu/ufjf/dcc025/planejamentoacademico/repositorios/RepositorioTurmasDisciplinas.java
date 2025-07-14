package br.edu.ufjf.dcc025.planejamentoacademico.repositorios;

import br.edu.ufjf.dcc025.planejamentoacademico.modelo.*;
import br.edu.ufjf.dcc025.planejamentoacademico.validadores.ValidadorLogicoAND;
import br.edu.ufjf.dcc025.planejamentoacademico.validadores.ValidadorSimples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepositorioTurmasDisciplinas {
    private static final List<Disciplina> disciplinas = new ArrayList<>();
    private static final List<Turma> turmas = new ArrayList<>();

    public static void carregarDados() {
        disciplinas.clear(); // limpar lista estática antes de carregar
        turmas.clear();
        Disciplina calc1 = new DisciplinaObrigatoria("MAT154", "Calculo 1", 4);
        Disciplina alg = new DisciplinaObrigatoria("DCC199", "Algoritmos", 4);
        Disciplina algPratica = new DisciplinaObrigatoria("DCC5199", "Algoritmos pratica", 2);
        Disciplina quimFundamental = new DisciplinaObrigatoria("QUI165", "Quimica fundamental", 4);
        Disciplina ga = new DisciplinaObrigatoria("MAT155", "Geometria analitica e sistemas lineres", 4);
        Disciplina labIntFis = new DisciplinaObrigatoria("FIS122", "Laboratorio de introducao as ciencias fisicas", 2);
        Disciplina intCiencias = new DisciplinaObrigatoria("ICE001", "Introducao a ciencias exatas", 2);
        Disciplina labQuim = new DisciplinaObrigatoria("QUI126", "Laboratorio de quimica", 2);
        Disciplina calc2 = new DisciplinaObrigatoria("MAT156", "Calculo 2", 4);
        Disciplina alg2 = new DisciplinaObrigatoria("DCCXX1", "Algoritmos 2", 4);
        Disciplina alg2Pratica = new DisciplinaObrigatoria("DCC5X1", "Algoritmos pratica", 2);
        Disciplina fis1 = new DisciplinaObrigatoria("FIS073", "Fisica 1", 4);
        Disciplina intEst = new DisciplinaObrigatoria("EST028", "Introducao a estatistica", 4);
        Disciplina labFis1 = new DisciplinaObrigatoria("FIS073", "Laboratorio de fisica 1", 2);
        Disciplina labTrans = new DisciplinaObrigatoria("QUI168", "Laboratorio de transformacoes quimicas", 2);
        Disciplina intEng = new DisciplinaObrigatoria("MAC011", "Introducao a engenharia computacional", 2);
        Disciplina calc3 = new DisciplinaObrigatoria("MAT157", "Calculo 3", 4);
        Disciplina ed = new DisciplinaObrigatoria("DCC013", "Estrutura de dados", 4);
        Disciplina fis2 = new DisciplinaObrigatoria("FIS074", "Fisica 2", 4);
        Disciplina oo = new DisciplinaObrigatoria("DCC025", "Orientacao a objetos", 4);
        Disciplina modGeom = new DisciplinaObrigatoria("MAC036", "Representacao grafica e modelagem geometrica", 2);
        Disciplina calcProb = new DisciplinaObrigatoria("EST029", "Calculo de probabilidade", 4);


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

        //3 Semestre
        disciplinas.add(calc3);
        disciplinas.add(ed);
        disciplinas.add(fis2);
        disciplinas.add(calcProb);
        disciplinas.add(modGeom);
        disciplinas.add(oo);

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

        //Validadores para as matérias do terceiro semestre

        calc3.adicionarValidadorPreRequisito(new ValidadorSimples(calc2));
        ed.adicionarValidadorPreRequisito(new ValidadorSimples(alg2));
        ValidadorLogicoAND vAndFis2 = new ValidadorLogicoAND();
        vAndFis2.adicionarValidador(new ValidadorSimples(calc2));
        vAndFis2.adicionarValidador(new ValidadorSimples(fis1));
        calcProb.adicionarValidadorPreRequisito(new ValidadorSimples(intEst));
        modGeom.adicionarValidadorPreRequisito(new ValidadorSimples(ga));


        //Eletivas


        //Turmas do primeiro semestre
        Turma tCalc1A = new Turma("A", calc1, 60, Arrays.asList(
                new Horario(Dia.SEGUNDA, 8, 10),
                new Horario(Dia.QUARTA, 8, 10)
        ));
        Turma tAlgA = new Turma("A", alg, 60, Arrays.asList(
                new Horario(Dia.TERCA, 10, 12),
                new Horario(Dia.QUINTA, 10, 12)
        ));
        Turma tAlgPratica = new Turma("A", algPratica, 60, List.of(
                new Horario(Dia.SEXTA, 14, 16)
        ));
        Turma tLabQuimA = new Turma("A", labQuim, 60, List.of(
                new Horario(Dia.SEGUNDA, 10, 12)
        ));

        calc1.adicionarTurma(tCalc1A);
        alg.adicionarTurma(tAlgA);
        algPratica.adicionarTurma(tAlgPratica);
        labQuim.adicionarTurma(tLabQuimA);
    }

    public static List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public static List<Turma> getTurmas() {
        return turmas;
    }

}

