public class gerente extends funcionarioAbstract {
    protected int CRM;

    public gerente(String nome, String cpf, double salario, int CRM){
        super(nome, cpf, salario);
        this.CRM = CRM;
    }
    
    public void getbonificacao(){
        salario += (salario*0.09);
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf); 
        System.out.println("Salário: " + salario);
        System.out.println("CRM: " + CRM);
    }
}
