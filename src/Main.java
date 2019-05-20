import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj pierwszą z pięciu liczb");
        int number1 = input.nextInt();
        System.out.println("Podaj drugą z pięciu liczb");
        int number2 = input.nextInt();
        System.out.println("Podaj trzecią z pięciu liczb");
        int number3 = input.nextInt();
        System.out.println("Podaj czwartą z pięciu liczb");
        int number4 = input.nextInt();
        System.out.println("Podaj piatą  z pięciu liczb");
        int number5 = input.nextInt();

        int[] numbers  = {number1,number2,number3,number4,number5};

        System.out.println("Suma pierwszej, trzeciej i piątej liczby wynosi " + (numbers[0]+numbers[2]+numbers[4]));
    }


}

