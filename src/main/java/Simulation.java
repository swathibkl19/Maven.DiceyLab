import java.util.Arrays;

    public class Simulation {
        Bins bin;
        Dice dice;
        Integer numberOfTosses;
        public Integer numberOfDies;



        public Simulation(int numberOfDies, int numberOfTosses) {
            this.numberOfTosses = numberOfTosses;
            dice = new Dice( numberOfDies );
            bin = new Bins( numberOfDies, (numberOfDies * 6));
            this.numberOfDies = numberOfDies;
        }

        public void runSimulation() {
            for (int i = 0; i < numberOfTosses; i++) {
                Integer t = dice.tossAndSum();
                bin.incrementBin(t);
            }
        }

        public void printResults(){
            String toPrint = "***\nSimulation of 2 dice tossed for 1Mx.\n***\n\n";
            Integer valueOfRange;
            for (int i = numberOfDies; i < bin.lengthArray + numberOfDies + 1; i++) {
                valueOfRange = bin.getBin(i);
                toPrint += String.format("%2d",i) + " : "
                        + String.format("%8d", valueOfRange) + " : "
                        + String.format("%5.2f", ((float)valueOfRange/(float)numberOfTosses)) + " "
                        + asterisks(100 * valueOfRange / numberOfTosses)
                        + "\n";
            }
            System.out.println( toPrint );
        }

        public String asterisks(Integer sample){
            String str = "";
            for (int i = 0; i < sample; i++) {
                str += "*";
            }
            return str;
        }

        public static void main(String[] args) {
            Simulation sim = new Simulation(2, 1000000);
            sim.runSimulation();
            sim.printResults();

        }
        }

