package other.bean;

import org.springframework.beans.factory.FactoryBean;

public class ABeanFactroyBean implements FactoryBean<ABean> {

    @Override
    public ABean getObject() throws Exception {
        return new ABean();
    }

    @Override
    public Class<?> getObjectType() {
        return ABean.class;
    }
}
