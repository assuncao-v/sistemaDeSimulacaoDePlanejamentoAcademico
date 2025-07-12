package br.edu.ufjf.dcc025.planejamentoacademico.exceptions.gerenciamentovagas;

import br.edu.ufjf.dcc025.planejamentoacademico.exceptions.MatriculaException;

public class GerenciamentoVagasException extends MatriculaException {

    /**
     * Creates a new instance of <code>GerenciamentoVagasException</code>
     * without detail message.
     */
    public GerenciamentoVagasException() {
        super();
    }

    /**
     * Constructs an instance of <code>GerenciamentoVagasException</code> with
     * the specified detail message.
     *
     * @param message the detail message.
     */
    public GerenciamentoVagasException(String message) {
        super(message);
    }
}
