package ioc;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "Be patient. The luck will come",
            "Be careful. Today is not your lucky day",
            "The journey begins!"
    };

    private Random random = new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(data.length);
        return data[index];
    }
}
