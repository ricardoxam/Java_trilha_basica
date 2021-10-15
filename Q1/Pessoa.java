import java.util.Calendar;

public class Pessoa{
    private String nome;
    private String data_nascimento;
    private double altura;

    public Pessoa (String nome, String data_nascimento, double altura){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.altura = altura;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    

    public void imprimirDados(){
        System.out.println("O nome da pessoa é: " +getNome());
        System.out.println("A altura da pessoa é: " +getAltura());
        System.out.println("A idade da pessoa é: " +calcularIdade());
    }

    public int calcularIdade(){
        String [] resultado = getData_nascimento().split("-");
        int ano = Integer.parseInt(resultado[2]);
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        return (anoAtual - ano);

    }


    


}