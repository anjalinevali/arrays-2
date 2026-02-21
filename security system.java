
public class SecuritySystem {

    public static void main(String[] args) {

        // Failed login attempts for each user
        int[] failedAttempts = {1, 4, 2, 5, 3};

        // Check each user's attempts
        for (int i = 0; i < failedAttempts.length; i++) {
            System.out.println("User " + (i + 1) + " failed attempts: " + failedAttempts[i]);

            if (failedAttempts[i] > 3) {
                System.out.println("⚠ ALERT: User " + (i + 1) + " account is locked!");
            }
        }
    }
}
