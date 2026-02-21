public class StudentMarks {

    public static void main(String[] args) {

        int[] marks = {85, 72, 40, 101, -5}; // you can change values
        int passMarks = 35;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");

            // Check invalid marks
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks");
            }
            // Check pass or fail
            else if (marks[i] >= passMarks) {
                System.out.println("Pass");
            }
            else {
                System.out.println("Fail");
            }
        }
    }
}
