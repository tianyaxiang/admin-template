package com.tianyaxiang.springboot.adminlte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author tianyaxiang
 */
@SpringBootApplication
public class SpringbootAdminlteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAdminlteApplication.class, args);

        List<String> stockList = new ArrayList<String>();
        stockList.add("stock1");
        stockList.add("stock2");
        stockList.add("stock3");

        for (Iterator<String> i = stockList.iterator(); i.hasNext();) {
            stockList.remove(2);
            String item = i.next();
            System.out.println(item);
        }

    }
}
