import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twoDigits = twoDigits();
        int over500 = over500();
        int greatest = greatest();
        int smallest = smallest();
        int sum = sum();
        int totalCount = totalCount();
        System.out.print("Odds: ");
        System.out.println(odds);
        System.out.print("Evens: ");
        System.out.println(evens);
        System.out.print("Two Digits: ");
        System.out.println(twoDigits);
        System.out.print("Greater than 500: ");
        System.out.println(over500);
        System.out.println("Greatest: " + greatest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Sum: " + sum);
        System.out.println("Total: " + totalCount);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 1)
                evens++;
        }
        return evens;
    }

    public static int twoDigits() throws FileNotFoundException {
        s = new Scanner(f);
        int twoDigits = 0;
        while (s.hasNext()) {
            int num = s.nextInt();
            if ((num >= 10 && num <= 99) || (num <= -10 && num >= -99)) {
                twoDigits++;
            }
        }
        return twoDigits;
    }

    public static int over500() throws FileNotFoundException {
        s = new Scanner(f);
        int over500 = 0;
        while (s.hasNext()) {
            if (s.nextInt() > 500) 
            over500++;
        }
        return over500;
    }

    public static int greatest() throws FileNotFoundException {
        s = new Scanner(f);
        int greatest = 0;
        while (s.hasNext()) {
            if (s.nextInt() > greatest)
            greatest = s.nextInt();
        }
        return greatest;
    }

    public static int smallest() throws FileNotFoundException {
        s = new Scanner(f);
        int smallest = 0;
        while (s.hasNext()) {
            if (s.nextInt() < smallest)
            smallest = s.nextInt();
        }
        return smallest;
    }

    public static int sum() throws FileNotFoundException {
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext()) {
            sum += s.nextInt();
        }
        return sum;
    }

    public static int totalCount() throws FileNotFoundException {
        s = new Scanner(f);
        int totalCount = 0;
        while (s.hasNext()) {
            totalCount++;
        }
        return totalCount;
    }
    
}