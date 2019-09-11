package WzorceProjektowe.Builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dog {

    private String name;
    private String description;
    private List<Food> foodList;
    private List<Toy> toysList;
    private LocalDate bornDate;
    private boolean isAlive;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public List<Toy> getToysList() {
        return toysList;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public boolean isAlive() {
        return isAlive;
    }

    private Dog() {
    }

    public static final class Builder {

        private String name;
        private String description;
        private List<Food> foodList = new ArrayList<>();
        private List<Toy> toysList = new ArrayList<>();
        private LocalDate bornDate;
        private boolean isAlive;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder food(Food food) {
            this.foodList.add(food);
            return this;
        }

        public Builder toys(Toy toy) {
            this.toysList.add(toy);
            return this;
        }

        public Builder bornDate(LocalDate bornDate) {
            this.bornDate = bornDate;
            return this;
        }

        public Builder isAlive() {
            this.isAlive = true;
            return this;
        }

        public Dog build() {

            if (this.name.isEmpty()) {
                throw new IllegalStateException("Name must be given!");
            }

            if (this.description.isEmpty()) {
                throw new IllegalStateException("Description must be given!");
            }

            if (this.bornDate == null) {
                throw new IllegalStateException("Born date must be given!");
            }

            Dog dog = new Dog();
            dog.name = this.name;
            dog.description = this.description;
            dog.foodList = this.foodList;
            dog.toysList = this.toysList;
            dog.bornDate = this.bornDate;
            dog.isAlive = this.isAlive;
            return dog;

        }

    }
}
