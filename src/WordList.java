import java.util.ArrayList;

public class WordList {

    // Egenskaper: En lista med ord
    // Metoder:
    // constructor: Generera en standardlista
    // slumpOrd(): väljer ett slumpmässigt ord från listan
    // läggTillOrd(): lägger till ett ord till listan
    // taBortOrd(): tar bort ett ord från listan
    // getOrd(): Visa nuvarande valt ord
    //
    // ArrayList

    ArrayList<String> wordList;
    String currentWord;

    public WordList()
    {
        wordList=new ArrayList<>();
        wordList.add("Katt");
        wordList.add("Hund");
        wordList.add("Elefant");
    }

    public String getRandomWord()
    {
        // Välj en slumpmässig siffra mellan 0 och wordList.Length
        // returnera ordet i det index som slumptalet visar
        // currentWord ska ha värdet av ordet i index
    }

    public void AddWord(String word) { wordList.add((word)); }

    public void removeWord(String word) { wordList.remove(word);}

    public String getCurrentWord() { return currentWord; }


}
