package demo;

import demo.conf.DemoAutoConfiguration;
import demo.conf.DemoProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoApp.class, args);

        System.out.println(ctx.getBean(DemoAutoConfiguration.class).getDp().getMessage());
    }
}
