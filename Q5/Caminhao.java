import java.util.ArrayList;

public class Caminhao {
    
    private String tipo;
    private int quantidade;
    private ArrayList<Pluviometro>  pluviometro = new ArrayList<>();

    public int calcularCapacidade() {
        int total = 0;
        for (Pluviometro pluviometro2 : pluviometro) {
            total += pluviometro2.capacidade;
        }
        return total;
    }

    public String getTipo() {
        return tipo;
    }
    public ArrayList<Pluviometro> getPluviometro() {
        return this.pluviometro;
    }
    public void setPluviometro(Pluviometro pluviometro) {
        this.pluviometro.add(pluviometro);
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;

    }
    
}
