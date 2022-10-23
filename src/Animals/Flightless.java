package Animals;

import java.util.Objects;

public class Flightless extends Birds{
    protected String walkingType;
    public Flightless(String name, int age, String livingArea, String walkingType) {
        super(name, age, livingArea);
        if(walkingType != null && !walkingType.isEmpty()) {
            this.walkingType = walkingType;
        } else {
            System.out.println("Неизвестно");
        }
    }
    public String getWalkingType() {
        return walkingType;
    }
    public void setWalkingType(String walkingType) {
        this.walkingType = walkingType;
    }

    public void walking() {
        System.out.println("Гулять");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return walkingType.equals(that.walkingType);
    }

    @Override
    public String toString() {
        return "Flightless{" +
                "walkingType='" + walkingType + '\'' +
                ", livingArea='" + livingArea + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
