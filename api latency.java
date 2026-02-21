public class ApiLatency {
    public static void main(String[] args) {
        int[] responseTimes = {1200, 2500, 1800, 3200, 900, 2100};
        int total = 0;

        System.out.print("Slow APIs (>2000ms): ");
        for (int time : responseTimes) {
            total += time;
            if (time > 2000) {
                System.out.print(time + " ");
            }
        }

        double average = (double) total / responseTimes.length;
        System.out.println("\nAverage Response Time: " + average + " ms");
    }
}
