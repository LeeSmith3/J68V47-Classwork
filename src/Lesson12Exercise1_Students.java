public class Lesson12Exercise1_Students {

    public static class Student {

        public int id = 3412323;
        public String firstName = "John";
        public String surname = "Smith";

        public boolean present = true;

    }
    public static void displayStudent(Student thisStudent) {
        System.out.format("(%d) %s %s %n", thisStudent.id, thisStudent.firstName, thisStudent.surname);
    }

    public static void main(String[] args) {
        // create student object and display
        Student student1 = new Student();
        displayStudent(student1);
        // update values of student object and display
    }
}
