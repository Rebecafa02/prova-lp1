public class programador extends funcionarioAbstract {
    public String ling_prog;

    public programador(String nome, String cpf, double salario, String ling_prog){
        super(nome, cpf, salario);
        this.ling_prog = ling_prog;
    }

    public void getbonificacao(){
        salario += (salario * 0.15);
    }
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf); 
        System.out.println("Salário: " + salario);
        System.out.println("Linguagem de programação: " + ling_prog);}
}
