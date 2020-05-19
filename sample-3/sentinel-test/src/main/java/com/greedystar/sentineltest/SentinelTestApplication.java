package com.greedystar.sentineltest;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Author GreedyStar
 * Date   2020-5-18
 */
@SpringBootApplication
public class SentinelTestApplication {

    public static void main(String[] args) {
        initFlowRules();
        SpringApplication.run(SentinelTestApplication.class);
    }

    /**
     * 定义规则
     */
    private static void initFlowRules() {
//        List<FlowRule> rules = new ArrayList<>();
//        FlowRule rule = new FlowRule();
//        rule.setResource("test1");
//        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
//        rule.setCount(1);
//        rules.add(rule);
//        rule = new FlowRule();
//        rule.setResource("test2");
//        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
//        rule.setCount(1);
//        rules.add(rule);
//        FlowRuleManager.loadRules(rules);
    }

}
