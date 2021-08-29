package edu.wctc.salestool;

import edu.wctc.salestool.iface.SalesInput;
import edu.wctc.salestool.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesTool {
    private SalesInput input;
    private ShippingPolicy policy;

    @Autowired
    public SalesTool(SalesInput input, ShippingPolicy policy) {
        this.input = input;
        this.policy = policy;
        System.out.println("Created Sales");
    }

    public void generate(){
        input.getSales();
        List<Sale> sales = input.getSales();

        for( Sale s : sales){
            s.setShipping(policy.getShippingCost(s));
            System.out.println(s);
        }

    }
}
