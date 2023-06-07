import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;
/*
 * Create the Student and Priorities classes here.
 */
  class Student{
     
     private int id;
     
     private String name;
     
     private double cgpa;
     
    public Student(int id, String name, double cgpa){
        
        this.id = id;
        
        this.name = name;
        
        this.cgpa = cgpa;
        
    }
        int getID(){
            
            return this.id;
        }
        
        String getName(){
            
            return this.name;
            
        }
        double getCGPA(){
            
            return this.cgpa;
        }
 }
     
    class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>(
            Comparator.comparing(Student::getCGPA).reversed()
                .thenComparing(Student::getName)
                .thenComparing(Student::getID)
        );
        for (String event : events) {
            String[] parts = event.split("\\s+");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                Student student = new Student(id, name, cgpa);
                queue.add(student);
            } else if (parts[0].equals("SERVED")) {
                queue.poll();
            }
        }
        List<Student> students = new ArrayList<>(queue);
        students.sort(Comparator.comparing(Student::getCGPA).reversed()
            .thenComparing(Student::getName)
            .thenComparing(Student::getID)
        );
        return students;
    }
    }


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}