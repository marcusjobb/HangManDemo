import java.util.Objects;

public class Word {

    // Egenskaper: Hanterar ordet vi gissar på
    // Metoder:
    // getOrd(): returnerar ordet
    // getGissning(): returnerar det gissade ordet
    // matchaBokstav(): kollar om en given bokstav matchar någon i ordet
    // ersättBokstav(): ersätter alla matchande streck i ordet med en bokstav
    // harGissat(): Kollar om det gissade ordet är som det man ska gissa på
    //
    // String ord (katt)
    // String gissning (----)

    private String word;
    private String guess;

    public Word(String word) {
        this.word = word;
        this.guess = "";
        for (int i = 0; i < word.length(); i++) {
            guess += "-";
        }
    }

    // Returnerar ordet man gissar på
    public String getWord() { return word;  }

    // Returnerar gissningsresultat
    public String getGuess() { return guess; }

    // Returnerar ifall gissningen finns i ordet
    public Boolean Contains(String letter) {
        // Kolla om bokstaven finns i ordet... hint: indexOf eller Contains
        // tänk på att det INTE får vara case sensitive  "k" == "K"
    }

    public void replaceGuess(String guess) // Varning: klurig metod
    {
        // Loopa igenom word och ersätt alla matchande tecken i guess
    }

    public Boolean hasGuessed()
    {
        return Objects.equals(guess.toLowerCase(), word.toLowerCase());
    }

}
