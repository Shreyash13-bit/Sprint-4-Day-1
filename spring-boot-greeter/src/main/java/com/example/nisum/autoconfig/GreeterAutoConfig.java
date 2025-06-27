package com.example.nisum.autoconfig;
import com.example.nisum.service.Greeter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreeterAutoConfig {
    @Bean
    @ConditionalOnMissingBean
    public Greeter greeter() {
        return new Greeter("Hello from Auto-Config!");
    }
}
