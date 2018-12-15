//PIERWSZY PLIK

public class RangeLister {

    int [] makeRange(int lower, int upper) {
        int[] range = new int[(upper-lower) + 1];

        for (int i = 0; i <range.length; i++) {
            range[i] = lower++;
        }
        return range;
    }

    void show(int[] range) {
        System.out.print("Tablica: [");
        for(int i: range){
            System.out.print(i + " ");
        }
        System.out.print("]");
    }


    public static void main(String[] args) {

        int[] range;

        RangeLister rangeLister = new RangeLister();
        range = rangeLister.makeRange(4,13);

        rangeLister.show(range);
    }

}
