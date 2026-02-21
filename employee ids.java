public class HRSystem {
    public static void main(String[] args) {

        // 1. Create an array of employee IDs
        int[] employeeIds = {101, 102, 103, 104, 105};

        // 2. Print all employee IDs
        System.out.println("Employee IDs:");
        for (int id : employeeIds) {
            System.out.println(id);
        }

        // 3. Print total number of employees
        System.out.println("Total number of employees: " + employeeIds.length);
    }
}
