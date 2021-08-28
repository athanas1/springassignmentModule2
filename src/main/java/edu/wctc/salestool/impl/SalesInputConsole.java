package edu.wctc.salestool.impl;

import edu.wctc.salestool.Sale;
import edu.wctc.salestool.iface.SalesInput;

import java.util.List;

public class SalesInputConsole implements SalesInput {
    @Override
    public List<Sale> getSales() {
        System.out.println("Hello");
        return null;
    }
}
