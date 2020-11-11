public class Caixa{

    private float saida;
    private float comissao;
    private float total; // dinheiro total no caixa
    private Conta conta;

    public Caixa(Conta conta){
        this.conta = conta;
    }

    public void setTotal(float x){
        this.total += x;
    }
    public void setSaida(float x){
        this.total -= x;
        this.saida += x;
    }
    public float getTotal(){
        return this.total;
    }
    public float getSaida(){
        return this.saida;
    }

}
