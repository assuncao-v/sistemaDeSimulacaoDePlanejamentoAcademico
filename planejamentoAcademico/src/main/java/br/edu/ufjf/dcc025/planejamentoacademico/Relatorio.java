package br.edu.ufjf.dcc025.planejamentoacademico;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Relatorio {
    private List<Turma> turmasAceitas = new ArrayList<>();
    private Map<Turma,String> turmasRejeitadas = new LinkedHashMap<>();

    public void aceitar(Turma turma){
        turmasAceitas.add(turma);
    }
    public void rejeitar(Turma turma,String motivo){
        turmasRejeitadas.put(turma,motivo);
    }
    public List<Turma> getTurmasAceitas(){
        return turmasAceitas;
    }
    public Map<Turma,String> getTurmasRejeitadas(){
        return turmasRejeitadas;
    }
    public void imprimir(){
        System.out.println("Turmas aceitas: ");
        for(Turma t : turmasAceitas){
            System.out.printf(%s,t.codigoDaDisciplina);
        }
    }

}
