package edu.wctc.salestool.iface;

import edu.wctc.salestool.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}
