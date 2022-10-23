package Animals;

import java.util.Objects;

public class Predators extends Mammals {
    protected String foodType;
    public Predators(String name, int age, String livingArea, int walkingSpeed, String foodType) {
        super(name, age, livingArea, walkingSpeed);
        if(foodType != null && !foodType.isEmpty()) {
            this.foodType = foodType;
        } else {
            System.out.println("Трава");
        }
    }
    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public void walking() {
        System.out.println("Охотиться");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return foodType.equals(predators.foodType);
    }

    @Override
    public String toString() {
        return "Predators{" +
                "foodType='" + foodType + '\'' +
                ", livingArea='" + livingArea + '\'' +
                ", walkingSpeed=" + walkingSpeed +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
