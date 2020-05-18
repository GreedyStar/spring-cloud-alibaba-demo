package com.greedystar.sentineltest.utils;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * Author GreedyStar
 * Date   2020-5-18
 */
public class ExceptionUtil {

    /**
     * BlockException处理函数，参数列表最后多一个 BlockException，其余与原函数一致
     */
    public static String handleTest1(BlockException ex) {
        ex.printStackTrace();
        return "block Sentinel from static method";
    }

}
