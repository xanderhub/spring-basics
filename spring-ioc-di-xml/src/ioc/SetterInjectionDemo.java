package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(swimCoach.getDailyWorkout());

        System.out.println(swimCoach.getDailyFortune());

        System.out.println(swimCoach.getEmailAddress());
        System.out.println(swimCoach.getTeam());

        context.close();

    }
}
