package edu.wctc.salestool.impl;

import edu.wctc.salestool.Sale;
import edu.wctc.salestool.iface.SalesInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SalesInputConsole implements SalesInput {
    @Override
    public List<Sale> getSales(){
        List<Sale> sales = new ArrayList<>();
        String quit;
        Scanner scanner = new Scanner(System.in);
            do {

                System.out.println("What is the Customer name?");

                String customer = scanner.nextLine();

                System.out.println("What Country are they from?");
                String country = scanner.nextLine();

                System.out.println("What is the price of their Bill?");
                double cost = Double.parseDouble(scanner.nextLine());

                System.out.println("What is their tax?");
                double tax = Double.parseDouble(scanner.nextLine());

                Sale sale = createSale(customer,country,cost,tax);

                sales.add(sale);

                System.out.println("Add another entry? Y/N");
                quit = scanner.nextLine().toUpperCase();
                System.out.println(quit);
            } while (quit == "Y");

        return sales;
    }

    private static Sale createSale(String customer, String country, double cost, double tax){

        String c = customer;
        String c2 = country;
        double c3 = cost;
        double t = tax;

        return new Sale(c,c2,c3,t);
    }

}
