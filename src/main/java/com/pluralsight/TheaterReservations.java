package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner reservationScanner = new Scanner(System.in);
        System.out.println("Please enter your full name:");
        String nameInput = reservationScanner.nextLine();
        System.out.println("Please enter the day you would like to watch the movie (MM/dd/yyyy):");
        String dateInput = reservationScanner.nextLine();
        System.out.println("Please enter the number of tickets you would like to purchase:");
        int ticketInput = reservationScanner.nextInt();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate movieDate = LocalDate.parse(dateInput, dateFormatter);

        if (ticketInput > 1) {
            System.out.println(ticketInput + " movie tickets reserved under " + nameInput + " on " + movieDate);
        } else if (ticketInput == 1) {
            System.out.println(ticketInput + " movie ticket reserved under " + nameInput + " on " + movieDate);
        } else {
            System.out.println("Invalid ticket selection");
        }
    }
}
