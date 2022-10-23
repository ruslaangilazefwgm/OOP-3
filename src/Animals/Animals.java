package Animals;

import java.util.Objects;

public abstract class Animals {
    protected String name;
    protected int age;

    public Animals (String name, int age) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Animal";
        }
        if (age < 0) {
            this.age = Math.abs(age);
        } else {
            this.age = age;
        }
    }

    public abstract void eating();
    public abstract void sleeping();
    public abstract void walking();

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && name.equals(animals.name);
    }

}
