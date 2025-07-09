package br.edu.ufjf.dcc025.planejamentoacademico.exceptions.validacaomatricula;

public class CargaHorariaExcedidaException extends ValidacaoMatriculaException{
    /**
     * Create a new instance of <code>CargaHorariaExcedidaException</code> 
     * without a detail message.
     */
    public CargaHorariaExcedidaException() {
        super();
    }
    
    /**
     * Create a new instance of <code>CargaHorariaExcedidaException</code> with
     * the specified detail message.
     * 
     * @param message the detail message
     */
    public CargaHorariaExcedidaException(String message){
        super(message);
    }
    
    /**
     * Create a new instance of <code>CargaHorariaExcedidaException</code> with
     * the specified cause.
     * 
     * @param cause the specified cause.
     */
    public CargaHorariaExcedidaException(Throwable cause){
        super(cause);
    }
    
    /**
     * Create a new instance of <code>CargaHorariaExcedidaException</code> with
     * the specified detail message and specified cause.
     * 
     * @param message
     * @param cause
     */
    public CargaHorariaExcedidaException(String message,Throwable cause){
        super(message, cause);
    }
}
