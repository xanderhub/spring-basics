package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach sameCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println("Pointing to the same object: " + (coach == sameCoach));

        context.close();
    }
}
