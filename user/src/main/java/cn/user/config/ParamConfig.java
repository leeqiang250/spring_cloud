package cn.user.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
public class ParamConfig extends cn.common.util.ParamConfig {

    public static String name0_name00_name000;

    @Value("${name0.name00.name000}")
    public void setRefreshScopeName0_name00_name000(String name0_name00_name000) {
        this.name0_name00_name000 = name0_name00_name000;
    }

}