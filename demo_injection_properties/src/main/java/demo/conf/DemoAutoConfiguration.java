package demo.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DemoProperties.class)
public class DemoAutoConfiguration {
    private DemoProperties dp;

    public DemoAutoConfiguration(DemoProperties dp) {
        this.dp = dp;
    }

    public DemoProperties getDp() {
        return dp;
    }

    public void setDp(DemoProperties dp) {
        this.dp = dp;
    }
}
