import java.util.Scanner;

public class Switch_sætninger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv et tal mellem 1 og 10");
        int tal = input.nextInt();

        switch (tal){
            case 1: System.out.println("du har valgt tallet 1"); break;
            case 2: System.out.println("du har valgt tallet 2"); break;
            case 3: System.out.println("du har valgt tallet 3"); break;
            case 4: System.out.println("du har valgt tallet 4"); break;
            case 5: System.out.println("du har valgt tallet 5"); break;
            case 6: System.out.println("du har valgt tallet 6"); break;
            case 7: System.out.println("du har valgt tallet 7"); break;
            case 8: System.out.println("du har valgt tallet 8"); break;
            case 9: System.out.println("du har valgt tallet 9"); break;
            case 10: System.out.println("du har valgt tallet 10"); break;
            default: System.out.println("Du har skrevet noget forkert");
            //Det er det samme som if statements hvis case 1 er false vil den kører videre indtil en er dem er true
        }
    }
}
