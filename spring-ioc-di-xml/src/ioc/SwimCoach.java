package ioc;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;


    private String emailAddress;
    private String team;

    public SwimCoach() {
        System.out.println("SwimCoach: default constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("SwimCoach: in setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("SwimCoach: in setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("SwimCoach: in setter method - setTeam");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 2000 meters";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
