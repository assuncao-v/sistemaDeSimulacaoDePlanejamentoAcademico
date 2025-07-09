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

    private List<ValidadorPreRequisito> validadoresDePreRequisito;
    private List<Disciplina> coRequisitos;

    //Precisa de validação dos parâmetros com tratamento de exceção.
    public Disciplina(String codigo, String nome, int cargaHorariaSemanal){
        this.codigo = codigo;
        this.nome = nome;
        setCargaHorariaSemanal(cargaHorariaSemanal);
        this.validadoresDePreRequisito = new ArrayList<>();
        this.coRequisitos = new ArrayList<>();
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
        for(ValidadorPreRequisito validador : validadoresDePreRequisito){
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
