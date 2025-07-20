public class BikeBox {
    private int codigo;
    private String modelo;
    private int vagas;
    private int estoque;
    private double valorBase;
    
    public BikeBox(int codigo, String modelo, int vagas, int estoque, double valorBase)
    {
        this.codigo = codigo;
        this.modelo = modelo;
        this.vagas = vagas;
        this.estoque = estoque;
        this.valorBase = valorBase;
    }

    //Modelos 
    /*
     * 
     * Modelo BikeBox Premium --
     * codigo 1
     * vagas = 12
     * estoque = 10
     * valor base = 4.999,99R$
     * 
     * Modelo BikeBox Standard --
     * codigo 2
     * vagas = 8
     * estoque = 25
     * valor base = 2.499,99R$
     * 
     * Modelo BikeBox Compact --
     * codigo 3
     * vagas = 4
     * estoque = 30
     * valor base = 999,99R$
     * 
     */

     // Getters

    public int getCodigo() {
        return codigo;
    }

    public int getEstoque() {
        return estoque;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVagas() {
        return vagas;
    }

    public double getValorBase() {
        return valorBase;
    }

     // Setters

     public void setCodigo(int codigo) {
         this.codigo = codigo;
     }

     public void setEstoque(int estoque) {
         this.estoque = estoque;
     }

     public void setModelo(String modelo) {
         this.modelo = modelo;
     }

     public void setVagas(int vagas) {
         this.vagas = vagas;
     }

     public void setValorBase(double valorBase) {
         this.valorBase = valorBase;
     }

     // Métodos -------------------
     
     // Método Calcular valor de locação por período
     public double calcValorLocacao(int periodo, double valor, int quantidade)
     {
        double valorBruto;
        switch (periodo) {
            case 1: // 0% Desconto
                
                break;
            case 2: // 5% Desconto
                
                break;
            case 3: // 10% Desconto
                
                break;
            default:
                throw new AssertionError();
        }
        return valor;
     }
}