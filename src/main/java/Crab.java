public class Crab {
    private int hands;
    private int legs;
    private String kind;
    private String name;

    public Crab(int hands, int legs, String kind, String name) {
        this.hands = hands;
        this.legs = legs;
        this.kind = kind;
        this.name = name;
    }
    public Crab(String kind, String name) {
        this.hands = 2;
        this.legs = 6;
        this.kind = kind;
        this.name = name;
    }

    public void cry() {
        System.out.println("i'm Crab with name - " + name);
    }
    public void run() {

    }

    public void eat() {

    }

    public int getHands() {
        return hands;
    }

    public void setHands(int hands) {
        this.hands = hands;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
