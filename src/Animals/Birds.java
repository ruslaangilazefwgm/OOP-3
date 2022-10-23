package Animals;

import java.util.Objects;

public class Birds extends Animals{
    protected String livingArea;

    public Birds(String name, int age, String livingArea) {
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
        Birds birds = (Birds) o;
        return livingArea.equals(birds.livingArea);
    }

    @Override
    public String toString() {
        return "Birds{" +
                "livingArea='" + livingArea + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
