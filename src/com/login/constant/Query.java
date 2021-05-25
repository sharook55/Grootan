package com.login.constant;

public class Query {
    
    public static final String create = new StringBuilder("INSERT INTO details.login( first_name, last_name, email, phone_number, age, dob,")
                                                  .append("                               address1, address2, address3, username, password)")
                                                  .append("     VALUES ( ?, ?, ?, ?, ?)                                                    ")
                                                  .toString();
    
    public static final String readPass = new StringBuilder("SELECT username, password")
                                                    .append("  FROM details.login     ")
                                                    .append(" WHERE username = ?      ")
                                                    .toString();
    
    public static final String read = new StringBuilder("SELECT user_id, first_name, last_name, email, phone_number, age, dob,")
                                                .append("           address1, address2, address3, new_login.login_id, username")
                                                .append("  FROM details.login                                                 ")
                                                .toString();
}
