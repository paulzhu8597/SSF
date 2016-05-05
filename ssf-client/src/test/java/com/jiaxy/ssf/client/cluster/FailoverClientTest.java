package com.jiaxy.ssf.client.cluster;

import com.jiaxy.ssf.client.Client;
import com.jiaxy.ssf.common.ProtocolType;
import com.jiaxy.ssf.config.ConsumerConfig;
import com.jiaxy.ssf.message.MessageBuilder;
import com.jiaxy.ssf.message.ResponseMessage;
import com.jiaxy.ssf.service.TestSuiteService;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class FailoverClientTest {


    private Client client;

    @Before
    public void setUp() throws Exception {
        ConsumerConfig<TestSuiteService> consumerConfig = new ConsumerConfig<TestSuiteService>();
        consumerConfig.setServiceInterfaceName(TestSuiteService.class.getCanonicalName());
        consumerConfig.setAlias("ssf-test-suite");
        consumerConfig.setUrl("ssf://127.0.0.1:31818?weight=200,ssf://127.0.0.1:31617");
        consumerConfig.setProtocol(ProtocolType.SSF);
        client = new FailoverClient(consumerConfig);

    }

    @Test
    public void testSendMsg() throws Exception {
        ResponseMessage<String> rs = client.sendMsg(MessageBuilder.buildRequestMessage(TestSuiteService.class,"helloWorld",new Class[]{String.class},new String[]{}));
        System.out.println(rs.getResponse());
    }

    @Test
    public void testClose() throws Exception {

    }
}