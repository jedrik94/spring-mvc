package pl.jedrik94.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/src/main/webapp/WEB-INF/spring-mvc-demo-servlet.xml");
    }
}
