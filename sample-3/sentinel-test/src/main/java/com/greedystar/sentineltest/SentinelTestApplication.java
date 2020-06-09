package com.greedystar.sentineltest;

import com.alibaba.csp.sentinel.datasource.ReadableDataSource;
import com.alibaba.csp.sentinel.datasource.nacos.NacosDataSource;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
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
        SpringApplication.run(SentinelTestApplication.class, args);
    }

    /**
     * 硬编码定义规则
     */
    private static void initRules() {
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

    /**
     * 通过Nacos定义规则
     */
    private static void initRulesFromNacos() {
//        String remoteAddress = "";
//        String groupId = "";
//        String dataId = "";
//        // remoteAddress 代表 Nacos 服务端的地址，groupId 和 dataId 对应 Nacos 中相应配置
//        ReadableDataSource<String, List<FlowRule>> flowRuleDataSource = new NacosDataSource<>(remoteAddress, groupId, dataId,
//                source -> JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
//                }));
//        FlowRuleManager.register2Property(flowRuleDataSource.getProperty());
    }

}
