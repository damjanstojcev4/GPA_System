package gpa;

public class App {
    public static void main(String[] args) {
        Student damjan = new Student("Damjan");
        damjan.add("Math", 'C');
        damjan.add("English", 'A');
        damjan.add("History", 'B');
        damjan.add("Geography", 'D');

        System.out.println(damjan.getName() + " has a GPA of " + damjan.getGPA());
        System.out.println("It is obtained " + " from these subjects: ");

        for (String str: damjan.getSubject()) {
            System.out.println(str);
        }
    }
}
