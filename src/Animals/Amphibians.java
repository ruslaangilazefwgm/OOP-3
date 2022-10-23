package Animals;

import java.util.Objects;

public class Amphibians extends Animals {
    protected String livingArea;

    public Amphibians(String name, int age, String livingArea) {
        super(name, age);
        if (livingArea != null && !livingArea.isEmpty()) {
            this.livingArea = livingArea;
        } else {
            System.out.println("Неизвестно");
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
        System.out.println("Охотиться");
    }

    public String getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(String livingArea) {
        this.livingArea = livingArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return livingArea.equals(that.livingArea);
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "livingArea='" + livingArea + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
