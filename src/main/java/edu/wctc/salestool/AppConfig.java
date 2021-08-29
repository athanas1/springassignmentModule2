package edu.wctc.salestool;

import edu.wctc.salestool.iface.SalesInput;
import edu.wctc.salestool.iface.SalesReport;
import edu.wctc.salestool.iface.ShippingPolicy;
import edu.wctc.salestool.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.salestool")
public class AppConfig {
    @Bean
    public SalesInput salesInput () {
        return new SalesInputTxt();

         //return new SalesInputConsole();
    }
    @Bean
    public ShippingPolicy shippingPolicy () {
        //return new FreeShipping();
        return new DomesticShipping();
    }
    @Bean
    public SalesReport salesReport() {
        //return new DetailedReport();
        return new SummaryReport();
    }

}
