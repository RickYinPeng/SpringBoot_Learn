package com.atyp.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/08/17 下午5:48
 * @see: com.atyp.myrule
 * @desception:
 */
@Configuration
public class MySelfRule extends AbstractLoadBalancerRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object o) {
        return null;
    }
}
