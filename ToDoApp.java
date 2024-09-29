import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        TaskManager gerenciador = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar uma tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Concluir uma tarefa");
            System.out.println("4. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(descricao);
                    break;
                case 2:
                    gerenciador.listarTarefas();
                    break;
                case 3:
                    gerenciador.listarTarefas();
                    System.out.print("Digite o ID da tarefa a concluir: ");
                    int id = scanner.nextInt();
                    gerenciador.concluirTarefa(id);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

