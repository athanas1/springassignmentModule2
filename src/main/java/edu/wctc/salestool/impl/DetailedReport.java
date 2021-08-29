package edu.wctc.salestool.impl;

import edu.wctc.salestool.Sale;
import edu.wctc.salestool.iface.SalesReport;

import java.util.List;

public class DetailedReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SALES SUMMARY REPORT");
        for(Sale s : salesList){
            System.out.println(s);
        }
    }
}
