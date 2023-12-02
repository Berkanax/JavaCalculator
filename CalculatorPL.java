package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner dane = new Scanner(System.in);
        System.out.println("Cześć!");
        System.out.println("Aby rozpocząć podaj swoję imię: ");
        String imie = dane.nextLine();
        System.out.println("Uruchamiam kalkulator...");
        System.out.println("######################");
        System.out.println("##### KALKULATOR #####");
        System.out.println("######################\n");

        while (true) {
            System.out.println("Funkcje kalkulatora ( * | + | - | / )");
            System.out.println("Podaj pierwszą liczbę: ");
            double liczba1 = dane.nextDouble();
            dane.nextLine();
            System.out.println("Podaj drugą liczbę: ");
            double liczba2 = dane.nextDouble();
            dane.nextLine();
            System.out.println("Wybierz operacje ( * | + | - | / )");
            String operacja = dane.nextLine();
            double wynik;
            switch (operacja) {
                case "+":
                    wynik = liczba1 + liczba2;
                    break;

                case "-":
                    wynik = liczba1 - liczba2;
                    break;

                case "*":
                    wynik = liczba1 * liczba2;
                    break;

                case "/":
                    if (liczba2 != 0) {
                        wynik = liczba1 / liczba2;
                    } else {
                        System.out.println("Dzielenie przez zero!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error 505 - Coś poszło nie tak");
                    return;
            }
            System.out.println(imie + ", Twój wynik to: " + wynik);
            System.out.println("Czy chcesz wykonać nastepnę obliczenia? (tak/nie)");
            String decyzja = dane.nextLine();

            if (decyzja.equalsIgnoreCase("nie")) {
                break;
            }
        }
        dane.close();
        System.out.println("Kalkulator zakończył swoją pracę!");
        System.out.println("Miłaego dnia " + imie);
    }

}
