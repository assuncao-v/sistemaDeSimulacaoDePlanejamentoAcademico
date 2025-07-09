package br.edu.ufjf.dcc025.planejamentoacademico.exceptions;

public abstract class MatriculaException extends Exception{
    /**
     * Create a new instance of <code>MatriculaException</code> 
     * without a detail message.
     */
    public MatriculaException() {
        super();
    }
    
    /**
     * Create a new instance of <code>MatriculaException</code> with
     * the specified detail message.
     * 
     * @param message the detail message
     */
    public MatriculaException(String message){
        super(message);
    }
    
    /**
     * Create a new instance of <code>MatriculaException</code> with
     * the specified cause.
     * 
     * @param cause the specified cause.
     */
    public MatriculaException(Throwable cause){
        super(cause);
    }
    
    /**
     * Create a new instance of <code>MatriculaException</code> with
     * the specified detail message and specified cause.
     * 
     * @param message
     * @param cause
     */
    public MatriculaException(String message,Throwable cause){
        super(message, cause);
    }
}
