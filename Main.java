import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Cycle[] cycle = new Cycle[n];
        for(int i = 0; i < n; i++) {
            int r = (int) (Math.random() * 3);
            int d = (int) (Math.random() * 10);
            switch (r) {
                case 0:
                    Unicycle uni = new Unicycle(d);
                    cycle[i] = uni;
                    break;
                case 1:
                    Bicycle bic = new Bicycle(d);
                    cycle[i] = bic;
                    break;
                case 2:
                    Tricycle tri = new Tricycle(d);
                    cycle[i] = tri;
                    break;
            }
        }
        for (int i=0; i<3; i++){
            for (int j=1; j<3; j++){
                if (cycle[j].getSumDiameter()<cycle[j-1].getSumDiameter()){
                    Cycle sort = cycle[j];
                    cycle[j] = cycle[j - 1];
                    cycle[j - 1] = sort;
                }
            }
        }
        for(int i = 0;i<n;i++){
            System.out.println(cycle[i].getSumDiameter());
        }
        for (Cycle c : cycle) {
            if (c instanceof Unicycle)
                c.repair();
        }
        Repair.repair_all(cycle[1]);
    }

}
