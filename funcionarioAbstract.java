public abstract class funcionarioAbstract {
   protected String nome;
   protected String cpf;
   protected double salario;

    public funcionarioAbstract(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public abstract void getbonificacao();

    public abstract void imprimir();
}