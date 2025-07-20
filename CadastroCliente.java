import java.util.Scanner;

public class CadastroCliente {
    Cliente arrClientes[];
    Scanner teclado = new Scanner(System.in);


    public CadastroCliente()
    {
        arrClientes = new Cliente[30];

    }

    public Cliente[] adicionar(Cliente[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == null)
            {
                System.out.println("Espaço vazio encontrado no índice " + i);

                System.out.println("Insira o nome do cliente:");
                String nome = teclado.nextLine();

                System.out.println("Insira o nome da empresa:");
                String empresa = teclado.nextLine();

                Cliente novo = new Cliente(i, nome, empresa);

                array[i] = novo;
                System.out.println("Cliente cadastrado com sucesso!");
                return array;
            }
        }
        System.out.println("Não há espaço disponível para novos clientes.");
        return array;
    }

    public void remover()
    {
        listar();
        Cliente cliente = buscar();
        if(cliente != null)
        {
            for(int i = 0; i < arrClientes.length; i++)
            { 
                if(arrClientes[i] == cliente)
                {
                    arrClientes[i] = null;
                    System.out.println("Cliente removido com sucesso");
                }
            }
        }
    }

    public void listar()
    {
        System.out.println("===============================================");
        System.out.println("               LISTA DE CLIENTES              ");
        System.out.println("===============================================");
        System.out.printf("%-4s | %-25s | %-20s\n", "ID", "Nome", "Empresa");
        System.out.println("-----------------------------------------------");
        for(int i = 0; i < arrClientes.length; i++)
        {
            Cliente cliente = arrClientes[i];
            if (cliente != null) {
                System.out.printf("%-4d | %-25s | %-20s\n",
                    cliente.getId(), cliente.getNome(), cliente.getEmpresa());
            }
        }
        System.out.println("===============================================");
    }

    public Cliente buscar()
    {
        System.out.println("Insira o nome do cliente que deseja buscar");
        String nome = teclado.nextLine();
        boolean encontrado = false;

        for(int i = 0; i < arrClientes.length; i++)
        {
            if(arrClientes[i] != null && nome.equalsIgnoreCase(arrClientes[i].getNome()))
            {
                return arrClientes[i];
            }
        }
        System.out.println("Não existe um cliente com esse nome");
        return null;
    }
}
