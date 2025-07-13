/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufjf.dcc025.planejamentoacademico.modelo;

import br.edu.ufjf.dcc025.planejamentoacademico.excecoes.PreRequisitoNaoCumpridoException;
import br.edu.ufjf.dcc025.planejamentoacademico.validadores.ValidadorPreRequisito;

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

    public void adicionarValidadorPreRequisito(ValidadorPreRequisito v){
        validadoresDePreRequisito.add(v);
    }

    public void alocarTurma(Turma turma){
        turmas.add(turma);
    }
    public void adicionarCoRequisitos(Disciplina d) {
        this.coRequisitos.add(d);
    }

    public List<Disciplina> getCoRequisitos(){
        return coRequisitos;
    }

    public void validarPreRequisitos(Aluno aluno) throws PreRequisitoNaoCumpridoException {
        for (ValidadorPreRequisito validador : validadoresDePreRequisito) {
            if (!validador.validar(aluno, this)) {
                throw new PreRequisitoNaoCumpridoException(this);
            }
        }
    }
    public List<ValidadorPreRequisito>  getValidadoresDePreRequisito(){
        return validadoresDePreRequisito;
    }

    private static Disciplina buscarDisciplinaPorCodigo(List<Disciplina> disciplinas, String codigo) {
        for (Disciplina d : disciplinas) {
            if (d.getCodigo().equals(codigo)) {
                return d;
            }
        }
        throw new IllegalArgumentException("Disciplina com código " + codigo + " não encontrada.");
    }

    public List<Turma> getTurmas(){
        return turmas;
    }

    public void adicionarTurma(Turma turma){
        turmas.add(turma);
    }

    public abstract int getNivelDeImportancia();

    @Override
    public String toString(){
        return String.format("%s  - %s",codigo,nome);
    }

}
