package io.pivotal.ms;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class MsApplication {

	private Log log = LogFactory.getLog(MsApplication.class);
    private AtomicInteger counter = new AtomicInteger(0);

    @RequestMapping(value = "/", produces = "application/json")
    public String produce() {
       // int value = counter.incrementAndGet();

        //log.info(String.format("Produced a value: %s", value));
        log.info("cat");
        return "{\"value\": \"cat\"}";
        //return String.format("{\"value\": %s}", value);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(MsApplication.class, args);
    }
}
