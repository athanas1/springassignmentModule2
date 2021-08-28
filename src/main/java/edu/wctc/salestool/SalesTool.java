package edu.wctc.salestool;

import edu.wctc.salestool.iface.SalesInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesTool {
    private SalesInput input;

    @Autowired
    public SalesTool(SalesInput input) {
        this.input = input;
        System.out.println("Created Sales");
    }

    public void generate(){
        input.getSales();
        List<Sale> sales = input.getSales();

        for( Sale s : sales){
            System.out.println(s);
        }

    }
}
