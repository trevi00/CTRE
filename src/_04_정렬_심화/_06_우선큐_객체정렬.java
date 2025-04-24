package _04_정렬_심화;

import java.util.PriorityQueue;

public class _06_우선큐_객체정렬 {
    public static void main(String[] args) {
        String[][] students = {
                {"Alice", "90"},
                {"Bob", "85"},
                {"Charlie", "95"}
        };

        PriorityQueue<Student> pq = new PriorityQueue<>((a, b) -> {
            if(a.score == b.score) return a.name.compareTo(b.name);
            return b.score - a.score;
        });

        for(String[] student : students){
            Student st = new Student(student[0], Integer.parseInt(student[1]));
            pq.offer(st);
        }

        for(int i = 0; i < students.length; i++){
            Student student = pq.poll();
            System.out.println(student.name + " : " + student.score);
        }

    }
}

class Student {
    String name;
    int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }
}