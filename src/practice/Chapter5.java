package practice;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class Chapter5 {

    public static void main(String[] args) {
        Map<LocalDate, String> tasks = new TreeMap<>();
        
        tasks.put(LocalDate.of(2021, 10, 21), "牛乳を買う");
        tasks.put(LocalDate.of(2021, 9, 15), "○○社面談");
        tasks.put(LocalDate.of(2021, 12, 4), "手帳を買う");
        tasks.put(LocalDate.of(2021, 8, 10), "散髪に行く");
        tasks.put(LocalDate.of(2021, 11, 9), "スクールの課題を解く");
        
        tasks.forEach((date, task) -> System.out.println(date + ":" + task));
    }
}