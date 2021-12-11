public class Tricycle extends Cycle{

    public Tricycle(int diameter) {
        super(3, diameter);
    }

    @Override
    public void repair() {
        System.out.println("Ремонт трехколесного велосипеда");
    }

    @Override
    public void usage() {
        System.out.println("Using tricycle");
    }

    @Override
    public void build() {
        System.out.println("Assembling tricycle");
    }

}
