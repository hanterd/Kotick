public class Kotik {
            int stomach = 10;
        boolean isHungry = true;

        public static void main(String[] args) {
            new Kotik().liveAnotherDay();

        }

        public boolean play() {
            if (stomach <= 0) {
                isHungry = true;
                return false;
            } else {
                stomach = stomach - 2;
                return true;
            }
        }

        public boolean sleep() {
            if (stomach <= 0) {
                isHungry = true;
                return false;
            } else {
                stomach = stomach - 4;
                return true;
            }
        }

        public boolean chaseMouse() {
            if (stomach <= 0) {
                isHungry = true;
                return false;
            } else {
                stomach = stomach - 3;
                return true;
            }
        }

        public boolean sayMeowMeow() {
            if (stomach <= 0) {
                isHungry = true;
                return false;
            } else {
                stomach = stomach - 1;
                return true;
            }
        }

        public boolean run() {
            if (stomach <= 0) {
                isHungry = true;
                return false;
            } else {
                stomach = stomach - 5;
                return true;
            }
        }

        public boolean scratch() {
            if (stomach <= 0) {
                isHungry = true;
                return false;
            } else {
                stomach = stomach - 3;
                return true;
            }
        }

        public void eat() {
            System.out.println("я поел");
            eat(10, "fish");
            if (stomach > 0) {
                isHungry = false;
            }
        }

        public void eat(int count) {
            stomach = +count;
        }

        public void eat(int count, String nameFood) {
            stomach = +count;
        }

        public void liveAnotherDay() {
            for (int i = 0; i < 24; i++) {
                if (isHungry) {
                    eat();
                } else {
                    int random = (int) (Math.random() * 6) + 1;
                    switch (random) {
                        case 1:
                            System.out.println("поиграл? - " + play());
                            break;
                        case 2:
                            System.out.println("поспал? - " + sleep());
                            break;
                        case 3:
                            System.out.println("нашел мышь? - " + chaseMouse());
                            break;
                        case 4:
                            System.out.println("сказал мяу? - " + sayMeowMeow());
                            break;
                        case 5:
                            System.out.println("побегал? - " + run());
                            break;
                        case 6:
                            System.out.println("поцарапал? - " + scratch());
                            break;
                    }
                }
            }
        }
    }
