
public class Bins {

        public int iniBound;
        public int lengthArray;
        public int[] bin;

        public Bins(int iniBound, int endBound) {
            lengthArray = endBound - iniBound;
            bin = new int[lengthArray + 1];
            this.iniBound = iniBound;
        }

        public Integer getBin(int value) {
            return bin[value - iniBound];
        }

        public void incrementBin(int value) {
            bin[value - iniBound] += 1;
        }

    }


