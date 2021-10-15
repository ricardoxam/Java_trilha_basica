import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Agenda g = new Agenda();
        Scanner sc = new Scanner(System.in);
        System.out.println("O que deseja fazer? ");
        System.out.println("1 - Cadastro na agenda. ");
        System.out.println("2 - Remover pessoa. ");
        System.out.println("3 - Retorna indice de uma pessoa. ");
        System.out.println("4 - Imprimir agenda. ");
        System.out.println("5 - Informe o indice para retornar uma pessoa. ");
        System.out.println("6 - Sair. ");

        switch (sc.nextInt()) {
            case 1:
            g.armazenarPessoa(); 
                break;
            case 2:
            System.out.println("Informe o nome da pessoa que deseja remover: ");
            g.removerPessoa(sc.nextLine());
                break;
            case 3:
            System.out.println("Informe o nome da pessoa que deseja buscar o indice ");
            g.buscarNome(sc.nextLine());
                break;
            case 4:
            g.imprimirAgenda();
                break;
            case 5:
            System.out.println("Informe o indice da pessoa que está buscando");
            g.imprimirPessoa(sc.nextInt());
                break;
            case 6:
                break;        
        }
           
        sc.close();

    }
    
}
