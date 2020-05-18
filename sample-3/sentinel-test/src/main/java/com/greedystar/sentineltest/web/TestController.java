package com.greedystar.sentineltest.web;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.greedystar.sentineltest.utils.ExceptionUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author GreedyStar
 * Date   2020-5-18
 */
@RestController
public class TestController {

    /*
     * ！！！！！！ Note ！！！！！！
     *
     * blockHandler用于处理BlockException
     *
     * fallback用于处理所有类型的异常（除 exceptionsToIgnore 里排除的异常类型）
     *
     * 二者的定义格式基本相同
     */

    /**
     * test1
     * <p>
     * 将对BlockException的处理放入一个单独的ExceptionUtil类中，这种方式要求处理异常的handleTest1方法为静态方法
     */
    @GetMapping(value = "/test1")
    @SentinelResource(value = "test1", blockHandler = "handleTest1", blockHandlerClass = ExceptionUtil.class)
    public String test1() {
        return "test1 : Hello Sentinel";
    }

    /**
     * test2
     * <p>
     * 将对BlockException的处理放在当前类中
     */
    @GetMapping(value = "/test2")
    @SentinelResource(value = "test2", blockHandler = "handleTest2")
    public String test2() {
        return "test2 : Hello Sentinel";
    }

    /**
     * BlockException处理函数，参数列表最后多一个 BlockException，其余与原函数一致
     */
    public String handleTest2(BlockException ex) {
        // 进行一些日志处理
        ex.printStackTrace();
        return "block Sentinel from normal method";
    }

}
