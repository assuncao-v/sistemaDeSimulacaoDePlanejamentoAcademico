package br.edu.ufjf.dcc025.planejamentoacademico.excecoes;

public class CoRequisitoNaoAtendidoException extends ValidacaoMatriculaException{
    public CoRequisitoNaoAtendidoException(String mensagem){
        super(mensagem);
    }
}
