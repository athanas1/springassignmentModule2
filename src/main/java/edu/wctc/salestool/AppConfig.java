package edu.wctc.salestool;

import edu.wctc.salestool.iface.SalesInput;
import edu.wctc.salestool.impl.SalesInputConsole;
import edu.wctc.salestool.impl.SalesInputTxt;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.salestool")
public class AppConfig {
    @Bean
    public SalesInput salesInput () {
        return new SalesInputTxt();
    }

}
