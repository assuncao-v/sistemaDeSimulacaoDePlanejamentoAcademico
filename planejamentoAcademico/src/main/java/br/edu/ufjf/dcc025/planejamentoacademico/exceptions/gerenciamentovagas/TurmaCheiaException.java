package br.edu.ufjf.dcc025.planejamentoacademico.exceptions.gerenciamentovagas;

public class TurmaCheiaException extends GerenciamentoVagasException {

    /**
     * Creates a new instance of <code>TurmaCheiaException</code> without detail
     * message.
     */
    public TurmaCheiaException() {
        super();
    }

    /**
     * Constructs an instance of <code>TurmaCheiaException</code> with the
     * specified detail message.
     *
     * @param message the detail message.
     */
    public TurmaCheiaException(String message) {
        super(message);
    }

    /**
     * Constructs a new instance of <code>TurmaCheiaException</code> with
     * the specified cause.
     * 
     * @param cause the specified cause.
     */
    public TurmaCheiaException(Throwable cause){
        super(cause);
    }
    
    /**
     * Constructs a new instance of <code>TurmaCheiaException</code> with
     * the specified detail message and specified cause.
     * 
     * @param message
     * @param cause
     */
    public TurmaCheiaException(String message,Throwable cause){
        super(message, cause);
    }
}
