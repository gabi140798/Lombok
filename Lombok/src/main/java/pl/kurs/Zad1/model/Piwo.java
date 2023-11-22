package pl.kurs.Zad1.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@EqualsAndHashCode

public class Piwo {

    private final String marka;
    private double cena;
    private int jakoscPiany;
    private List<String> listaSkladnikow;
    private Double zawartoscAlkoholu;

    private Piwo(Builder builder) {
        this.marka = builder.marka;
        this.cena = builder.cena;
        this.jakoscPiany = builder.jakoscPiany;
        this.listaSkladnikow = builder.skladniki;
        this.zawartoscAlkoholu = builder.zawartoscAlkoholu;
    }

    @Override
    public String toString() {
        return String.format("Marka: %s, Cena: %s", marka, cena);
    }

    public static class Builder {
        private final String marka;
        private double cena;
        private int jakoscPiany;
        private List<String> skladniki;
        private Double zawartoscAlkoholu;

        public Builder(String marka) {
            this.marka = marka;
        }

        public Builder cena(double cena) {
            this.cena = cena;
            return this;
        }

        public Builder jakoscPiany(int jakoscPiany) {
            this.jakoscPiany = jakoscPiany;
            return this;
        }

        public Builder skladniki(List<String> skladniki) {
            this.skladniki = skladniki;
            return this;
        }

        public Builder zawartoscAlkoholu(Double zawartoscAlkoholu) {
            this.zawartoscAlkoholu = zawartoscAlkoholu;
            return this;
        }

        public Piwo build() {
            return new Piwo(this);
        }
    }
}



