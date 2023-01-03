public class Banco {

    private int numero;
    private String nome;
    private double total;

    public Banco(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    };

    public Banco(int numero, String nome, double initialDeposit){
        this.numero = numero;
        this.nome = nome;
        depositar(initialDeposit);
    };

    public int getNumero() {
        return numero;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTotal() {
        return total;
    }



    public void depositar(double amount){
        this.total+= amount;
    };

    public void retirar(double amount){
        this.total-=amount+5.0;
    };

    @Override
    public String toString() {
        return
                "numero= "
                        + numero +
                ", nome= "
                        + nome +
                ", total: $ "
                        +String.format("%.2f", total)
                ;
    }
}
