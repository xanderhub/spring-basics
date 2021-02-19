package ioc;

public class SadFortuneServiceImpl implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is sad day :(";
    }
}
