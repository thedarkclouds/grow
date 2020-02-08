package com.grow.design;

//抽象主题
interface Subject {
    void Request();
}

/**
 * @author huye
 * @date 2020-02-06 14:37
 * @comment
 */
public class ProxyDemo {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.Request();
    }
}

//真实主题
class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}

//代理
class Proxy implements Subject {
    private RealSubject realSubject;
    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
    }

    public void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }

    public void postRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }
}
