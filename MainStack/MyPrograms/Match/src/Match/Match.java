package Match;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Match {
    public static void main (String[] args) throws IOException {
              BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int c1 = 0;
        int c2 = 0;
        while (true) {
            int x = Integer.parseInt(reader.readLine());
            int y = Integer.parseInt(reader.readLine());
            System.out.println("Счет:");
            if (x > 0) c1 = c1 + x;
            if (y > 0) c2 = c2 + y;
            System.out.println("Первая команда: " + c1 + " | " + "Вторая команда: " + c2);
            System.out.println(" ");
            if (c1 >= 100 && c1 > c2) {
                System.out.println("Победитель: ");
                System.out.println("Победила первая команда со счетом: " + c1);
                break;
            }
            System.out.println(" ");
            if (c2 >= 100 && c2 > c1) {
                System.out.println("Победитель: ");
                System.out.println("Победила вторая команда со счетом: " + c2);
                break;
            }
        }
    }
}
