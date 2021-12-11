public class Unicycle extends Cycle {

    public Unicycle(int diameter) {
        super(1, diameter);
    }


    @Override
    public void repair() {
        System.out.println("Ремонт одноколесного велосипеда");
    }

    @Override
    public void usage() {
        System.out.println("Using unicycle");
    }

    @Override
    public void build() {
        System.out.println("Assembling unicycle");
    }

}

