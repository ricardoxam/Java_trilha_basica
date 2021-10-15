import java.util.Scanner;

public class Agenda {
    Scanner scanner = new Scanner(System.in);
    
    
    Pessoa[] vetor = new Pessoa[10];

    public void armazenarPessoa(){
        for(int i = 0;i<(vetor.length-1);i++){
            Pessoa p = new Pessoa();
            System.out.println("Informe o nome da pessoa: ");
            p.setNome(scanner.nextLine());
            System.out.println("Informe a idade da pessoa: ");
            p.setIdade(scanner.nextInt());
            System.out.println("Informe a altura: ");
            p.setAltura(scanner.nextFloat());
            vetor[i]= p;
                   
        }
        
    }    

    public void removerPessoa(String nome){
        for(int i = 0;i<(vetor.length-1);i++){
            if(nome.equalsIgnoreCase(vetor[i].getNome())){
                vetor[i].setNome(null);
                vetor[i].setIdade(0);
                vetor[i].setAltura(0);
            }
        }
        }


    public void buscarNome(String nome){
        for(int i = 0;i<(vetor.length-1);i++){
            if(nome.equalsIgnoreCase(vetor[i].getNome())){
                System.out.println("A pessoa está na posição: " +i);

        }else{
                System.out.println("A pessoa não está na agenda ");
            }    
         }
    
    }


    public void imprimirAgenda(){
        for(int i = 0;i<(vetor.length-1);i++){
            System.out.println("-----------------------");
            System.out.println(vetor[i].getNome());
            System.out.println(vetor[i].getIdade());
            System.out.println(vetor[i].getAltura());

            System.out.println("-----------------------");
        }
    }

    public void imprimirPessoa(int index){
        for(int i = 0;i<(vetor.length-1);i++){
            if(index == i){
                System.out.println(vetor[i].getNome());
            } 

    }



    
   // ArrayList<Pessoa> lista = new ArrayList<>()
       

}
}
