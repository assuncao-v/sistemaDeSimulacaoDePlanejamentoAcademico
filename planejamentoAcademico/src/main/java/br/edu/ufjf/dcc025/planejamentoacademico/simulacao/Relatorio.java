package br.edu.ufjf.dcc025.planejamentoacademico.simulacao;

import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Turma;

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
    public void imprimir() {
        System.out.println("Relatorio de simulação de matrícula: ");
        if(turmasAceitas.isEmpty() && turmasRejeitadas.isEmpty()){
            System.out.println("Nenhuma turma processada");
            return;
        }
        System.out.println("Turmas aceitas: ");
        if(turmasAceitas.isEmpty()){
            System.out.println("Nenhuma!");
        }
        else{
            for(Turma t : turmasAceitas){
                System.out.printf("  - %s (%s)%n", t.getId(), t.getDisciplina().getNome());
            }
        }
        System.out.println("Turmas rejeitadas: ");
        if(turmasRejeitadas.isEmpty()){
            System.out.println("Nenhuma! ");
        }
        else{
            for(Map.Entry<Turma,String> entrada : turmasRejeitadas.entrySet()){
                Turma t = entrada.getKey();
                String motivo = entrada.getValue();
                System.out.printf("  - %s (%s): %s%n", t.getId(), t.getDisciplina().getNome(), motivo);
            }
        }
    }
}
