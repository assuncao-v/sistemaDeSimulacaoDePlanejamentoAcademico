package br.edu.ufjf.dcc025.planejamentoacademico.exceptions.validacaomatricula;

import br.edu.ufjf.dcc025.planejamentoacademico.exceptions.MatriculaException;

public class ValidacaoMatriculaException extends MatriculaException {
    /**
     * Create a new instance of <code>ValidacaoMatriculaException</code> 
     * without a detail message.
     */
    public ValidacaoMatriculaException() {
        super();
    }
    
    /**
     * Create a new instance of <code>ValidacaoMatriculaException</code> with
     * the specified detail message.
     * 
     * @param message the detail message
     */
    public ValidacaoMatriculaException(String message){
        super(message);
    }
    
    /**
     * Create a new instance of <code>ValidacaoMatriculaException</code> with
     * the specified cause.
     * 
     * @param cause the specified cause.
     */
    public ValidacaoMatriculaException(Throwable cause){
        super(cause);
    }
    
    /**
     * Create a new instance of <code>ValidacaoMatriculaException</code> with
     * the specified detail message and specified cause.
     * 
     * @param message
     * @param cause
     */
    public ValidacaoMatriculaException(String message,Throwable cause){
        super(message, cause);
    }
}
