package br.edu.ufjf.dcc025.planejamentoacademico.modelo;

public class Horario {
    private final Dia diaDaSemana;
    private final int horarioInicio;
    private final int horarioFinal;

    public Horario(Dia diaDaSemana, int horarioInicio, int horarioFinal){
        this.diaDaSemana = diaDaSemana;
        this.horarioFinal = horarioFinal;
        this.horarioInicio = horarioInicio;
    }
    public boolean existeConflito(Horario horario){
        if (!this.diaDaSemana.equals(horario.diaDaSemana)) return false;
        return !(this.horarioFinal <= horario.horarioInicio || horario.horarioFinal <= this.horarioInicio);
    }

    public Dia getDiaDaSemana(){
        return diaDaSemana;
    }
    public int getHorarioInicio(){
        return horarioInicio;
    }
    public int getHorarioFinal(){
        return horarioFinal;
    }

    @Override
    public String toString() {
        return diaDaSemana + " " + getHorarioInicio() + "h-" + getHorarioFinal() + "h";
    }
}
