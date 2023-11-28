public class departamentos extends gerente implements bonificacao {
    public int qtd_departamentos;

    public departamentos(String nome, String cpf, double salario, int CRM, int qtd_departamentos){
        super(nome, cpf, salario, CRM);
        this.qtd_departamentos = qtd_departamentos;
    }
    
    public void getbonificacao(){
       salario += (salario*0.11);
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Quantidade de departamentos " + qtd_departamentos);
    }
}
