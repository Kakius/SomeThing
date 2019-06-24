package Match;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Match {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int c1 = 0;
        int c2 = 0;
        while (true){
            int x = Integer.parseInt(reader.readLine());
            int y = Integer.parseInt(reader.readLine());
            if (x > 0) c1 = c1 + x;
            if (y > 0) c2 = c2 + y;
            System.out.println("Первая команда :" + c1 + " " + "очков");
            System.out.println("Вторая команда :" + c2 + " " + "очков");
        }
        Data currentDate = new Date();
        System.out.println(currentDate);
    }
}
