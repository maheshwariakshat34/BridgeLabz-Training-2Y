import java.util.*;

interface MealPlan { String getType(); }

class VegetarianMeal implements MealPlan { public String getType(){return "Vegetarian";} }
class VeganMeal implements MealPlan { public String getType(){return "Vegan";} }
class KetoMeal implements MealPlan { public String getType(){return "Keto";} }

class Meal<T extends MealPlan> {
    private T plan;
    Meal(T plan){this.plan=plan;}
    public T getPlan(){return plan;}
}

class MealPlanGenerator {
    public static <T extends MealPlan> void generatePlan(Meal<T> meal){
        System.out.println("Generated meal plan: " + meal.getPlan().getType());
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> veg = new Meal<>(new VegetarianMeal());
        Meal<KetoMeal> keto = new Meal<>(new KetoMeal());
        generatePlan(veg);
        generatePlan(keto);
    }
}
