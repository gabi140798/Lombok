package pl.kurs.Zad1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Getter

public class Alkoholik {

    private String imie, nazwisko;
    private List<Piwo> listaPiw = new ArrayList<>();

    @Override
    public String toString() {
        return String.format("Imię: %s, Nazwisko: %s", imie,nazwisko);
    }
}
