/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufjf.dcc025.planejamentoacademico.modelo;

/**
 *
 * @author assuncao-v
 */
public class Turma {
    public final String codigoDaDisciplina;
    public final Integer capacidadeMaxima;
    //public final Horario horarioFixo; Devemos criar uma classe para Horario
    private Integer quantidadeAlunosMatriculados;
    
    //Precisa de validação dos parâmetros com tratamento de exceção.
    public Turma(String codigoDaDisciplina, Integer capacidadeMaxima /* ,Horario horarioFixo*/){
        if(validarCodigoDaDisciplina(codigoDaDisciplina)) this.codigoDaDisciplina = codigoDaDisciplina;
        else this.codigoDaDisciplina = codigoDaDisciplina;
        if(validarCapacidadeMaxima(capacidadeMaxima)) this.capacidadeMaxima = capacidadeMaxima;
        else this.capacidadeMaxima = 0;
        //this.horarioFixo = horarioFixo;
    }
    
    private boolean validarCodigoDaDisciplina(String codigoDaDisciplina){
        return true;
    }
    private boolean validarCapacidadeMaxima(Integer capacidadeMaxima){
        return true;
    }
    
    public Integer getQuantidadeAlunosMatriculados(){
        return this.quantidadeAlunosMatriculados;
    }
    
}
