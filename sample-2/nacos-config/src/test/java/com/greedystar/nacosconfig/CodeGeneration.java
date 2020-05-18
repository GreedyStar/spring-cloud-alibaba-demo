package com.greedystar.nacosconfig;

import com.greedystar.generator.invoker.SingleInvoker;
import com.greedystar.generator.invoker.base.Invoker;

/**
 * Author GreedyStar
 * Date   2020-5-18
 */
public class CodeGeneration {

    public static void main(String[] args) {
        Invoker invoker = new SingleInvoker.Builder()
                .setTableName("users")
                .setClassName("User")
                .build();
        invoker.execute();
    }

}
