public class Televisao {
    private int volume = 0;
    private int canal = 0;
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    
    public void aumentarVolume(){
        setVolume(++volume);
    }
    public void diminuirVolume(){
        if(getVolume() == 0){
            System.out.println("Volume já atingiu o mínimo");
        }else{
            setVolume(--volume);
        }
    }
    public void subirCanal(){
        setCanal(++canal);
    }
    public void descerCanal(){
        if(getCanal() == 0){
            setCanal(99);
        }else{
            setCanal(--canal);
        }
    }
    public void trocarCanal(int canal){
        setCanal(canal);
    }
    public int consultarCanal(){
        return getCanal();
    }

}
