package edu.wctc.salestool.iface;

import edu.wctc.salestool.Sale;

public interface ShippingPolicy {
    double getShippingCost(Sale sale);

}
