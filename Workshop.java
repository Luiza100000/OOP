public class Workshop {

    private Cycle cycle;

    public void setCycle(Cycle cycle) {
        this.cycle = cycle;
    }

    public void repair(){
        cycle.repair();
    }

}
