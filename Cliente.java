public class Cliente {
    private int id;
    private String nome;
    private String empresa;

    public Cliente(int id, String nome, String empresa)
    {
        this.id = id;
        this.nome = nome;
        this.empresa = empresa;
    }

    // Getters

    public String getEmpresa() {
        return empresa;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    // Setters

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString()
    {
        return String.format(
            "-----------------------------------------------\n" +
            "ID     : %d\n" +
            "Nome   : %s\n" +
            "Empresa: %s\n" +
            "-----------------------------------------------",
            id, nome, empresa
        );
    }
    
}
