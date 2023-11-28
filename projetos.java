public class projetos extends gerente implements bonificacao {
    protected int qtd_projetos;

    public projetos(String nome, String cpf, double salario, int CRM, int qtd_projetos){
        super(nome, cpf, salario, CRM);
        this.qtd_projetos = qtd_projetos;
    }
    
    public void getbonificacao(){
        salario += (salario * 0.1);
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Quantidade de projetos " + qtd_projetos);
    }
}
