import java.util.Random;



    public class Dice {


        private int number;
        Random rand = new Random();


        public Dice(int number) {
            this.number = number;
        }

        public Integer tossAndSum() {
            Integer sum = 0;
            Integer alea;
            for (int i = 0; i < number; i++) {
                alea = getRandomNumberInRange(1,6);
                sum +=  alea;
            }
            return sum;
        }

        private static int getRandomNumberInRange(int min, int max) {

            if (min >= max) {
                throw new IllegalArgumentException("Max must be greater than min");
            }

            Random r = new Random();
            return r.nextInt((max - min) + 1) + min;
        }


    }


