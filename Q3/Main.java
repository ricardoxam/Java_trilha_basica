public class Main {
    public static void main(String[] args) {
        Elevador el = new Elevador();

        el.inicializar(100, 0);

        el.entrar();

        System.out.println(el.getCapacidade_atual());

        
    }
    
}
