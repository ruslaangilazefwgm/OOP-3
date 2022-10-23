package Animals;

import java.util.Objects;

public class Mammals extends Animals {
    protected String livingArea;
    protected int walkingSpeed;

    public Mammals(String name, int age, String livingArea, int walkingSpeed) {
        super(name, age);
        if (livingArea != null && !livingArea.isEmpty()) {
            this.livingArea = livingArea;
        } else {
            System.out.println("Неизвестно");
        }
        if (walkingSpeed < 0) {
            this.walkingSpeed = Math.abs(walkingSpeed);
        } else {
            this.walkingSpeed = walkingSpeed;
        }
    }


    @Override
    public void eating() {

    }

    @Override
    public void sleeping() {

    }

    @Override
    public void walking() {
        System.out.println("Гулять");
    }

    public String getLivingArea() {
        return livingArea;
    }
    public int getWalkingSpeed() {
        return walkingSpeed;
    }

    public void setLivingArea(String livingArea) {
        this.livingArea = livingArea;
    }

    public void setWalkingSpeed(int walkingSpeed) {
        this.walkingSpeed = walkingSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return walkingSpeed == mammals.walkingSpeed && livingArea.equals(mammals.livingArea);
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "livingArea='" + livingArea + '\'' +
                ", walkingSpeed=" + walkingSpeed +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
