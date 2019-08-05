package com.atyp.starter;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/07/28 下午5:10
 * @see: com.atyp.starter
 * @desception:
 */
public class HelloService {

    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHellAtyp(String name){
       return helloProperties.getPrefix()+"-"+name+"-"+helloProperties.getSuffix();
    }
}
