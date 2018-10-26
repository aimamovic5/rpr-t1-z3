package ba.unsa.etf.rpr;

public class Sat {
    private int sati;
    private int minute;
    private int sekunde;
    public Sat(int sati, int minute, int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }
    public void Postavi(int sati, int minute, int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }

}
