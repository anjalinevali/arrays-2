import java.util.HashSet;

public class DuplicateTransactions {
    public static void main(String[] args) {

        int[] transactionIds = {101, 202, 303, 101, 404, 202, 505, 303, 303};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int id : transactionIds) {
            if (!seen.add(id)) {
                duplicates.add(id); // add duplicate only once
            }
        }

        System.out.println("Duplicate Transaction IDs:");
        for (int dup : duplicates) {
            System.out.println(dup);
        }
    }
}
