package br.edu.ufjf.dcc025.planejamentoacademico.exceptions.validacaomatricula;

public class ConflitoDeHorarioException extends ValidacaoMatriculaException{
    /**
     * Create a new instance of <code>ConflitoDeHorarioException</code> 
     * without a detail message.
     */
    public ConflitoDeHorarioException() {
        super();
    }
    
    /**
     * Create a new instance of <code>ConflitoDeHorarioException</code> with
     * the specified detail message.
     * 
     * @param message the detail message
     */
    public ConflitoDeHorarioException(String message){
        super(message);
    }
    
    /**
     * Create a new instance of <code>ConflitoDeHorarioException</code> with
     * the specified cause.
     * 
     * @param cause the specified cause.
     */
    public ConflitoDeHorarioException(Throwable cause){
        super(cause);
    }
    
    /**
     * Create a new instance of <code>ConflitoDeHorarioException</code> with
     * the specified detail message and specified cause.
     * 
     * @param message
     * @param cause
     */
    public ConflitoDeHorarioException(String message,Throwable cause){
        super(message, cause);
    }
}
