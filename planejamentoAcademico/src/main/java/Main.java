import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Aluno;
import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Disciplina;
import br.edu.ufjf.dcc025.planejamentoacademico.modelo.Turma;
import br.edu.ufjf.dcc025.planejamentoacademico.repositorios.RepositorioTurmasDisciplinas;
import br.edu.ufjf.dcc025.planejamentoacademico.simulacao.Relatorio;
import br.edu.ufjf.dcc025.planejamentoacademico.simulacao.ServicoMatricula;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Carrega as disciplinas e turmas no repositório
        RepositorioTurmasDisciplinas.carregarDados();

        // Pega a lista de disciplinas
        List<Disciplina> disciplinas = RepositorioTurmasDisciplinas.getDisciplinas();

        // Cria um aluno com carga horária máxima de 20 horas
        Aluno aluno = new Aluno("João da Silva", "202501001", 20);

        // Suponha que o aluno já tenha passado em algumas disciplinas (exemplo)
        aluno.adicionarDisciplinaCursada(disciplinas.get(0), 70); // Aprovado na primeira disciplina

        // Adiciona as primeiras turmas das duas primeiras disciplinas ao planejamento
        Turma turma1 = disciplinas.get(1).getTurmas().get(0);
        Turma turma2 = disciplinas.get(2).getTurmas().get(0);

        aluno.adicionarTurmaNoPlanejamento(turma1);
        aluno.adicionarTurmaNoPlanejamento(turma2);

        // Executa a simulação de matrícula
        Relatorio relatorio = ServicoMatricula.simulacaoMatricula(aluno);

        // Imprime o relatório da simulação
        relatorio.imprimir();
    }

}
