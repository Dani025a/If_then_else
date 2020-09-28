import java.util.Scanner;

public class If_Sætninger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv en hastighed: ");
        int fart = input.nextInt();
        //Vi får vores input som vi har ændret til en integer, som hedder fart

        if (fart <= 0 && fart >= 50)
            System.out.println("Hvorfor kører du så langsomt");
        //Hvis har er 0 eller større end og far er 50 eller mindre end, vil den være true og skrive den oventående tekst, Hvis den er false vil den kører videre
        else if (fart <50 && fart >= 100)
            System.out.println("Du kan godt kører hurtigere!");
        //Det samme sker her og hvis den er false igen kører den videre
        else if (fart <100)
            System.out.println("Du kører meget stærkt!");
        else
            System.out.println("Det er ikke muligt at kører den hastighed");
        //else er hvis alle ovenstående er false vil den skrive ovenstående tekst
    }
}
