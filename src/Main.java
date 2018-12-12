import java.util.*;
public class Main {
    public static void main(String[] args)
    {
    double numb1;
    double numb2;
    Scanner scan = new Scanner(System.in);
    char input;
    System.out.println("Voeg uw eerste nummer in:");
    numb1 = scan.nextInt();
    System.out.println("Voeg uw tweede nummer in:");
    numb2 = scan.nextInt();
    System.out.println("Kies een optie: + , - , * , / , %");
    input = scan.next().charAt(0);
    if(input == '+'){
        System.out.println("Uw antwoord is: " + Optellen(numb1, numb2));
    }
    if (input == '-'){
        System.out.println("Uw antwoord is: " + Aftrekken(numb1, numb2));
    }
    if (input == '*'){
        System.out.print("Uw antwoord is: " + Vermenigvuldigen(numb1, numb2));
    }
    if (input == '/'){
        System.out.print("Uw antwoord is: " + Delen(numb1, numb2));
    }
    if (input == '%'){
        System.out.print("Uw antwoord is: " + Modulo(numb1, numb2));
    }
    }

    public static double Optellen(double numb1, double numb2)
    {
    double answer = 0.0;
            answer = numb1 + numb2;
    return answer;
    }
    public static double Aftrekken(double numb1, double numb2)
    {
    double answer = 0.0;
            answer = numb1 - numb2;
    return answer;
    }
    public static double Vermenigvuldigen(double numb1, double numb2)
    {
    double answer = 0.0;
            answer = numb1 * numb2;
    return answer;
    }
    public static double Delen(double numb1, double numb2)
    {
    double answer = 0.0;
            answer = numb1 / numb2;
     return answer;
    }
    public static double Modulo(double numb1, double numb2)
    {
    double answer = 0.0;
            answer = numb1 % numb2;
    return answer;
    }
}
