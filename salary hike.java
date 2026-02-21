public class SalaryIncrement {

    public static void main(String[] args) {

        // Step 1: Store salaries in an array
        double[] salaries = {25000, 30000, 40000, 50000, 60000};

        System.out.println("Original Salaries:");
        for (double salary : salaries) {
            System.out.println(salary);
        }

        // Step 2: Increase each salary by 10%
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = salaries[i] + (salaries[i] * 0.10);
        }

        // Step 3: Print updated salaries
        System.out.println("\nUpdated Salaries after 10% hike:");
        for (double salary : salaries) {
            System.out.println(salary);
        }
    }
}

