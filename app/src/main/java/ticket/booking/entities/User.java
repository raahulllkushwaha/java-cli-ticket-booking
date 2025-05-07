package ticket.booking.entities;

import sun.security.krb5.internal.Ticket;

import java.util.List;

public class User {
    private String name;
//    private String email;
    private String password;
    private String hashedPassword;
    private List<Ticket> ticketsBooked;
    private String userId;
    public static void main(String[] args) {

    }
}
