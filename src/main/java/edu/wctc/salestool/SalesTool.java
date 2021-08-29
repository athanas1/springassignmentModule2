package edu.wctc.salestool;

import edu.wctc.salestool.iface.SalesInput;
import edu.wctc.salestool.iface.SalesReport;
import edu.wctc.salestool.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesTool {
    private SalesInput input;
    private ShippingPolicy policy;
    private SalesReport report;

    @Autowired
    public SalesTool(SalesInput input, ShippingPolicy policy , SalesReport report) {
        this.input = input;
        this.policy = policy;
        this.report = report;
        System.out.println("Created Sales");
    }

    public void generate(){

        List<Sale> sales = input.getSales();

        for( Sale s : sales){
            s.setShipping(policy.getShippingCost(s));
        }
        report.generateReport(sales);

    }
}
