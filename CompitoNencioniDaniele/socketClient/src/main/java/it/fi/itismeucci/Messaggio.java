package it.fi.itismeucci;

import java.util.*;

public class Messaggio {
    public ArrayList<Biglietto> biglietti;

    public Messaggio() {
    }

    public Messaggio(ArrayList<Biglietto> biglietti) {
        this.biglietti = biglietti;
    }

    public ArrayList<Biglietto> getBiglietti() {
        return this.biglietti;
    }

    public void setBiglietti(ArrayList<Biglietto> biglietti) {
        this.biglietti = biglietti;
    }
    
}
