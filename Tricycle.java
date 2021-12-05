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

    }

    @Override
    public void build() {

    }

}
