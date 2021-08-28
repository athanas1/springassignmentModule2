package edu.wctc.salestool.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import edu.wctc.salestool.Sale;
import edu.wctc.salestool.iface.SalesInput;

public class SalesInputTxt implements SalesInput{
    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        Path pathToFile = Paths.get("sales.txt");

        try(BufferedReader br = Files.newBufferedReader(pathToFile)){
            String line = br.readLine();

            while(line != null){
                String[] attributes = line.split(",");

                Sale sale = createSale(attributes);

                sales.add(sale);


                line = br.readLine();
            }

        } catch(IOException ioe){
            ioe.printStackTrace();
        }
        return sales;
    }

    private static Sale createSale(String[] data){

        String customer = data[0];
        String country = data[1];
        double cost = Double.parseDouble(data[2]);
        double tax = Double.parseDouble(data[3]);

        return new Sale(customer,country,cost,tax);
    }
}
