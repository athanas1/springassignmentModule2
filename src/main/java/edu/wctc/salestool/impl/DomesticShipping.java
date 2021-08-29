package edu.wctc.salestool.impl;

import edu.wctc.salestool.Sale;
import edu.wctc.salestool.iface.ShippingPolicy;

public class DomesticShipping implements ShippingPolicy {
    @Override
    public double getShippingCost(Sale sale) {
        double ship = 0;
        switch(sale.getCountry()){
            case "United States":
                ship = 5;
                break;
            case "Japan":
                ship = 7.50;
                break;
            case "Scotland":
                ship = 1.25;
                break;
            case "India":
                ship = 2.35;
                break;
            default:
                ship = 3.55;
        }
        return ship;
    }
}
