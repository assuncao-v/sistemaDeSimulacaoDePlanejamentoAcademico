import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Aluno;
import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Disciplina;
import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Turma;
import br.edu.ufjf.dcc025.planejamentoacademico.repositorios.RepositorioTurmasDisciplinas;
import br.edu.ufjf.dcc025.planejamentoacademico.simulacao.Relatorio;
import br.edu.ufjf.dcc025.planejamentoacademico.simulacao.ServicoMatricula;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RepositorioTurmasDisciplinas.carregarDados();
        List<Disciplina> disciplinas = RepositorioTurmasDisciplinas.getDisciplinas();
        Aluno aluno = new Aluno("João da Silva", "202501001", 20);
        aluno.adicionarDisciplinaCursada(disciplinas.get(0), 70);
        Turma turma1 = disciplinas.get(1).getTurmas().get(0);
        Turma turma2 = disciplinas.get(2).getTurmas().get(0);
        aluno.adicionarTurmaNoPlanejamento(turma1);
        aluno.adicionarTurmaNoPlanejamento(turma2);
        Relatorio relatorio = ServicoMatricula.simulacaoMatricula(aluno);
        relatorio.imprimir();
    }

}
