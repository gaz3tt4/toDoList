import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tarefas;
    private int proximoId;

    public TaskManager() {
        this.tarefas = new ArrayList<>();
        this.proximoId = 1;
    }

    public void adicionarTarefa(String descricao) {
        Task tarefa = new Task(proximoId++, descricao);
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa);
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa disponível.");
        } else {
            for (Task tarefa : tarefas) {
                System.out.println(tarefa);
            }
        }
    }

    public void concluirTarefa(int id) {
        for (Task tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.concluir();
                System.out.println("Tarefa concluída: " + tarefa);
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }
}
