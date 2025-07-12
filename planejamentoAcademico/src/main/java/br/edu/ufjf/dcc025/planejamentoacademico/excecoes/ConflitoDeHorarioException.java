package br.edu.ufjf.dcc025.planejamentoacademico.excecoes;

public class ConflitoDeHorarioException extends ValidacaoMatriculaException{
    public ConflitoDeHorarioException(String mensagem){
        super(mensagem);
    }
}
