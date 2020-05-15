package pl.ruszkodem.tips.search.something;

import java.util.HashSet;
import java.util.Set;

public class HotHighSchoolChick {

    private static final boolean hasABoyfriend = true;
    private final String name;
    private final int height;
    private final int weight;
    private final int age;
    private final Set<Dude> friendzone;

    public HotHighSchoolChick(String name, int height, int weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.friendzone = new HashSet<>();
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

    public Set<Dude> getFriendzone() {
        return friendzone;
    }

    public boolean beMyGirlfriend() {
        return !hasABoyfriend;
    }

    public boolean willYouDanceWithMe() {
        return false;
    }

    public void updateFriendZone(Dude dude) {
        friendzone.add(dude);
    }















    //You wish!!!



}
