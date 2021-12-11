public abstract class Cycle implements Comparable<Cycle>  {
    int diameter;
    int wheelCount;

    public Cycle(int wheelCount, int diameter) {
        this.diameter = diameter;
        this.wheelCount = wheelCount;
    }

    private void buy(){
        System.out.println("Покупка велосипеда");
    }

    public abstract void repair();
    public abstract void usage();
    public abstract void build();

    public int getSumDiameter(){
        return diameter * wheelCount;
    }

    @Override
    public int compareTo(Cycle o) {
        return o.getSumDiameter() - getSumDiameter();
    }

}
