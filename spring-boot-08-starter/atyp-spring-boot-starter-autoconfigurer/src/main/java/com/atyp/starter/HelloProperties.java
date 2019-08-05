package com.atyp.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/07/28 下午5:11
 * @see: com.atyp.starter
 * @desception:
 */
@ConfigurationProperties(prefix = "atyp.hello")
public class HelloProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
