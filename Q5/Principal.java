import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String entrada = "";
        ArrayList<Caminhao> caminhao = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (!entrada.equals("fim")) {
            Caminhao c = new Caminhao();
            System.out.println("Informe o tipo do Caminhão: ");
            c.setTipo(Selecao.leString(sc.nextLine()));
            System.out.println("Informe a quantidade de pluviometros que deseja cadastrar: ");
            c.setQuantidade(Selecao.leNumero(sc.nextInt()));
            
            sc.nextLine();

            for(int i=0; i < c.getQuantidade(); i++){
                Pluviometro p = new Pluviometro();
                System.out.println("Informe um nome identificador para o pluviometro");
                p.setIdentificador(sc.nextLine());
                System.out.println("Informe a capacidade do "+ i + "º pluviometro");
                p.setCapacidade(sc.nextInt());

                sc.nextLine();
                c.setPluviometro(p);
            }
            caminhao.add(c);
            System.out.println("Se deseja encerrar digite fim");
            entrada = sc.nextLine().toLowerCase();
            
        }
        sc.close();
        Selecao.selecaoCaminhao(caminhao);
    }
    
}
