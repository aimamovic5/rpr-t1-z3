package ba.unsa.etf.rpr;
import java.io.PrintStream;

public class Sat {
    private int sati;
    private int minute;
    private int sekunde;
    public Sat(int sati, int minute, int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }
    void Postavi(int sati, int minute, int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }
    void Sljedeci() {
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
    void Prethodni() {
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
    void PomjeriZa(int pomak) {
        if (pomak > 0) for (int i = 0; i < pomak; i++) this.Sljedeci();
        else for (int i = 0; i > pomak; i--) this.Prethodni();
    }
    final int DajSate() { return this.sati; }
    final int DajMinute() { return this.minute; }
    final int DajSekunde() { return this.sekunde; }
    final void Ispisi() {
        System.out.println(Integer.toString(this.DajSate())+":"+Integer.toString(this.DajMinute())+":"+Integer.toString(this.DajSekunde()));
    }
   }
