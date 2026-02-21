public class CpuLoadTracker {
    public static void main(String[] args) {

        // CPU usage for 7 days (in percentage)
        int[] cpuLoad = {65, 70, 55, 80, 60, 75, 68};

        int highest = cpuLoad[0];
        int lowest = cpuLoad[0];
        int sum = 0;

        // Loop through the array
        for (int i = 0; i < cpuLoad.length; i++) {
            sum += cpuLoad[i];

            if (cpuLoad[i] > highest) {
                highest = cpuLoad[i];
            }

            if (cpuLoad[i] < lowest) {
                lowest = cpuLoad[i];
            }
        }

        double average = (double) sum / cpuLoad.length;

        // Output
        System.out.println("CPU Usage for 7 Days:");
        for (int load : cpuLoad) {
            System.out.print(load + "% ");
        }

        System.out.println("\n\nHighest CPU Load: " + highest + "%");
        System.out.println("Lowest CPU Load: " + lowest + "%");
        System.out.println("Average CPU Load: " + average + "%");
    }
}
