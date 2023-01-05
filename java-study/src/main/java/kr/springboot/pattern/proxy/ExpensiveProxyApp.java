package kr.springboot.pattern.proxy;

/**
 * Java proxy pattern
 * https://www.baeldung.com/java-proxy-pattern
 */
public class ExpensiveProxyApp {

    public static void main(String[] args) {

        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();

    }

}
