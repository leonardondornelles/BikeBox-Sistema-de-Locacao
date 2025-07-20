import java.util.Scanner;

public class CadastroBikeBox {
    BikeBox bikeArr[];
    Scanner teclado = new Scanner(System.in);

    public CadastroBikeBox(){
        bikeArr = new BikeBox[12];
        // Premium 
        bikeArr[0] = new BikeBox(1, "Premium", 12, 10, 4.999);
        bikeArr[1] = new BikeBox(4, "Premium Plus", 14, 6, 5999.99);
        // Standard
        bikeArr[2] = new BikeBox(2, "Standard", 8, 25, 2499.99);
        bikeArr[3] = new BikeBox(5, "Standard Duo", 10, 15, 2999.99);
        // Compact
        bikeArr[4] = new BikeBox(3, "Compact", 4, 30, 999.99);
        bikeArr[5] = new BikeBox(6, "Compact Light", 2, 40, 699.99);
        bikeArr[6] = new BikeBox(7, "Compact XL", 5, 20, 1299.99);
        // Outdoor
        bikeArr[7] = new BikeBox(8, "Outdoor Basic", 6, 18, 1899.99);
        bikeArr[8] = new BikeBox(9, "Outdoor Plus", 8, 12, 2399.99);
        // Elétricas
        bikeArr[9] = new BikeBox(10, "E-BikeBox", 6, 8, 3499.99); 
        bikeArr[10] = new BikeBox(11, "SmartBox", 10, 5, 5499.99); 
        // Edição Especial
        bikeArr[11] = new BikeBox(12, "EventoBox", 16, 4, 6499.99); 
    }

    public BikeBox[] adicionar(BikeBox[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == null) {
                System.out.println("Espaço vazio encontrado no índice " + i);

                System.out.println("Insira o nome do equipamento:");
                String nome = teclado.nextLine();

                System.out.println("Insira o número de vagas:");
                int vagas = teclado.nextInt();
                teclado.nextLine();

                System.out.println("Insira a quantidade em estoque:");
                int qtd = teclado.nextInt();
                teclado.nextLine();

                System.out.println("Insira o preço base:");
                double preco = teclado.nextDouble();
                teclado.nextLine();

                BikeBox novo = new BikeBox(i + 1, nome, vagas, qtd, preco);

                array[i] = novo;
                System.out.println("Equipamento cadastrado com sucesso!");
                return array;
            }
        }
        System.out.println("Não há espaço disponível para novos equipamentos.");
        return array;
    }

    public void remover() {
        listar();
        BikeBox bike = buscar();
        if(bike != null) {
            for(int i = 0; i < bikeArr.length; i++) {
                if(bikeArr[i] == bike) {
                    bikeArr[i] = null;
                    System.out.println("Equipamento removido com sucesso");
                }
            }
        }
    }

    public void listar() {
        System.out.println("===============================================");
        System.out.println("           LISTA DE EQUIPAMENTOS BIKEBOX       ");
        System.out.println("===============================================");
        System.out.printf("%-3s | %-18s | %-4s | %-4s | %-8s\n", "ID", "Nome", "Vagas", "Qtd", "Preço");
        System.out.println("-----------------------------------------------");
        for(int i = 0; i < bikeArr.length; i++) {
            BikeBox b = bikeArr[i];
            if (b != null) {
                System.out.printf("%-3d | %-18s | %-4d | %-4d | R$ %-8.2f\n",
                    b.getCodigo(), b.getModelo(), b.getVagas(), b.getEstoque(), b.getValorBase());
            }
        }
        System.out.println("===============================================");
    }

    public BikeBox buscar() {
        System.out.println("Insira o nome do equipamento que deseja buscar");
        String nome = teclado.nextLine();

        for(int i = 0; i < bikeArr.length; i++) {
            if(bikeArr[i] != null && nome.equalsIgnoreCase(bikeArr[i].getModelo())) {
                return bikeArr[i];
            }
        }
        System.out.println("Não existe um equipamento com esse nome");
        return null;
    }

    public void amem()
    {
        
    }
}

