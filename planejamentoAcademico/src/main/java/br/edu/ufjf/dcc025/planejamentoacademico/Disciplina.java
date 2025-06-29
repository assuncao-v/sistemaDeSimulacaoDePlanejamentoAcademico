/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufjf.dcc025.planejamentoacademico;

/**
 *
 * @author assuncao-v
 */
public abstract class Disciplina {
    public final String codigo;
    public final String nome;
    private Integer cargaHorariaSemanal;
    
    //Precisa de validação dos parâmetros com tratamento de exceção.
    public Disciplina(String codigo, String nome, Integer cargaHorariaSemanal){
        if(validarCodigo(codigo)) this.codigo = codigo;
        else this.codigo = "";
        if(validarNome(nome)) this.nome = nome;
        else this.nome = "";
        if(validarCargaHorariaSemanal(cargaHorariaSemanal)) this.cargaHorariaSemanal = cargaHorariaSemanal;
        else this.cargaHorariaSemanal = 0;
    }
    
    private boolean validarCodigo(String codigo){
        return true;
    }
    
    private boolean validarNome(String nome){
        return true;
    }
            
    private boolean validarCargaHorariaSemanal(Integer cargaHorariaSemanal){
        return true;
    }
    
    public Integer getCargaHorariaSemanal(){
        return this.cargaHorariaSemanal;
    }
    
    public void setCargaHorariaSemanal(Integer cargaHorariaSemanal){
        if(validarCargaHorariaSemanal(cargaHorariaSemanal)) this.cargaHorariaSemanal = cargaHorariaSemanal;   
    }
}
