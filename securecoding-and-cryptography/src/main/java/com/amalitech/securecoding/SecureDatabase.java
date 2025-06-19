package com.amalitech.securecoding;

import java.sql.*;

//public class SecureDatabase {
//    public void safeQuery(String userInput) throws SQLException {
//        String query = "SELECT * FROM accounts WHERE username = ?";
//        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebanking", "user", "password");
//             PreparedStatement stmt = conn.prepareStatement(query)) {
//            stmt.setString(1, userInput);
//            ResultSet rs = stmt.executeQuery();
//            while (rs.next()) {
//                System.out.println("Account Holder: " + rs.getString("name"));
//            }
//        }
//    }
//}