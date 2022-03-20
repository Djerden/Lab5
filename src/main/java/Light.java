public class Light implements Comparable<Light>{
    private boolean lightOn = false;

    public void lightOn() {
        lightOn = true;
        System.out.println("Свет включен");
    }
    public void lightOff() {
        lightOn = false;
        System.out.println("Свет выключен");
    }

    @Override
    public int compareTo(Light o) {
        return 0;
    }
}
