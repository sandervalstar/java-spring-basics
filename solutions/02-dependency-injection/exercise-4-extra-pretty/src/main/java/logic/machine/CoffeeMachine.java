package logic.machine;

import domain.Recipe;
import logic.dispenser.*;

public class CoffeeMachine {
    private Dispenser dispenser;

    public CoffeeMachine(Dispenser dispenser) {
        this.dispenser = dispenser;
    }

    public void brew(Recipe recipe) {
        System.out.println(String.format("Brewing %s...", recipe.getName()));
        recipe.getIngredientPercentageList().stream().forEach(
                ingredientPercentage -> dispenser.dispense(ingredientPercentage)
        );
        System.out.println("Done");
    }
}