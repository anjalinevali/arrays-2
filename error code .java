
import java.util.HashMap;
import java.util.Map;

public class ErrorCodeAnalyzer {
    public static void main(String[] args) {

        // Logs storing error codes
        int[] errorCodes = {404, 500, 404, 403, 500, 404, 401, 500, 500};

        // Step 1: Count occurrences of each error code
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int code : errorCodes) {
            countMap.put(code, countMap.getOrDefault(code, 0) + 1);
        }

        // Print error code counts
        System.out.println("Error Code Counts:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println("Error Code " + entry.getKey() +
                               " → " + entry.getValue() + " times");
        }

        // Step 2: Identify most frequent error code
        int maxCount = 0;
        int mostFrequentCode = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentCode = entry.getKey();
            }
        }

        System.out.println("\nMost Frequent Error Code: " +
                           mostFrequentCode +
                           " (" + maxCount + " times)");
    }
}
