package pl.kurs;

import lombok.*;

//@NoArgsConstructor // tworzy konstruktor bezargumentowy
@AllArgsConstructor // konstruktor ze wszystkimi polami
@RequiredArgsConstructor // zawiera tylko pola wymagane, final albo nonNull
@ToString
public class Employee {

    @NonNull
    private String name;
    private String surName;
    private double salary;
    private final String pesel;


//    https://nullpointerexception.pl/lombok-dobre-i-slabe-strony/

    /*
     * Stworz klase Piwo (marka, cena, jakosc piany, lista skladnikow, opcjonalna zawartosc alkoholu)
     * Stworz klase Alkoholik (imie, nazwisko, lista piw (asocjacja)).
     *
     * Piwo ma wyswietlac tylko marke i cene.
     *
     * Alkoholik ma wyswietlac tylko imie i nazwisNko
     *
     * W piwie marka ma byc polem niemodyfikowalnym
     *
     * Dwa piwa sa takie same jesli marka i cena jest taka sama
     *
     * Uzyj buildera do tworzenia obiektow + powiazan
     */

}