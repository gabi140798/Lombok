package pl.kurs.Zad1;

import pl.kurs.Zad1.model.Piwo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
         * Stworz klase Piwo (marka, cena, jakosc piany, lista skladnikow, opcjonalna zawartosc alkoholu)
         * Stworz klase Alkoholik (imie, nazwisko, lista piw (asocjacja)).
         *
         * Piwo ma wyswietlac tylko marke i cene - zrobione
         *
         * Alkoholik ma wyswietlac tylko imie i nazwisNko - zrobione
         *
         * W piwie marka ma byc polem niemodyfikowalnym - zrobione
         *
         * Dwa piwa sa takie same jesli marka i cena jest taka sama
         *
         * Uzyj buildera do tworzenia obiektow + powiazan
         */

        Piwo piwo1 = new Piwo.Builder("Tyskie").cena(4.5).build();
        Piwo piwo2 = new Piwo.Builder("Żubr").cena(5.0).build();
        Piwo piwo3 = new Piwo.Builder("Tyskie").cena(4.5).build();
        Piwo piwo4 = new Piwo.Builder("Okocim").cena(5.0).build();

        System.out.println("Czy piwo1 jest takie samo jak piwo2? " + piwo1.equals(piwo2));
        System.out.println("Czy piwo1 jest takie samo jak piwo3? " + piwo1.equals(piwo3));
        System.out.println("Czy piwo1 jest takie samo jak piwo4? " + piwo1.equals(piwo4));

        List<Piwo> listaPiw = new ArrayList<>();
        listaPiw.add(piwo1);
        System.out.println("Czy lista piw zawiera piwo3? " + listaPiw.contains(piwo3));
    }

    }
