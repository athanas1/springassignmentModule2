package edu.wctc.salestool.impl;

import edu.wctc.salestool.Sale;
import edu.wctc.salestool.iface.ShippingPolicy;

public class FreeShipping implements ShippingPolicy {
    @Override
    public double getShippingCost(Sale sale) {
        return 0;
    }
}
