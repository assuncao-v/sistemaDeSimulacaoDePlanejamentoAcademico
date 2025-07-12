package br.edu.ufjf.dcc025.planejamentoacademico.exceptions.validacaomatricula;

public class PreRequisitoNaoCumpridoException extends ValidacaoMatriculaException {
    public PreRequisitoNaoCumpridoException() {
        super();
    }
    
    public PreRequisitoNaoCumpridoException(String message){
        super(message);
    }
    
    public PreRequisitoNaoCumpridoException(Throwable cause){
        super(cause);
    }
    
    public PreRequisitoNaoCumpridoException(String message,Throwable cause){
        super(message, cause);
    }
}

