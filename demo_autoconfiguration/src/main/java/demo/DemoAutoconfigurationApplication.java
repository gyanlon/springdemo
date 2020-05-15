package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import other.bean.OtherBean;
import other.bean.OtherBeanX;

@SpringBootApplication
public class DemoAutoconfigurationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoAutoconfigurationApplication.class, args);

        System.out.println(ctx.getBean(OtherBean.class).toString());
        System.out.println(ctx.getBean(OtherBeanX.class).toString());
    }

}
