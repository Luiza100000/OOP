public class Bicycle extends Cycle{

    public Bicycle(int diameter) {
        super(2, diameter);
    }

    @Override
    public void repair() {
        System.out.println("Ремонт двухколесного велосипеда");
    }

    @Override
    public void usage() {

    }

    @Override
    public void build() {

    }
}
