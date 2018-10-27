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
    public void Sljedeci() {
        this.sekunde++;
        if (this.sekunde == 60) {
            this.sekunde = 0; this.minute++;
        }
        if (this.minute == 60) {
            this.minute = 0; this.sati++;
        }
        if (this.sati == 24) {
            this.sati = 0;
        }
    }
    public void Prethodni() {
        this.sekunde--;
        if (this.sekunde == -1) {
            this.sekunde = 59; this.minute--;
        }
        if (this.minute == -1) {
            this.minute = 59; this.sati--;
        }
        if (this.sati == -1) {
            this.sati = 23;
        }
    }
   }
