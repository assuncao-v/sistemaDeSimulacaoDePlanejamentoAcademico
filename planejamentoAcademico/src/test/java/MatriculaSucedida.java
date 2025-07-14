import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Aluno;
import br.edu.ufjf.dcc025.planejamentoacademico.repositorios.RepositorioTurmasDisciplinas;
import br.edu.ufjf.dcc025.planejamentoacademico.simulacao.Relatorio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatriculaSucedida {
    private Aluno aluno;
    private Relatorio relatorio;

    @BeforeEach
    public void setup() {
        RepositorioTurmasDisciplinas.carregarDados();
        
        aluno = new Aluno("Welder Salvador Victor", "20256561A", 60);
        
        aluno.adicionarDisciplinaCursada(RepositorioTurmasDisciplinas.getDisciplinas().get(1), 70);
        aluno.adicionarDisciplinaCursada(RepositorioTurmasDisciplinas.getDisciplinas().get(2), 80);
    }

    @Test
    public void testMatriculaBemSucedida() {
        try{
            boolean resultado = aluno.validarMatricula(RepositorioTurmasDisciplinas.getTurmas().get(1), relatorio);
            assertTrue(resultado, "A matrícula deveria ser bem-sucedida.\n");
            relatorio.imprimir();
        }catch(Exception e){
            System.out.println("O aluno não consegue ser matriculado");
        }
    }
}
