package cryptography;

import java.security.MessageDigest;

public class HashingExample {
    public static String hashData(String data) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(data.getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static void main(String[] args) throws Exception {
        String sensitiveData = "BankAccount123";
        String hashedData = hashData(sensitiveData);
        System.out.println("Hashed: " + hashedData);
    }
}
