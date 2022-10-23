package Animals;

import java.util.Objects;

public class Flying extends Birds{
    protected String walkingType;
    public Flying(String name, int age, String livingArea, String walkingType) {
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
        System.out.println("Летать");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return walkingType.equals(flying.walkingType);
    }

    @Override
    public String toString() {
        return "Flying{" +
                "walkingType='" + walkingType + '\'' +
                ", livingArea='" + livingArea + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
