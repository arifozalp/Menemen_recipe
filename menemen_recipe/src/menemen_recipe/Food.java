package menemen_recipe;

import java.util.*;

abstract public class Food extends FoodItem {
	
	protected final List<FoodItem> foodItems = new ArrayList<>(); 
	
	Food(double amount) {
		super(Unit.Piece, amount);
	}	
	
	@Override
	void execute(FoodInterface foodInterface) {
		for (FoodItem foodItem : foodItems) {
			foodItem.execute(foodInterface);
		}		
	}
	
	@Override
	public double getCalorie() {
		double totalCalorie = 0.0;
		
		for (FoodItem foodItem : foodItems) {
			totalCalorie += foodItem.getTotalCalorie();
		}
		
		return totalCalorie;
	}	

}
