package cdi.demos;

import java.util.Random;

@Loggable
public class IsbnGenerator {

    public String generateNumber() {
        return "13-84356-" + Math.abs(new Random().nextInt());
    }

}
