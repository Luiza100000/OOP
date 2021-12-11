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
        System.out.println("Using bicycle");
    }

    @Override
    public void build() {
        System.out.println("Assembling bicycle");
    }
}

