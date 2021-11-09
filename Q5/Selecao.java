import java.util.ArrayList;

public class Selecao extends Controle {
    private static int maior = -1;
    private static int indiceMaior = -1;


    public static int getMaior() {
        return maior;
    }
    public static void setMaior(int maior) {
        Selecao.maior = maior;
    }
    public static int getIndiceMaior() {
        return indiceMaior;
    }
    public static void setIndiceMaior(int indiceMaior) {
        Selecao.indiceMaior = indiceMaior;
    }
        
    public static void selecaoCaminhao(ArrayList<Caminhao> caminhao) {
        for(int i=0; i<caminhao.size(); i++){
        int parcial = caminhao.get(i).calcularCapacidade();
            if (parcial >getMaior()) {
                setMaior(parcial);
                setIndiceMaior(i);
            }
        }
        System.out.println("O caminhão com a maior capacidade é: "+ caminhao.get(getIndiceMaior()).getTipo() + "O seu indice é: " + getIndiceMaior()) ;
        System.out.println("A capacidade dele é de: "+ getMaior());

    }       
}
