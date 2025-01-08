import java.util.Scanner;

public class ArrySearch {
    public static void main(String[] args) {

        int a, item;
        Scanner input = new Scanner(System.in);

        System.out.println(" Array Search program in Java");

        System.out.println("Enter Array Size");
        a = input.nextInt();

        if ( a <= 0 ){
            System.out.println(" Error: Array Size must be greater than 0!");
            return;

        }

        int[] n = new int[a];

        System.out.println("Enter your elements ");
        for (int i = 0; i < a; i++) {
            n[i] = input.nextInt();
        }

        System.out.println("Enter the number you want to search");
        item = input.nextInt();

        boolean found = false;
        for (int i = 0; i < a; i++) {
            if (n[i] == item) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("item not Found!");
        }

        input.close();

    }
}




