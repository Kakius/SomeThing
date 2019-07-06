package Match;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Match {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<String> team = new ArrayList<String>();
    static ArrayList<Integer> score = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {
        String name;

        int t1 = 0, t2 = 0, t3 = 0, t4= 0, t5 = 0, t6 = 0, t7 = 0, t8 = 0, t9 = 0, t10 = 0, t11 = 0, t12 = 0;

        //Добовляем команды в список
        System.out.println("Введите название команды: ");
        for (int i = 0; i < 2; i++) {
            name = reader.readLine();
            team.add(name);
        }
        System.out.println("Подсчет очков команд: ");
        for (int i = 0; i < 2; i++) {
            int x1 = Integer.parseInt(reader.readLine());
            int y1 = Integer.parseInt(reader.readLine());
            if (x1 > 0) t1 = t1 + x1;
            if (y1 > 0) t2 = t2 + y1;
            System.out.println("Команда" + " " + team.get(0) + ": " + t1 + " | " + "Команда" + " " + team.get(1) + ": " + t2);
            if (t1 > t2) {
                System.out.print("Во второй этап проходит команда: ");
                System.out.print(team.get(0));
                System.out.println(" со счетом: " + t1);
            }
            if (t2 <= 10 || t1 < t2) {
                System.out.print("Во второй этап проходит команда: ");
                System.out.print(team.get(1));
                System.out.println(" со счетом: " + t2);
            }
            if (t1 > t2) {
                score.add(t1);
            } else {
                score.add(t2);
            }
/*
            int x2 = Integer.parseInt(reader.readLine());            if (x2 > 0) t1 = t3 + x2;
            int y2 = Integer.parseInt(reader.readLine());            if (y2 > 0) t2 = t4 + y2;

            int x3 = Integer.parseInt(reader.readLine());            if (x3 > 0) t1 = t5 + x3;
            int y3 = Integer.parseInt(reader.readLine());            if (y3 > 0) t2 = t6 + y3;

            int x4 = Integer.parseInt(reader.readLine());            if (x4 > 0) t1 = t7 + x4;
            int y4 = Integer.parseInt(reader.readLine());            if (y4 > 0) t2 = t8 + y4;

            int x5 = Integer.parseInt(reader.readLine());            if (x5 > 0) t1 = t9 + x5;
            int y5 = Integer.parseInt(reader.readLine());            if (y5 > 0) t2 = t10 + y5;

 */
        }
        System.out.println("Команда: " + team.get(0) + " | " + score.get(0));
        System.out.println("Команда: " + team.get(1) + " | " + score.get(1));
    }
}
