package koschei;


import koschei.models.Deth8;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;

    @Autowired
    public void setOcean1(Ocean1 ocean) {
        this.ocean = ocean;
    }

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();
    }

    @Component
    public static class Ocean1 {
        private final Island2 island;

        public Ocean1(Island2 island2) {
            this.island = island2;
        }

        @Override
        public String toString() {
            return "на океане есть остров , " + island.toString();
        }
    }

    @Component
    public static class Island2 {
        private final Wood3 wood;

        public Island2(Wood3 wood) {
            this.wood = wood;
        }

        @Override
        public String toString() {
            return "на острове дерево , " + wood.toString();
        }
    }

    @Component
    public static class Wood3 {
        private final Rabbit4 rabbit;

        @Autowired
        public Wood3(Rabbit4 rabbit) {
            this.rabbit = rabbit;
        }

        @Override
        public String toString() {
            return "на дереве заяц , " + rabbit.toString();
        }

        @Component
        public static class Rabbit4 {
            private final Duck5 duck;

            public Rabbit4(Duck5 duck) {
                this.duck = duck;
            }

            @Override
            public String toString() {
                return "в зайце утка , " + duck.toString();
            }
        }
    }

    @Component
    public static class Duck5 {
        private final Egg6 egg;

        @Autowired
        public Duck5(Egg6 egg) {
            this.egg = egg;
        }

        @Override
        public String toString() {
            return "в утке яцо , " + egg.toString();
        }
    }

    @Component
    public static class Egg6 {

        @Autowired
        private Needle7 needle;

        @Override
        public String toString() {
            return "в яйце иголка , " + needle.toString();
        }
    }

    @Component
    public static class Needle7 {
        private final Deth8 deth;

        @Autowired
        public Needle7(Deth8 deth) {
            this.deth = deth;
        }

        @Override
        public String toString() {
            return "смерть Кощея на игле :(" + deth.toString();
        }
    }

    @Component
    public static class Deth8 {

    }

}



