package other.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import other.bean.*;

@Configuration
public class OtherAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public OtherBean otherBean() {
        return new OtherBean();
    }

    // 带参数，参数为dependent bean
    // 通过dependent bean的类型去找对应的bean声明
    // 如果找到，先实例化dependent bean.
    @Bean
    @ConditionalOnMissingBean
    public OtherBeanX otherBeanX(OtherBean depedentBean) {
        return new OtherBeanX(depedentBean);
    }

    @Bean
    @ConditionalOnMissingBean
    public ABeanFactroyBean depedentBean() {
        return new ABeanFactroyBean();
    }

    // 带参数，参数为dependent bean
    // 通过dependent bean的类型去找对应的bean声明
    // 如果找不到，通过参数名字找
    // 如果找到的是对应的factory bean, 则调用factorybean.getobject来实例化dependent bean。
    @Bean
    @ConditionalOnMissingBean
    public ABeanX aBeanX(ABean depedentBean) {
        return new ABeanX(depedentBean);
    }

}