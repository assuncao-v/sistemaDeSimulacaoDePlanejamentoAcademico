/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufjf.dcc025.planejamentoacademico;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author assuncao-v
 */
public abstract class Disciplina {
    private final String codigo;
    private final String nome;
    private int cargaHorariaSemanal;
    private List<Turma> turmas = new ArrayList<>();
    private List<ValidadorPreRequisito> validadoresDePreRequisito;
    private List<Disciplina> coRequisitos;

    //Precisa de validação dos parâmetros com tratamento de exceção.
    public Disciplina(String codigo, String nome, int cargaHorariaSemanal,List<Turma> turmas){
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.validadoresDePreRequisito = new ArrayList<>();
        this.coRequisitos = new ArrayList<>();
        this.turmas = turmas;
    }

    public Integer getCargaHorariaSemanal(){
        return this.cargaHorariaSemanal;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public List<ValidadorPreRequisito> getValidadoresDePreRequisito() {
        return validadoresDePreRequisito;
    }

    public void setValidadoresDePreRequisito(List<ValidadorPreRequisito> validadoresDePreRequisito) {
        this.validadoresDePreRequisito = validadoresDePreRequisito;
    }

    public List<Disciplina> getCoRequisitos() {
        return coRequisitos;
    }

    public void setCoRequisitos(List<Disciplina> coRequisitos) {
        this.coRequisitos = coRequisitos;
    }

    public boolean validarPreRequisitos(Aluno aluno){
        for(ValidadorPreRequisito validador : validadoresDePreRequisitos){
            if(validador.validar(aluno,this)){
                return false;
            }
        }
        return true;
    }

    public abstract int getNivelDeImportancia();

    @Override
    public String toString(){
        return String.format("%s  - %s",codigo,nome);
    }

}
