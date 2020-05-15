package pl.ruszkodem.tips.search.something;

public class BradPitt {

    private final Status relationshipStatus = Status.IT_IS_COMPLICATED;
    private final String name;
    private final int height;
    private final int weight;
    private final int age;

    public BradPitt(String name, int height, int weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public Status getRelationshipStatus() {
        return relationshipStatus;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void takePicturePose() {
        System.out.println("Taking a picture pose");
    }

    public void smile() {
        System.out.println("Smiling");
    }

    public void play() {
        System.out.println("Playing");
    }

    public void wave() {
        System.out.println("Waving");
    }

    public void sendAKiss() {
        System.out.println("Sending a kiss");
    }


    private enum Status {
        MARRIED, DIVORCED, IT_IS_COMPLICATED;
    }
}
