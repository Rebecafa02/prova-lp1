public class aplicativo {
    public static void main (String [] args) throws Exception{

        gerente g1 = new gerente("Robesvaldo", "123456789", 2500.00, 6);
        programador p1 = new programador("Lucrecia", "789456123", 3500.00, "java");
        departamentos d1 = new departamentos("Richarlisson", "456123789", 3000.00, 7, 8);
        projetos pj1 = new projetos("Jaleusca", "417258963", 3100.00, 5, 9);

         repositorio quadro = new repositorio();
         quadro.inserir(p1);
         quadro.inserir(g1);
         quadro.inserir(pj1);
         //quadro.inserir(d1);
         quadro.inserir(g1);
        
         quadro.imprimirALL();


          
    }
    
}
