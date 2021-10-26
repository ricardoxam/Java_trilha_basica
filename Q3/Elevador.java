public class Elevador {
    private int andar_atual;
    private int total_andares;
    private int capacidade_total;
    private int capacidade_atual;
    public int getAndar_atual() {
        return andar_atual;
    }
    public void setAndar_atual(int andar_atual) {
        this.andar_atual = andar_atual;
    }
    public int getTotal_andares() {
        return total_andares;
    }
    public void setTotal_andares(int total_andares) {
        this.total_andares = total_andares;
    }
    public int getCapacidade_total() {
        return capacidade_total;
    }
    public void setCapacidade_total(int capacidade_total) {
        this.capacidade_total = capacidade_total;
    }
    public int getCapacidade_atual() {
        return capacidade_atual;
    }
    public void setCapacidade_atual(int capacidade_atual) {
        this.capacidade_atual = capacidade_atual;
    }
    
    public void inicializar(int capacidade_total, int capacidade_atual){
        setCapacidade_total(capacidade_total);
        setCapacidade_atual(capacidade_atual);
    }

    public void entrar(){
        if(getCapacidade_atual()<= getCapacidade_total()){
            setCapacidade_atual(++capacidade_atual);
        }else{
            System.out.println("O elevador está cheio.");
        }
    }

    public void sair(){
        if(getCapacidade_atual()>0){
            setCapacidade_atual(--capacidade_atual);
        }else{
            System.out.println("O elevador está vazio.");
        }
    }

    public void sobe(){
        if(getAndar_atual()<getTotal_andares()){
            setAndar_atual(++andar_atual);
        }else{
            System.out.println("O elevador está no andar limite!");
        }
    }

    public void desce(){
        if(getAndar_atual()>0 && getAndar_atual()<getTotal_andares()){
            setAndar_atual(--andar_atual);
        }else{
            System.out.println("O elevador já está no terreo.");
        }
    }
    
}
