import java.util.*;

public class Main {

    public static void main(String[] args) {
        Cycle[] cycles = generateCycles();

        bubbleSortByAsc(cycles);
        printArray(cycles);

        Arrays.sort(cycles);
        printArray(cycles);

        for (Cycle c : cycles) {
            if (c instanceof Unicycle) {
                c.repair();
            }
        }
        Workshop workshop = new Workshop();

        for(Cycle cycle: cycles){
            workshop.setCycle(cycle);
            workshop.repair();
        }
    }


    public static void printArray(Cycle[] cycles){
        for (Cycle cycle: cycles) {
            System.out.print(cycle.getSumDiameter() + ", ");
        }
        System.out.println();
    }

    public static void bubbleSortByAsc(Cycle[] cycles){
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (cycles[j].getSumDiameter() < cycles[j - 1].getSumDiameter()) {
                    Cycle sort = cycles[j];
                    cycles[j] = cycles[j - 1];
                    cycles[j - 1] = sort;
                }
            }
        }
    }

    public static Cycle[] generateCycles(){
        int n = 10;
        Cycle[] cycles = new Cycle[n];

        for (int i = 0; i < cycles.length; i++) {
            int randomType = (int) (Math.random() * 3);
            int randomDiameter = (int) (Math.random() * 10);

            switch (randomType) {
                case 0:
                    Cycle uni = new Unicycle(randomDiameter);
                    cycles[i] = uni;
                    break;
                case 1:
                    Cycle bic = new Bicycle(randomDiameter);
                    cycles[i] = bic;
                    break;
                case 2:
                    Cycle tri = new Tricycle(randomDiameter);
                    cycles[i] = tri;
                    break;
            }
        }
        return cycles;
    }
}
