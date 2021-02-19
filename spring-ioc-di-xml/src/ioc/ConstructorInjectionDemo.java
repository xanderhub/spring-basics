package ioc;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionDemo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("trackCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        context.close();

    }
}
