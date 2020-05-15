package other.autoconfigure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import other.bean.OtherBean;
import other.bean.OtherBeanX;

@Configuration
public class OtherAutoConfiguration {

    @Bean
    public OtherBean otherBean() {
        return new OtherBean();
    }

    @Bean
    public OtherBeanX otherBeanX(OtherBean otherBean) {
        return new OtherBeanX();
    }

}