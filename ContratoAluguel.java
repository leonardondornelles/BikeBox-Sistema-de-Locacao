import java.util.Scanner;

public class ContratoAluguel {
    private Cliente cliente;
    private BikeBox bikeBox;
    private int quantidade;
    private int periodo;
    private boolean seguro;
    private double valorContrato;

    CadastroCliente cCliente = new CadastroCliente();
    CadastroBikeBox cBikeBox = new CadastroBikeBox();
    BikeBox bikeBox1;

    ContratoAluguel contratosArr[];

    Scanner teclado = new Scanner(System.in);

    public ContratoAluguel(Cliente cliente, BikeBox bikeBox, int quantidade, int periodo, boolean seguro, double valorContrato)
    {
        this.cliente = cliente;
        this.bikeBox = bikeBox;
        this.quantidade = quantidade;
        this.periodo = periodo;
        this.seguro = seguro;
        this.valorContrato = valorContrato;
    }

    public void realizarAluguel()
    {
        System.out.println("Realizar aluguel de um cliente");
        cliente = cCliente.buscar();
        if(cliente != null)
        {
            bikeBox = cBikeBox.buscar();
            if(bikeBox != null)
            {
                bikeBox.toString();
                double valorBase = bikeBox.getValorBase();

                System.out.println("Quantidade a ser alugada");

                int quantidade = teclado.nextInt();

                if(quantidade < bikeBox.getEstoque())
                {
                    System.out.println("Sucesso!");
                    System.out.println("Qual vai ser o periodo?");
                    System.out.println("Tabela de descontos por período:");
                    System.out.println("---------------------------------------------------");
                    System.out.println("| Período                  | Desconto aplicado     |");
                    System.out.println("----------------------------------------------------");
                    System.out.println("Opção 1 | Até 7 dias       |     Sem desconto      |");
                    System.out.println("Opção 2 | 15 dias          |     5% de desconto    |");
                    System.out.println("Opção 3 | 30 dias ou mais  |     10% de desconto   |");
                    System.out.println("----------------------------------------------------");

                    int periodo = teclado.nextInt();
                    while (periodo < 1 || periodo > 3) { 
                        System.out.println("Opção inválida. Por favor, escolha:");
                        System.out.println("1 - Até 7 dias");
                        System.out.println("2 - 15 dias");
                        System.out.println("3 - 30 dias ou mais");
                        System.out.print("Digite a opção desejada: ");
                        periodo = teclado.nextInt();
                    }

                    String respostaSeguro;
                    
                    do {
                        System.out.println("Deseja contratar o seguro para o equipamento?");
                        System.out.println("O seguro adiciona 2% ao valor total do aluguel e oferece cobertura contra danos e furtos durante o período.");
                        System.out.print("Digite 'S' para SIM ou 'N' para NÃO: ");

                        respostaSeguro = teclado.next();

                        if (!respostaSeguro.equalsIgnoreCase("S") && !respostaSeguro.equalsIgnoreCase("N")) {
                            System.out.println("Opção inválida. Por favor, digite 'S' ou 'N'.");
                        }
                    } while (!respostaSeguro.equalsIgnoreCase("S") && !respostaSeguro.equalsIgnoreCase("N"));

                    seguro = respostaSeguro.equalsIgnoreCase("S");

                    bikeBox.calcValorLocacao(periodo, valorBase, quantidade);
                    ContratoAluguel contrato = new ContratoAluguel(cliente, bikeBox, quantidade, periodo, seguro, periodo);
                }
                else{
                    System.out.println("Não temos essa quantidade no estoque");
                }
            }
            else{
                System.out.println("Houve um erro");
            }
        }
        else{
            System.out.println("Houve um erro");
        }
    }

    // Getters

    public Cliente getCliente() {
        return cliente;
    }

    public int getPeriodo() {
        return periodo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public BikeBox getBikeBox() {
        return bikeBox;
    }

    // ToString

    public String toString() {
        return String.format(
            "Contrato de Aluguel:\nCliente: %s\nEquipamento: %s\nQuantidade: %d\nPeríodo: %d dias\nSeguro: %s",
            cliente.getNome(), bikeBox.getModelo(), quantidade, periodo, seguro ? "Sim" : "Não"
        );
    }
    
}
