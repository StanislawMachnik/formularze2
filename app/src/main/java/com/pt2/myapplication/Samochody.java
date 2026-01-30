package com.pt2.myapplication;

public class Samochody{
    private double cena;
    private String marka;
    private String model;
    private int rocznik;
    private boolean czyPierwszyWlasciciel;
    private String historia;


    public Samochody(double cena, String marka, String model, int rocznik, boolean czyPierwszyWlasciciel, String historia) {
        this.cena = cena;
        this.marka = marka;
        this.model = model;
        this.rocznik = rocznik;
        this.czyPierwszyWlasciciel = czyPierwszyWlasciciel;
        this.historia = historia;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return  marka + " " + model + "\n" + "Rocznik: " + rocznik + " \n" + historia +
                "\n" + "Pierwszy właściciel: " + (czyPierwszyWlasciciel ? "Tak" : "Nie");

    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public boolean isCzyPierwszyWlasciciel() {
        return czyPierwszyWlasciciel;
    }

    public void setCzyPierwszyWlasciciel(boolean czyPierwszyWlasciciel) {
        this.czyPierwszyWlasciciel = czyPierwszyWlasciciel;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
}
