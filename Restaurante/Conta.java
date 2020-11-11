public class Conta{
    private int numConta;
    public float valor;
    private String formaPagamento;
    private Cliente cliente;
    
    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    void setValor(float valor){
        this.valor = valor;
    }

}
