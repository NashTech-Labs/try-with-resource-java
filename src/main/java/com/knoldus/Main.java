package com.knoldus;

import com.knoldus.ordering.AutoCloseableResourcesFirst;
import com.knoldus.ordering.AutoCloseableResourcesSecond;

public class Main {
    public static void main(String[] args) throws Exception {
        orderOfClosingResources();
    }

    // Ordering --
    private static void orderOfClosingResources() throws Exception {
        try (AutoCloseableResourcesFirst af = new AutoCloseableResourcesFirst();
             AutoCloseableResourcesSecond as = new AutoCloseableResourcesSecond()) {

            af.doSomething();
            as.doSomething();
        }
    }
}
