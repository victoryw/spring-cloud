package org.victoryw.springcloudexample.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("test-configuration-server")
public class TestConfigurationServer {

    @Autowired
    private Environment environment;

    @Value("testConfig")
    private String testConfig;

    @GetMapping
    public String getConfiguration() {
        return testConfig;
    }
}
