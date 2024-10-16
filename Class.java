package com.company;

public class Card {
    private char deger;
    private boolean tahmin = false;

    public Card(char deger) {
        this.deger = deger;
    }

    public void setDeger(char deger) {
        this.deger = deger;
    }

    public char getDeger() {
        return this.deger;
    }
    public void setTahmin(boolean tahmin)
    { this.tahmin = tahmin; }

    public boolean isTahmin()
    { return this.tahmin; }
}
