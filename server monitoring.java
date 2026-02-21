public class ServerMonitoring {
    public static void main(String[] args) {
        int[] logs = {1, 0, 0, 1, 0, 0, 0, 1};

        int totalDowntime = 0;
        int maxDowntime = 0;
        int currentDowntime = 0;

        for (int status : logs) {
            if (status == 0) {
                totalDowntime++;
                currentDowntime++;
                maxDowntime = Math.max(maxDowntime, currentDowntime);
            } else {
                currentDowntime = 0;
            }
        }

        System.out.println("Total downtime hours: " + totalDowntime);
        System.out.println("Longest continuous downtime: " + maxDowntime);
    }
}
