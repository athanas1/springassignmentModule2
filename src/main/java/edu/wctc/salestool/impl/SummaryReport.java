package edu.wctc.salestool.impl;

import edu.wctc.salestool.Sale;
import edu.wctc.salestool.iface.SalesReport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SummaryReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        ArrayList<String> countries = new ArrayList<>();
        //I struggled trying to add the sum of the arrays based on the country attribute, Any tips? DOESN'T WORK WITH CONSOLE INPUT
        double usCost = 0;
        double scotCost = 0;
        double japanCost = 0;
        double indiaCost = 0;
        double cost = 0;
        double usTax = 0;
        double scotTax = 0;
        double japanTax = 0;
        double indiaTax = 0;
        double tax = 0;
        double usShipping = 0;
        double scotShipping = 0;
        double japanShipping = 0;
        double indiaShipping = 0;
        double shipping = 0;


        for(Sale s : salesList) {
            countries.add(s.getCountry());
            if (s.getCountry().contains("United States")) {
                usCost += s.getAmount();
                usTax += s.getTax();
                usShipping += s.getShipping();
            } else if (s.getCountry().contains("India")) {
                indiaCost += s.getAmount();
                indiaTax += s.getTax();
                indiaShipping += s.getShipping();
            } else if (s.getCountry().contains("Japan")) {
                japanCost += s.getAmount();
                japanTax += s.getTax();
                japanShipping += s.getShipping();
            }else if(s.getCountry().contains("Scotland")){
                scotCost += s.getAmount();
                scotTax += s.getTax();
                scotShipping += s.getShipping();
            } else{
                cost += s.getAmount();
                tax += s.getTax();
                shipping += s.getShipping();
            }
        }
        Set<String> uniqueCountries = new HashSet<String>(countries);

        String [] countarray = uniqueCountries.toArray(new String[uniqueCountries.size()]);

        System.out.println(uniqueCountries);
        System.out.println(countarray[0] + " Cost: " + usCost + " Tax: " + usTax + " Shipping: " + usShipping);
        System.out.println(countarray[1] + " Cost: " + japanCost + " Tax: " + japanTax + " Shipping: " + japanShipping);
        System.out.println(countarray[2] + " Cost: " + scotCost + " Tax: " + scotTax + " Shipping: " + scotShipping);
        System.out.println(countarray[3] + " Cost: " + indiaCost + " Tax: " + indiaTax + " Shipping: " + indiaShipping);
        System.out.println("Other Cost: " + cost + " Tax: " + tax + " Shipping: " + shipping);

    }
}
