public class Controle_Remoto {
    public static void main(String[] args) {
       Televisao t = new Televisao();
       //Aumentar volume:
       t.aumentarVolume();
       //Diminuir volume:
       t.diminuirVolume();
       //Subir um canal:
       t.subirCanal();
       //Descer canal:
       t.descerCanal();
       //Indicar um canal:
       t.trocarCanal(10);
       //Consultar canal;
       t.consultarCanal(); 
    }
    
    
}
