//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Author marioPuzo = new Author("Mario", "Puzo");
        Book TheGodFather = new Book("The God Father", marioPuzo, 1969);
        Author AntoineDeSaintExupery = new Author("Antoine De", "Saint-Exupery");
        Book TheLittlePrince = new Book("The Little Prince", AntoineDeSaintExupery, 1943);

        System.out.println("TheGodFather.getReleaseYear() = " + TheGodFather.getReleaseYear());
        TheGodFather.setReleaseYear(1970);
        System.out.println("TheGodFather.getReleaseYear() = " + TheGodFather.getReleaseYear());

        System.out.println("TheGodFather.toString() = " + TheGodFather.toString());

        System.out.println(TheGodFather.equals(TheLittlePrince));
        TheLittlePrince.setBookTitle("The God Father");
        System.out.println(TheGodFather.equals(TheLittlePrince));

        System.out.println("AntoineDeSaintExupery.equals(marioPuzo) = " + AntoineDeSaintExupery.equals(marioPuzo));
        AntoineDeSaintExupery.setFirstName("Mario");
        AntoineDeSaintExupery.setLastName("Puzo");
        System.out.println("AntoineDeSaintExupery.equals(marioPuzo) = " + AntoineDeSaintExupery.equals(marioPuzo));
    }
}