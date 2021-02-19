package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
        Coach baseballCoach2 = context.getBean("baseballCoach", Coach.class);

        //check if the same bean
        boolean result = (baseballCoach == baseballCoach2);

        System.out.println("Same objects: " + result);
        System.out.println("Mem location for baseballCoach: " + baseballCoach);
        System.out.println("Mem location for baseballCoach2: " + baseballCoach2);
    }
}
