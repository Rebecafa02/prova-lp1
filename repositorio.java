public class repositorio {
   private funcionarioAbstract [] BD;
   private int indice;

    public repositorio(){
        BD = new funcionarioAbstract[4];
        indice = 0;
    }

    public void inserir(funcionarioAbstract fa){
          if(BD[indice] == fa){
            System.out.println("Funcionário já cadastrado!");
          } else{
            BD[indice] = fa;
            indice++;
          }
        }
        public void remover(funcionarioAbstract fa){
            for(int i =0; i< indice; i++){
                if(BD[i] == fa){
                    BD[i] = BD[indice-1];
                    BD[indice] = null;
                    indice --;
                }
            }
        }
        public void bonificarALL(){
            for (int i = 0; i< indice; i++){
                BD[i].getbonificacao();
            }
        }
        public void imprimirALL(){
             for (int i = 0; i< indice; i++){
                BD[i].imprimir();
            }
        }
    }

