import java.util.Scanner;

public class LocadoraBikeBox {
    public static void main(String[] args) {
        CadastroBikeBox cBikeBox = new CadastroBikeBox();
        CadastroCliente cCliente = new CadastroCliente();
        Scanner teclado = new Scanner(System.in);

        menu(teclado, cBikeBox, cCliente);
    }

    public static void menu(Scanner teclado, CadastroBikeBox cBikeBox, CadastroCliente cCliente) {
        int escolha = 0;
        while (escolha != 12) {
            System.out.println("\n==================================================");
            System.out.println("           BEM-VINDO À LOCADORA BIKEBOX           ");
            System.out.println("==================================================");
            System.out.println("|  1  | Incluir cliente                         |");
            System.out.println("|  2  | Remover cliente                         |");
            System.out.println("|  3  | Listar clientes                         |");
            System.out.println("|  4  | Buscar cliente por nome                 |");
            System.out.println("|  5  | Incluir equipamento                     |");
            System.out.println("|  6  | Listar equipamentos                     |");
            System.out.println("|  7  | Buscar equipamento                      |");
            System.out.println("|  8  | Realizar aluguel                        |");
            System.out.println("|  9  | Devolver equipamento                    |");
            System.out.println("| 10  | Disponibilidade de vagas por dia        |");
            System.out.println("| 11  | Relatório de CO2 evitado                |");
            System.out.println("| 12  | Sair                                    |");
            System.out.println("==================================================");
            System.out.print("Selecione uma opção: ");

            escolha = teclado.nextInt();
            teclado.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("\n--- Cadastro de Cliente ---");
                    cCliente.adicionar(cCliente.arrClientes);
                    break;
                case 2:
                    System.out.println("\n--- Remover Cliente ---");
                    cCliente.remover();
                    break;
                case 3:
                    System.out.println("\n--- Lista de Clientes ---");
                    cCliente.listar();
                    break;
                case 4:
                    System.out.println("\n--- Buscar Cliente por Nome ---");
                    Cliente cliente = cCliente.buscar();
                    cliente.toString();
                    break;
                case 5:
                    System.out.println("\n--- Incluir Equipamento ---");
                    cBikeBox.adicionar(cBikeBox.bikeArr);
                    break;
                case 6:
                    System.out.println("\n--- Lista de Equipamentos ---");
                    cBikeBox.listar();
                    break;
                case 7:
                    System.out.println("\n--- Buscar Equipamento ---");
                    BikeBox bikeBox = cBikeBox.buscar();
                    bikeBox.toString();
                    break;
                case 8:
                    System.out.println("\n--- Realizar Aluguel ---");
                    // Implementar aluguel
                    break;
                case 9:
                    System.out.println("\n--- Devolver Equipamento ---");
                    // Implementar devolução
                    break;
                case 10:
                    System.out.println("\n--- Disponibilidade de Vagas por Dia ---");
                    // Implementar disponibilidade
                    break;
                case 11:
                    System.out.println("\n--- Relatório de CO2 Evitado ---");
                    // Implementar relatório
                    break;
                case 12:
                    System.out.println("\nSaindo... Obrigado por usar a BikeBox!");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        }
    }
}
