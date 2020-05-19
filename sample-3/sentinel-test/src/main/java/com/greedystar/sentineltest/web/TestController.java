package com.greedystar.sentineltest.web;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import com.greedystar.sentineltest.utils.ExceptionUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

/**
 * Author GreedyStar
 * Date   2020-5-18
 */
@RestController
public class TestController {

    /*
     * ！！！！！！ Note ！！！！！！
     *
     * blockHandler用于处理BlockException，也就是流量控制
     *
     * fallback用于处理所有类型的异常（除 exceptionsToIgnore 里排除的异常类型）
     *
     * 注意：熔断降级默认会抛出DegradeException
     *
     * 二者的定义格式基本相同
     */

    /**
     * test1
     * 流量控制测试
     * 将对BlockException的处理放入一个单独的ExceptionUtil类中，这种方式要求处理异常的handleTest1方法为静态方法
     */
    @GetMapping(value = "/test1")
    @SentinelResource(value = "test1", blockHandler = "handleTest1", blockHandlerClass = ExceptionUtil.class)
    public String test1() {
        return "请求资源 : test1";
    }

    /**
     * test2
     * <p>
     * 将对BlockException的处理放在当前类中
     */
    @GetMapping(value = "/test2")
    @SentinelResource(value = "test2", blockHandler = "handleTest2")
    public String test2() {
        return "请求资源 : test2";
    }

    /**
     * BlockException处理函数，参数列表最后多一个 BlockException，其余与原函数一致
     */
    public String handleTest2(BlockException ex) {
        // 进行一些日志处理
        ex.printStackTrace();
        return "流量控制 : test2";
    }

    /**
     * test3
     * 测试熔断降级
     */
    @GetMapping(value = "/test3")
    @SentinelResource(value = "test3", fallback = "handleDegrade")
    public String test3() {
        if (new Random().nextBoolean()) {
            int i = 1 / 0; // 模拟一个业务异常
        }
        return "请求资源 : test3";
    }

    /**
     * 熔断降级处理函数
     */
    public String handleDegrade(Throwable throwable) {
        if (throwable instanceof DegradeException) {
            return "服务已被降级 = " + new Date();
        } else {
            return "业务出现异常 = " + new Date();
        }
    }

}
