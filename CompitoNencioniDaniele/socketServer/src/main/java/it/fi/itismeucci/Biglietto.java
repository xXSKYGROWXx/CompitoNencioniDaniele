package it.fi.itismeucci;

import java.util.*;

public class Biglietto {
    public int id;
    public String posto;


    public Biglietto() {
    }


    public Biglietto(String posto) {
        this.posto = posto;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id, int numero) {
        numero = 0;
        this.id = numero++;
    }

    public String getPosto() {
        return this.posto;
    }

    public void setPosto(String posto) {
        this.posto = posto;
    }

}
