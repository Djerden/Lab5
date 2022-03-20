public class PerfectCrab extends Crab implements AbleToFly{
    private String ability;

    public PerfectCrab(String name, String ability) {
        super(3, 8, "Perfect Crab", name);
        this.ability = ability;
    }


    @Override
    public void fly() {
        System.out.println("Краб взлетает ");
    }

    @Override
    public void fall() {
        System.out.println("Краб падает ");
    }
}
