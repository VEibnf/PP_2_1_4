package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    public Rabbit4(Duck5 duck) {
    }

    @Override
    public String toString() {
        return ", в зайце утка " + "";
    }
}
