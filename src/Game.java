import java.util.ArrayList;

public class Game {
    // Egenskaper:
    // En instans av Ordlista-klassen
    // En instans av Ord-klassen
    // En instans av Spelare-klassen
    // Antal gissningar
    // En lista med gissade bokstäver
    // Metoder:
    // startaSpel(): initierar ett nytt spel (loop)
    // gissa(): låter spelaren gissa en bokstav (boolean)
    // avslutaSpel(): avslutar spelet (shutdown)
    // vinnare(): kollar om spelaren vunnit spelet (boolean)
    //
    // Ordlista ordlista;
    // Ord ord;
    // int antalGissningar;
    // Klassen är "beroende" av att Ordlista och Ord klasserna finns och fungerar!
    //
    // Game |-> Ord
    //      |-> Ordlista
    //
    // Om klassen Ord eller Ordlista inte fungerar så drabbas Game.

    // Klassvariabler - alla metoder kan nå dem, men ingen utanför klassen kan se dem!
    Word word;
    WordList wordList;
    ArrayList<String> History;
    int guesses;

    public void StartGame()
    {
        // Sätt ALLA standardvärden för att spelet ska fungera likadant varje gång
        // Instansiera wordlist
        // Fråga wordlist om ett ord och skicka den till Word
        // Instansiera History
        // Sätt guesses till 0

        //  Loop att köra så länge spelaren inte vunnit (anropa checkForWinner())
        // while (checkForWinner())
        // {
        //  Öka guesses för varje iteration
        //  Fråga användaren om gissning (anropa Gissa())
        //  Om spelaren skriver "Lägg av" anropa avsluta spel (flytta till checkGuess())
        //  Kontrollera att vi inte gissat på samma sak innan (flytta till checkGuess())
        //  Kontrollera med word om gissningen är OK (flytta till checkGuess())
        //  Uppdatera ord med gissning
        // }
        // När loopen är klar, skriv Game Over
    }

    private void checkGuess(String guess)
    {
        // Kolla om spelaren vill sluta spela
        if (guess=="lägg av") avslutaSpel();
        // Kolla historiken
        if (History.contains(guess))
        {
            System.out.println("Var inte så fantasilös! Gissa på något annat!");
            return;
        }
        // Kolla om gissningen är OK och i så fall uppdatera ordet
        if (word.Contains(guess))
        {
            word.replaceGuess(guess);
            // Lägg gissningen i historiken.
            History.add(guess);
        }
    }

    public String gissa() {
        // Scanner som frågar efter en gissning
    }

    public void avslutaSpel(){
        System.exit(0);
    }

    public Boolean checkForWinner() {
        // Fråga ordklassen om spelaren vunnit
        return word.hasGuessed();
    }
}
