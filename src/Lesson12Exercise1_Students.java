public class Lesson12Exercise1_Students {

    public class Student {

        public int id = 0;
        public String firstName = "";
        public String surname = "";

        public boolean present = true;

    }
    public static void displayStudent(Student thisStudent) {
        System.out.format("(%d) %s %s %n", thisStudent.id, thisStudent.firstName, thisStudent.surname);
    }

    public void main(String[] args) {
        // create student object and display
        Student student1 = new Student();
        displayStudent(student1);
        // update values of student object and display
    }
}
