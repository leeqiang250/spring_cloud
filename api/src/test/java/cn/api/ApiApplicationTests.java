package cn.api;

import cn.api.controller.APIController;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiApplicationTests {

    //@Autowired
    //private RestTemplate restTemplate;

    @Autowired
    private APIController apiController;

    @Test
    public void contextLoads() {
        //String json = "{\"tokens\":[{ \"contractAddress\":\"0xa870879e2872f9f2dc3a33933a9af3345b00fd14\", \"chainType\":\"ETH\" }],\"currency\":\"CNY\" }";
        //JSONObject response = restTemplate.postForEntity("https://api2.kcash.com/api/prices", json, JSONObject.class).getBody();
        //System.out.println(response);
    }

    @Test
    public void testApi() {
        System.out.println(apiController.get());
        assertTrue(apiController.get().getData());
    }
}